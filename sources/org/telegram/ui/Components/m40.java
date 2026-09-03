package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m40 {
    public static final m40 d;
    public static final m40 e;
    public static final m40 f;
    public static final m40 h;
    public static final m40 n;
    public static final m40 r;
    public static final m40 s;
    public static final m40 v;
    public static final /* synthetic */ m40[] w;
    public final String a;
    public final int b;
    public final float c;

    static {
        m40 m40Var = new m40("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = m40Var;
        m40 m40Var2 = new m40("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = m40Var2;
        m40 m40Var3 = new m40("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = m40Var3;
        m40 m40Var4 = new m40("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = m40Var4;
        m40 m40Var5 = new m40("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = m40Var5;
        m40 m40Var6 = new m40("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = m40Var6;
        m40 m40Var7 = new m40("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = m40Var7;
        m40 m40Var8 = new m40();
        v = m40Var8;
        w = new m40[]{m40Var, m40Var2, m40Var3, m40Var4, m40Var5, m40Var6, m40Var7, m40Var8};
    }

    public m40() {
        this.a = "hints_controller_" + this;
        this.b = 3;
        this.c = 1.0f;
    }

    public static m40 valueOf(String str) {
        return (m40) Enum.valueOf(m40.class, str);
    }

    public static m40[] values() {
        return (m40[]) w.clone();
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

    public m40(String str, int i10, String str2, int i11, float f10) {
        this.a = str2;
        this.b = i11;
        this.c = f10;
    }
}
