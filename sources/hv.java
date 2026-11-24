// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hv extends r55 {
    public final /* synthetic */ mv S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(mv mvVar) {
        super(true);
        this.S = mvVar;
    }

    @Override // q55, u46, f69
    public final boolean x0() {
        return false;
    }

    @Override // r55
    public final boolean z1(int i) {
        byte b;
        mv mvVar = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = mvVar.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i) - 1);
        lv lvVar = mvVar.w;
        c47 c47Var = (c47) lvVar.b.get(pageBlock);
        if (c47Var.a != c47Var.b && (b = c47Var.c) == c47Var.d && b != 0) {
            int size = lvVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                c47 c47Var2 = (c47) lvVar.a.get(i2);
                if (c47Var2 != c47Var) {
                    byte b2 = c47Var2.c;
                    byte b3 = c47Var.c;
                    if (b2 <= b3 && c47Var2.d >= b3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
