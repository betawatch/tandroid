package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class zg {
    public static final zg a;
    public static final zg b;
    public static final zg c;
    public static final zg d;
    public static final zg e;
    public static final zg f;
    public static final /* synthetic */ zg[] h;

    static {
        zg zgVar = new zg("VOICE", 0);
        a = zgVar;
        zg zgVar2 = new zg("VIDEO", 1);
        b = zgVar2;
        zg zgVar3 = new zg("STICKER", 2);
        c = zgVar3;
        zg zgVar4 = new zg("KEYBOARD", 3);
        d = zgVar4;
        zg zgVar5 = new zg("SMILE", 4);
        e = zgVar5;
        zg zgVar6 = new zg("GIF", 5);
        f = zgVar6;
        h = new zg[]{zgVar, zgVar2, zgVar3, zgVar4, zgVar5, zgVar6};
    }

    public static zg valueOf(String str) {
        return (zg) Enum.valueOf(zg.class, str);
    }

    public static zg[] values() {
        return (zg[]) h.clone();
    }
}
