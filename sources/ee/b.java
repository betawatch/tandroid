package ee;

import de.c;
import de.d;
import de.e;
import de.f;
import e4.h;
import ie.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends ke.a {
    public final ArrayList c;
    public final ArrayList d;
    public final de.a a = new de.a();
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
        int i9 = 0;
        while (i9 < trim.length()) {
            char charAt = trim.charAt(i9);
            if (charAt == '\\') {
                int i10 = i9 + 1;
                if (i10 >= trim.length() || trim.charAt(i10) != '|') {
                    sb2.append('\\');
                } else {
                    sb2.append('|');
                    i9 = i10;
                }
            } else if (charAt != '|') {
                sb2.append(charAt);
            } else {
                arrayList.add(sb2.toString());
                sb2.setLength(0);
            }
            i9++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override // ke.a
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // ke.a
    public final ie.a e() {
        return this.a;
    }

    @Override // ke.a
    public final void g(je.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        e eVar = new e();
        de.a aVar2 = this.a;
        aVar2.b(eVar);
        p fVar = new f();
        eVar.b(fVar);
        int i9 = 0;
        while (true) {
            arrayList = this.c;
            if (i9 >= size) {
                break;
            }
            String str = (String) arrayList2.get(i9);
            d dVar = new d();
            if (i9 < arrayList.size()) {
                dVar.h = (c) arrayList.get(i9);
            }
            aVar.a(str.trim(), dVar);
            dVar.g = true;
            fVar.b(dVar);
            i9++;
        }
        ArrayList arrayList3 = this.b;
        int size2 = arrayList3.size();
        p pVar = null;
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList3.get(i10);
            i10++;
            ArrayList i11 = i((CharSequence) obj);
            p fVar2 = new f();
            int i12 = 0;
            while (i12 < size) {
                String str2 = i12 < i11.size() ? (String) i11.get(i12) : "";
                d dVar2 = new d();
                if (i12 < arrayList.size()) {
                    dVar2.h = (c) arrayList.get(i12);
                }
                aVar.a(str2.trim(), dVar2);
                fVar2.b(dVar2);
                i12++;
            }
            if (pVar == null) {
                pVar = new de.b();
                aVar2.b(pVar);
            }
            pVar.b(fVar2);
        }
    }

    @Override // ke.a
    public final h h(fe.e eVar) {
        if (eVar.a.toString().contains("|")) {
            return h.a(eVar.b);
        }
        return null;
    }
}
