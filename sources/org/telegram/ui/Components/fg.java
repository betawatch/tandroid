package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fg {
    public static final fg a;
    public static final fg b;
    public static final fg c;
    public static final fg d;
    public static final fg e;
    public static final fg f;
    public static final /* synthetic */ fg[] h;

    static {
        fg fgVar = new fg("VOICE", 0);
        a = fgVar;
        fg fgVar2 = new fg("VIDEO", 1);
        b = fgVar2;
        fg fgVar3 = new fg("STICKER", 2);
        c = fgVar3;
        fg fgVar4 = new fg("KEYBOARD", 3);
        d = fgVar4;
        fg fgVar5 = new fg("SMILE", 4);
        e = fgVar5;
        fg fgVar6 = new fg("GIF", 5);
        f = fgVar6;
        h = new fg[]{fgVar, fgVar2, fgVar3, fgVar4, fgVar5, fgVar6};
    }

    public static fg valueOf(String str) {
        return (fg) Enum.valueOf(fg.class, str);
    }

    public static fg[] values() {
        return (fg[]) h.clone();
    }
}
