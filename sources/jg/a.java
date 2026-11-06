package jg;

import bi.ub;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                org.telegram.messenger.g0.h3(new a(cVar, str, 1));
                break;
            default:
                c cVar2 = this.b;
                String str2 = this.c;
                Locale locale2 = null;
                cVar2.r = null;
                int i7 = cVar2.s + 1;
                cVar2.s = i7;
                Locale locale3 = hd.E0().y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new ub(cVar2, locale3, str2, locale, i7));
                        break;
                    } else {
                        locale2 = Locale.US;
                    }
                }
                locale = locale2;
                Utilities.e.c(new ub(cVar2, locale3, str2, locale, i7));
        }
    }
}
