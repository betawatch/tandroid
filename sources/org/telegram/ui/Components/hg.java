package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hg {
    public static final hg a;
    public static final hg b;
    public static final hg c;
    public static final hg d;
    public static final hg e;
    public static final hg f;
    public static final /* synthetic */ hg[] h;

    static {
        hg hgVar = new hg("VOICE", 0);
        a = hgVar;
        hg hgVar2 = new hg("VIDEO", 1);
        b = hgVar2;
        hg hgVar3 = new hg("STICKER", 2);
        c = hgVar3;
        hg hgVar4 = new hg("KEYBOARD", 3);
        d = hgVar4;
        hg hgVar5 = new hg("SMILE", 4);
        e = hgVar5;
        hg hgVar6 = new hg("GIF", 5);
        f = hgVar6;
        h = new hg[]{hgVar, hgVar2, hgVar3, hgVar4, hgVar5, hgVar6};
    }

    public static hg valueOf(String str) {
        return (hg) Enum.valueOf(hg.class, str);
    }

    public static hg[] values() {
        return (hg[]) h.clone();
    }
}
