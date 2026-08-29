package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h40 {
    public static final h40 d;
    public static final h40 e;
    public static final h40 f;
    public static final h40 h;
    public static final h40 n;
    public static final h40 r;
    public static final h40 s;
    public static final h40 v;
    public static final /* synthetic */ h40[] w;
    public final String a;
    public final int b;
    public final float c;

    static {
        h40 h40Var = new h40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = h40Var;
        h40 h40Var2 = new h40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = h40Var2;
        h40 h40Var3 = new h40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = h40Var3;
        h40 h40Var4 = new h40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = h40Var4;
        h40 h40Var5 = new h40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = h40Var5;
        h40 h40Var6 = new h40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = h40Var6;
        h40 h40Var7 = new h40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = h40Var7;
        h40 h40Var8 = new h40();
        v = h40Var8;
        w = new h40[]{h40Var, h40Var2, h40Var3, h40Var4, h40Var5, h40Var6, h40Var7, h40Var8};
    }

    public h40() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static h40 valueOf(String str) {
        return (h40) Enum.valueOf(h40.class, str);
    }

    public static h40[] values() {
        return (h40[]) w.clone();
    }

    public final void a() {
        MessagesController.getGlobalMainSettings().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        String str = this.a;
        MessagesController.getGlobalMainSettings().edit().putInt(str, globalMainSettings.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (MessagesController.getGlobalMainSettings().getInt(this.a, 0) < this.b) {
            float f9 = this.c;
            if (f9 >= 1.0f) {
                return true;
            }
            if (f9 > 0.0f && Utilities.fastRandom.nextFloat() < f9) {
                return true;
            }
        }
        return false;
    }

    public h40(String str, int i10, String str2, int i11, float f9) {
        this.a = str2;
        this.b = i11;
        this.c = f9;
    }
}
