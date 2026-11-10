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
/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hg {
    public static final hg d;
    public static final hg e;
    public static final /* synthetic */ hg[] f;
    public final gg a;
    public final gg b;
    public final int c;

    static {
        gg ggVar = gg.a;
        gg ggVar2 = gg.b;
        hg hgVar = new hg("VOICE_TO_VIDEO", 0, ggVar, ggVar2, R.raw.voice_and_video);
        d = hgVar;
        gg ggVar3 = gg.c;
        gg ggVar4 = gg.d;
        hg hgVar2 = new hg("STICKER_TO_KEYBOARD", 1, ggVar3, ggVar4, R.raw.sticker_to_keyboard);
        gg ggVar5 = gg.e;
        hg hgVar3 = new hg("SMILE_TO_KEYBOARD", 2, ggVar5, ggVar4, R.raw.smile_to_keyboard);
        hg hgVar4 = new hg("VIDEO_TO_VOICE", 3, ggVar2, ggVar, R.raw.voice_and_video);
        e = hgVar4;
        hg hgVar5 = new hg("KEYBOARD_TO_STICKER", 4, ggVar4, ggVar3, R.raw.keyboard_to_sticker);
        gg ggVar6 = gg.f;
        f = new hg[]{hgVar, hgVar2, hgVar3, hgVar4, hgVar5, new hg("KEYBOARD_TO_GIF", 5, ggVar4, ggVar6, R.raw.keyboard_to_gif), new hg("KEYBOARD_TO_SMILE", 6, ggVar4, ggVar5, R.raw.keyboard_to_smile), new hg("GIF_TO_KEYBOARD", 7, ggVar6, ggVar4, R.raw.gif_to_keyboard), new hg("GIF_TO_SMILE", 8, ggVar6, ggVar5, R.raw.gif_to_smile), new hg("SMILE_TO_GIF", 9, ggVar5, ggVar6, R.raw.smile_to_gif), new hg("SMILE_TO_STICKER", 10, ggVar5, ggVar3, R.raw.smile_to_sticker), new hg("STICKER_TO_SMILE", 11, ggVar3, ggVar5, R.raw.sticker_to_smile)};
    }

    public hg(String str, int i7, gg ggVar, gg ggVar2, int i10) {
        this.a = ggVar;
        this.b = ggVar2;
        this.c = i10;
    }

    public static hg valueOf(String str) {
        return (hg) Enum.valueOf(hg.class, str);
    }

    public static hg[] values() {
        return (hg[]) f.clone();
    }
}
