package cf;

import bf.c;
import bf.d;
import bf.e;
import bf.f;
import df.g;
import gf.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends jf.a {
    public final ArrayList c;
    public final ArrayList d;
    public final bf.a a = new bf.a();
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
        int i3 = 0;
        while (i3 < trim.length()) {
            char charAt = trim.charAt(i3);
            if (charAt == '\\') {
                int i10 = i3 + 1;
                if (i10 >= trim.length() || trim.charAt(i10) != '|') {
                    sb2.append('\\');
                } else {
                    sb2.append('|');
                    i3 = i10;
                }
            } else if (charAt != '|') {
                sb2.append(charAt);
            } else {
                arrayList.add(sb2.toString());
                sb2.setLength(0);
            }
            i3++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override // jf.a
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // jf.a
    public final gf.a e() {
        return this.a;
    }

    @Override // jf.a
    public final void g(hf.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        e eVar = new e();
        bf.a aVar2 = this.a;
        aVar2.b(eVar);
        p fVar = new f();
        eVar.b(fVar);
        int i3 = 0;
        while (true) {
            arrayList = this.c;
            if (i3 >= size) {
                break;
            }
            String str = (String) arrayList2.get(i3);
            d dVar = new d();
            if (i3 < arrayList.size()) {
                dVar.h = (c) arrayList.get(i3);
            }
            aVar.a(str.trim(), dVar);
            dVar.g = true;
            fVar.b(dVar);
            i3++;
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
                pVar = new bf.b();
                aVar2.b(pVar);
            }
            pVar.b(fVar2);
        }
    }

    @Override // jf.a
    public final df.a h(g gVar) {
        if (gVar.a.toString().contains("|")) {
            return df.a.a(gVar.b);
        }
        return null;
    }
}
