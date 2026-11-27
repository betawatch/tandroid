// default package

import org.telegram.messenger.beta.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hz1 {
    public static final hz1 d;
    public static final hz1 e;
    public static final /* synthetic */ hz1[] f;
    public final gz1 a;
    public final gz1 b;
    public final int c;

    static {
        gz1 gz1Var = gz1.a;
        gz1 gz1Var2 = gz1.b;
        hz1 hz1Var = new hz1("VOICE_TO_VIDEO", 0, gz1Var, gz1Var2, R.raw.voice_and_video);
        d = hz1Var;
        gz1 gz1Var3 = gz1.c;
        gz1 gz1Var4 = gz1.d;
        hz1 hz1Var2 = new hz1("STICKER_TO_KEYBOARD", 1, gz1Var3, gz1Var4, R.raw.sticker_to_keyboard);
        gz1 gz1Var5 = gz1.e;
        hz1 hz1Var3 = new hz1("SMILE_TO_KEYBOARD", 2, gz1Var5, gz1Var4, R.raw.smile_to_keyboard);
        hz1 hz1Var4 = new hz1("VIDEO_TO_VOICE", 3, gz1Var2, gz1Var, R.raw.voice_and_video);
        e = hz1Var4;
        hz1 hz1Var5 = new hz1("KEYBOARD_TO_STICKER", 4, gz1Var4, gz1Var3, R.raw.keyboard_to_sticker);
        gz1 gz1Var6 = gz1.f;
        f = new hz1[]{hz1Var, hz1Var2, hz1Var3, hz1Var4, hz1Var5, new hz1("KEYBOARD_TO_GIF", 5, gz1Var4, gz1Var6, R.raw.keyboard_to_gif), new hz1("KEYBOARD_TO_SMILE", 6, gz1Var4, gz1Var5, R.raw.keyboard_to_smile), new hz1("GIF_TO_KEYBOARD", 7, gz1Var6, gz1Var4, R.raw.gif_to_keyboard), new hz1("GIF_TO_SMILE", 8, gz1Var6, gz1Var5, R.raw.gif_to_smile), new hz1("SMILE_TO_GIF", 9, gz1Var5, gz1Var6, R.raw.smile_to_gif), new hz1("SMILE_TO_STICKER", 10, gz1Var5, gz1Var3, R.raw.smile_to_sticker), new hz1("STICKER_TO_SMILE", 11, gz1Var3, gz1Var5, R.raw.sticker_to_smile)};
    }

    public hz1(String str, int i, gz1 gz1Var, gz1 gz1Var2, int i2) {
        this.a = gz1Var;
        this.b = gz1Var2;
        this.c = i2;
    }

    public static hz1 valueOf(String str) {
        return (hz1) Enum.valueOf(hz1.class, str);
    }

    public static hz1[] values() {
        return (hz1[]) f.clone();
    }
}
