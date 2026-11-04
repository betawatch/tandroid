package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.iz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class p0 extends c {
    public final Context x;
    public final e6 y;

    public p0(Context context, e6 e6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.x = context;
        this.y = e6Var;
        new iz(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue H(int i3) {
        int i10;
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty() && i3 - 1 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        return null;
    }

    @Override // u4.h0
    public final int b() {
        ArrayList arrayList = this.f;
        return arrayList.isEmpty() ? this.w ? 3 : 0 : arrayList.size() + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return (i3 != 0 || this.f.isEmpty()) ? 0 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i3);
            ((v4) view).a(H, H != null ? 2 : i3, i3 != b() - 1, false);
        } else if (i10 == 1) {
            ((x3) view).setText(bd.M0(2131748760, null));
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        e6 e6Var = this.y;
        Context context = this.x;
        return new bj0(i3 == 0 ? new v4(context, e6Var) : new x3(context, e6Var));
    }
}
