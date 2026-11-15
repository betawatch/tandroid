package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ng {
    public static final ng a;
    public static final ng b;
    public static final ng c;
    public static final ng d;
    public static final ng e;
    public static final ng f;
    public static final /* synthetic */ ng[] h;

    static {
        ng ngVar = new ng("VOICE", 0);
        a = ngVar;
        ng ngVar2 = new ng("VIDEO", 1);
        b = ngVar2;
        ng ngVar3 = new ng("STICKER", 2);
        c = ngVar3;
        ng ngVar4 = new ng("KEYBOARD", 3);
        d = ngVar4;
        ng ngVar5 = new ng("SMILE", 4);
        e = ngVar5;
        ng ngVar6 = new ng("GIF", 5);
        f = ngVar6;
        h = new ng[]{ngVar, ngVar2, ngVar3, ngVar4, ngVar5, ngVar6};
    }

    public static ng valueOf(String str) {
        return (ng) Enum.valueOf(ng.class, str);
    }

    public static ng[] values() {
        return (ng[]) h.clone();
    }
}
