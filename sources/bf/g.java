package bf;

import android.net.Uri;
import android.os.Bundle;
import q5.l;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final l b;
    public final Uri c;
    public final String d;
    public final int e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(f fVar) {
        String str;
        int i10;
        l lVar;
        Bundle bundle;
        StringBuilder sb;
        StringBuilder sb2;
        String str2;
        String str3;
        int i11;
        str = (String) fVar.c;
        this.a = str;
        str.getClass();
        i10 = 3;
        switch (str) {
            case "image/jpeg":
            case "image/png":
                i10 = 4;
                lVar = (l) fVar.h;
                lVar = lVar == null ? new l(i10) : lVar;
                bundle = lVar.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) fVar.e;
                if (str2 != null) {
                    sb.append(str2);
                }
                str3 = (String) fVar.f;
                if (str3 != null) {
                    sb2.append(str3);
                }
                i11 = fVar.a;
                if (i11 != 0 && fVar.b != 0) {
                    l.f(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i11);
                    int i12 = fVar.b;
                    l.f(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i12);
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append("(");
                    sb2.append(fVar.a);
                    sb2.append("x");
                    sb2.append(fVar.b);
                    sb2.append(")");
                }
                if (sb.length() > 0) {
                    lVar.e("com.google.android.gms.cast.metadata.TITLE", sb.toString());
                } else {
                    lVar.e("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb2.length() > 0) {
                    lVar.e("com.google.android.gms.cast.metadata.SUBTITLE", sb2.toString());
                    break;
                }
                break;
            case "application/x-mpegURL":
            case "video/mp4":
                i10 = 1;
                lVar = (l) fVar.h;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) fVar.e;
                if (str2 != null) {
                }
                str3 = (String) fVar.f;
                if (str3 != null) {
                }
                i11 = fVar.a;
                if (i11 != 0) {
                    l.f(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i11);
                    int i122 = fVar.b;
                    l.f(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i122);
                    if (sb2.length() > 0) {
                    }
                    sb2.append("(");
                    sb2.append(fVar.a);
                    sb2.append("x");
                    sb2.append(fVar.b);
                    sb2.append(")");
                    break;
                }
                if (sb.length() > 0) {
                }
                if (sb2.length() > 0) {
                }
                break;
            default:
                if (!str.startsWith("audio/")) {
                    lVar = null;
                    break;
                }
                lVar = (l) fVar.h;
                if (lVar == null) {
                }
                bundle = lVar.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) fVar.e;
                if (str2 != null) {
                }
                str3 = (String) fVar.f;
                if (str3 != null) {
                }
                i11 = fVar.a;
                if (i11 != 0) {
                }
                if (sb.length() > 0) {
                }
                if (sb2.length() > 0) {
                }
                break;
        }
        this.b = lVar;
        this.c = (Uri) fVar.g;
        this.d = (String) fVar.d;
        this.e = fVar.a;
        this.f = fVar.b;
    }
}
