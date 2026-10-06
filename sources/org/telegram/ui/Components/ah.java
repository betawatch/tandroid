package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ah {
    public static final ah a;
    public static final ah b;
    public static final ah c;
    public static final ah d;
    public static final ah e;
    public static final ah f;
    public static final /* synthetic */ ah[] h;

    static {
        ah ahVar = new ah("VOICE", 0);
        a = ahVar;
        ah ahVar2 = new ah("VIDEO", 1);
        b = ahVar2;
        ah ahVar3 = new ah("STICKER", 2);
        c = ahVar3;
        ah ahVar4 = new ah("KEYBOARD", 3);
        d = ahVar4;
        ah ahVar5 = new ah("SMILE", 4);
        e = ahVar5;
        ah ahVar6 = new ah("GIF", 5);
        f = ahVar6;
        h = new ah[]{ahVar, ahVar2, ahVar3, ahVar4, ahVar5, ahVar6};
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) h.clone();
    }
}
