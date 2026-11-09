package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class s0 extends c {
    public final Context x;
    public final g6 y;

    public s0(Context context, g6 g6Var, boolean z9, boolean z10) {
        super(z9, z10);
        this.x = context;
        this.y = g6Var;
        new mz(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.pj0
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
            ((x3) view).setText(id.M0(2131748752, null));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        g6 g6Var = this.y;
        Context context = this.x;
        return new yi0(i7 == 0 ? new v4(context, g6Var) : new x3(context, g6Var));
    }
}
