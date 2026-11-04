package org.telegram.ui.Components;

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
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gg {
    public static final gg d;
    public static final gg e;
    public static final /* synthetic */ gg[] f;
    public final fg a;
    public final fg b;
    public final int c;

    static {
        fg fgVar = fg.a;
        fg fgVar2 = fg.b;
        gg ggVar = new gg("VOICE_TO_VIDEO", 0, fgVar, fgVar2, R.raw.voice_and_video);
        d = ggVar;
        fg fgVar3 = fg.c;
        fg fgVar4 = fg.d;
        gg ggVar2 = new gg("STICKER_TO_KEYBOARD", 1, fgVar3, fgVar4, R.raw.sticker_to_keyboard);
        fg fgVar5 = fg.e;
        gg ggVar3 = new gg("SMILE_TO_KEYBOARD", 2, fgVar5, fgVar4, R.raw.smile_to_keyboard);
        gg ggVar4 = new gg("VIDEO_TO_VOICE", 3, fgVar2, fgVar, R.raw.voice_and_video);
        e = ggVar4;
        gg ggVar5 = new gg("KEYBOARD_TO_STICKER", 4, fgVar4, fgVar3, R.raw.keyboard_to_sticker);
        fg fgVar6 = fg.f;
        f = new gg[]{ggVar, ggVar2, ggVar3, ggVar4, ggVar5, new gg("KEYBOARD_TO_GIF", 5, fgVar4, fgVar6, R.raw.keyboard_to_gif), new gg("KEYBOARD_TO_SMILE", 6, fgVar4, fgVar5, R.raw.keyboard_to_smile), new gg("GIF_TO_KEYBOARD", 7, fgVar6, fgVar4, R.raw.gif_to_keyboard), new gg("GIF_TO_SMILE", 8, fgVar6, fgVar5, R.raw.gif_to_smile), new gg("SMILE_TO_GIF", 9, fgVar5, fgVar6, R.raw.smile_to_gif), new gg("SMILE_TO_STICKER", 10, fgVar5, fgVar3, R.raw.smile_to_sticker), new gg("STICKER_TO_SMILE", 11, fgVar3, fgVar5, R.raw.sticker_to_smile)};
    }

    public gg(String str, int i3, fg fgVar, fg fgVar2, int i10) {
        this.a = fgVar;
        this.b = fgVar2;
        this.c = i10;
    }

    public static gg valueOf(String str) {
        return (gg) Enum.valueOf(gg.class, str);
    }

    public static gg[] values() {
        return (gg[]) f.clone();
    }
}
