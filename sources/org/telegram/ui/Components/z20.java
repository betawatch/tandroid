package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class z20 {
    public static final z20 d;
    public static final z20 e;
    public static final z20 f;
    public static final z20 h;
    public static final z20 n;
    public static final z20 r;
    public static final z20 s;
    public static final z20 w;
    public static final z20 x;
    public static final /* synthetic */ z20[] y;
    public final String a;
    public final int b;
    public final float c;

    static {
        z20 z20Var = new z20("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = z20Var;
        z20 z20Var2 = new z20("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = z20Var2;
        z20 z20Var3 = new z20("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = z20Var3;
        z20 z20Var4 = new z20("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = z20Var4;
        z20 z20Var5 = new z20("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = z20Var5;
        z20 z20Var6 = new z20("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = z20Var6;
        z20 z20Var7 = new z20("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = z20Var7;
        z20 z20Var8 = new z20("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = z20Var8;
        z20 z20Var9 = new z20();
        x = z20Var9;
        y = new z20[]{z20Var, z20Var2, z20Var3, z20Var4, z20Var5, z20Var6, z20Var7, z20Var8, z20Var9};
    }

    public z20() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static z20 valueOf(String str) {
        return (z20) Enum.valueOf(z20.class, str);
    }

    public static z20[] values() {
        return (z20[]) y.clone();
    }

    public final void a() {
        org.telegram.messenger.qp.e1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        String str = this.a;
        org.telegram.messenger.qp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.qp.e1().getInt(this.a, 0) < this.b) {
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

    public z20(String str, int i7, String str2, int i10, float f10) {
        this.a = str2;
        this.b = i10;
        this.c = f10;
    }
}
