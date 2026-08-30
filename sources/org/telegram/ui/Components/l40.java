package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l40 {
    public static final l40 d;
    public static final l40 e;
    public static final l40 f;
    public static final l40 h;
    public static final l40 n;
    public static final l40 r;
    public static final l40 s;
    public static final l40 v;
    public static final /* synthetic */ l40[] w;
    public final String a;
    public final int b;
    public final float c;

    static {
        l40 l40Var = new l40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = l40Var;
        l40 l40Var2 = new l40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = l40Var2;
        l40 l40Var3 = new l40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = l40Var3;
        l40 l40Var4 = new l40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = l40Var4;
        l40 l40Var5 = new l40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = l40Var5;
        l40 l40Var6 = new l40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = l40Var6;
        l40 l40Var7 = new l40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = l40Var7;
        l40 l40Var8 = new l40();
        v = l40Var8;
        w = new l40[]{l40Var, l40Var2, l40Var3, l40Var4, l40Var5, l40Var6, l40Var7, l40Var8};
    }

    public l40() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static l40 valueOf(String str) {
        return (l40) Enum.valueOf(l40.class, str);
    }

    public static l40[] values() {
        return (l40[]) w.clone();
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

    public l40(String str, int i10, String str2, int i11, float f10) {
        this.a = str2;
        this.b = i11;
        this.c = f10;
    }
}
