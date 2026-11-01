package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements org.telegram.ui.Components.hk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ mv(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                zx zxVar = this.b;
                Object obj = zxVar.C0.x0.G(i10).G;
                if (!(obj instanceof org.telegram.messenger.kj)) {
                    if (obj instanceof th.r4) {
                        th.r4 r4Var = (th.r4) obj;
                        Bundle i11 = org.telegram.ui.Cells.f1.i(3, TeXSymbolParser.TYPE_ATTR);
                        i11.putString("hashtag", r4Var.C);
                        i11.putInt("storiesCount", r4Var.J);
                        zxVar.presentFragment(new org.telegram.ui.Components.n90(i11, null));
                        break;
                    }
                } else {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.kj.B0(kjVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.kj.B0(kjVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.kj.B0(kjVar.k));
                    }
                    bundle.putInt("message_id", kjVar.f1());
                    un unVar = new un(bundle);
                    zx.p4(unVar, kjVar);
                    zxVar.presentFragment(unVar);
                    break;
                }
                break;
            default:
                zx zxVar2 = this.b;
                zxVar2.b0.I0(true);
                ArrayList arrayList = zxVar2.b0.e3;
                zxVar2.t3(arrayList.isEmpty() ? zf.g0.j3[i10] : (zf.e0) arrayList.get(i10));
                break;
        }
    }
}
