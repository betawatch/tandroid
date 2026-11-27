// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dpb {
    public final String a;
    public final String b;

    public dpb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boolean a(dpb dpbVar, dpb dpbVar2) {
        if (dpbVar == dpbVar2) {
            return true;
        }
        if (dpbVar == null || dpbVar2 == null) {
            return false;
        }
        return dpbVar.equals(dpbVar2);
    }

    public static dpb c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new dpb(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return new dpb(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
        }
        return null;
    }

    public static dpb d(String str) {
        return new dpb(str, null);
    }

    public final boolean b() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dpb)) {
            return false;
        }
        dpb dpbVar = (dpb) obj;
        String str = this.a;
        String replace = str == null ? null : str.replace("️", "");
        String str2 = dpbVar.a;
        return TextUtils.equals(replace, str2 != null ? str2.replace("️", "") : null) && TextUtils.equals(this.b, dpbVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.replace("️", "").hashCode() : 0;
        String str2 = this.b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }
}
