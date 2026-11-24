// default package

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ac3 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public ac3(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(ArrayList arrayList, boolean z) {
        if (go4.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            throw null;
        }
        if (go4.K(2)) {
            Log.v("FragmentManager", "Executing operations from null to null");
        }
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        throw null;
    }

    public final void b() {
        if (!this.a.isAttachedToWindow()) {
            c();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            ArrayList arrayList = new ArrayList(this.c);
            this.c.clear();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                vka vkaVar = (vka) obj;
                if (!this.b.isEmpty()) {
                    throw null;
                }
                vkaVar.getClass();
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                vka vkaVar2 = (vka) obj2;
                if (this.d) {
                    if (go4.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + vkaVar2);
                    }
                    vkaVar2.b();
                    throw null;
                }
                if (go4.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + vkaVar2);
                }
                vkaVar2.a(this.a);
                this.d = false;
                this.c.add(vkaVar2);
            }
            if (this.b.isEmpty()) {
                return;
            }
            e();
            ArrayList arrayList2 = new ArrayList(this.b);
            if (arrayList2.isEmpty()) {
                return;
            }
            this.b.clear();
            this.c.addAll(arrayList2);
            if (go4.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
            }
            a(arrayList2, this.e);
            throw null;
        }
    }

    public final void c() {
        String str;
        String str2;
        if (go4.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            e();
            d(this.b);
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((vka) obj).getClass();
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                vka vkaVar = (vka) obj2;
                if (go4.K(2)) {
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + vkaVar);
                }
                vkaVar.a(this.a);
            }
            ArrayList arrayList2 = new ArrayList(this.b);
            int size3 = arrayList2.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                ((vka) obj3).getClass();
            }
            int size4 = arrayList2.size();
            while (i < size4) {
                Object obj4 = arrayList2.get(i);
                i++;
                vka vkaVar2 = (vka) obj4;
                if (go4.K(2)) {
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + vkaVar2);
                }
                vkaVar2.a(this.a);
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vka) obj).getClass();
            el2.d(null, arrayList2);
        }
        List k = yk2.k(yk2.m(arrayList2));
        int size2 = k.size();
        for (int i2 = 0; i2 < size2; i2++) {
            uka ukaVar = (uka) k.get(i2);
            ukaVar.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!ukaVar.a) {
                ukaVar.c(viewGroup);
            }
            ukaVar.a = true;
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vka) obj).getClass();
        }
    }
}
