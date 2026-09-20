package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c4 implements fg.a {
    public i6 a;
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

    public final TLRPC.ThemeSettings b(int i10) {
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
        if (arrayList != null && i10 >= 0 && arrayList.size() > i10) {
            return arrayList.get(i10);
        }
        return null;
    }
}
