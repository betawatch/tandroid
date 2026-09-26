package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k40 {
    public static final k40 d;
    public static final k40 e;
    public static final k40 f;
    public static final k40 h;
    public static final k40 n;
    public static final k40 r;
    public static final k40 s;
    public static final k40 v;
    public static final /* synthetic */ k40[] w;
    public final String a;
    public final int b;
    public final float c;

    static {
        k40 k40Var = new k40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = k40Var;
        k40 k40Var2 = new k40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = k40Var2;
        k40 k40Var3 = new k40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = k40Var3;
        k40 k40Var4 = new k40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = k40Var4;
        k40 k40Var5 = new k40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = k40Var5;
        k40 k40Var6 = new k40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = k40Var6;
        k40 k40Var7 = new k40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = k40Var7;
        k40 k40Var8 = new k40();
        v = k40Var8;
        w = new k40[]{k40Var, k40Var2, k40Var3, k40Var4, k40Var5, k40Var6, k40Var7, k40Var8};
    }

    public k40() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static k40 valueOf(String str) {
        return (k40) Enum.valueOf(k40.class, str);
    }

    public static k40[] values() {
        return (k40[]) w.clone();
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
            float f7 = this.c;
            if (f7 >= 1.0f) {
                return true;
            }
            if (f7 > 0.0f && Utilities.fastRandom.nextFloat() < f7) {
                return true;
            }
        }
        return false;
    }

    public k40(String str, int i10, String str2, int i11, float f7) {
        this.a = str2;
        this.b = i11;
        this.c = f7;
    }
}
