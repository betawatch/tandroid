package n0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    public final Locale get(int i7) {
        return this.a.get(i7);
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
