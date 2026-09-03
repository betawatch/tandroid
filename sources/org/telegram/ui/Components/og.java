package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class og {
    public static final og a;
    public static final og b;
    public static final og c;
    public static final og d;
    public static final og e;
    public static final og f;
    public static final /* synthetic */ og[] h;

    static {
        og ogVar = new og("VOICE", 0);
        a = ogVar;
        og ogVar2 = new og("VIDEO", 1);
        b = ogVar2;
        og ogVar3 = new og("STICKER", 2);
        c = ogVar3;
        og ogVar4 = new og("KEYBOARD", 3);
        d = ogVar4;
        og ogVar5 = new og("SMILE", 4);
        e = ogVar5;
        og ogVar6 = new og("GIF", 5);
        f = ogVar6;
        h = new og[]{ogVar, ogVar2, ogVar3, ogVar4, ogVar5, ogVar6};
    }

    public static og valueOf(String str) {
        return (og) Enum.valueOf(og.class, str);
    }

    public static og[] values() {
        return (og[]) h.clone();
    }
}
