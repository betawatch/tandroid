package jg;

import bi.ub;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
