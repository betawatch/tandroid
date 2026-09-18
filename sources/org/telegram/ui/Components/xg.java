package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xg {
    public static final xg a;
    public static final xg b;
    public static final xg c;
    public static final xg d;
    public static final xg e;
    public static final xg f;
    public static final /* synthetic */ xg[] h;

    static {
        xg xgVar = new xg("VOICE", 0);
        a = xgVar;
        xg xgVar2 = new xg("VIDEO", 1);
        b = xgVar2;
        xg xgVar3 = new xg("STICKER", 2);
        c = xgVar3;
        xg xgVar4 = new xg("KEYBOARD", 3);
        d = xgVar4;
        xg xgVar5 = new xg("SMILE", 4);
        e = xgVar5;
        xg xgVar6 = new xg("GIF", 5);
        f = xgVar6;
        h = new xg[]{xgVar, xgVar2, xgVar3, xgVar4, xgVar5, xgVar6};
    }

    public static xg valueOf(String str) {
        return (xg) Enum.valueOf(xg.class, str);
    }

    public static xg[] values() {
        return (xg[]) h.clone();
    }
}
