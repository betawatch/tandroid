package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jv0 extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ kv0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(kv0 kv0Var, Context context, int i10, g60 g60Var) {
        super(context, i10, g60Var, null);
        this.C = kv0Var;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean e() {
        mv0 mv0Var = this.C.d;
        rb1 rb1Var = mv0Var.c;
        View F = rb1Var.F(this);
        f2.l1 T = F == null ? null : rb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = mv0Var.y;
            if (i10 == mv0Var.n && b10 == (mv0Var.k0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean f(org.telegram.ui.Cells.b6 b6Var) {
        int b10;
        mv0 mv0Var = this.C.d;
        rb1 rb1Var = mv0Var.c;
        View F = rb1Var.F(b6Var);
        f2.l1 T = F == null ? null : rb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return mv0Var.w[b10 - mv0Var.k0];
    }

    @Override // org.telegram.ui.Cells.b6
    public final void g(dh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            zn.k8(menu, this.C.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(org.telegram.ui.Cells.b6 b6Var, boolean z4) {
        int b10;
        mv0 mv0Var = this.C.d;
        if (z4 && mv0Var.I) {
            Arrays.fill(mv0Var.w, false);
            mv0Var.c.getChildCount();
            for (int i10 = mv0Var.k0; i10 < mv0Var.k0 + mv0Var.y; i10++) {
                f2.l1 K = mv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(b6Var, z4);
        rb1 rb1Var = mv0Var.c;
        View F = rb1Var.F(b6Var);
        f2.l1 T = F == null ? null : rb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            mv0Var.w[b10 - mv0Var.k0] = z4;
        }
        mv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.b6
    public final void i(boolean z4) {
        mv0.d0(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(org.telegram.ui.Cells.b6 b6Var) {
        mv0.e0(this.C.d, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean l(ArrayList arrayList) {
        mv0 mv0Var = this.C.d;
        if (!arrayList.isEmpty()) {
            mv0Var.c.getClass();
            int R = RecyclerView.R(this) - mv0Var.k0;
            if (R >= 0) {
                dh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < mv0Var.n) {
                    for (int length = mv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = mv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    mv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    mv0Var.y++;
                    i10++;
                }
                mv0Var.r0();
                mv0Var.d0 = (mv0Var.k0 + i10) - 1;
                mv0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean o() {
        return this.C.d.I;
    }
}
