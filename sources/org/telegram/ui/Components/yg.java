package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class yg {
    public static final yg a;
    public static final yg b;
    public static final yg c;
    public static final yg d;
    public static final yg e;
    public static final yg f;
    public static final /* synthetic */ yg[] h;

    static {
        yg ygVar = new yg("VOICE", 0);
        a = ygVar;
        yg ygVar2 = new yg("VIDEO", 1);
        b = ygVar2;
        yg ygVar3 = new yg("STICKER", 2);
        c = ygVar3;
        yg ygVar4 = new yg("KEYBOARD", 3);
        d = ygVar4;
        yg ygVar5 = new yg("SMILE", 4);
        e = ygVar5;
        yg ygVar6 = new yg("GIF", 5);
        f = ygVar6;
        h = new yg[]{ygVar, ygVar2, ygVar3, ygVar4, ygVar5, ygVar6};
    }

    public static yg valueOf(String str) {
        return (yg) Enum.valueOf(yg.class, str);
    }

    public static yg[] values() {
        return (yg[]) h.clone();
    }
}
