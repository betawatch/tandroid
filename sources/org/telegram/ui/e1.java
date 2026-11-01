package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e1 extends s4.s {
    public final /* synthetic */ j1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j1 j1Var) {
        super(true);
        this.S = j1Var;
    }

    @Override // s4.s
    public final boolean B1(int i10) {
        byte b10;
        j1 j1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.s.items;
        org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) j1Var.w.b.get(arrayList.get((arrayList.size() - i10) - 1));
        if (cjVar.a != cjVar.b && (b10 = cjVar.c) == cjVar.d && b10 != 0) {
            int size = j1Var.w.a.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.cj cjVar2 = (org.telegram.messenger.cj) j1Var.w.a.get(i11);
                if (cjVar2 != cjVar) {
                    byte b11 = cjVar2.c;
                    byte b12 = cjVar.c;
                    if (b11 <= b12 && cjVar2.d >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // s4.s
    public final boolean C1(View view) {
        return false;
    }

    @Override // s4.r, s4.a0, s4.n0
    public final boolean y0() {
        return false;
    }
}
