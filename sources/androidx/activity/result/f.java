package androidx.activity.result;

import a4.w;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.l;
import androidx.fragment.app.e0;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class f {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.e.get(str);
        if (dVar != null) {
            b bVar = dVar.a;
            if (this.d.contains(str)) {
                bVar.l(dVar.b.a(intent, i11));
                this.d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new a(intent, i11));
        return true;
    }

    public abstract void b(int i10, e0 e0Var, Object obj);

    public final c c(final String str, l lVar, final e0 e0Var, final b bVar) {
        v vVar = lVar.d;
        if (vVar.c.compareTo(n.d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + lVar + " is attempting to register while current state is " + vVar.c + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap hashMap = this.c;
        e eVar = (e) hashMap.get(str);
        if (eVar == null) {
            eVar = new e(vVar);
        }
        r rVar = new r() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.r
            public final void d(t tVar, m mVar) {
                boolean equals = m.ON_START.equals(mVar);
                String str2 = str;
                f fVar = f.this;
                if (!equals) {
                    if (m.ON_STOP.equals(mVar)) {
                        fVar.e.remove(str2);
                        return;
                    } else {
                        if (m.ON_DESTROY.equals(mVar)) {
                            fVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap hashMap2 = fVar.e;
                Bundle bundle = fVar.g;
                HashMap hashMap3 = fVar.f;
                b bVar2 = bVar;
                e0 e0Var2 = e0Var;
                hashMap2.put(str2, new d(bVar2, e0Var2));
                if (hashMap3.containsKey(str2)) {
                    Object obj = hashMap3.get(str2);
                    hashMap3.remove(str2);
                    bVar2.l(obj);
                }
                a aVar = (a) bundle.getParcelable(str2);
                if (aVar != null) {
                    bundle.remove(str2);
                    bVar2.l(e0Var2.a(aVar.b, aVar.a));
                }
            }
        };
        eVar.a.a(rVar);
        eVar.b.add(rVar);
        hashMap.put(str, eVar);
        return new c(this, str, e0Var, 0);
    }

    public final c d(String str, e0 e0Var, b bVar) {
        e(str);
        this.e.put(str, new d(bVar, e0Var));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.l(obj);
        }
        Bundle bundle = this.g;
        a aVar = (a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            bVar.l(e0Var.a(aVar.b, aVar.a));
        }
        return new c(this, str, e0Var, 1);
    }

    public final void e(String str) {
        HashMap hashMap = this.b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        cd.a aVar = cd.e.a;
        int nextInt = cd.e.a.a().nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            Integer valueOf = Integer.valueOf(i10);
            HashMap hashMap2 = this.a;
            if (!hashMap2.containsKey(valueOf)) {
                hashMap2.put(Integer.valueOf(i10), str);
                hashMap.put(str, Integer.valueOf(i10));
                return;
            } else {
                cd.a aVar2 = cd.e.a;
                nextInt = cd.e.a.a().nextInt(2147418112);
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            StringBuilder s10 = w.s("Dropping pending result for request ", str, ": ");
            s10.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", s10.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            StringBuilder s11 = w.s("Dropping pending result for request ", str, ": ");
            s11.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", s11.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        e eVar = (e) hashMap2.get(str);
        if (eVar != null) {
            ArrayList arrayList = eVar.b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                eVar.a.b((r) obj);
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
