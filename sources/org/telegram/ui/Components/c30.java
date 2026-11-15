package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c30 {
    public static final c30 d;
    public static final c30 e;
    public static final c30 f;
    public static final c30 h;
    public static final c30 n;
    public static final c30 r;
    public static final c30 s;
    public static final c30 w;
    public static final c30 x;
    public static final /* synthetic */ c30[] y;
    public final String a;
    public final int b;
    public final float c;

    static {
        c30 c30Var = new c30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = c30Var;
        c30 c30Var2 = new c30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = c30Var2;
        c30 c30Var3 = new c30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = c30Var3;
        c30 c30Var4 = new c30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = c30Var4;
        c30 c30Var5 = new c30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = c30Var5;
        c30 c30Var6 = new c30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = c30Var6;
        c30 c30Var7 = new c30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = c30Var7;
        c30 c30Var8 = new c30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = c30Var8;
        c30 c30Var9 = new c30();
        x = c30Var9;
        y = new c30[]{c30Var, c30Var2, c30Var3, c30Var4, c30Var5, c30Var6, c30Var7, c30Var8, c30Var9};
    }

    public c30() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static c30 valueOf(String str) {
        return (c30) Enum.valueOf(c30.class, str);
    }

    public static c30[] values() {
        return (c30[]) y.clone();
    }

    public final void a() {
        org.telegram.messenger.np.e1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.np.e1();
        String str = this.a;
        org.telegram.messenger.np.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.np.e1().getInt(this.a, 0) < this.b) {
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

    public c30(String str, int i7, String str2, int i10, float f10) {
        this.a = str2;
        this.b = i10;
        this.c = f10;
    }
}
