// default package

import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kz5 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb6 b;

    public /* synthetic */ kz5(mb6 mb6Var, byte b) {
        this.a = b;
        this.b = mb6Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        mb6 mb6Var = this.b;
        mb6 mb6Var2 = (mb6) obj;
        mb6 mb6Var3 = (mb6) obj2;
        switch (b) {
            case 0:
                if (mb6Var2 != mb6Var) {
                    if (mb6Var3 != mb6Var) {
                        int i = mb6Var2.k;
                        int i2 = mb6Var3.k;
                        if (i == i2) {
                            break;
                        } else if (i <= i2) {
                            if (i >= i2) {
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (mb6Var2 != mb6Var) {
                    if (mb6Var3 != mb6Var) {
                        List list = a5c.N;
                        int indexOf = list.indexOf(mb6Var2.f);
                        int indexOf2 = list.indexOf(mb6Var3.f);
                        if (indexOf >= 0) {
                            if (indexOf2 >= 0) {
                                break;
                            }
                        } else if (indexOf2 < 0) {
                            int i3 = mb6Var2.k;
                            int i4 = mb6Var3.k;
                            if (i3 == i4) {
                                break;
                            } else if (i3 <= i4) {
                                if (i3 >= i4) {
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
    }
}
