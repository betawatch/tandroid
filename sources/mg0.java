// default package

import java.util.Locale;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wc6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ mg0(wc6 wc6Var, String str, byte b) {
        this.a = b;
        this.b = wc6Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale;
        byte b = 1;
        switch (this.a) {
            case 0:
                wc6 wc6Var = this.b;
                String str = this.c;
                wc6Var.getClass();
                hl.c3(new mg0(wc6Var, str, b));
                break;
            default:
                wc6 wc6Var2 = this.b;
                String str2 = this.c;
                Locale locale2 = null;
                wc6Var2.r = null;
                int i = wc6Var2.s + 1;
                wc6Var2.s = i;
                Locale locale3 = ob6.D0().y;
                if (wc6Var2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new l77((Object) wc6Var2, (Object) locale3, (Object) str2, (Object) locale, i, (byte) 5));
                        break;
                    } else {
                        locale2 = Locale.US;
                    }
                }
                locale = locale2;
                Utilities.e.c(new l77((Object) wc6Var2, (Object) locale3, (Object) str2, (Object) locale, i, (byte) 5));
        }
    }
}
