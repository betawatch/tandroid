package he;

import g4.h;
import ge.c;
import ge.d;
import ge.e;
import ge.f;
import java.util.ArrayList;
import le.p;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends ne.a {
    public final ArrayList c;
    public final ArrayList d;
    public final ge.a a = new ge.a();
    public final ArrayList b = new ArrayList();
    public boolean e = true;

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < trim.length()) {
            char charAt = trim.charAt(i10);
            if (charAt == '\\') {
                int i11 = i10 + 1;
                if (i11 >= trim.length() || trim.charAt(i11) != '|') {
                    sb2.append('\\');
                } else {
                    sb2.append('|');
                    i10 = i11;
                }
            } else if (charAt != '|') {
                sb2.append(charAt);
            } else {
                arrayList.add(sb2.toString());
                sb2.setLength(0);
            }
            i10++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override // ne.a
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // ne.a
    public final le.a e() {
        return this.a;
    }

    @Override // ne.a
    public final void g(me.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        e eVar = new e();
        ge.a aVar2 = this.a;
        aVar2.b(eVar);
        p fVar = new f();
        eVar.b(fVar);
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            if (i10 >= size) {
                break;
            }
            String str = (String) arrayList2.get(i10);
            d dVar = new d();
            if (i10 < arrayList.size()) {
                dVar.h = (c) arrayList.get(i10);
            }
            aVar.a(str.trim(), dVar);
            dVar.g = true;
            fVar.b(dVar);
            i10++;
        }
        ArrayList arrayList3 = this.b;
        int size2 = arrayList3.size();
        p pVar = null;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList3.get(i11);
            i11++;
            ArrayList i12 = i((CharSequence) obj);
            p fVar2 = new f();
            int i13 = 0;
            while (i13 < size) {
                String str2 = i13 < i12.size() ? (String) i12.get(i13) : "";
                d dVar2 = new d();
                if (i13 < arrayList.size()) {
                    dVar2.h = (c) arrayList.get(i13);
                }
                aVar.a(str2.trim(), dVar2);
                fVar2.b(dVar2);
                i13++;
            }
            if (pVar == null) {
                pVar = new ge.b();
                aVar2.b(pVar);
            }
            pVar.b(fVar2);
        }
    }

    @Override // ne.a
    public final h h(ie.e eVar) {
        if (eVar.a.toString().contains("|")) {
            return h.a(eVar.b);
        }
        return null;
    }
}
