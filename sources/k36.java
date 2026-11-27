// default package

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k36 extends a36 {
    public y84 a;
    public z26 b;
    public final WeakReference c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final k0b h;

    public k36(i36 i36Var) {
        new AtomicReference(null);
        this.a = new y84();
        z26 z26Var = z26.b;
        this.b = z26Var;
        this.g = new ArrayList();
        this.c = new WeakReference(i36Var);
        this.h = new k0b(z26Var);
    }

    @Override // a36
    public final void a(h36 h36Var) {
        f36 bc3Var;
        Object obj;
        i36 i36Var;
        d("addObserver");
        z26 z26Var = this.b;
        z26 z26Var2 = z26.a;
        if (z26Var != z26Var2) {
            z26Var2 = z26.b;
        }
        j36 j36Var = new j36();
        HashMap hashMap = l36.a;
        boolean z = h36Var instanceof f36;
        boolean z2 = h36Var instanceof hx3;
        Object obj2 = null;
        byte b = 1;
        if (z && z2) {
            bc3Var = new bc3((hx3) h36Var, (f36) h36Var, r6);
        } else if (z2) {
            bc3Var = new bc3((hx3) h36Var, obj2, r6);
        } else if (z) {
            bc3Var = (f36) h36Var;
        } else {
            Class<?> cls = h36Var.getClass();
            if (l36.b(cls) == 2) {
                Object obj3 = l36.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() == 1) {
                    l36.a((Constructor) list.get(0), h36Var);
                    throw null;
                }
                int size = list.size();
                fu4[] fu4VarArr = new fu4[size];
                if (size > 0) {
                    l36.a((Constructor) list.get(0), h36Var);
                    throw null;
                }
                bc3Var = new z59(fu4VarArr, b);
            } else {
                bc3Var = new bc3(h36Var);
            }
        }
        j36Var.b = bc3Var;
        j36Var.a = z26Var2;
        y84 y84Var = this.a;
        ls9 h = y84Var.h(h36Var);
        if (h != null) {
            obj = h.b;
        } else {
            HashMap hashMap2 = y84Var.e;
            ls9 ls9Var = new ls9(h36Var, j36Var);
            y84Var.d++;
            ls9 ls9Var2 = y84Var.b;
            if (ls9Var2 == null) {
                y84Var.a = ls9Var;
                y84Var.b = ls9Var;
            } else {
                ls9Var2.c = ls9Var;
                ls9Var.d = ls9Var2;
                y84Var.b = ls9Var;
            }
            hashMap2.put(h36Var, ls9Var);
            obj = null;
        }
        if (((j36) obj) != null || (i36Var = (i36) this.c.get()) == null) {
            return;
        }
        r6 = (this.d != 0 || this.e) ? (byte) 1 : (byte) 0;
        z26 c = c(h36Var);
        this.d++;
        while (j36Var.a.compareTo(c) < 0 && this.a.e.containsKey(h36Var)) {
            z26 z26Var3 = j36Var.a;
            ArrayList arrayList = this.g;
            arrayList.add(z26Var3);
            w26 w26Var = y26.Companion;
            z26 z26Var4 = j36Var.a;
            w26Var.getClass();
            z26Var4.getClass();
            int ordinal = z26Var4.ordinal();
            y26 y26Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : y26.ON_RESUME : y26.ON_START : y26.ON_CREATE;
            if (y26Var == null) {
                lq5.o(j36Var.a, "no event up from ");
                return;
            } else {
                j36Var.a(i36Var, y26Var);
                arrayList.remove(arrayList.size() - 1);
                c = c(h36Var);
            }
        }
        if (r6 == 0) {
            g();
        }
        this.d--;
    }

    @Override // a36
    public final void b(h36 h36Var) {
        h36Var.getClass();
        d("removeObserver");
        this.a.i(h36Var);
    }

    public final z26 c(h36 h36Var) {
        HashMap hashMap = this.a.e;
        ls9 ls9Var = hashMap.containsKey(h36Var) ? ((ls9) hashMap.get(h36Var)).d : null;
        z26 z26Var = ls9Var != null ? ((j36) ls9Var.b).a : null;
        ArrayList arrayList = this.g;
        z26 z26Var2 = arrayList.isEmpty() ? null : (z26) c00.g(1, arrayList);
        z26 z26Var3 = this.b;
        if (z26Var == null || z26Var.compareTo(z26Var3) >= 0) {
            z26Var = z26Var3;
        }
        return (z26Var2 == null || z26Var2.compareTo(z26Var) >= 0) ? z26Var : z26Var2;
    }

    public final void d(String str) {
        yr.a().getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(qd4.y("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(y26 y26Var) {
        y26Var.getClass();
        d("handleLifecycleEvent");
        f(y26Var.a());
    }

    public final void f(z26 z26Var) {
        z26 z26Var2 = this.b;
        if (z26Var2 != z26Var) {
            z26 z26Var3 = z26.b;
            z26 z26Var4 = z26.a;
            if (z26Var2 == z26Var3 && z26Var == z26Var4) {
                StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
                sb.append(z26Var);
                sb.append(", but was ");
                sb.append(this.b);
                Object obj = this.c.get();
                sb.append(" in component ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.b = z26Var;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            g();
            this.e = false;
            if (this.b == z26Var4) {
                this.a = new y84();
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
        i36 i36Var = (i36) this.c.get();
        if (i36Var == null) {
            grb.i("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            y84 y84Var = this.a;
            if (y84Var.d == 0) {
                break;
            }
            ls9 ls9Var = y84Var.a;
            ls9Var.getClass();
            z26 z26Var = ((j36) ls9Var.b).a;
            ls9 ls9Var2 = this.a.b;
            ls9Var2.getClass();
            z26 z26Var2 = ((j36) ls9Var2.b).a;
            if (z26Var == z26Var2 && this.b == z26Var2) {
                break;
            }
            this.f = false;
            z26 z26Var3 = this.b;
            ls9 ls9Var3 = this.a.a;
            ls9Var3.getClass();
            int compareTo = z26Var3.compareTo(((j36) ls9Var3.b).a);
            ArrayList arrayList = this.g;
            if (compareTo < 0) {
                y84 y84Var2 = this.a;
                ks9 ks9Var = new ks9(y84Var2.b, y84Var2.a, (byte) 1);
                y84Var2.c.put(ks9Var, Boolean.FALSE);
                while (ks9Var.hasNext() && !this.f) {
                    Map.Entry entry = (Map.Entry) ks9Var.next();
                    entry.getClass();
                    h36 h36Var = (h36) entry.getKey();
                    j36 j36Var = (j36) entry.getValue();
                    while (j36Var.a.compareTo(this.b) > 0 && !this.f && this.a.e.containsKey(h36Var)) {
                        w26 w26Var = y26.Companion;
                        z26 z26Var4 = j36Var.a;
                        w26Var.getClass();
                        z26Var4.getClass();
                        int ordinal = z26Var4.ordinal();
                        y26 y26Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : y26.ON_PAUSE : y26.ON_STOP : y26.ON_DESTROY;
                        if (y26Var == null) {
                            lq5.o(j36Var.a, "no event down from ");
                            return;
                        } else {
                            arrayList.add(y26Var.a());
                            j36Var.a(i36Var, y26Var);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            ls9 ls9Var4 = this.a.b;
            if (!this.f && ls9Var4 != null && this.b.compareTo(((j36) ls9Var4.b).a) > 0) {
                y84 y84Var3 = this.a;
                ms9 ms9Var = new ms9(y84Var3);
                y84Var3.c.put(ms9Var, Boolean.FALSE);
                while (ms9Var.hasNext() && !this.f) {
                    Map.Entry entry2 = (Map.Entry) ms9Var.next();
                    h36 h36Var2 = (h36) entry2.getKey();
                    j36 j36Var2 = (j36) entry2.getValue();
                    while (j36Var2.a.compareTo(this.b) < 0 && !this.f && this.a.e.containsKey(h36Var2)) {
                        arrayList.add(j36Var2.a);
                        w26 w26Var2 = y26.Companion;
                        z26 z26Var5 = j36Var2.a;
                        w26Var2.getClass();
                        z26Var5.getClass();
                        int ordinal2 = z26Var5.ordinal();
                        y26 y26Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : y26.ON_RESUME : y26.ON_START : y26.ON_CREATE;
                        if (y26Var2 == null) {
                            lq5.o(j36Var2.a, "no event up from ");
                            return;
                        } else {
                            j36Var2.a(i36Var, y26Var2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
        }
    }
}
