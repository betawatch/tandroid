package kh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class g5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ g5(p5 p5Var, int i10) {
        this.a = i10;
        this.b = p5Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                p5 p5Var = this.b;
                Integer num = (Integer) p5Var.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) p5Var.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                p5 p5Var2 = this.b;
                Integer num3 = (Integer) p5Var2.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num4 = (Integer) p5Var2.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                p5 p5Var3 = this.b;
                Integer num5 = (Integer) p5Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num6 = (Integer) p5Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num5 == null) {
                    return 1;
                }
                if (num6 == null) {
                    return -1;
                }
                return num6.intValue() - num5.intValue();
        }
    }
}
