package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gg {
    public static final gg a;
    public static final gg b;
    public static final gg c;
    public static final gg d;
    public static final gg e;
    public static final gg f;
    public static final /* synthetic */ gg[] h;

    static {
        gg ggVar = new gg("VOICE", 0);
        a = ggVar;
        gg ggVar2 = new gg("VIDEO", 1);
        b = ggVar2;
        gg ggVar3 = new gg("STICKER", 2);
        c = ggVar3;
        gg ggVar4 = new gg("KEYBOARD", 3);
        d = ggVar4;
        gg ggVar5 = new gg("SMILE", 4);
        e = ggVar5;
        gg ggVar6 = new gg("GIF", 5);
        f = ggVar6;
        h = new gg[]{ggVar, ggVar2, ggVar3, ggVar4, ggVar5, ggVar6};
    }

    public static gg valueOf(String str) {
        return (gg) Enum.valueOf(gg.class, str);
    }

    public static gg[] values() {
        return (gg[]) h.clone();
    }
}
