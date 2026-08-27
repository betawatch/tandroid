package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kg {
    public static final kg a;
    public static final kg b;
    public static final kg c;
    public static final kg d;
    public static final kg e;
    public static final kg f;
    public static final /* synthetic */ kg[] h;

    static {
        kg kgVar = new kg("VOICE", 0);
        a = kgVar;
        kg kgVar2 = new kg("VIDEO", 1);
        b = kgVar2;
        kg kgVar3 = new kg("STICKER", 2);
        c = kgVar3;
        kg kgVar4 = new kg("KEYBOARD", 3);
        d = kgVar4;
        kg kgVar5 = new kg("SMILE", 4);
        e = kgVar5;
        kg kgVar6 = new kg("GIF", 5);
        f = kgVar6;
        h = new kg[]{kgVar, kgVar2, kgVar3, kgVar4, kgVar5, kgVar6};
    }

    public static kg valueOf(String str) {
        return (kg) Enum.valueOf(kg.class, str);
    }

    public static kg[] values() {
        return (kg[]) h.clone();
    }
}
