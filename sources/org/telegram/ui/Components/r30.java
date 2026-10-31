package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r30 {
    public static final r30 d;
    public static final r30 e;
    public static final r30 f;
    public static final r30 h;
    public static final r30 n;
    public static final r30 r;
    public static final r30 s;
    public static final r30 w;
    public static final r30 x;
    public static final /* synthetic */ r30[] y;
    public final String a;
    public final int b;
    public final float c;

    static {
        r30 r30Var = new r30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = r30Var;
        r30 r30Var2 = new r30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = r30Var2;
        r30 r30Var3 = new r30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = r30Var3;
        r30 r30Var4 = new r30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = r30Var4;
        r30 r30Var5 = new r30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = r30Var5;
        r30 r30Var6 = new r30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = r30Var6;
        r30 r30Var7 = new r30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = r30Var7;
        r30 r30Var8 = new r30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = r30Var8;
        r30 r30Var9 = new r30();
        x = r30Var9;
        y = new r30[]{r30Var, r30Var2, r30Var3, r30Var4, r30Var5, r30Var6, r30Var7, r30Var8, r30Var9};
    }

    public r30() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static r30 valueOf(String str) {
        return (r30) Enum.valueOf(r30.class, str);
    }

    public static r30[] values() {
        return (r30[]) y.clone();
    }

    public final void a() {
        org.telegram.messenger.vp.d1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
        String str = this.a;
        org.telegram.messenger.vp.d1().edit().putInt(str, d12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.vp.d1().getInt(this.a, 0) < this.b) {
            float f7 = this.c;
            if (f7 >= 1.0f) {
                return true;
            }
            if (f7 > 0.0f && Utilities.c.nextFloat() < f7) {
                return true;
            }
        }
        return false;
    }

    public r30(String str, int i10, String str2, int i11, float f7) {
        this.a = str2;
        this.b = i11;
        this.c = f7;
    }
}
