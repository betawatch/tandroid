// default package

import java.util.Locale;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lg0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sa6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ lg0(sa6 sa6Var, String str, byte b) {
        this.a = b;
        this.b = sa6Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale;
        byte b = 1;
        switch (this.a) {
            case 0:
                sa6 sa6Var = this.b;
                String str = this.c;
                sa6Var.getClass();
                gl.c3(new lg0(sa6Var, str, b));
                break;
            default:
                sa6 sa6Var2 = this.b;
                String str2 = this.c;
                Locale locale2 = null;
                sa6Var2.r = null;
                int i = sa6Var2.s + 1;
                sa6Var2.s = i;
                Locale locale3 = k96.D0().y;
                if (sa6Var2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new i57((Object) sa6Var2, (Object) locale3, (Object) str2, (Object) locale, i, (byte) 5));
                        break;
                    } else {
                        locale2 = Locale.US;
                    }
                }
                locale = locale2;
                Utilities.e.c(new i57((Object) sa6Var2, (Object) locale3, (Object) str2, (Object) locale, i, (byte) 5));
        }
    }
}
