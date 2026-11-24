// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fnb {
    public final String a;
    public final String b;

    public fnb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boolean a(fnb fnbVar, fnb fnbVar2) {
        if (fnbVar == fnbVar2) {
            return true;
        }
        if (fnbVar == null || fnbVar2 == null) {
            return false;
        }
        return fnbVar.equals(fnbVar2);
    }

    public static fnb c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new fnb(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return new fnb(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
        }
        return null;
    }

    public static fnb d(String str) {
        return new fnb(str, null);
    }

    public final boolean b() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fnb) {
            fnb fnbVar = (fnb) obj;
            if (TextUtils.equals(this.a, fnbVar.a) && TextUtils.equals(this.b, fnbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }
}
