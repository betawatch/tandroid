package gb;

import android.content.Context;
import b6.m;
import cb.j;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends j {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final fb.a f;
    public final boolean g;

    public e(Context context, fb.a aVar) {
        this.e = context;
        this.f = aVar;
        aVar.getClass();
        this.g = true;
    }

    @Override // cb.j
    public final void b() {
        m.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        if (this.d == null) {
            this.f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override // cb.j
    public final void c() {
        m.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
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
            return TranslateController.UNKNOWN_LANGUAGE;
        }
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        m.h(thickLanguageIdentifier);
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
        return str2.isEmpty() ? TranslateController.UNKNOWN_LANGUAGE : "iw".equals(str2) ? "he" : str2;
    }
}
