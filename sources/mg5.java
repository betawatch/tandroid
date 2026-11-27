// default package

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mg5 {
    public static final mg5 d;
    public static final mg5 e;
    public static final mg5 f;
    public static final mg5 h;
    public static final mg5 n;
    public static final mg5 r;
    public static final mg5 s;
    public static final mg5 w;
    public static final mg5 x;
    public static final /* synthetic */ mg5[] y;
    public final String a;
    public final byte b;
    public final float c;

    static {
        mg5 mg5Var = new mg5("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = mg5Var;
        mg5 mg5Var2 = new mg5("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = mg5Var2;
        mg5 mg5Var3 = new mg5("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = mg5Var3;
        mg5 mg5Var4 = new mg5("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = mg5Var4;
        mg5 mg5Var5 = new mg5("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = mg5Var5;
        mg5 mg5Var6 = new mg5("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = mg5Var6;
        mg5 mg5Var7 = new mg5("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = mg5Var7;
        mg5 mg5Var8 = new mg5("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = mg5Var8;
        mg5 mg5Var9 = new mg5();
        x = mg5Var9;
        y = new mg5[]{mg5Var, mg5Var2, mg5Var3, mg5Var4, mg5Var5, mg5Var6, mg5Var7, mg5Var8, mg5Var9};
    }

    public mg5() {
        this.a = "hints_controller_" + this;
        this.b = (byte) 3;
        this.c = 1.0f;
    }

    public static mg5 valueOf(String str) {
        return (mg5) Enum.valueOf(mg5.class, str);
    }

    public static mg5[] values() {
        return (mg5[]) y.clone();
    }

    public final void a() {
        uc7.e1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences e1 = uc7.e1();
        String str = this.a;
        uc7.e1().edit().putInt(str, e1.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (uc7.e1().getInt(this.a, 0) < this.b) {
            float f2 = this.c;
            if (f2 >= 1.0f) {
                return true;
            }
            if (f2 > 0.0f && Utilities.c.nextFloat() < f2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mg5(String str, int i, String str2, int i2, float f2) {
        this.a = str2;
        this.b = i2;
        this.c = f2;
    }
}
