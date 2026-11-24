// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hu extends s35 {
    public final /* synthetic */ mu S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(mu muVar) {
        super(true);
        this.S = muVar;
    }

    @Override // r35, t26, d49
    public final boolean x0() {
        return false;
    }

    @Override // s35
    public final boolean z1(int i) {
        byte b;
        mu muVar = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = muVar.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i) - 1);
        lu luVar = muVar.w;
        c27 c27Var = (c27) luVar.b.get(pageBlock);
        if (c27Var.a != c27Var.b && (b = c27Var.c) == c27Var.d && b != 0) {
            int size = luVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                c27 c27Var2 = (c27) luVar.a.get(i2);
                if (c27Var2 != c27Var) {
                    byte b2 = c27Var2.c;
                    byte b3 = c27Var.c;
                    if (b2 <= b3 && c27Var2.d >= b3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
