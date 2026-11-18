package bi;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ v6(h8 h8Var, int i7) {
        this.a = i7;
        this.b = h8Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                v7 v7Var = this.b.d;
                Integer num = (Integer) v7Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num2 = (Integer) v7Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                v7 v7Var2 = this.b.d;
                Integer num3 = (Integer) v7Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) v7Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                v7 v7Var3 = this.b.d;
                Integer num5 = (Integer) v7Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num6 = (Integer) v7Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
