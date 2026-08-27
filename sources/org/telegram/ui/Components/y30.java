package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y30 {
    public static final y30 d;
    public static final y30 e;
    public static final y30 f;
    public static final y30 h;
    public static final y30 n;
    public static final y30 r;
    public static final y30 s;
    public static final y30 v;
    public static final /* synthetic */ y30[] w;
    public final String a;
    public final int b;
    public final float c;

    static {
        y30 y30Var = new y30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = y30Var;
        y30 y30Var2 = new y30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = y30Var2;
        y30 y30Var3 = new y30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = y30Var3;
        y30 y30Var4 = new y30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = y30Var4;
        y30 y30Var5 = new y30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = y30Var5;
        y30 y30Var6 = new y30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = y30Var6;
        y30 y30Var7 = new y30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = y30Var7;
        y30 y30Var8 = new y30();
        v = y30Var8;
        w = new y30[]{y30Var, y30Var2, y30Var3, y30Var4, y30Var5, y30Var6, y30Var7, y30Var8};
    }

    public y30() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static y30 valueOf(String str) {
        return (y30) Enum.valueOf(y30.class, str);
    }

    public static y30[] values() {
        return (y30[]) w.clone();
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

    public y30(String str, int i10, String str2, int i11, float f10) {
        this.a = str2;
        this.b = i11;
        this.c = f10;
    }
}
