// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ane {
    public static void a(vib vibVar, vib vibVar2, int i) {
        if (vibVar == null || vibVar2 == null || vibVar == vibVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(vibVar.g);
        ui6 ui6Var = (ui6) vibVar.f;
        ui6 ui6Var2 = (ui6) vibVar2.f;
        while (ui6Var != ui6Var2) {
            sb.append(((vib) ui6Var).g);
            ui6 ui6Var3 = (ui6) ui6Var.f;
            ui6Var.g();
            ui6Var = ui6Var3;
        }
        vibVar.g = sb.toString();
    }

    public static void b(ui6 ui6Var, ui6 ui6Var2) {
        vib vibVar = null;
        vib vibVar2 = null;
        int i = 0;
        while (ui6Var != null) {
            if (ui6Var instanceof vib) {
                vibVar2 = (vib) ui6Var;
                if (vibVar == null) {
                    vibVar = vibVar2;
                }
                i = vibVar2.g.length() + i;
            } else {
                a(vibVar, vibVar2, i);
                vibVar = null;
                vibVar2 = null;
                i = 0;
            }
            if (ui6Var == ui6Var2) {
                break;
            } else {
                ui6Var = (ui6) ui6Var.f;
            }
        }
        a(vibVar, vibVar2, i);
    }
}
