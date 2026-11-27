// default package

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fc9 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nd9 b;

    public /* synthetic */ fc9(nd9 nd9Var, byte b) {
        this.a = b;
        this.b = nd9Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                ed9 ed9Var = nd9Var.e;
                Integer num = (Integer) ed9Var.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) ed9Var.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 != null) {
                    return num2.intValue() - num.intValue();
                }
                return -1;
            case 1:
                ed9 ed9Var2 = nd9Var.e;
                Integer num3 = (Integer) ed9Var2.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num4 = (Integer) ed9Var2.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 != null) {
                    return num4.intValue() - num3.intValue();
                }
                return -1;
            default:
                ed9 ed9Var3 = nd9Var.e;
                Integer num5 = (Integer) ed9Var3.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num6 = (Integer) ed9Var3.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num5 == null) {
                    return 1;
                }
                if (num6 != null) {
                    return num6.intValue() - num5.intValue();
                }
                return -1;
        }
    }
}
