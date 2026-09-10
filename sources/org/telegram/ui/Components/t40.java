package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class t40 {
    public static final t40 d;
    public static final t40 e;
    public static final t40 f;
    public static final t40 h;
    public static final t40 n;
    public static final t40 r;
    public static final t40 s;
    public static final t40 v;
    public static final /* synthetic */ t40[] w;
    public final String a;
    public final int b;
    public final float c;

    static {
        t40 t40Var = new t40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = t40Var;
        t40 t40Var2 = new t40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = t40Var2;
        t40 t40Var3 = new t40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = t40Var3;
        t40 t40Var4 = new t40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = t40Var4;
        t40 t40Var5 = new t40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = t40Var5;
        t40 t40Var6 = new t40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = t40Var6;
        t40 t40Var7 = new t40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = t40Var7;
        t40 t40Var8 = new t40();
        v = t40Var8;
        w = new t40[]{t40Var, t40Var2, t40Var3, t40Var4, t40Var5, t40Var6, t40Var7, t40Var8};
    }

    public t40() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static t40 valueOf(String str) {
        return (t40) Enum.valueOf(t40.class, str);
    }

    public static t40[] values() {
        return (t40[]) w.clone();
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

    public t40(String str, int i10, String str2, int i11, float f7) {
        this.a = str2;
        this.b = i11;
        this.c = f7;
    }
}
