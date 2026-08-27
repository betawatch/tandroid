package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ot0 extends f2.c0 {
    public final /* synthetic */ qt0 d;

    public ot0(qt0 qt0Var) {
        this.d = qt0Var;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.a.setPressed(false);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        SavedMessagesController.SavedDialog r10;
        int l10 = f2.c0.l(0, 0);
        hu0 hu0Var = this.d.x;
        return (!hu0Var.y1 || recyclerView.getAdapter() == hu0Var.O || (r10 = r(o1Var)) == null || !r10.pinned) ? l10 : f2.c0.l(3, 0);
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        qt0 qt0Var = this.d;
        ArrayList arrayList = qt0Var.f;
        hu0 hu0Var = qt0Var.x;
        if (!hu0Var.y1 || recyclerView.getAdapter() == hu0Var.O) {
            return false;
        }
        SavedMessagesController.SavedDialog r10 = r(o1Var);
        SavedMessagesController.SavedDialog r11 = r(o1Var2);
        if (r10 == null || r11 == null || !r10.pinned || !r11.pinned) {
            return false;
        }
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        arrayList.remove(b10);
        arrayList.add(b11, r10);
        qt0Var.p(b10, b11);
        qt0Var.h = true;
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        ys0 ys0Var;
        qt0 qt0Var = this.d;
        up0 up0Var = qt0Var.n;
        if (o1Var != null && (ys0Var = qt0Var.s) != null) {
            ys0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(up0Var);
            AndroidUtilities.runOnUIThread(up0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.o1 o1Var) {
        int b10;
        if (o1Var != null && (b10 = o1Var.b()) >= 0) {
            qt0 qt0Var = this.d;
            if (b10 < qt0Var.f.size()) {
                return (SavedMessagesController.SavedDialog) qt0Var.f.get(b10);
            }
        }
        return null;
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }
}
