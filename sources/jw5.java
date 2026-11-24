// default package

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jw5 {
    public final String a;

    public jw5(String str, byte b) {
        switch (b) {
            case 1:
                this.a = str;
                break;
            default:
                str.getClass();
                this.a = str;
                break;
        }
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e) {
            bh7.j(e);
        }
    }

    public final String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }
}
