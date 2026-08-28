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
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nc {
    public static final nc A;
    public static final nc B;
    public static final nc C;
    public static final nc D;
    public static final nc E;
    public static final /* synthetic */ nc[] F;
    public static final nc e;
    public static final nc f;
    public static final nc h;
    public static final nc n;
    public static final nc r;
    public static final nc s;
    public static final nc v;
    public static final nc w;
    public static final nc x;
    public static final nc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final mc d;

    static {
        int i9 = R.string.PhotoSavedHint;
        mc mcVar = mc.e;
        nc ncVar = new nc("PHOTO", 0, "PhotoSavedHint", i9, mcVar);
        e = ncVar;
        nc ncVar2 = new nc("PHOTOS", 1, "PhotosSavedHint", mcVar);
        f = ncVar2;
        nc ncVar3 = new nc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, mcVar);
        h = ncVar3;
        nc ncVar4 = new nc("VIDEOS", 3, "VideosSavedHint", mcVar);
        n = ncVar4;
        nc ncVar5 = new nc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, mcVar);
        r = ncVar5;
        nc ncVar6 = new nc("LIVEPHOTOS", 5, "LivePhotosSavedHint", mcVar);
        s = ncVar6;
        nc ncVar7 = new nc("MEDIA", 6, "MediaSavedHint", mcVar);
        v = ncVar7;
        int i10 = R.string.PhotoSavedToDownloadsHintLinked;
        mc mcVar2 = mc.d;
        nc ncVar8 = new nc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i10, mcVar2);
        w = ncVar8;
        nc ncVar9 = new nc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, mcVar2);
        x = ncVar9;
        nc ncVar10 = new nc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, mc.h);
        y = ncVar10;
        nc ncVar11 = new nc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, mcVar2);
        A = ncVar11;
        int i11 = R.string.AudioSavedHint;
        mc mcVar3 = mc.f;
        nc ncVar12 = new nc("AUDIO", 11, "AudioSavedHint", i11, mcVar3);
        B = ncVar12;
        nc ncVar13 = new nc("AUDIOS", 12, "AudiosSavedHint", mcVar3);
        C = ncVar13;
        nc ncVar14 = new nc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, mcVar2);
        D = ncVar14;
        nc ncVar15 = new nc("UNKNOWNS", 14, "FilesSavedHintLinked", mcVar2);
        E = ncVar15;
        F = new nc[]{ncVar, ncVar2, ncVar3, ncVar4, ncVar5, ncVar6, ncVar7, ncVar8, ncVar9, ncVar10, ncVar11, ncVar12, ncVar13, ncVar14, ncVar15};
    }

    public nc(String str, int i9, String str2, int i10, mc mcVar) {
        this.a = str2;
        this.b = i10;
        this.d = mcVar;
        this.c = false;
    }

    public static nc valueOf(String str) {
        return (nc) Enum.valueOf(nc.class, str);
    }

    public static nc[] values() {
        return (nc[]) F.clone();
    }

    public nc(String str, int i9, String str2, mc mcVar) {
        this.a = str2;
        this.d = mcVar;
        this.b = 0;
        this.c = true;
    }
}
