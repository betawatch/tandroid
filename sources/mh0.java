// default package

import java.util.Locale;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ mh0(rc6 rc6Var, String str, byte b) {
        this.a = b;
        this.b = rc6Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale;
        byte b = 1;
        switch (this.a) {
            case 0:
                rc6 rc6Var = this.b;
                String str = this.c;
                rc6Var.getClass();
                gm.c3(new mh0(rc6Var, str, b));
                break;
            default:
                rc6 rc6Var2 = this.b;
                String str2 = this.c;
                Locale locale2 = null;
                rc6Var2.r = null;
                int i = rc6Var2.s + 1;
                rc6Var2.s = i;
                Locale locale3 = jb6.D0().y;
                if (rc6Var2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new i77((Object) rc6Var2, (Object) locale3, (Object) str2, (Object) locale, i, (byte) 5));
                        break;
                    } else {
                        locale2 = Locale.US;
                    }
                }
                locale = locale2;
                Utilities.e.c(new i77((Object) rc6Var2, (Object) locale3, (Object) str2, (Object) locale, i, (byte) 5));
        }
    }
}
