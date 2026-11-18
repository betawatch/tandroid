package jg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(c cVar, String str, int i7) {
        this.a = i7;
        this.b = cVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale;
        switch (this.a) {
            case 0:
                c cVar = this.b;
                String str = this.c;
                cVar.getClass();
                org.telegram.messenger.g0.g3(new a(cVar, str, 1));
                break;
            default:
                c cVar2 = this.b;
                String str2 = this.c;
                Locale locale2 = null;
                cVar2.r = null;
                int i7 = cVar2.s + 1;
                cVar2.s = i7;
                Locale locale3 = gd.E0().y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new ai.g1(cVar2, locale3, str2, locale, i7, 3));
                        break;
                    } else {
                        locale2 = Locale.US;
                    }
                }
                locale = locale2;
                Utilities.e.c(new ai.g1(cVar2, locale3, str2, locale, i7, 3));
        }
    }
}
