package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements org.telegram.ui.Components.gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ nv(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                ay ayVar = this.b;
                Object obj = ayVar.C0.x0.G(i10).G;
                if (!(obj instanceof org.telegram.messenger.jj)) {
                    if (obj instanceof th.r4) {
                        th.r4 r4Var = (th.r4) obj;
                        Bundle i11 = org.telegram.ui.Cells.f1.i(3, TeXSymbolParser.TYPE_ATTR);
                        i11.putString("hashtag", r4Var.C);
                        i11.putInt("storiesCount", r4Var.J);
                        ayVar.presentFragment(new org.telegram.ui.Components.n90(i11, null));
                        break;
                    }
                } else {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.jj.B0(jjVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.jj.B0(jjVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.jj.B0(jjVar.k));
                    }
                    bundle.putInt("message_id", jjVar.f1());
                    un unVar = new un(bundle);
                    ay.o4(unVar, jjVar);
                    ayVar.presentFragment(unVar);
                    break;
                }
                break;
            default:
                ay ayVar2 = this.b;
                ayVar2.b0.I0(true);
                ArrayList arrayList = ayVar2.b0.e3;
                ayVar2.s3(arrayList.isEmpty() ? zf.g0.j3[i10] : (zf.e0) arrayList.get(i10));
                break;
        }
    }
}
