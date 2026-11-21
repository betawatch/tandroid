package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class n30 {
    public static final n30 d;
    public static final n30 e;
    public static final n30 f;
    public static final n30 h;
    public static final n30 n;
    public static final n30 r;
    public static final n30 s;
    public static final n30 w;
    public static final n30 x;
    public static final /* synthetic */ n30[] y;
    public final String a;
    public final int b;
    public final float c;

    static {
        n30 n30Var = new n30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = n30Var;
        n30 n30Var2 = new n30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = n30Var2;
        n30 n30Var3 = new n30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = n30Var3;
        n30 n30Var4 = new n30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = n30Var4;
        n30 n30Var5 = new n30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = n30Var5;
        n30 n30Var6 = new n30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = n30Var6;
        n30 n30Var7 = new n30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = n30Var7;
        n30 n30Var8 = new n30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = n30Var8;
        n30 n30Var9 = new n30();
        x = n30Var9;
        y = new n30[]{n30Var, n30Var2, n30Var3, n30Var4, n30Var5, n30Var6, n30Var7, n30Var8, n30Var9};
    }

    public n30() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static n30 valueOf(String str) {
        return (n30) Enum.valueOf(n30.class, str);
    }

    public static n30[] values() {
        return (n30[]) y.clone();
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

    public n30(String str, int i7, String str2, int i10, float f10) {
        this.a = str2;
        this.b = i10;
        this.c = f10;
    }
}
