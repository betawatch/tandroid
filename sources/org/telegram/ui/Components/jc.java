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
/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jc {
    public static final jc E;
    public static final jc F;
    public static final jc G;
    public static final jc H;
    public static final jc I;
    public static final jc J;
    public static final /* synthetic */ jc[] K;
    public static final jc e;
    public static final jc f;
    public static final jc h;
    public static final jc n;
    public static final jc r;
    public static final jc s;
    public static final jc w;
    public static final jc x;
    public static final jc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final ic d;

    static {
        ic icVar = ic.e;
        jc jcVar = new jc("PHOTO", 0, "PhotoSavedHint", 2131747070, icVar);
        e = jcVar;
        jc jcVar2 = new jc("PHOTOS", 1, "PhotosSavedHint", icVar);
        f = jcVar2;
        jc jcVar3 = new jc("VIDEO", 2, "VideoSavedHint", 2131743335, icVar);
        h = jcVar3;
        jc jcVar4 = new jc("VIDEOS", 3, "VideosSavedHint", icVar);
        n = jcVar4;
        jc jcVar5 = new jc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748641, icVar);
        r = jcVar5;
        jc jcVar6 = new jc("LIVEPHOTOS", 5, "LivePhotosSavedHint", icVar);
        s = jcVar6;
        jc jcVar7 = new jc("MEDIA", 6, "MediaSavedHint", icVar);
        w = jcVar7;
        ic icVar2 = ic.d;
        jc jcVar8 = new jc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747069, icVar2);
        x = jcVar8;
        jc jcVar9 = new jc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743334, icVar2);
        y = jcVar9;
        jc jcVar10 = new jc("GIF", 9, "GifSavedHint", 2131750453, ic.h);
        E = jcVar10;
        jc jcVar11 = new jc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750452, icVar2);
        F = jcVar11;
        ic icVar3 = ic.f;
        jc jcVar12 = new jc("AUDIO", 11, "AudioSavedHint", 2131753905, icVar3);
        G = jcVar12;
        jc jcVar13 = new jc("AUDIOS", 12, "AudiosSavedHint", icVar3);
        H = jcVar13;
        jc jcVar14 = new jc("UNKNOWN", 13, "FileSavedHintLinked", 2131750816, icVar2);
        I = jcVar14;
        jc jcVar15 = new jc("UNKNOWNS", 14, "FilesSavedHintLinked", icVar2);
        J = jcVar15;
        K = new jc[]{jcVar, jcVar2, jcVar3, jcVar4, jcVar5, jcVar6, jcVar7, jcVar8, jcVar9, jcVar10, jcVar11, jcVar12, jcVar13, jcVar14, jcVar15};
    }

    public jc(String str, int i7, String str2, int i10, ic icVar) {
        this.a = str2;
        this.b = i10;
        this.d = icVar;
        this.c = false;
    }

    public static jc valueOf(String str) {
        return (jc) Enum.valueOf(jc.class, str);
    }

    public static jc[] values() {
        return (jc[]) K.clone();
    }

    public jc(String str, int i7, String str2, ic icVar) {
        this.a = str2;
        this.d = icVar;
        this.b = 0;
        this.c = true;
    }
}
