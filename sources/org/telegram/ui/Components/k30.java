package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k30 {
    public static final k30 d;
    public static final k30 e;
    public static final k30 f;
    public static final k30 h;
    public static final k30 n;
    public static final k30 r;
    public static final k30 s;
    public static final k30 w;
    public static final k30 x;
    public static final /* synthetic */ k30[] y;
    public final String a;
    public final int b;
    public final float c;

    static {
        k30 k30Var = new k30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = k30Var;
        k30 k30Var2 = new k30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = k30Var2;
        k30 k30Var3 = new k30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = k30Var3;
        k30 k30Var4 = new k30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = k30Var4;
        k30 k30Var5 = new k30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = k30Var5;
        k30 k30Var6 = new k30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = k30Var6;
        k30 k30Var7 = new k30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = k30Var7;
        k30 k30Var8 = new k30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = k30Var8;
        k30 k30Var9 = new k30();
        x = k30Var9;
        y = new k30[]{k30Var, k30Var2, k30Var3, k30Var4, k30Var5, k30Var6, k30Var7, k30Var8, k30Var9};
    }

    public k30() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static k30 valueOf(String str) {
        return (k30) Enum.valueOf(k30.class, str);
    }

    public static k30[] values() {
        return (k30[]) y.clone();
    }

    public final void a() {
        org.telegram.messenger.mp.g1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        String str = this.a;
        org.telegram.messenger.mp.g1().edit().putInt(str, g12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.mp.g1().getInt(this.a, 0) < this.b) {
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

    public k30(String str, int i7, String str2, int i10, float f10) {
        this.a = str2;
        this.b = i10;
        this.c = f10;
    }
}
