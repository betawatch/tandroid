package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class s0 extends c {
    public final Context x;
    public final f6 y;

    public s0(Context context, f6 f6Var, boolean z9, boolean z10) {
        super(z9, z10);
        this.x = context;
        this.y = f6Var;
        new lz(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
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

    @Override // v4.g0
    public final int b() {
        ArrayList arrayList = this.f;
        return arrayList.isEmpty() ? this.w ? 3 : 0 : arrayList.size() + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return (i7 != 0 || this.f.isEmpty()) ? 0 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i7);
            ((v4) view).a(H, H != null ? 2 : i7, i7 != b() - 1, false);
        } else if (i10 == 1) {
            ((x3) view).setText(hd.M0(2131748751, null));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        f6 f6Var = this.y;
        Context context = this.x;
        return new xi0(i7 == 0 ? new v4(context, f6Var) : new x3(context, f6Var));
    }
}
