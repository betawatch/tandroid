package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class s0 extends c {
    public final Context x;
    public final h6 y;

    public s0(Context context, h6 h6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.x = context;
        this.y = h6Var;
        new yz(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
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

    @Override // v4.i0
    public final int b() {
        ArrayList arrayList = this.f;
        return arrayList.isEmpty() ? this.w ? 3 : 0 : arrayList.size() + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return (i7 != 0 || this.f.isEmpty()) ? 0 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i7);
            ((w4) view).a(H, H != null ? 2 : i7, i7 != b() - 1, false);
        } else if (i10 == 1) {
            ((y3) view).setText(hd.N0(2131748559, null));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        h6 h6Var = this.y;
        Context context = this.x;
        return new mj0(i7 == 0 ? new w4(context, h6Var) : new y3(context, h6Var));
    }
}
