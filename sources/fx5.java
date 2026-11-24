// default package

import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fx5 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i96 b;

    public /* synthetic */ fx5(i96 i96Var, byte b) {
        this.a = b;
        this.b = i96Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        i96 i96Var = this.b;
        i96 i96Var2 = (i96) obj;
        i96 i96Var3 = (i96) obj2;
        switch (b) {
            case 0:
                if (i96Var2 != i96Var) {
                    if (i96Var3 != i96Var) {
                        int i = i96Var2.k;
                        int i2 = i96Var3.k;
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
                if (i96Var2 != i96Var) {
                    if (i96Var3 != i96Var) {
                        List list = b1c.N;
                        int indexOf = list.indexOf(i96Var2.f);
                        int indexOf2 = list.indexOf(i96Var3.f);
                        if (indexOf >= 0) {
                            if (indexOf2 >= 0) {
                                break;
                            }
                        } else if (indexOf2 < 0) {
                            int i3 = i96Var2.k;
                            int i4 = i96Var3.k;
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
