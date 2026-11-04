package kg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(c cVar, String str, int i3) {
        this.a = i3;
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
                int i3 = cVar2.s + 1;
                cVar2.s = i3;
                Locale locale3 = bd.E0().y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new ai.p1(cVar2, locale3, str2, locale, i3, 5));
                        break;
                    } else {
                        locale2 = Locale.US;
                    }
                }
                locale = locale2;
                Utilities.e.c(new ai.p1(cVar2, locale3, str2, locale, i3, 5));
        }
    }
}
