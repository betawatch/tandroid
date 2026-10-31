package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dg {
    public static final dg a;
    public static final dg b;
    public static final dg c;
    public static final dg d;
    public static final dg e;
    public static final dg f;
    public static final /* synthetic */ dg[] h;

    static {
        dg dgVar = new dg("VOICE", 0);
        a = dgVar;
        dg dgVar2 = new dg("VIDEO", 1);
        b = dgVar2;
        dg dgVar3 = new dg("STICKER", 2);
        c = dgVar3;
        dg dgVar4 = new dg("KEYBOARD", 3);
        d = dgVar4;
        dg dgVar5 = new dg("SMILE", 4);
        e = dgVar5;
        dg dgVar6 = new dg("GIF", 5);
        f = dgVar6;
        h = new dg[]{dgVar, dgVar2, dgVar3, dgVar4, dgVar5, dgVar6};
    }

    public static dg valueOf(String str) {
        return (dg) Enum.valueOf(dg.class, str);
    }

    public static dg[] values() {
        return (dg[]) h.clone();
    }
}
