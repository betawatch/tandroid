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
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kc {
    public static final kc E;
    public static final kc F;
    public static final kc G;
    public static final kc H;
    public static final kc I;
    public static final kc J;
    public static final /* synthetic */ kc[] K;
    public static final kc e;
    public static final kc f;
    public static final kc h;
    public static final kc n;
    public static final kc r;
    public static final kc s;
    public static final kc w;
    public static final kc x;
    public static final kc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final jc d;

    static {
        jc jcVar = jc.e;
        kc kcVar = new kc("PHOTO", 0, "PhotoSavedHint", 2131747071, jcVar);
        e = kcVar;
        kc kcVar2 = new kc("PHOTOS", 1, "PhotosSavedHint", jcVar);
        f = kcVar2;
        kc kcVar3 = new kc("VIDEO", 2, "VideoSavedHint", 2131743348, jcVar);
        h = kcVar3;
        kc kcVar4 = new kc("VIDEOS", 3, "VideosSavedHint", jcVar);
        n = kcVar4;
        kc kcVar5 = new kc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748642, jcVar);
        r = kcVar5;
        kc kcVar6 = new kc("LIVEPHOTOS", 5, "LivePhotosSavedHint", jcVar);
        s = kcVar6;
        kc kcVar7 = new kc("MEDIA", 6, "MediaSavedHint", jcVar);
        w = kcVar7;
        jc jcVar2 = jc.d;
        kc kcVar8 = new kc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747070, jcVar2);
        x = kcVar8;
        kc kcVar9 = new kc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743347, jcVar2);
        y = kcVar9;
        kc kcVar10 = new kc("GIF", 9, "GifSavedHint", 2131750454, jc.h);
        E = kcVar10;
        kc kcVar11 = new kc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750453, jcVar2);
        F = kcVar11;
        jc jcVar3 = jc.f;
        kc kcVar12 = new kc("AUDIO", 11, "AudioSavedHint", 2131753906, jcVar3);
        G = kcVar12;
        kc kcVar13 = new kc("AUDIOS", 12, "AudiosSavedHint", jcVar3);
        H = kcVar13;
        kc kcVar14 = new kc("UNKNOWN", 13, "FileSavedHintLinked", 2131750817, jcVar2);
        I = kcVar14;
        kc kcVar15 = new kc("UNKNOWNS", 14, "FilesSavedHintLinked", jcVar2);
        J = kcVar15;
        K = new kc[]{kcVar, kcVar2, kcVar3, kcVar4, kcVar5, kcVar6, kcVar7, kcVar8, kcVar9, kcVar10, kcVar11, kcVar12, kcVar13, kcVar14, kcVar15};
    }

    public kc(String str, int i7, String str2, int i10, jc jcVar) {
        this.a = str2;
        this.b = i10;
        this.d = jcVar;
        this.c = false;
    }

    public static kc valueOf(String str) {
        return (kc) Enum.valueOf(kc.class, str);
    }

    public static kc[] values() {
        return (kc[]) K.clone();
    }

    public kc(String str, int i7, String str2, jc jcVar) {
        this.a = str2;
        this.d = jcVar;
        this.b = 0;
        this.c = true;
    }
}
