package org.telegram.ui.Components;

import org.telegram.messenger.R;

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
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lg {
    public static final lg d;
    public static final lg e;
    public static final /* synthetic */ lg[] f;
    public final kg a;
    public final kg b;
    public final int c;

    static {
        int i10 = R.raw.voice_and_video;
        kg kgVar = kg.a;
        kg kgVar2 = kg.b;
        lg lgVar = new lg("VOICE_TO_VIDEO", 0, kgVar, kgVar2, i10);
        d = lgVar;
        int i11 = R.raw.sticker_to_keyboard;
        kg kgVar3 = kg.c;
        kg kgVar4 = kg.d;
        lg lgVar2 = new lg("STICKER_TO_KEYBOARD", 1, kgVar3, kgVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        kg kgVar5 = kg.e;
        lg lgVar3 = new lg("SMILE_TO_KEYBOARD", 2, kgVar5, kgVar4, i12);
        lg lgVar4 = new lg("VIDEO_TO_VOICE", 3, kgVar2, kgVar, i10);
        e = lgVar4;
        lg lgVar5 = new lg("KEYBOARD_TO_STICKER", 4, kgVar4, kgVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        kg kgVar6 = kg.f;
        f = new lg[]{lgVar, lgVar2, lgVar3, lgVar4, lgVar5, new lg("KEYBOARD_TO_GIF", 5, kgVar4, kgVar6, i13), new lg("KEYBOARD_TO_SMILE", 6, kgVar4, kgVar5, R.raw.keyboard_to_smile), new lg("GIF_TO_KEYBOARD", 7, kgVar6, kgVar4, R.raw.gif_to_keyboard), new lg("GIF_TO_SMILE", 8, kgVar6, kgVar5, R.raw.gif_to_smile), new lg("SMILE_TO_GIF", 9, kgVar5, kgVar6, R.raw.smile_to_gif), new lg("SMILE_TO_STICKER", 10, kgVar5, kgVar3, R.raw.smile_to_sticker), new lg("STICKER_TO_SMILE", 11, kgVar3, kgVar5, R.raw.sticker_to_smile)};
    }

    public lg(String str, int i10, kg kgVar, kg kgVar2, int i11) {
        this.a = kgVar;
        this.b = kgVar2;
        this.c = i11;
    }

    public static lg valueOf(String str) {
        return (lg) Enum.valueOf(lg.class, str);
    }

    public static lg[] values() {
        return (lg[]) f.clone();
    }
}
