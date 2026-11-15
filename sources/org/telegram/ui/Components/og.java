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
/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class og {
    public static final og d;
    public static final og e;
    public static final /* synthetic */ og[] f;
    public final ng a;
    public final ng b;
    public final int c;

    static {
        ng ngVar = ng.a;
        ng ngVar2 = ng.b;
        og ogVar = new og("VOICE_TO_VIDEO", 0, ngVar, ngVar2, R.raw.voice_and_video);
        d = ogVar;
        ng ngVar3 = ng.c;
        ng ngVar4 = ng.d;
        og ogVar2 = new og("STICKER_TO_KEYBOARD", 1, ngVar3, ngVar4, R.raw.sticker_to_keyboard);
        ng ngVar5 = ng.e;
        og ogVar3 = new og("SMILE_TO_KEYBOARD", 2, ngVar5, ngVar4, R.raw.smile_to_keyboard);
        og ogVar4 = new og("VIDEO_TO_VOICE", 3, ngVar2, ngVar, R.raw.voice_and_video);
        e = ogVar4;
        og ogVar5 = new og("KEYBOARD_TO_STICKER", 4, ngVar4, ngVar3, R.raw.keyboard_to_sticker);
        ng ngVar6 = ng.f;
        f = new og[]{ogVar, ogVar2, ogVar3, ogVar4, ogVar5, new og("KEYBOARD_TO_GIF", 5, ngVar4, ngVar6, R.raw.keyboard_to_gif), new og("KEYBOARD_TO_SMILE", 6, ngVar4, ngVar5, R.raw.keyboard_to_smile), new og("GIF_TO_KEYBOARD", 7, ngVar6, ngVar4, R.raw.gif_to_keyboard), new og("GIF_TO_SMILE", 8, ngVar6, ngVar5, R.raw.gif_to_smile), new og("SMILE_TO_GIF", 9, ngVar5, ngVar6, R.raw.smile_to_gif), new og("SMILE_TO_STICKER", 10, ngVar5, ngVar3, R.raw.smile_to_sticker), new og("STICKER_TO_SMILE", 11, ngVar3, ngVar5, R.raw.sticker_to_smile)};
    }

    public og(String str, int i7, ng ngVar, ng ngVar2, int i10) {
        this.a = ngVar;
        this.b = ngVar2;
        this.c = i10;
    }

    public static og valueOf(String str) {
        return (og) Enum.valueOf(og.class, str);
    }

    public static og[] values() {
        return (og[]) f.clone();
    }
}
