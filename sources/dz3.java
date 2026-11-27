// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dz3 implements hl5 {
    public znb a;
    public TLRPC.TL_theme b;
    public TLRPC.TL_chatThemeUniqueGift c;
    public int d;
    public int e = -1;
    public SparseIntArray f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public final long a() {
        TLRPC.TL_theme tL_theme = this.b;
        if (tL_theme != null) {
            return tL_theme.id;
        }
        TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.c;
        if (tL_chatThemeUniqueGift != null) {
            return tL_chatThemeUniqueGift.gift.gift_id;
        }
        return 0L;
    }

    public final TLRPC.ThemeSettings b(int i) {
        ArrayList<TLRPC.ThemeSettings> arrayList;
        TLRPC.TL_theme tL_theme = this.b;
        if (tL_theme == null) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = this.c;
            if (tL_chatThemeUniqueGift != null) {
                arrayList = tL_chatThemeUniqueGift.theme_settings;
            }
            return null;
        }
        arrayList = tL_theme.settings;
        if (arrayList != null && i >= 0 && arrayList.size() > i) {
            return arrayList.get(i);
        }
        return null;
    }
}
