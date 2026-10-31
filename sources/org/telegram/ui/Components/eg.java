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
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class eg {
    public static final eg d;
    public static final eg e;
    public static final /* synthetic */ eg[] f;
    public final dg a;
    public final dg b;
    public final int c;

    static {
        dg dgVar = dg.a;
        dg dgVar2 = dg.b;
        eg egVar = new eg("VOICE_TO_VIDEO", 0, dgVar, dgVar2, R.raw.voice_and_video);
        d = egVar;
        dg dgVar3 = dg.c;
        dg dgVar4 = dg.d;
        eg egVar2 = new eg("STICKER_TO_KEYBOARD", 1, dgVar3, dgVar4, R.raw.sticker_to_keyboard);
        dg dgVar5 = dg.e;
        eg egVar3 = new eg("SMILE_TO_KEYBOARD", 2, dgVar5, dgVar4, R.raw.smile_to_keyboard);
        eg egVar4 = new eg("VIDEO_TO_VOICE", 3, dgVar2, dgVar, R.raw.voice_and_video);
        e = egVar4;
        eg egVar5 = new eg("KEYBOARD_TO_STICKER", 4, dgVar4, dgVar3, R.raw.keyboard_to_sticker);
        dg dgVar6 = dg.f;
        f = new eg[]{egVar, egVar2, egVar3, egVar4, egVar5, new eg("KEYBOARD_TO_GIF", 5, dgVar4, dgVar6, R.raw.keyboard_to_gif), new eg("KEYBOARD_TO_SMILE", 6, dgVar4, dgVar5, R.raw.keyboard_to_smile), new eg("GIF_TO_KEYBOARD", 7, dgVar6, dgVar4, R.raw.gif_to_keyboard), new eg("GIF_TO_SMILE", 8, dgVar6, dgVar5, R.raw.gif_to_smile), new eg("SMILE_TO_GIF", 9, dgVar5, dgVar6, R.raw.smile_to_gif), new eg("SMILE_TO_STICKER", 10, dgVar5, dgVar3, R.raw.smile_to_sticker), new eg("STICKER_TO_SMILE", 11, dgVar3, dgVar5, R.raw.sticker_to_smile)};
    }

    public eg(String str, int i10, dg dgVar, dg dgVar2, int i11) {
        this.a = dgVar;
        this.b = dgVar2;
        this.c = i11;
    }

    public static eg valueOf(String str) {
        return (eg) Enum.valueOf(eg.class, str);
    }

    public static eg[] values() {
        return (eg[]) f.clone();
    }
}
