// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class elb {
    public final String a;
    public final String b;

    public elb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boolean a(elb elbVar, elb elbVar2) {
        if (elbVar == elbVar2) {
            return true;
        }
        if (elbVar == null || elbVar2 == null) {
            return false;
        }
        return elbVar.equals(elbVar2);
    }

    public static elb c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new elb(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return new elb(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
        }
        return null;
    }

    public static elb d(String str) {
        return new elb(str, null);
    }

    public final boolean b() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elb) {
            elb elbVar = (elb) obj;
            if (TextUtils.equals(this.a, elbVar.a) && TextUtils.equals(this.b, elbVar.b)) {
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
