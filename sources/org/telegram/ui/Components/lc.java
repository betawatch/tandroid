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
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lc {
    public static final lc A;
    public static final lc B;
    public static final lc C;
    public static final lc D;
    public static final lc E;
    public static final /* synthetic */ lc[] F;
    public static final lc e;
    public static final lc f;
    public static final lc h;
    public static final lc n;
    public static final lc r;
    public static final lc s;
    public static final lc v;
    public static final lc w;
    public static final lc x;
    public static final lc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final kc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        kc kcVar = kc.e;
        lc lcVar = new lc("PHOTO", 0, "PhotoSavedHint", i10, kcVar);
        e = lcVar;
        lc lcVar2 = new lc("PHOTOS", 1, "PhotosSavedHint", kcVar);
        f = lcVar2;
        lc lcVar3 = new lc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, kcVar);
        h = lcVar3;
        lc lcVar4 = new lc("VIDEOS", 3, "VideosSavedHint", kcVar);
        n = lcVar4;
        lc lcVar5 = new lc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, kcVar);
        r = lcVar5;
        lc lcVar6 = new lc("LIVEPHOTOS", 5, "LivePhotosSavedHint", kcVar);
        s = lcVar6;
        lc lcVar7 = new lc("MEDIA", 6, "MediaSavedHint", kcVar);
        v = lcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        kc kcVar2 = kc.d;
        lc lcVar8 = new lc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, kcVar2);
        w = lcVar8;
        lc lcVar9 = new lc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, kcVar2);
        x = lcVar9;
        lc lcVar10 = new lc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, kc.h);
        y = lcVar10;
        lc lcVar11 = new lc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, kcVar2);
        A = lcVar11;
        int i12 = R.string.AudioSavedHint;
        kc kcVar3 = kc.f;
        lc lcVar12 = new lc("AUDIO", 11, "AudioSavedHint", i12, kcVar3);
        B = lcVar12;
        lc lcVar13 = new lc("AUDIOS", 12, "AudiosSavedHint", kcVar3);
        C = lcVar13;
        lc lcVar14 = new lc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, kcVar2);
        D = lcVar14;
        lc lcVar15 = new lc("UNKNOWNS", 14, "FilesSavedHintLinked", kcVar2);
        E = lcVar15;
        F = new lc[]{lcVar, lcVar2, lcVar3, lcVar4, lcVar5, lcVar6, lcVar7, lcVar8, lcVar9, lcVar10, lcVar11, lcVar12, lcVar13, lcVar14, lcVar15};
    }

    public lc(String str, int i10, String str2, int i11, kc kcVar) {
        this.a = str2;
        this.b = i11;
        this.d = kcVar;
        this.c = false;
    }

    public static lc valueOf(String str) {
        return (lc) Enum.valueOf(lc.class, str);
    }

    public static lc[] values() {
        return (lc[]) F.clone();
    }

    public lc(String str, int i10, String str2, kc kcVar) {
        this.a = str2;
        this.d = kcVar;
        this.b = 0;
        this.c = true;
    }
}
