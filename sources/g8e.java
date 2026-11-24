// default package

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g8e extends lg7 {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final w5d f;

    public g8e(Context context, w5d w5dVar) {
        this.e = context;
        this.f = w5dVar;
        w5dVar.getClass();
    }

    @Override // lg7
    public final void b() {
        ite.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        if (this.d == null) {
            this.f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override // lg7
    public final void c() {
        ite.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
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
        ite.h(thickLanguageIdentifier);
        ArrayList a = thickLanguageIdentifier.a(str);
        int size = a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str2 = "";
                break;
            }
            Object obj = a.get(i);
            i++;
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
            if (!"unknown".equals(identifiedLanguage.a)) {
                str2 = identifiedLanguage.a;
                break;
            }
        }
        return str2.isEmpty() ? "und" : "iw".equals(str2) ? "he" : str2;
    }
}
