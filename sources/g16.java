// default package

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class g16 extends w06 {
    public d84 a;
    public v06 b;
    public final WeakReference c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final hwa h;

    public g16(e16 e16Var) {
        new AtomicReference(null);
        this.a = new d84();
        v06 v06Var = v06.b;
        this.b = v06Var;
        this.g = new ArrayList();
        this.c = new WeakReference(e16Var);
        this.h = new hwa(v06Var);
    }

    @Override // w06
    public final void a(d16 d16Var) {
        b16 ib3Var;
        Object obj;
        e16 e16Var;
        d("addObserver");
        v06 v06Var = this.b;
        v06 v06Var2 = v06.a;
        if (v06Var != v06Var2) {
            v06Var2 = v06.b;
        }
        f16 f16Var = new f16();
        HashMap hashMap = h16.a;
        boolean z = d16Var instanceof b16;
        boolean z2 = d16Var instanceof mw3;
        Object obj2 = null;
        byte b = 1;
        if (z && z2) {
            ib3Var = new ib3((mw3) d16Var, (b16) d16Var, r6);
        } else if (z2) {
            ib3Var = new ib3((mw3) d16Var, obj2, r6);
        } else if (z) {
            ib3Var = (b16) d16Var;
        } else {
            Class<?> cls = d16Var.getClass();
            if (h16.b(cls) == 2) {
                Object obj3 = h16.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() == 1) {
                    h16.a((Constructor) list.get(0), d16Var);
                    throw null;
                }
                int size = list.size();
                bs4[] bs4VarArr = new bs4[size];
                if (size > 0) {
                    h16.a((Constructor) list.get(0), d16Var);
                    throw null;
                }
                ib3Var = new k29(bs4VarArr, b);
            } else {
                ib3Var = new ib3(d16Var);
            }
        }
        f16Var.b = ib3Var;
        f16Var.a = v06Var2;
        d84 d84Var = this.a;
        to9 h = d84Var.h(d16Var);
        if (h != null) {
            obj = h.b;
        } else {
            HashMap hashMap2 = d84Var.e;
            to9 to9Var = new to9(d16Var, f16Var);
            d84Var.d++;
            to9 to9Var2 = d84Var.b;
            if (to9Var2 == null) {
                d84Var.a = to9Var;
                d84Var.b = to9Var;
            } else {
                to9Var2.c = to9Var;
                to9Var.d = to9Var2;
                d84Var.b = to9Var;
            }
            hashMap2.put(d16Var, to9Var);
            obj = null;
        }
        if (((f16) obj) != null || (e16Var = (e16) this.c.get()) == null) {
            return;
        }
        r6 = (this.d != 0 || this.e) ? (byte) 1 : (byte) 0;
        v06 c = c(d16Var);
        this.d++;
        while (f16Var.a.compareTo(c) < 0 && this.a.e.containsKey(d16Var)) {
            v06 v06Var3 = f16Var.a;
            ArrayList arrayList = this.g;
            arrayList.add(v06Var3);
            s06 s06Var = u06.Companion;
            v06 v06Var4 = f16Var.a;
            s06Var.getClass();
            v06Var4.getClass();
            int ordinal = v06Var4.ordinal();
            u06 u06Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : u06.ON_RESUME : u06.ON_START : u06.ON_CREATE;
            if (u06Var == null) {
                wn4.p(f16Var.a, "no event up from ");
                return;
            } else {
                f16Var.a(e16Var, u06Var);
                arrayList.remove(arrayList.size() - 1);
                c = c(d16Var);
            }
        }
        if (r6 == 0) {
            g();
        }
        this.d--;
    }

    @Override // w06
    public final void b(d16 d16Var) {
        d16Var.getClass();
        d("removeObserver");
        this.a.i(d16Var);
    }

    public final v06 c(d16 d16Var) {
        HashMap hashMap = this.a.e;
        to9 to9Var = hashMap.containsKey(d16Var) ? ((to9) hashMap.get(d16Var)).d : null;
        v06 v06Var = to9Var != null ? ((f16) to9Var.b).a : null;
        ArrayList arrayList = this.g;
        v06 v06Var2 = arrayList.isEmpty() ? null : (v06) b00.f(1, arrayList);
        v06 v06Var3 = this.b;
        if (v06Var == null || v06Var.compareTo(v06Var3) >= 0) {
            v06Var = v06Var3;
        }
        return (v06Var2 == null || v06Var2.compareTo(v06Var) >= 0) ? v06Var : v06Var2;
    }

    public final void d(String str) {
        xr.a().getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(tb4.y("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(u06 u06Var) {
        u06Var.getClass();
        d("handleLifecycleEvent");
        f(u06Var.a());
    }

    public final void f(v06 v06Var) {
        v06 v06Var2 = this.b;
        if (v06Var2 != v06Var) {
            v06 v06Var3 = v06.b;
            v06 v06Var4 = v06.a;
            if (v06Var2 == v06Var3 && v06Var == v06Var4) {
                StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
                sb.append(v06Var);
                sb.append(", but was ");
                sb.append(this.b);
                Object obj = this.c.get();
                sb.append(" in component ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.b = v06Var;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            g();
            this.e = false;
            if (this.b == v06Var4) {
                this.a = new d84();
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
        e16 e16Var = (e16) this.c.get();
        if (e16Var == null) {
            sc8.j("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            d84 d84Var = this.a;
            if (d84Var.d == 0) {
                break;
            }
            to9 to9Var = d84Var.a;
            to9Var.getClass();
            v06 v06Var = ((f16) to9Var.b).a;
            to9 to9Var2 = this.a.b;
            to9Var2.getClass();
            v06 v06Var2 = ((f16) to9Var2.b).a;
            if (v06Var == v06Var2 && this.b == v06Var2) {
                break;
            }
            this.f = false;
            v06 v06Var3 = this.b;
            to9 to9Var3 = this.a.a;
            to9Var3.getClass();
            int compareTo = v06Var3.compareTo(((f16) to9Var3.b).a);
            ArrayList arrayList = this.g;
            if (compareTo < 0) {
                d84 d84Var2 = this.a;
                so9 so9Var = new so9(d84Var2.b, d84Var2.a, (byte) 1);
                d84Var2.c.put(so9Var, Boolean.FALSE);
                while (so9Var.hasNext() && !this.f) {
                    Map.Entry entry = (Map.Entry) so9Var.next();
                    entry.getClass();
                    d16 d16Var = (d16) entry.getKey();
                    f16 f16Var = (f16) entry.getValue();
                    while (f16Var.a.compareTo(this.b) > 0 && !this.f && this.a.e.containsKey(d16Var)) {
                        s06 s06Var = u06.Companion;
                        v06 v06Var4 = f16Var.a;
                        s06Var.getClass();
                        v06Var4.getClass();
                        int ordinal = v06Var4.ordinal();
                        u06 u06Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : u06.ON_PAUSE : u06.ON_STOP : u06.ON_DESTROY;
                        if (u06Var == null) {
                            wn4.p(f16Var.a, "no event down from ");
                            return;
                        } else {
                            arrayList.add(u06Var.a());
                            f16Var.a(e16Var, u06Var);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            to9 to9Var4 = this.a.b;
            if (!this.f && to9Var4 != null && this.b.compareTo(((f16) to9Var4.b).a) > 0) {
                d84 d84Var3 = this.a;
                uo9 uo9Var = new uo9(d84Var3);
                d84Var3.c.put(uo9Var, Boolean.FALSE);
                while (uo9Var.hasNext() && !this.f) {
                    Map.Entry entry2 = (Map.Entry) uo9Var.next();
                    d16 d16Var2 = (d16) entry2.getKey();
                    f16 f16Var2 = (f16) entry2.getValue();
                    while (f16Var2.a.compareTo(this.b) < 0 && !this.f && this.a.e.containsKey(d16Var2)) {
                        arrayList.add(f16Var2.a);
                        s06 s06Var2 = u06.Companion;
                        v06 v06Var5 = f16Var2.a;
                        s06Var2.getClass();
                        v06Var5.getClass();
                        int ordinal2 = v06Var5.ordinal();
                        u06 u06Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : u06.ON_RESUME : u06.ON_START : u06.ON_CREATE;
                        if (u06Var2 == null) {
                            wn4.p(f16Var2.a, "no event up from ");
                            return;
                        } else {
                            f16Var2.a(e16Var, u06Var2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
        }
    }
}
