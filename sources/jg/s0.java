package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class s0 extends c {
    public final Context x;
    public final i6 y;

    public s0(Context context, i6 i6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.x = context;
        this.y = i6Var;
        new wz(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.bk0
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
            ((v4) view).a(H, H != null ? 2 : i7, i7 != b() - 1, false);
        } else if (i10 == 1) {
            ((x3) view).setText(gd.M0(2131748560, null));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        i6 i6Var = this.y;
        Context context = this.x;
        return new kj0(i7 == 0 ? new v4(context, i6Var) : new x3(context, i6Var));
    }
}
