package d9;

import fb.n;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f implements n {
    public String a;

    public f(String str, int i10) {
        switch (i10) {
            case 1:
                this.a = str;
                break;
            default:
                str.getClass();
                this.a = str;
                break;
        }
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // fb.n
    public Object v2() {
        throw new db.j(this.a);
    }
}
