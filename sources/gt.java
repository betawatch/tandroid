// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gt extends q59 {
    public final Context c;
    public final /* synthetic */ ht d;

    public gt(ht htVar, Context context) {
        this.d = htVar;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
    }

    @Override // y59
    public final int b() {
        return this.d.H;
    }

    @Override // y59
    public final int d(int i) {
        ht htVar = this.d;
        if (i >= htVar.y && i < htVar.E) {
            return 0;
        }
        if (i == htVar.F) {
            return 1;
        }
        return (i == htVar.G || i == htVar.x) ? 2 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        View view = u69Var.a;
        ht htVar = this.d;
        ArrayList arrayList = htVar.h;
        if (d(i) != 0) {
            if (d(i) == 2) {
                njb njbVar = (njb) view;
                if (i == htVar.x) {
                    njbVar.setTopPadding(17);
                    njbVar.setBottomPadding(10);
                    njbVar.setText(jb6.M0(htVar.I == 5 ? 2131754100 : 2131754089, null));
                    return;
                } else {
                    njbVar.setTopPadding(10);
                    njbVar.setBottomPadding(17);
                    njbVar.setText(null);
                    return;
                }
            }
            return;
        }
        int i3 = i - htVar.y;
        et etVar = (et) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i3);
        etVar.b(stickerSetCovered, i3 != arrayList.size() - 1);
        mu8 mu8Var = etVar.f;
        i2 = ((d) htVar).currentAccount;
        boolean D0 = hs6.d0(i2).D0(stickerSetCovered.set.id, true);
        etVar.a(D0, false, false);
        vh6 vh6Var = htVar.a;
        if (D0) {
            vh6Var.l(stickerSetCovered.set.id);
            if (mu8Var != null) {
                mu8Var.a(false, false);
            }
        } else {
            boolean z = vh6Var.h(stickerSetCovered.set.id) >= 0;
            if (mu8Var != null) {
                mu8Var.a(z, false);
            }
        }
        etVar.setOnCheckedChangeListener(new o(this, stickerSetCovered, (byte) 13));
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        View view = null;
        if (i == 0) {
            et etVar = new et(context, true);
            anb.h(cmb.c6, null, etVar);
            view = etVar;
        } else if (i == 1) {
            view = new pa6(context);
        } else if (i == 2) {
            view = new njb(context);
        }
        view.setLayoutParams(new g69(-1, -2));
        return new b59(view);
    }
}
