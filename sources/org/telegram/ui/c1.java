package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) h1Var.w.b.get(arrayList.get((arrayList.size() - i7) - 1));
        if (xiVar.a != xiVar.b && (b10 = xiVar.c) == xiVar.d && b10 != 0) {
            int size = h1Var.w.a.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.xi xiVar2 = (org.telegram.messenger.xi) h1Var.w.a.get(i10);
                if (xiVar2 != xiVar) {
                    byte b11 = xiVar2.c;
                    byte b12 = xiVar.c;
                    if (b11 <= b12 && xiVar2.d >= b12) {
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
