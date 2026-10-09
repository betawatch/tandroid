package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a50 {
    public static final a50 d;
    public static final a50 e;
    public static final a50 f;
    public static final a50 h;
    public static final a50 n;
    public static final a50 r;
    public static final a50 s;
    public static final a50 v;
    public static final a50 w;
    public static final /* synthetic */ a50[] x;
    public final String a;
    public final int b;
    public final float c;

    static {
        a50 a50Var = new a50("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = a50Var;
        a50 a50Var2 = new a50("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = a50Var2;
        a50 a50Var3 = new a50("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = a50Var3;
        a50 a50Var4 = new a50("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = a50Var4;
        a50 a50Var5 = new a50("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = a50Var5;
        a50 a50Var6 = new a50("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = a50Var6;
        a50 a50Var7 = new a50("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = a50Var7;
        a50 a50Var8 = new a50("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        v = a50Var8;
        a50 a50Var9 = new a50();
        w = a50Var9;
        x = new a50[]{a50Var, a50Var2, a50Var3, a50Var4, a50Var5, a50Var6, a50Var7, a50Var8, a50Var9};
    }

    public a50() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static a50 valueOf(String str) {
        return (a50) Enum.valueOf(a50.class, str);
    }

    public static a50[] values() {
        return (a50[]) x.clone();
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

    public a50(String str, int i10, String str2, int i11, float f7) {
        this.a = str2;
        this.b = i11;
        this.c = f7;
    }
}
