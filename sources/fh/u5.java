package fh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ u5(e6 e6Var, int i9) {
        this.a = i9;
        this.b = e6Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                Integer num = (Integer) e6Var.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) e6Var.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                e6 e6Var2 = this.b;
                Integer num3 = (Integer) e6Var2.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num4 = (Integer) e6Var2.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                e6 e6Var3 = this.b;
                Integer num5 = (Integer) e6Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num6 = (Integer) e6Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
