package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v20 {
    public static final v20 d;
    public static final v20 e;
    public static final v20 f;
    public static final v20 h;
    public static final v20 n;
    public static final v20 r;
    public static final v20 s;
    public static final v20 w;
    public static final v20 x;
    public static final /* synthetic */ v20[] y;
    public final String a;
    public final int b;
    public final float c;

    static {
        v20 v20Var = new v20("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = v20Var;
        v20 v20Var2 = new v20("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = v20Var2;
        v20 v20Var3 = new v20("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = v20Var3;
        v20 v20Var4 = new v20("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = v20Var4;
        v20 v20Var5 = new v20("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = v20Var5;
        v20 v20Var6 = new v20("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = v20Var6;
        v20 v20Var7 = new v20("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = v20Var7;
        v20 v20Var8 = new v20("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = v20Var8;
        v20 v20Var9 = new v20();
        x = v20Var9;
        y = new v20[]{v20Var, v20Var2, v20Var3, v20Var4, v20Var5, v20Var6, v20Var7, v20Var8, v20Var9};
    }

    public v20() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static v20 valueOf(String str) {
        return (v20) Enum.valueOf(v20.class, str);
    }

    public static v20[] values() {
        return (v20[]) y.clone();
    }

    public final void a() {
        org.telegram.messenger.hp.e1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        String str = this.a;
        org.telegram.messenger.hp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.hp.e1().getInt(this.a, 0) < this.b) {
            float f10 = this.c;
            if (f10 >= 1.0f) {
                return true;
            }
            if (f10 > 0.0f && Utilities.c.nextFloat() < f10) {
                return true;
            }
        }
        return false;
    }

    public v20(String str, int i3, String str2, int i10, float f10) {
        this.a = str2;
        this.b = i10;
        this.c = f10;
    }
}
