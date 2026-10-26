package n0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f implements e {
    public final LocaleList a;

    public f(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // n0.e
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // n0.e
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((e) obj).b());
    }

    @Override // n0.e
    public final Locale get(int i10) {
        return this.a.get(i10);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // n0.e
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
