// default package

import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ey7 {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(iy0 iy0Var, String str) {
        wu2 parent = iy0Var.getParent();
        ArrayList arrayList = ((yg0) parent).b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iy0 iy0Var2 = (iy0) obj;
            if (iy0Var2.getType().equals(iy0Var.getType())) {
                if (iy0Var2 == iy0Var) {
                    break;
                }
                i++;
            }
        }
        String concat = String.format("/%s[%d]", iy0Var.getType(), Integer.valueOf(i)).concat(str);
        return parent instanceof iy0 ? a((iy0) parent, concat) : concat;
    }
}
