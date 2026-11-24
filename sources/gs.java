// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gs extends n39 {
    public final Context c;
    public final /* synthetic */ hs d;

    public gs(hs hsVar, Context context) {
        this.d = hsVar;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 0;
    }

    @Override // w39
    public final int b() {
        return this.d.H;
    }

    @Override // w39
    public final int d(int i) {
        hs hsVar = this.d;
        if (i >= hsVar.y && i < hsVar.E) {
            return 0;
        }
        if (i == hsVar.F) {
            return 1;
        }
        return (i == hsVar.G || i == hsVar.x) ? 2 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        View view = s49Var.a;
        hs hsVar = this.d;
        ArrayList arrayList = hsVar.h;
        if (d(i) != 0) {
            if (d(i) == 2) {
                mhb mhbVar = (mhb) view;
                if (i == hsVar.x) {
                    mhbVar.setTopPadding(17);
                    mhbVar.setBottomPadding(10);
                    mhbVar.setText(k96.M0(hsVar.I == 5 ? 2131754132 : 2131754121, null));
                    return;
                } else {
                    mhbVar.setTopPadding(10);
                    mhbVar.setBottomPadding(17);
                    mhbVar.setText(null);
                    return;
                }
            }
            return;
        }
        int i3 = i - hsVar.y;
        es esVar = (es) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i3);
        esVar.b(stickerSetCovered, i3 != arrayList.size() - 1);
        ls8 ls8Var = esVar.f;
        i2 = ((d) hsVar).currentAccount;
        boolean D0 = hq6.d0(i2).D0(stickerSetCovered.set.id, true);
        esVar.a(D0, false, false);
        vf6 vf6Var = hsVar.a;
        if (D0) {
            vf6Var.l(stickerSetCovered.set.id);
            if (ls8Var != null) {
                ls8Var.a(false, false);
            }
        } else {
            boolean z = vf6Var.h(stickerSetCovered.set.id) >= 0;
            if (ls8Var != null) {
                ls8Var.a(z, false);
            }
        }
        esVar.setOnCheckedChangeListener(new o(this, stickerSetCovered, (byte) 13));
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        View view = null;
        if (i == 0) {
            es esVar = new es(context, true);
            zkb.h(bkb.c6, null, esVar);
            view = esVar;
        } else if (i == 1) {
            view = new q86(context);
        } else if (i == 2) {
            view = new mhb(context);
        }
        view.setLayoutParams(new e49(-1, -2));
        return new y29(view);
    }
}
