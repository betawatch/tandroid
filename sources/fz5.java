// default package

import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fz5 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hb6 b;

    public /* synthetic */ fz5(hb6 hb6Var, byte b) {
        this.a = b;
        this.b = hb6Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        hb6 hb6Var = this.b;
        hb6 hb6Var2 = (hb6) obj;
        hb6 hb6Var3 = (hb6) obj2;
        switch (b) {
            case 0:
                if (hb6Var2 != hb6Var) {
                    if (hb6Var3 != hb6Var) {
                        int i = hb6Var2.k;
                        int i2 = hb6Var3.k;
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
                if (hb6Var2 != hb6Var) {
                    if (hb6Var3 != hb6Var) {
                        List list = b3c.N;
                        int indexOf = list.indexOf(hb6Var2.f);
                        int indexOf2 = list.indexOf(hb6Var3.f);
                        if (indexOf >= 0) {
                            if (indexOf2 >= 0) {
                                break;
                            }
                        } else if (indexOf2 < 0) {
                            int i3 = hb6Var2.k;
                            int i4 = hb6Var3.k;
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
