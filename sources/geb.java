// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class geb extends x1 {
    public final ArrayList c;
    public final ArrayList d;
    public final feb a = new feb();
    public final ArrayList b = new ArrayList();
    public boolean e = true;

    public geb(ArrayList arrayList, ArrayList arrayList2) {
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
        int i = 0;
        while (i < trim.length()) {
            char charAt = trim.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (i2 >= trim.length() || trim.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    i = i2;
                }
            } else if (charAt != '|') {
                sb.append(charAt);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // x1
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // x1
    public final gk0 e() {
        return this.a;
    }

    @Override // x1
    public final void g(qn5 qn5Var) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        peb pebVar = new peb();
        feb febVar = this.a;
        febVar.b(pebVar);
        tg6 gfbVar = new gfb();
        pebVar.b(gfbVar);
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= size) {
                break;
            }
            String str = (String) arrayList2.get(i);
            neb nebVar = new neb();
            if (i < arrayList.size()) {
                nebVar.h = (leb) arrayList.get(i);
            }
            qn5Var.a(str.trim(), nebVar);
            nebVar.g = true;
            gfbVar.b(nebVar);
            i++;
        }
        ArrayList arrayList3 = this.b;
        int size2 = arrayList3.size();
        tg6 tg6Var = null;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList3.get(i2);
            i2++;
            ArrayList i3 = i((CharSequence) obj);
            tg6 gfbVar2 = new gfb();
            int i4 = 0;
            while (i4 < size) {
                String str2 = i4 < i3.size() ? (String) i3.get(i4) : "";
                neb nebVar2 = new neb();
                if (i4 < arrayList.size()) {
                    nebVar2.h = (leb) arrayList.get(i4);
                }
                qn5Var.a(str2.trim(), nebVar2);
                gfbVar2.b(nebVar2);
                i4++;
            }
            if (tg6Var == null) {
                tg6Var = new heb();
                febVar.b(tg6Var);
            }
            tg6Var.b(gfbVar2);
        }
    }

    @Override // x1
    public final vj2 h(vo3 vo3Var) {
        if (vo3Var.a.toString().contains("|")) {
            return vj2.a(vo3Var.b);
        }
        return null;
    }
}
