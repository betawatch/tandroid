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
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pg {
    public static final pg d;
    public static final pg e;
    public static final /* synthetic */ pg[] f;
    public final og a;
    public final og b;
    public final int c;

    static {
        int i9 = R.raw.voice_and_video;
        og ogVar = og.a;
        og ogVar2 = og.b;
        pg pgVar = new pg("VOICE_TO_VIDEO", 0, ogVar, ogVar2, i9);
        d = pgVar;
        int i10 = R.raw.sticker_to_keyboard;
        og ogVar3 = og.c;
        og ogVar4 = og.d;
        pg pgVar2 = new pg("STICKER_TO_KEYBOARD", 1, ogVar3, ogVar4, i10);
        int i11 = R.raw.smile_to_keyboard;
        og ogVar5 = og.e;
        pg pgVar3 = new pg("SMILE_TO_KEYBOARD", 2, ogVar5, ogVar4, i11);
        pg pgVar4 = new pg("VIDEO_TO_VOICE", 3, ogVar2, ogVar, i9);
        e = pgVar4;
        pg pgVar5 = new pg("KEYBOARD_TO_STICKER", 4, ogVar4, ogVar3, R.raw.keyboard_to_sticker);
        int i12 = R.raw.keyboard_to_gif;
        og ogVar6 = og.f;
        f = new pg[]{pgVar, pgVar2, pgVar3, pgVar4, pgVar5, new pg("KEYBOARD_TO_GIF", 5, ogVar4, ogVar6, i12), new pg("KEYBOARD_TO_SMILE", 6, ogVar4, ogVar5, R.raw.keyboard_to_smile), new pg("GIF_TO_KEYBOARD", 7, ogVar6, ogVar4, R.raw.gif_to_keyboard), new pg("GIF_TO_SMILE", 8, ogVar6, ogVar5, R.raw.gif_to_smile), new pg("SMILE_TO_GIF", 9, ogVar5, ogVar6, R.raw.smile_to_gif), new pg("SMILE_TO_STICKER", 10, ogVar5, ogVar3, R.raw.smile_to_sticker), new pg("STICKER_TO_SMILE", 11, ogVar3, ogVar5, R.raw.sticker_to_smile)};
    }

    public pg(String str, int i9, og ogVar, og ogVar2, int i10) {
        this.a = ogVar;
        this.b = ogVar2;
        this.c = i10;
    }

    public static pg valueOf(String str) {
        return (pg) Enum.valueOf(pg.class, str);
    }

    public static pg[] values() {
        return (pg[]) f.clone();
    }
}
