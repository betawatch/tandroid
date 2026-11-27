// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bib extends y1 {
    public final ArrayList c;
    public final ArrayList d;
    public final aib a = new aib();
    public final ArrayList b = new ArrayList();
    public boolean e = true;

    public bib(ArrayList arrayList, ArrayList arrayList2) {
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

    @Override // y1
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // y1
    public final hk0 e() {
        return this.a;
    }

    @Override // y1
    public final void g(tp5 tp5Var) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        kib kibVar = new kib();
        aib aibVar = this.a;
        aibVar.b(kibVar);
        yi6 bjbVar = new bjb();
        kibVar.b(bjbVar);
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= size) {
                break;
            }
            String str = (String) arrayList2.get(i);
            iib iibVar = new iib();
            if (i < arrayList.size()) {
                iibVar.h = (gib) arrayList.get(i);
            }
            tp5Var.a(str.trim(), iibVar);
            iibVar.g = true;
            bjbVar.b(iibVar);
            i++;
        }
        ArrayList arrayList3 = this.b;
        int size2 = arrayList3.size();
        yi6 yi6Var = null;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList3.get(i2);
            i2++;
            ArrayList i3 = i((CharSequence) obj);
            yi6 bjbVar2 = new bjb();
            int i4 = 0;
            while (i4 < size) {
                String str2 = i4 < i3.size() ? (String) i3.get(i4) : "";
                iib iibVar2 = new iib();
                if (i4 < arrayList.size()) {
                    iibVar2.h = (gib) arrayList.get(i4);
                }
                tp5Var.a(str2.trim(), iibVar2);
                bjbVar2.b(iibVar2);
                i4++;
            }
            if (yi6Var == null) {
                yi6Var = new cib();
                aibVar.b(yi6Var);
            }
            yi6Var.b(bjbVar2);
        }
    }

    @Override // y1
    public final qk2 h(mp3 mp3Var) {
        if (mp3Var.a.toString().contains("|")) {
            return qk2.a(mp3Var.b);
        }
        return null;
    }
}
