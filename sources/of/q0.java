package of;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ik0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class q0 extends c {
    public final Context G;
    public final b6 H;
    public boolean I;

    public q0(Context context, b6 b6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.I = false;
        this.G = context;
        this.H = b6Var;
        new e00(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i9) {
        ArrayList arrayList = this.r;
        if (!arrayList.isEmpty()) {
            i9--;
        }
        if (i9 >= 0 && i9 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i9);
        }
        if (this.F) {
            return null;
        }
        int size = i9 - arrayList.size();
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

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.r;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        if (this.I) {
            return size;
        }
        if (this.F) {
            return size + 3;
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        if (!isEmpty && !arrayList2.isEmpty()) {
            size++;
        }
        return arrayList2.size() + size;
    }

    @Override // f2.r0
    public final int j(int i9) {
        ArrayList arrayList = this.r;
        return ((i9 == 0 || i9 == arrayList.size() + 1) && !arrayList.isEmpty()) ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i10;
        int i11 = q1Var.f;
        View view = q1Var.a;
        boolean z10 = true;
        ArrayList arrayList = this.r;
        if (i11 != 0) {
            if (i11 == 1) {
                if (i9 != 0 || arrayList.isEmpty()) {
                    ((v3) view).setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                } else {
                    ((v3) view).setText(LocaleController.getString(R.string.LocationOnMap));
                    return;
                }
            }
            return;
        }
        int i12 = !arrayList.isEmpty() ? i9 - 1 : i9;
        if (i12 < 0 || i12 >= arrayList.size()) {
            if (!this.F) {
                int size = i12 - arrayList.size();
                if (!this.n && !arrayList.isEmpty()) {
                    size--;
                }
                i10 = size;
                if (i10 >= 0) {
                    ArrayList arrayList2 = this.s;
                    if (i10 < arrayList2.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i10);
                    }
                }
            }
            tL_messageMediaVenue = null;
            i10 = i9;
        } else {
            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i12);
            i10 = 2;
        }
        u4 u4Var = (u4) view;
        if (i9 == h() - 1 || (!this.n && !arrayList.isEmpty() && i9 == arrayList.size())) {
            z10 = false;
        }
        u4Var.b(tL_messageMediaVenue, i10, z10, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        b6 b6Var = this.H;
        Context context = this.G;
        return new ik0(i9 == 0 ? new u4(context, b6Var) : new v3(context, b6Var));
    }
}
