package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u40 {
    public static final u40 d;
    public static final u40 e;
    public static final u40 f;
    public static final u40 h;
    public static final u40 n;
    public static final u40 r;
    public static final u40 s;
    public static final u40 v;
    public static final u40 w;
    public static final /* synthetic */ u40[] x;
    public final String a;
    public final int b;
    public final float c;

    static {
        u40 u40Var = new u40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = u40Var;
        u40 u40Var2 = new u40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = u40Var2;
        u40 u40Var3 = new u40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = u40Var3;
        u40 u40Var4 = new u40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = u40Var4;
        u40 u40Var5 = new u40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = u40Var5;
        u40 u40Var6 = new u40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = u40Var6;
        u40 u40Var7 = new u40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = u40Var7;
        u40 u40Var8 = new u40("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = u40Var8;
        u40 u40Var9 = new u40();
        w = u40Var9;
        x = new u40[]{u40Var, u40Var2, u40Var3, u40Var4, u40Var5, u40Var6, u40Var7, u40Var8, u40Var9};
    }

    public u40() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static u40 valueOf(String str) {
        return (u40) Enum.valueOf(u40.class, str);
    }

    public static u40[] values() {
        return (u40[]) x.clone();
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

    public u40(String str, int i10, String str2, int i11, float f7) {
        this.a = str2;
        this.b = i11;
        this.c = f7;
    }
}
