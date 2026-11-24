// default package

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ob6 implements nb6 {
    public final LocaleList a;

    public ob6(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // nb6
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // nb6
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((nb6) obj).b());
    }

    @Override // nb6
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // nb6
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
