package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a4 implements nf.a {
    public e6 a;
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
    public int o;

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

    public final TLRPC.ThemeSettings b(int i9) {
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
        if (arrayList != null && i9 >= 0 && arrayList.size() > i9) {
            return arrayList.get(i9);
        }
        return null;
    }
}
