package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a30 {
    public static final a30 d;
    public static final a30 e;
    public static final a30 f;
    public static final a30 h;
    public static final a30 n;
    public static final a30 r;
    public static final a30 s;
    public static final a30 w;
    public static final a30 x;
    public static final /* synthetic */ a30[] y;
    public final String a;
    public final int b;
    public final float c;

    static {
        a30 a30Var = new a30("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = a30Var;
        a30 a30Var2 = new a30("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = a30Var2;
        a30 a30Var3 = new a30("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = a30Var3;
        a30 a30Var4 = new a30("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = a30Var4;
        a30 a30Var5 = new a30("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = a30Var5;
        a30 a30Var6 = new a30("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = a30Var6;
        a30 a30Var7 = new a30("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = a30Var7;
        a30 a30Var8 = new a30("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = a30Var8;
        a30 a30Var9 = new a30();
        x = a30Var9;
        y = new a30[]{a30Var, a30Var2, a30Var3, a30Var4, a30Var5, a30Var6, a30Var7, a30Var8, a30Var9};
    }

    public a30() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static a30 valueOf(String str) {
        return (a30) Enum.valueOf(a30.class, str);
    }

    public static a30[] values() {
        return (a30[]) y.clone();
    }

    public final void a() {
        org.telegram.messenger.qp.e1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        String str = this.a;
        org.telegram.messenger.qp.e1().edit().putInt(str, e12.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (org.telegram.messenger.qp.e1().getInt(this.a, 0) < this.b) {
            float f10 = this.c;
            if (f10 >= 1.0f) {
                return true;
            }
            if (f10 > 0.0f && Utilities.c.nextFloat() < f10) {
                return true;
            }
        }
        return false;
    }

    public a30(String str, int i7, String str2, int i10, float f10) {
        this.a = str2;
        this.b = i10;
        this.c = f10;
    }
}
