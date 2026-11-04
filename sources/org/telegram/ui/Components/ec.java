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
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ec {
    public static final ec E;
    public static final ec F;
    public static final ec G;
    public static final ec H;
    public static final ec I;
    public static final ec J;
    public static final /* synthetic */ ec[] K;
    public static final ec e;
    public static final ec f;
    public static final ec h;
    public static final ec n;
    public static final ec r;
    public static final ec s;
    public static final ec w;
    public static final ec x;
    public static final ec y;
    public final String a;
    public final int b;
    public final boolean c;
    public final dc d;

    static {
        dc dcVar = dc.e;
        ec ecVar = new ec("PHOTO", 0, "PhotoSavedHint", 2131747272, dcVar);
        e = ecVar;
        ec ecVar2 = new ec("PHOTOS", 1, "PhotosSavedHint", dcVar);
        f = ecVar2;
        ec ecVar3 = new ec("VIDEO", 2, "VideoSavedHint", 2131743595, dcVar);
        h = ecVar3;
        ec ecVar4 = new ec("VIDEOS", 3, "VideosSavedHint", dcVar);
        n = ecVar4;
        ec ecVar5 = new ec("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748842, dcVar);
        r = ecVar5;
        ec ecVar6 = new ec("LIVEPHOTOS", 5, "LivePhotosSavedHint", dcVar);
        s = ecVar6;
        ec ecVar7 = new ec("MEDIA", 6, "MediaSavedHint", dcVar);
        w = ecVar7;
        dc dcVar2 = dc.d;
        ec ecVar8 = new ec("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747271, dcVar2);
        x = ecVar8;
        ec ecVar9 = new ec("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743594, dcVar2);
        y = ecVar9;
        ec ecVar10 = new ec("GIF", 9, "GifSavedHint", 2131750478, dc.h);
        E = ecVar10;
        ec ecVar11 = new ec("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750477, dcVar2);
        F = ecVar11;
        dc dcVar3 = dc.f;
        ec ecVar12 = new ec("AUDIO", 11, "AudioSavedHint", 2131753908, dcVar3);
        G = ecVar12;
        ec ecVar13 = new ec("AUDIOS", 12, "AudiosSavedHint", dcVar3);
        H = ecVar13;
        ec ecVar14 = new ec("UNKNOWN", 13, "FileSavedHintLinked", 2131750829, dcVar2);
        I = ecVar14;
        ec ecVar15 = new ec("UNKNOWNS", 14, "FilesSavedHintLinked", dcVar2);
        J = ecVar15;
        K = new ec[]{ecVar, ecVar2, ecVar3, ecVar4, ecVar5, ecVar6, ecVar7, ecVar8, ecVar9, ecVar10, ecVar11, ecVar12, ecVar13, ecVar14, ecVar15};
    }

    public ec(String str, int i3, String str2, int i10, dc dcVar) {
        this.a = str2;
        this.b = i10;
        this.d = dcVar;
        this.c = false;
    }

    public static ec valueOf(String str) {
        return (ec) Enum.valueOf(ec.class, str);
    }

    public static ec[] values() {
        return (ec[]) K.clone();
    }

    public ec(String str, int i3, String str2, dc dcVar) {
        this.a = str2;
        this.d = dcVar;
        this.b = 0;
        this.c = true;
    }
}
