package je;

import ie.c;
import ie.d;
import ie.e;
import ie.f;
import j4.h;
import java.util.ArrayList;
import ne.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends pe.a {
    public final ArrayList c;
    public final ArrayList d;
    public final ie.a a = new ie.a();
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
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (i10 < trim.length()) {
            char charAt = trim.charAt(i10);
            if (charAt == '\\') {
                int i11 = i10 + 1;
                if (i11 >= trim.length() || trim.charAt(i11) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    i10 = i11;
                }
            } else if (charAt != '|') {
                sb.append(charAt);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
            i10++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // pe.a
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // pe.a
    public final ne.a e() {
        return this.a;
    }

    @Override // pe.a
    public final void g(oe.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        e eVar = new e();
        ie.a aVar2 = this.a;
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
                pVar = new ie.b();
                aVar2.b(pVar);
            }
            pVar.b(fVar2);
        }
    }

    @Override // pe.a
    public final h h(ke.e eVar) {
        if (eVar.a.toString().contains("|")) {
            return h.a(eVar.b);
        }
        return null;
    }
}
