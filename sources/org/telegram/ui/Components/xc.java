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
/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xc {
    public static final xc E;
    public static final xc F;
    public static final xc G;
    public static final xc H;
    public static final xc I;
    public static final /* synthetic */ xc[] J;
    public static final xc e;
    public static final xc f;
    public static final xc h;
    public static final xc n;
    public static final xc r;
    public static final xc s;
    public static final xc v;
    public static final xc w;
    public static final xc x;
    public static final xc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final wc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        wc wcVar = wc.e;
        xc xcVar = new xc("PHOTO", 0, "PhotoSavedHint", i10, wcVar);
        e = xcVar;
        xc xcVar2 = new xc("PHOTOS", 1, "PhotosSavedHint", wcVar);
        f = xcVar2;
        xc xcVar3 = new xc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, wcVar);
        h = xcVar3;
        xc xcVar4 = new xc("VIDEOS", 3, "VideosSavedHint", wcVar);
        n = xcVar4;
        xc xcVar5 = new xc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, wcVar);
        r = xcVar5;
        xc xcVar6 = new xc("LIVEPHOTOS", 5, "LivePhotosSavedHint", wcVar);
        s = xcVar6;
        xc xcVar7 = new xc("MEDIA", 6, "MediaSavedHint", wcVar);
        v = xcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        wc wcVar2 = wc.d;
        xc xcVar8 = new xc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, wcVar2);
        w = xcVar8;
        xc xcVar9 = new xc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, wcVar2);
        x = xcVar9;
        xc xcVar10 = new xc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, wc.h);
        y = xcVar10;
        xc xcVar11 = new xc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, wcVar2);
        E = xcVar11;
        int i12 = R.string.AudioSavedHint;
        wc wcVar3 = wc.f;
        xc xcVar12 = new xc("AUDIO", 11, "AudioSavedHint", i12, wcVar3);
        F = xcVar12;
        xc xcVar13 = new xc("AUDIOS", 12, "AudiosSavedHint", wcVar3);
        G = xcVar13;
        xc xcVar14 = new xc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, wcVar2);
        H = xcVar14;
        xc xcVar15 = new xc("UNKNOWNS", 14, "FilesSavedHintLinked", wcVar2);
        I = xcVar15;
        J = new xc[]{xcVar, xcVar2, xcVar3, xcVar4, xcVar5, xcVar6, xcVar7, xcVar8, xcVar9, xcVar10, xcVar11, xcVar12, xcVar13, xcVar14, xcVar15};
    }

    public xc(String str, int i10, String str2, int i11, wc wcVar) {
        this.a = str2;
        this.b = i11;
        this.d = wcVar;
        this.c = false;
    }

    public static xc valueOf(String str) {
        return (xc) Enum.valueOf(xc.class, str);
    }

    public static xc[] values() {
        return (xc[]) J.clone();
    }

    public xc(String str, int i10, String str2, wc wcVar) {
        this.a = str2;
        this.d = wcVar;
        this.b = 0;
        this.c = true;
    }
}
