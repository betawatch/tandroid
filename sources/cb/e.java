package cb;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.TranslateController;
import x5.l;
import ya.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends i {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final bb.a f;
    public final boolean g;

    public e(Context context, bb.a aVar) {
        this.e = context;
        this.f = aVar;
        aVar.getClass();
        this.g = true;
    }

    @Override // ya.i
    public final void b() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        if (this.d == null) {
            this.f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override // ya.i
    public final void c() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
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
        l.h(thickLanguageIdentifier);
        ArrayList a2 = thickLanguageIdentifier.a(str);
        int size = a2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                str2 = "";
                break;
            }
            Object obj = a2.get(i9);
            i9++;
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
            if (!"unknown".equals(identifiedLanguage.a)) {
                str2 = identifiedLanguage.a;
                break;
            }
        }
        return str2.isEmpty() ? TranslateController.UNKNOWN_LANGUAGE : "iw".equals(str2) ? "he" : str2;
    }
}
