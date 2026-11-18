package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wg {
    public static final wg a;
    public static final wg b;
    public static final wg c;
    public static final wg d;
    public static final wg e;
    public static final wg f;
    public static final /* synthetic */ wg[] h;

    static {
        wg wgVar = new wg("VOICE", 0);
        a = wgVar;
        wg wgVar2 = new wg("VIDEO", 1);
        b = wgVar2;
        wg wgVar3 = new wg("STICKER", 2);
        c = wgVar3;
        wg wgVar4 = new wg("KEYBOARD", 3);
        d = wgVar4;
        wg wgVar5 = new wg("SMILE", 4);
        e = wgVar5;
        wg wgVar6 = new wg("GIF", 5);
        f = wgVar6;
        h = new wg[]{wgVar, wgVar2, wgVar3, wgVar4, wgVar5, wgVar6};
    }

    public static wg valueOf(String str) {
        return (wg) Enum.valueOf(wg.class, str);
    }

    public static wg[] values() {
        return (wg[]) h.clone();
    }
}
