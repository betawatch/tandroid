package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.pz;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class s0 extends c {
    public final Context x;
    public final e6 y;

    public s0(Context context, e6 e6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.x = context;
        this.y = e6Var;
        new pz(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue H(int i7) {
        int i10;
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty() && i7 - 1 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        return null;
    }

    @Override // v4.h0
    public final int b() {
        ArrayList arrayList = this.f;
        return arrayList.isEmpty() ? this.w ? 3 : 0 : arrayList.size() + 1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return (i7 != 0 || this.f.isEmpty()) ? 0 : 1;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i7);
            ((v4) view).a(H, H != null ? 2 : i7, i7 != b() - 1, false);
        } else if (i10 == 1) {
            ((x3) view).setText(hd.M0(2131748752, null));
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        e6 e6Var = this.y;
        Context context = this.x;
        return new cj0(i7 == 0 ? new v4(context, e6Var) : new x3(context, e6Var));
    }
}
