package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n40 {
    public static final n40 d;
    public static final n40 e;
    public static final n40 f;
    public static final n40 h;
    public static final n40 n;
    public static final n40 r;
    public static final n40 s;
    public static final n40 v;
    public static final /* synthetic */ n40[] w;
    public final String a;
    public final int b;
    public final float c;

    static {
        n40 n40Var = new n40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = n40Var;
        n40 n40Var2 = new n40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = n40Var2;
        n40 n40Var3 = new n40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = n40Var3;
        n40 n40Var4 = new n40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = n40Var4;
        n40 n40Var5 = new n40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = n40Var5;
        n40 n40Var6 = new n40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = n40Var6;
        n40 n40Var7 = new n40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = n40Var7;
        n40 n40Var8 = new n40();
        v = n40Var8;
        w = new n40[]{n40Var, n40Var2, n40Var3, n40Var4, n40Var5, n40Var6, n40Var7, n40Var8};
    }

    public n40() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static n40 valueOf(String str) {
        return (n40) Enum.valueOf(n40.class, str);
    }

    public static n40[] values() {
        return (n40[]) w.clone();
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
            float f10 = this.c;
            if (f10 >= 1.0f) {
                return true;
            }
            if (f10 > 0.0f && Utilities.fastRandom.nextFloat() < f10) {
                return true;
            }
        }
        return false;
    }

    public n40(String str, int i10, String str2, int i11, float f10) {
        this.a = str2;
        this.b = i11;
        this.c = f10;
    }
}
