package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rg {
    public static final rg a;
    public static final rg b;
    public static final rg c;
    public static final rg d;
    public static final rg e;
    public static final rg f;
    public static final /* synthetic */ rg[] h;

    static {
        rg rgVar = new rg("VOICE", 0);
        a = rgVar;
        rg rgVar2 = new rg("VIDEO", 1);
        b = rgVar2;
        rg rgVar3 = new rg("STICKER", 2);
        c = rgVar3;
        rg rgVar4 = new rg("KEYBOARD", 3);
        d = rgVar4;
        rg rgVar5 = new rg("SMILE", 4);
        e = rgVar5;
        rg rgVar6 = new rg("GIF", 5);
        f = rgVar6;
        h = new rg[]{rgVar, rgVar2, rgVar3, rgVar4, rgVar5, rgVar6};
    }

    public static rg valueOf(String str) {
        return (rg) Enum.valueOf(rg.class, str);
    }

    public static rg[] values() {
        return (rg[]) h.clone();
    }
}
