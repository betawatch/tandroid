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
/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bh {
    public static final bh d;
    public static final bh e;
    public static final /* synthetic */ bh[] f;
    public final ah a;
    public final ah b;
    public final int c;

    static {
        int i10 = R.raw.voice_and_video;
        ah ahVar = ah.a;
        ah ahVar2 = ah.b;
        bh bhVar = new bh("VOICE_TO_VIDEO", 0, ahVar, ahVar2, i10);
        d = bhVar;
        int i11 = R.raw.sticker_to_keyboard;
        ah ahVar3 = ah.c;
        ah ahVar4 = ah.d;
        bh bhVar2 = new bh("STICKER_TO_KEYBOARD", 1, ahVar3, ahVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        ah ahVar5 = ah.e;
        bh bhVar3 = new bh("SMILE_TO_KEYBOARD", 2, ahVar5, ahVar4, i12);
        bh bhVar4 = new bh("VIDEO_TO_VOICE", 3, ahVar2, ahVar, i10);
        e = bhVar4;
        bh bhVar5 = new bh("KEYBOARD_TO_STICKER", 4, ahVar4, ahVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        ah ahVar6 = ah.f;
        f = new bh[]{bhVar, bhVar2, bhVar3, bhVar4, bhVar5, new bh("KEYBOARD_TO_GIF", 5, ahVar4, ahVar6, i13), new bh("KEYBOARD_TO_SMILE", 6, ahVar4, ahVar5, R.raw.keyboard_to_smile), new bh("GIF_TO_KEYBOARD", 7, ahVar6, ahVar4, R.raw.gif_to_keyboard), new bh("GIF_TO_SMILE", 8, ahVar6, ahVar5, R.raw.gif_to_smile), new bh("SMILE_TO_GIF", 9, ahVar5, ahVar6, R.raw.smile_to_gif), new bh("SMILE_TO_STICKER", 10, ahVar5, ahVar3, R.raw.smile_to_sticker), new bh("STICKER_TO_SMILE", 11, ahVar3, ahVar5, R.raw.sticker_to_smile)};
    }

    public bh(String str, int i10, ah ahVar, ah ahVar2, int i11) {
        this.a = ahVar;
        this.b = ahVar2;
        this.c = i11;
    }

    public static bh valueOf(String str) {
        return (bh) Enum.valueOf(bh.class, str);
    }

    public static bh[] values() {
        return (bh[]) f.clone();
    }
}
