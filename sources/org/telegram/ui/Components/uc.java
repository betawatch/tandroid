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
/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class uc {
    public static final uc E;
    public static final uc F;
    public static final uc G;
    public static final uc H;
    public static final uc I;
    public static final /* synthetic */ uc[] J;
    public static final uc e;
    public static final uc f;
    public static final uc h;
    public static final uc n;
    public static final uc r;
    public static final uc s;
    public static final uc v;
    public static final uc w;
    public static final uc x;
    public static final uc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final tc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        tc tcVar = tc.e;
        uc ucVar = new uc("PHOTO", 0, "PhotoSavedHint", i10, tcVar);
        e = ucVar;
        uc ucVar2 = new uc("PHOTOS", 1, "PhotosSavedHint", tcVar);
        f = ucVar2;
        uc ucVar3 = new uc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, tcVar);
        h = ucVar3;
        uc ucVar4 = new uc("VIDEOS", 3, "VideosSavedHint", tcVar);
        n = ucVar4;
        uc ucVar5 = new uc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, tcVar);
        r = ucVar5;
        uc ucVar6 = new uc("LIVEPHOTOS", 5, "LivePhotosSavedHint", tcVar);
        s = ucVar6;
        uc ucVar7 = new uc("MEDIA", 6, "MediaSavedHint", tcVar);
        v = ucVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        tc tcVar2 = tc.d;
        uc ucVar8 = new uc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, tcVar2);
        w = ucVar8;
        uc ucVar9 = new uc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, tcVar2);
        x = ucVar9;
        uc ucVar10 = new uc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, tc.h);
        y = ucVar10;
        uc ucVar11 = new uc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, tcVar2);
        E = ucVar11;
        int i12 = R.string.AudioSavedHint;
        tc tcVar3 = tc.f;
        uc ucVar12 = new uc("AUDIO", 11, "AudioSavedHint", i12, tcVar3);
        F = ucVar12;
        uc ucVar13 = new uc("AUDIOS", 12, "AudiosSavedHint", tcVar3);
        G = ucVar13;
        uc ucVar14 = new uc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, tcVar2);
        H = ucVar14;
        uc ucVar15 = new uc("UNKNOWNS", 14, "FilesSavedHintLinked", tcVar2);
        I = ucVar15;
        J = new uc[]{ucVar, ucVar2, ucVar3, ucVar4, ucVar5, ucVar6, ucVar7, ucVar8, ucVar9, ucVar10, ucVar11, ucVar12, ucVar13, ucVar14, ucVar15};
    }

    public uc(String str, int i10, String str2, int i11, tc tcVar) {
        this.a = str2;
        this.b = i11;
        this.d = tcVar;
        this.c = false;
    }

    public static uc valueOf(String str) {
        return (uc) Enum.valueOf(uc.class, str);
    }

    public static uc[] values() {
        return (uc[]) J.clone();
    }

    public uc(String str, int i10, String str2, tc tcVar) {
        this.a = str2;
        this.d = tcVar;
        this.b = 0;
        this.c = true;
    }
}
