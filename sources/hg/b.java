package hg;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boolean a(b bVar, b bVar2) {
        if (bVar == bVar2) {
            return true;
        }
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.equals(bVar2);
    }

    public static b c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new b(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return new b(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
        }
        return null;
    }

    public static b d(String str) {
        return new b(str, null);
    }

    public final boolean b() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.a, bVar.a) && TextUtils.equals(this.b, bVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        return (str2 != null ? str2.hashCode() : 0) ^ hashCode;
    }
}
