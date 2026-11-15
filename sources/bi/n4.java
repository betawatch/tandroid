package bi;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ n4(a6 a6Var, int i7) {
        this.a = i7;
        this.b = a6Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b.d;
                Integer num = (Integer) o5Var.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num2 = (Integer) o5Var.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                o5 o5Var2 = this.b.d;
                Integer num3 = (Integer) o5Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) o5Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                o5 o5Var3 = this.b.d;
                Integer num5 = (Integer) o5Var3.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num6 = (Integer) o5Var3.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
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
