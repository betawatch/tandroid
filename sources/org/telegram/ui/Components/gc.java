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
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gc {
    public static final gc D;
    public static final gc E;
    public static final gc F;
    public static final gc G;
    public static final gc H;
    public static final gc I;
    public static final /* synthetic */ gc[] J;
    public static final gc e;
    public static final gc f;
    public static final gc h;
    public static final gc n;
    public static final gc r;
    public static final gc s;
    public static final gc w;
    public static final gc x;
    public static final gc y;
    public final String a;
    public final int b;
    public final boolean c;
    public final fc d;

    static {
        fc fcVar = fc.e;
        gc gcVar = new gc("PHOTO", 0, "PhotoSavedHint", 2131747264, fcVar);
        e = gcVar;
        gc gcVar2 = new gc("PHOTOS", 1, "PhotosSavedHint", fcVar);
        f = gcVar2;
        gc gcVar3 = new gc("VIDEO", 2, "VideoSavedHint", 2131743585, fcVar);
        h = gcVar3;
        gc gcVar4 = new gc("VIDEOS", 3, "VideosSavedHint", fcVar);
        n = gcVar4;
        gc gcVar5 = new gc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748834, fcVar);
        r = gcVar5;
        gc gcVar6 = new gc("LIVEPHOTOS", 5, "LivePhotosSavedHint", fcVar);
        s = gcVar6;
        gc gcVar7 = new gc("MEDIA", 6, "MediaSavedHint", fcVar);
        w = gcVar7;
        fc fcVar2 = fc.d;
        gc gcVar8 = new gc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747263, fcVar2);
        x = gcVar8;
        gc gcVar9 = new gc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743584, fcVar2);
        y = gcVar9;
        gc gcVar10 = new gc("GIF", 9, "GifSavedHint", 2131750470, fc.h);
        D = gcVar10;
        gc gcVar11 = new gc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750469, fcVar2);
        E = gcVar11;
        fc fcVar3 = fc.f;
        gc gcVar12 = new gc("AUDIO", 11, "AudioSavedHint", 2131753908, fcVar3);
        F = gcVar12;
        gc gcVar13 = new gc("AUDIOS", 12, "AudiosSavedHint", fcVar3);
        G = gcVar13;
        gc gcVar14 = new gc("UNKNOWN", 13, "FileSavedHintLinked", 2131750828, fcVar2);
        H = gcVar14;
        gc gcVar15 = new gc("UNKNOWNS", 14, "FilesSavedHintLinked", fcVar2);
        I = gcVar15;
        J = new gc[]{gcVar, gcVar2, gcVar3, gcVar4, gcVar5, gcVar6, gcVar7, gcVar8, gcVar9, gcVar10, gcVar11, gcVar12, gcVar13, gcVar14, gcVar15};
    }

    public gc(String str, int i7, String str2, int i10, fc fcVar) {
        this.a = str2;
        this.b = i10;
        this.d = fcVar;
        this.c = false;
    }

    public static gc valueOf(String str) {
        return (gc) Enum.valueOf(gc.class, str);
    }

    public static gc[] values() {
        return (gc[]) J.clone();
    }

    public gc(String str, int i7, String str2, fc fcVar) {
        this.a = str2;
        this.d = fcVar;
        this.b = 0;
        this.c = true;
    }
}
