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
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sc {
    public static final sc A;
    public static final sc B;
    public static final sc C;
    public static final sc D;
    public static final sc E;
    public static final /* synthetic */ sc[] F;
    public static final sc e;
    public static final sc f;
    public static final sc h;
    public static final sc n;
    public static final sc r;
    public static final sc s;
    public static final sc v;
    public static final sc w;
    public static final sc x;
    public static final sc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final rc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        rc rcVar = rc.e;
        sc scVar = new sc("PHOTO", 0, "PhotoSavedHint", i10, rcVar);
        e = scVar;
        sc scVar2 = new sc("PHOTOS", 1, "PhotosSavedHint", rcVar);
        f = scVar2;
        sc scVar3 = new sc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, rcVar);
        h = scVar3;
        sc scVar4 = new sc("VIDEOS", 3, "VideosSavedHint", rcVar);
        n = scVar4;
        sc scVar5 = new sc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, rcVar);
        r = scVar5;
        sc scVar6 = new sc("LIVEPHOTOS", 5, "LivePhotosSavedHint", rcVar);
        s = scVar6;
        sc scVar7 = new sc("MEDIA", 6, "MediaSavedHint", rcVar);
        v = scVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        rc rcVar2 = rc.d;
        sc scVar8 = new sc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, rcVar2);
        w = scVar8;
        sc scVar9 = new sc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, rcVar2);
        x = scVar9;
        sc scVar10 = new sc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, rc.h);
        y = scVar10;
        sc scVar11 = new sc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, rcVar2);
        A = scVar11;
        int i12 = R.string.AudioSavedHint;
        rc rcVar3 = rc.f;
        sc scVar12 = new sc("AUDIO", 11, "AudioSavedHint", i12, rcVar3);
        B = scVar12;
        sc scVar13 = new sc("AUDIOS", 12, "AudiosSavedHint", rcVar3);
        C = scVar13;
        sc scVar14 = new sc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, rcVar2);
        D = scVar14;
        sc scVar15 = new sc("UNKNOWNS", 14, "FilesSavedHintLinked", rcVar2);
        E = scVar15;
        F = new sc[]{scVar, scVar2, scVar3, scVar4, scVar5, scVar6, scVar7, scVar8, scVar9, scVar10, scVar11, scVar12, scVar13, scVar14, scVar15};
    }

    public sc(String str, int i10, String str2, int i11, rc rcVar) {
        this.a = str2;
        this.b = i11;
        this.d = rcVar;
        this.c = false;
    }

    public static sc valueOf(String str) {
        return (sc) Enum.valueOf(sc.class, str);
    }

    public static sc[] values() {
        return (sc[]) F.clone();
    }

    public sc(String str, int i10, String str2, rc rcVar) {
        this.a = str2;
        this.d = rcVar;
        this.b = 0;
        this.c = true;
    }
}
