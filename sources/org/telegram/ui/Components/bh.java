package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bh {
    public static final bh a;
    public static final bh b;
    public static final bh c;
    public static final bh d;
    public static final bh e;
    public static final bh f;
    public static final /* synthetic */ bh[] h;

    static {
        bh bhVar = new bh("VOICE", 0);
        a = bhVar;
        bh bhVar2 = new bh("VIDEO", 1);
        b = bhVar2;
        bh bhVar3 = new bh("STICKER", 2);
        c = bhVar3;
        bh bhVar4 = new bh("KEYBOARD", 3);
        d = bhVar4;
        bh bhVar5 = new bh("SMILE", 4);
        e = bhVar5;
        bh bhVar6 = new bh("GIF", 5);
        f = bhVar6;
        h = new bh[]{bhVar, bhVar2, bhVar3, bhVar4, bhVar5, bhVar6};
    }

    public static bh valueOf(String str) {
        return (bh) Enum.valueOf(bh.class, str);
    }

    public static bh[] values() {
        return (bh[]) h.clone();
    }
}
