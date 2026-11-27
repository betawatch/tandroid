// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class av4 {
    public final List a;
    public final boolean b;

    public av4(List list, boolean z) {
        this.a = list;
        this.b = z;
        if (list.isEmpty()) {
            lq5.j("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List list2 = list;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((j23) it.next()) instanceof cv4) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i > 0 && i != this.a.size()) {
                lq5.j("Digital Credential Option cannot be used with other credential option.");
                throw null;
            }
            for (j23 j23Var : this.a) {
            }
        }
    }
}
