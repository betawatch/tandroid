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
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xg {
    public static final xg d;
    public static final xg e;
    public static final /* synthetic */ xg[] f;
    public final wg a;
    public final wg b;
    public final int c;

    static {
        wg wgVar = wg.a;
        wg wgVar2 = wg.b;
        xg xgVar = new xg("VOICE_TO_VIDEO", 0, wgVar, wgVar2, R.raw.voice_and_video);
        d = xgVar;
        wg wgVar3 = wg.c;
        wg wgVar4 = wg.d;
        xg xgVar2 = new xg("STICKER_TO_KEYBOARD", 1, wgVar3, wgVar4, R.raw.sticker_to_keyboard);
        wg wgVar5 = wg.e;
        xg xgVar3 = new xg("SMILE_TO_KEYBOARD", 2, wgVar5, wgVar4, R.raw.smile_to_keyboard);
        xg xgVar4 = new xg("VIDEO_TO_VOICE", 3, wgVar2, wgVar, R.raw.voice_and_video);
        e = xgVar4;
        xg xgVar5 = new xg("KEYBOARD_TO_STICKER", 4, wgVar4, wgVar3, R.raw.keyboard_to_sticker);
        wg wgVar6 = wg.f;
        f = new xg[]{xgVar, xgVar2, xgVar3, xgVar4, xgVar5, new xg("KEYBOARD_TO_GIF", 5, wgVar4, wgVar6, R.raw.keyboard_to_gif), new xg("KEYBOARD_TO_SMILE", 6, wgVar4, wgVar5, R.raw.keyboard_to_smile), new xg("GIF_TO_KEYBOARD", 7, wgVar6, wgVar4, R.raw.gif_to_keyboard), new xg("GIF_TO_SMILE", 8, wgVar6, wgVar5, R.raw.gif_to_smile), new xg("SMILE_TO_GIF", 9, wgVar5, wgVar6, R.raw.smile_to_gif), new xg("SMILE_TO_STICKER", 10, wgVar5, wgVar3, R.raw.smile_to_sticker), new xg("STICKER_TO_SMILE", 11, wgVar3, wgVar5, R.raw.sticker_to_smile)};
    }

    public xg(String str, int i7, wg wgVar, wg wgVar2, int i10) {
        this.a = wgVar;
        this.b = wgVar2;
        this.c = i10;
    }

    public static xg valueOf(String str) {
        return (xg) Enum.valueOf(xg.class, str);
    }

    public static xg[] values() {
        return (xg[]) f.clone();
    }
}
