package d9;

import fb.n;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f implements n {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ f(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.b);
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
    public Object h2() {
        throw new db.j(this.b);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public f(String str) {
        this.a = 0;
        str.getClass();
        this.b = str;
    }
}
