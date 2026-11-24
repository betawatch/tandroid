// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ggb extends x1 {
    public final ArrayList c;
    public final ArrayList d;
    public final fgb a = new fgb();
    public final ArrayList b = new ArrayList();
    public boolean e = true;

    public ggb(ArrayList arrayList, ArrayList arrayList2) {
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
    public final gl0 e() {
        return this.a;
    }

    @Override // x1
    public final void g(qp5 qp5Var) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        pgb pgbVar = new pgb();
        fgb fgbVar = this.a;
        fgbVar.b(pgbVar);
        ui6 ghbVar = new ghb();
        pgbVar.b(ghbVar);
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= size) {
                break;
            }
            String str = (String) arrayList2.get(i);
            ngb ngbVar = new ngb();
            if (i < arrayList.size()) {
                ngbVar.h = (lgb) arrayList.get(i);
            }
            qp5Var.a(str.trim(), ngbVar);
            ngbVar.g = true;
            ghbVar.b(ngbVar);
            i++;
        }
        ArrayList arrayList3 = this.b;
        int size2 = arrayList3.size();
        ui6 ui6Var = null;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList3.get(i2);
            i2++;
            ArrayList i3 = i((CharSequence) obj);
            ui6 ghbVar2 = new ghb();
            int i4 = 0;
            while (i4 < size) {
                String str2 = i4 < i3.size() ? (String) i3.get(i4) : "";
                ngb ngbVar2 = new ngb();
                if (i4 < arrayList.size()) {
                    ngbVar2.h = (lgb) arrayList.get(i4);
                }
                qp5Var.a(str2.trim(), ngbVar2);
                ghbVar2.b(ngbVar2);
                i4++;
            }
            if (ui6Var == null) {
                ui6Var = new hgb();
                fgbVar.b(ui6Var);
            }
            ui6Var.b(ghbVar2);
        }
    }

    @Override // x1
    public final il2 h(fq3 fq3Var) {
        if (fq3Var.a.toString().contains("|")) {
            return il2.a(fq3Var.b);
        }
        return null;
    }
}
