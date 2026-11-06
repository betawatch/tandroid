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
/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ig {
    public static final ig d;
    public static final ig e;
    public static final /* synthetic */ ig[] f;
    public final hg a;
    public final hg b;
    public final int c;

    static {
        hg hgVar = hg.a;
        hg hgVar2 = hg.b;
        ig igVar = new ig("VOICE_TO_VIDEO", 0, hgVar, hgVar2, R.raw.voice_and_video);
        d = igVar;
        hg hgVar3 = hg.c;
        hg hgVar4 = hg.d;
        ig igVar2 = new ig("STICKER_TO_KEYBOARD", 1, hgVar3, hgVar4, R.raw.sticker_to_keyboard);
        hg hgVar5 = hg.e;
        ig igVar3 = new ig("SMILE_TO_KEYBOARD", 2, hgVar5, hgVar4, R.raw.smile_to_keyboard);
        ig igVar4 = new ig("VIDEO_TO_VOICE", 3, hgVar2, hgVar, R.raw.voice_and_video);
        e = igVar4;
        ig igVar5 = new ig("KEYBOARD_TO_STICKER", 4, hgVar4, hgVar3, R.raw.keyboard_to_sticker);
        hg hgVar6 = hg.f;
        f = new ig[]{igVar, igVar2, igVar3, igVar4, igVar5, new ig("KEYBOARD_TO_GIF", 5, hgVar4, hgVar6, R.raw.keyboard_to_gif), new ig("KEYBOARD_TO_SMILE", 6, hgVar4, hgVar5, R.raw.keyboard_to_smile), new ig("GIF_TO_KEYBOARD", 7, hgVar6, hgVar4, R.raw.gif_to_keyboard), new ig("GIF_TO_SMILE", 8, hgVar6, hgVar5, R.raw.gif_to_smile), new ig("SMILE_TO_GIF", 9, hgVar5, hgVar6, R.raw.smile_to_gif), new ig("SMILE_TO_STICKER", 10, hgVar5, hgVar3, R.raw.smile_to_sticker), new ig("STICKER_TO_SMILE", 11, hgVar3, hgVar5, R.raw.sticker_to_smile)};
    }

    public ig(String str, int i7, hg hgVar, hg hgVar2, int i10) {
        this.a = hgVar;
        this.b = hgVar2;
        this.c = i10;
    }

    public static ig valueOf(String str) {
        return (ig) Enum.valueOf(ig.class, str);
    }

    public static ig[] values() {
        return (ig[]) f.clone();
    }
}
