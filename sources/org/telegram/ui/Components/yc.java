package org.telegram.ui.Components;

import org.telegram.messenger.R;

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
/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yc {
    public static final yc E;
    public static final yc F;
    public static final yc G;
    public static final yc H;
    public static final yc I;
    public static final /* synthetic */ yc[] J;
    public static final yc e;
    public static final yc f;
    public static final yc h;
    public static final yc n;
    public static final yc r;
    public static final yc s;
    public static final yc v;
    public static final yc w;
    public static final yc x;
    public static final yc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final xc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        xc xcVar = xc.e;
        yc ycVar = new yc("PHOTO", 0, "PhotoSavedHint", i10, xcVar);
        e = ycVar;
        yc ycVar2 = new yc("PHOTOS", 1, "PhotosSavedHint", xcVar);
        f = ycVar2;
        yc ycVar3 = new yc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, xcVar);
        h = ycVar3;
        yc ycVar4 = new yc("VIDEOS", 3, "VideosSavedHint", xcVar);
        n = ycVar4;
        yc ycVar5 = new yc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, xcVar);
        r = ycVar5;
        yc ycVar6 = new yc("LIVEPHOTOS", 5, "LivePhotosSavedHint", xcVar);
        s = ycVar6;
        yc ycVar7 = new yc("MEDIA", 6, "MediaSavedHint", xcVar);
        v = ycVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        xc xcVar2 = xc.d;
        yc ycVar8 = new yc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, xcVar2);
        w = ycVar8;
        yc ycVar9 = new yc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, xcVar2);
        x = ycVar9;
        yc ycVar10 = new yc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, xc.h);
        y = ycVar10;
        yc ycVar11 = new yc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, xcVar2);
        E = ycVar11;
        int i12 = R.string.AudioSavedHint;
        xc xcVar3 = xc.f;
        yc ycVar12 = new yc("AUDIO", 11, "AudioSavedHint", i12, xcVar3);
        F = ycVar12;
        yc ycVar13 = new yc("AUDIOS", 12, "AudiosSavedHint", xcVar3);
        G = ycVar13;
        yc ycVar14 = new yc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, xcVar2);
        H = ycVar14;
        yc ycVar15 = new yc("UNKNOWNS", 14, "FilesSavedHintLinked", xcVar2);
        I = ycVar15;
        J = new yc[]{ycVar, ycVar2, ycVar3, ycVar4, ycVar5, ycVar6, ycVar7, ycVar8, ycVar9, ycVar10, ycVar11, ycVar12, ycVar13, ycVar14, ycVar15};
    }

    public yc(String str, int i10, String str2, int i11, xc xcVar) {
        this.a = str2;
        this.b = i11;
        this.d = xcVar;
        this.c = false;
    }

    public static yc valueOf(String str) {
        return (yc) Enum.valueOf(yc.class, str);
    }

    public static yc[] values() {
        return (yc[]) J.clone();
    }

    public yc(String str, int i10, String str2, xc xcVar) {
        this.a = str2;
        this.d = xcVar;
        this.b = 0;
        this.c = true;
    }
}
