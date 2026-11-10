package ff;

import ef.c;
import ef.d;
import ef.e;
import ef.f;
import gf.h;
import java.util.ArrayList;
import kf.p;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b extends mf.a {
    public final ArrayList c;
    public final ArrayList d;
    public final ef.a a = new ef.a();
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
        int i7 = 0;
        while (i7 < trim.length()) {
            char charAt = trim.charAt(i7);
            if (charAt == '\\') {
                int i10 = i7 + 1;
                if (i10 >= trim.length() || trim.charAt(i10) != '|') {
                    sb2.append('\\');
                } else {
                    sb2.append('|');
                    i7 = i10;
                }
            } else if (charAt != '|') {
                sb2.append(charAt);
            } else {
                arrayList.add(sb2.toString());
                sb2.setLength(0);
            }
            i7++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override // mf.a
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // mf.a
    public final kf.a e() {
        return this.a;
    }

    @Override // mf.a
    public final void g(lf.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        e eVar = new e();
        ef.a aVar2 = this.a;
        aVar2.b(eVar);
        p fVar = new f();
        eVar.b(fVar);
        int i7 = 0;
        while (true) {
            arrayList = this.c;
            if (i7 >= size) {
                break;
            }
            String str = (String) arrayList2.get(i7);
            d dVar = new d();
            if (i7 < arrayList.size()) {
                dVar.h = (c) arrayList.get(i7);
            }
            aVar.a(str.trim(), dVar);
            dVar.g = true;
            fVar.b(dVar);
            i7++;
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
                pVar = new ef.b();
                aVar2.b(pVar);
            }
            pVar.b(fVar2);
        }
    }

    @Override // mf.a
    public final gf.a h(h hVar) {
        if (hVar.a.toString().contains("|")) {
            return gf.a.a(hVar.b);
        }
        return null;
    }
}
