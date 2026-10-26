package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y4;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class t0 extends c {
    public final Context K;
    public final u6 L;
    public boolean M;

    public t0(Context context, u6 u6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.M = false;
        this.K = context;
        this.L = u6Var;
        new c10(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i10) {
        ArrayList arrayList = this.r;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        if (this.J) {
            return null;
        }
        int size = i10 - arrayList.size();
        if (!arrayList.isEmpty()) {
            size--;
        }
        if (size < 0) {
            return null;
        }
        ArrayList arrayList2 = this.s;
        if (size < arrayList2.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
        }
        return null;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.r;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        if (this.M) {
            return size;
        }
        if (this.J) {
            return size + 3;
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        if (!isEmpty && !arrayList2.isEmpty()) {
            size++;
        }
        return arrayList2.size() + size;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ArrayList arrayList = this.r;
        return ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i11;
        int i12 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = true;
        ArrayList arrayList = this.r;
        if (i12 != 0) {
            if (i12 == 1) {
                if (i10 != 0 || arrayList.isEmpty()) {
                    ((z3) view).setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                } else {
                    ((z3) view).setText(LocaleController.getString(R.string.LocationOnMap));
                    return;
                }
            }
            return;
        }
        int i13 = !arrayList.isEmpty() ? i10 - 1 : i10;
        if (i13 < 0 || i13 >= arrayList.size()) {
            if (!this.J) {
                int size = i13 - arrayList.size();
                if (!this.n && !arrayList.isEmpty()) {
                    size--;
                }
                i11 = size;
                if (i11 >= 0) {
                    ArrayList arrayList2 = this.s;
                    if (i11 < arrayList2.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i11);
                    }
                }
            }
            tL_messageMediaVenue = null;
            i11 = i10;
        } else {
            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i13);
            i11 = 2;
        }
        y4 y4Var = (y4) view;
        if (i10 == h() - 1 || (!this.n && !arrayList.isEmpty() && i10 == arrayList.size())) {
            z10 = false;
        }
        y4Var.b(tL_messageMediaVenue, i11, z10, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var = this.L;
        Context context = this.K;
        return new vl0(i10 == 0 ? new y4(context, u6Var) : new z3(context, u6Var));
    }
}
