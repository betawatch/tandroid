package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t30 {
    public static final t30 d;
    public static final t30 e;
    public static final t30 f;
    public static final t30 h;
    public static final t30 n;
    public static final t30 r;
    public static final t30 s;
    public static final t30 v;
    public static final /* synthetic */ t30[] w;
    public final String a;
    public final int b;
    public final float c;

    static {
        t30 t30Var = new t30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = t30Var;
        t30 t30Var2 = new t30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = t30Var2;
        t30 t30Var3 = new t30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = t30Var3;
        t30 t30Var4 = new t30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = t30Var4;
        t30 t30Var5 = new t30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = t30Var5;
        t30 t30Var6 = new t30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = t30Var6;
        t30 t30Var7 = new t30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = t30Var7;
        t30 t30Var8 = new t30();
        v = t30Var8;
        w = new t30[]{t30Var, t30Var2, t30Var3, t30Var4, t30Var5, t30Var6, t30Var7, t30Var8};
    }

    public t30() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static t30 valueOf(String str) {
        return (t30) Enum.valueOf(t30.class, str);
    }

    public static t30[] values() {
        return (t30[]) w.clone();
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

    public t30(String str, int i9, String str2, int i10, float f10) {
        this.a = str2;
        this.b = i10;
        this.c = f10;
    }
}
