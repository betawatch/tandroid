package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d1 extends u4.t {
    public final /* synthetic */ i1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(i1 i1Var) {
        super(true);
        this.S = i1Var;
    }

    @Override // u4.t
    public final boolean B1(int i3) {
        byte b10;
        i1 i1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = i1Var.s.items;
        org.telegram.messenger.ri riVar = (org.telegram.messenger.ri) i1Var.w.b.get(arrayList.get((arrayList.size() - i3) - 1));
        if (riVar.a != riVar.b && (b10 = riVar.c) == riVar.d && b10 != 0) {
            int size = i1Var.w.a.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.ri riVar2 = (org.telegram.messenger.ri) i1Var.w.a.get(i10);
                if (riVar2 != riVar) {
                    byte b11 = riVar2.c;
                    byte b12 = riVar.c;
                    if (b11 <= b12 && riVar2.d >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // u4.t
    public final boolean C1(View view) {
        return false;
    }

    @Override // u4.s, u4.b0, u4.o0
    public final boolean y0() {
        return false;
    }
}
