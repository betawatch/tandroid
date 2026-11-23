package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c1 extends v4.u {
    public final /* synthetic */ h1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(h1 h1Var) {
        super(true);
        this.S = h1Var;
    }

    @Override // v4.u
    public final boolean B1(int i7) {
        byte b10;
        h1 h1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.s.items;
        org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) h1Var.w.b.get(arrayList.get((arrayList.size() - i7) - 1));
        if (yiVar.a != yiVar.b && (b10 = yiVar.c) == yiVar.d && b10 != 0) {
            int size = h1Var.w.a.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.yi yiVar2 = (org.telegram.messenger.yi) h1Var.w.a.get(i10);
                if (yiVar2 != yiVar) {
                    byte b11 = yiVar2.c;
                    byte b12 = yiVar.c;
                    if (b11 <= b12 && yiVar2.d >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // v4.u
    public final boolean C1(View view) {
        return false;
    }

    @Override // v4.t, v4.c0, v4.p0
    public final boolean y0() {
        return false;
    }
}
