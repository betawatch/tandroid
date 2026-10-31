package nb;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import jb.i;
import n6.l;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends i {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final mb.a f;
    public final boolean g;

    public e(Context context, mb.a aVar) {
        this.e = context;
        this.f = aVar;
        aVar.getClass();
        this.g = true;
    }

    @Override // jb.i
    public final void b() {
        l.j(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        if (this.d == null) {
            this.f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override // jb.i
    public final void c() {
        l.j(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        if (thickLanguageIdentifier != null) {
            thickLanguageIdentifier.c();
            this.d = null;
        }
    }

    public final String e(String str) {
        String str2;
        if (this.d == null) {
            b();
        }
        if (str.isEmpty()) {
            return "und";
        }
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        l.g(thickLanguageIdentifier);
        ArrayList a2 = thickLanguageIdentifier.a(str);
        int size = a2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                str2 = "";
                break;
            }
            Object obj = a2.get(i10);
            i10++;
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
            if (!"unknown".equals(identifiedLanguage.a)) {
                str2 = identifiedLanguage.a;
                break;
            }
        }
        return str2.isEmpty() ? "und" : "iw".equals(str2) ? "he" : str2;
    }
}
