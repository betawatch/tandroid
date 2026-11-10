package org.telegram.ui.Components;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fc {
    public static final fc D;
    public static final fc E;
    public static final fc F;
    public static final fc G;
    public static final fc H;
    public static final fc I;
    public static final /* synthetic */ fc[] J;
    public static final fc e;
    public static final fc f;
    public static final fc h;
    public static final fc n;
    public static final fc r;
    public static final fc s;
    public static final fc w;
    public static final fc x;
    public static final fc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final ec d;

    static {
        ec ecVar = ec.e;
        fc fcVar = new fc("PHOTO", 0, "PhotoSavedHint", 2131747264, ecVar);
        e = fcVar;
        fc fcVar2 = new fc("PHOTOS", 1, "PhotosSavedHint", ecVar);
        f = fcVar2;
        fc fcVar3 = new fc("VIDEO", 2, "VideoSavedHint", 2131743585, ecVar);
        h = fcVar3;
        fc fcVar4 = new fc("VIDEOS", 3, "VideosSavedHint", ecVar);
        n = fcVar4;
        fc fcVar5 = new fc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748834, ecVar);
        r = fcVar5;
        fc fcVar6 = new fc("LIVEPHOTOS", 5, "LivePhotosSavedHint", ecVar);
        s = fcVar6;
        fc fcVar7 = new fc("MEDIA", 6, "MediaSavedHint", ecVar);
        w = fcVar7;
        ec ecVar2 = ec.d;
        fc fcVar8 = new fc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747263, ecVar2);
        x = fcVar8;
        fc fcVar9 = new fc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743584, ecVar2);
        y = fcVar9;
        fc fcVar10 = new fc("GIF", 9, "GifSavedHint", 2131750470, ec.h);
        D = fcVar10;
        fc fcVar11 = new fc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750469, ecVar2);
        E = fcVar11;
        ec ecVar3 = ec.f;
        fc fcVar12 = new fc("AUDIO", 11, "AudioSavedHint", 2131753908, ecVar3);
        F = fcVar12;
        fc fcVar13 = new fc("AUDIOS", 12, "AudiosSavedHint", ecVar3);
        G = fcVar13;
        fc fcVar14 = new fc("UNKNOWN", 13, "FileSavedHintLinked", 2131750828, ecVar2);
        H = fcVar14;
        fc fcVar15 = new fc("UNKNOWNS", 14, "FilesSavedHintLinked", ecVar2);
        I = fcVar15;
        J = new fc[]{fcVar, fcVar2, fcVar3, fcVar4, fcVar5, fcVar6, fcVar7, fcVar8, fcVar9, fcVar10, fcVar11, fcVar12, fcVar13, fcVar14, fcVar15};
    }

    public fc(String str, int i7, String str2, int i10, ec ecVar) {
        this.a = str2;
        this.b = i10;
        this.d = ecVar;
        this.c = false;
    }

    public static fc valueOf(String str) {
        return (fc) Enum.valueOf(fc.class, str);
    }

    public static fc[] values() {
        return (fc[]) J.clone();
    }

    public fc(String str, int i7, String str2, ec ecVar) {
        this.a = str2;
        this.d = ecVar;
        this.b = 0;
        this.c = true;
    }
}
