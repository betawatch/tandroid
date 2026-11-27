// default package

import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class k18 {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(qy0 qy0Var, String str) {
        qv2 parent = qy0Var.getParent();
        ArrayList arrayList = ((zg0) parent).b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qy0 qy0Var2 = (qy0) obj;
            if (qy0Var2.getType().equals(qy0Var.getType())) {
                if (qy0Var2 == qy0Var) {
                    break;
                }
                i++;
            }
        }
        String concat = String.format("/%s[%d]", qy0Var.getType(), Integer.valueOf(i)).concat(str);
        return parent instanceof qy0 ? a((qy0) parent, concat) : concat;
    }
}
