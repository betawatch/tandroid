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
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c02 {
    public static final c02 d;
    public static final c02 e;
    public static final /* synthetic */ c02[] f;
    public final b02 a;
    public final b02 b;
    public final int c;

    static {
        b02 b02Var = b02.a;
        b02 b02Var2 = b02.b;
        c02 c02Var = new c02("VOICE_TO_VIDEO", 0, b02Var, b02Var2, R.raw.voice_and_video);
        d = c02Var;
        b02 b02Var3 = b02.c;
        b02 b02Var4 = b02.d;
        c02 c02Var2 = new c02("STICKER_TO_KEYBOARD", 1, b02Var3, b02Var4, R.raw.sticker_to_keyboard);
        b02 b02Var5 = b02.e;
        c02 c02Var3 = new c02("SMILE_TO_KEYBOARD", 2, b02Var5, b02Var4, R.raw.smile_to_keyboard);
        c02 c02Var4 = new c02("VIDEO_TO_VOICE", 3, b02Var2, b02Var, R.raw.voice_and_video);
        e = c02Var4;
        c02 c02Var5 = new c02("KEYBOARD_TO_STICKER", 4, b02Var4, b02Var3, R.raw.keyboard_to_sticker);
        b02 b02Var6 = b02.f;
        f = new c02[]{c02Var, c02Var2, c02Var3, c02Var4, c02Var5, new c02("KEYBOARD_TO_GIF", 5, b02Var4, b02Var6, R.raw.keyboard_to_gif), new c02("KEYBOARD_TO_SMILE", 6, b02Var4, b02Var5, R.raw.keyboard_to_smile), new c02("GIF_TO_KEYBOARD", 7, b02Var6, b02Var4, R.raw.gif_to_keyboard), new c02("GIF_TO_SMILE", 8, b02Var6, b02Var5, R.raw.gif_to_smile), new c02("SMILE_TO_GIF", 9, b02Var5, b02Var6, R.raw.smile_to_gif), new c02("SMILE_TO_STICKER", 10, b02Var5, b02Var3, R.raw.smile_to_sticker), new c02("STICKER_TO_SMILE", 11, b02Var3, b02Var5, R.raw.sticker_to_smile)};
    }

    public c02(String str, int i, b02 b02Var, b02 b02Var2, int i2) {
        this.a = b02Var;
        this.b = b02Var2;
        this.c = i2;
    }

    public static c02 valueOf(String str) {
        return (c02) Enum.valueOf(c02.class, str);
    }

    public static c02[] values() {
        return (c02[]) f.clone();
    }
}
