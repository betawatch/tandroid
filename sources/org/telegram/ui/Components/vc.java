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
/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vc {
    public static final vc E;
    public static final vc F;
    public static final vc G;
    public static final vc H;
    public static final vc I;
    public static final /* synthetic */ vc[] J;
    public static final vc e;
    public static final vc f;
    public static final vc h;
    public static final vc n;
    public static final vc r;
    public static final vc s;
    public static final vc v;
    public static final vc w;
    public static final vc x;
    public static final vc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final uc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        uc ucVar = uc.e;
        vc vcVar = new vc("PHOTO", 0, "PhotoSavedHint", i10, ucVar);
        e = vcVar;
        vc vcVar2 = new vc("PHOTOS", 1, "PhotosSavedHint", ucVar);
        f = vcVar2;
        vc vcVar3 = new vc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, ucVar);
        h = vcVar3;
        vc vcVar4 = new vc("VIDEOS", 3, "VideosSavedHint", ucVar);
        n = vcVar4;
        vc vcVar5 = new vc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, ucVar);
        r = vcVar5;
        vc vcVar6 = new vc("LIVEPHOTOS", 5, "LivePhotosSavedHint", ucVar);
        s = vcVar6;
        vc vcVar7 = new vc("MEDIA", 6, "MediaSavedHint", ucVar);
        v = vcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        uc ucVar2 = uc.d;
        vc vcVar8 = new vc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, ucVar2);
        w = vcVar8;
        vc vcVar9 = new vc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, ucVar2);
        x = vcVar9;
        vc vcVar10 = new vc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, uc.h);
        y = vcVar10;
        vc vcVar11 = new vc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, ucVar2);
        E = vcVar11;
        int i12 = R.string.AudioSavedHint;
        uc ucVar3 = uc.f;
        vc vcVar12 = new vc("AUDIO", 11, "AudioSavedHint", i12, ucVar3);
        F = vcVar12;
        vc vcVar13 = new vc("AUDIOS", 12, "AudiosSavedHint", ucVar3);
        G = vcVar13;
        vc vcVar14 = new vc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, ucVar2);
        H = vcVar14;
        vc vcVar15 = new vc("UNKNOWNS", 14, "FilesSavedHintLinked", ucVar2);
        I = vcVar15;
        J = new vc[]{vcVar, vcVar2, vcVar3, vcVar4, vcVar5, vcVar6, vcVar7, vcVar8, vcVar9, vcVar10, vcVar11, vcVar12, vcVar13, vcVar14, vcVar15};
    }

    public vc(String str, int i10, String str2, int i11, uc ucVar) {
        this.a = str2;
        this.b = i11;
        this.d = ucVar;
        this.c = false;
    }

    public static vc valueOf(String str) {
        return (vc) Enum.valueOf(vc.class, str);
    }

    public static vc[] values() {
        return (vc[]) J.clone();
    }

    public vc(String str, int i10, String str2, uc ucVar) {
        this.a = str2;
        this.d = ucVar;
        this.b = 0;
        this.c = true;
    }
}
