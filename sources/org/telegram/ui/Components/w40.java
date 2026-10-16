package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w40 {
    public static final w40 d;
    public static final w40 e;
    public static final w40 f;
    public static final w40 h;
    public static final w40 n;
    public static final w40 r;
    public static final w40 s;
    public static final w40 v;
    public static final w40 w;
    public static final /* synthetic */ w40[] x;
    public final String a;
    public final int b;
    public final float c;

    static {
        w40 w40Var = new w40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = w40Var;
        w40 w40Var2 = new w40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = w40Var2;
        w40 w40Var3 = new w40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = w40Var3;
        w40 w40Var4 = new w40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = w40Var4;
        w40 w40Var5 = new w40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = w40Var5;
        w40 w40Var6 = new w40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = w40Var6;
        w40 w40Var7 = new w40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = w40Var7;
        w40 w40Var8 = new w40("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = w40Var8;
        w40 w40Var9 = new w40();
        w = w40Var9;
        x = new w40[]{w40Var, w40Var2, w40Var3, w40Var4, w40Var5, w40Var6, w40Var7, w40Var8, w40Var9};
    }

    public w40() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static w40 valueOf(String str) {
        return (w40) Enum.valueOf(w40.class, str);
    }

    public static w40[] values() {
        return (w40[]) x.clone();
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

    public w40(String str, int i10, String str2, int i11, float f7) {
        this.a = str2;
        this.b = i11;
        this.c = f7;
    }
}
