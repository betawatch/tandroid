// default package

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class li2 {
    public final String a;
    public final it6 b;
    public final Uri c;
    public final String d;
    public final int e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public li2(ki2 ki2Var) {
        String str;
        int i;
        it6 it6Var;
        Bundle bundle;
        StringBuilder sb;
        StringBuilder sb2;
        String str2;
        String str3;
        int i2;
        str = (String) ki2Var.c;
        this.a = str;
        str.getClass();
        i = 3;
        switch (str) {
            case "image/jpeg":
            case "image/png":
                i = 4;
                it6Var = (it6) ki2Var.h;
                it6Var = it6Var == null ? new it6(i) : it6Var;
                bundle = it6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) ki2Var.e;
                if (str2 != null) {
                    sb.append(str2);
                }
                str3 = (String) ki2Var.f;
                if (str3 != null) {
                    sb2.append(str3);
                }
                i2 = ki2Var.a;
                if (i2 != 0 && ki2Var.b != 0) {
                    it6.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i2);
                    int i3 = ki2Var.b;
                    it6.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i3);
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append("(");
                    sb2.append(ki2Var.a);
                    sb2.append("x");
                    sb2.append(ki2Var.b);
                    sb2.append(")");
                }
                if (sb.length() > 0) {
                    it6Var.b("com.google.android.gms.cast.metadata.TITLE", sb.toString());
                } else {
                    it6Var.b("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb2.length() > 0) {
                    it6Var.b("com.google.android.gms.cast.metadata.SUBTITLE", sb2.toString());
                    break;
                }
                break;
            case "application/x-mpegURL":
            case "video/mp4":
                i = 1;
                it6Var = (it6) ki2Var.h;
                if (it6Var == null) {
                }
                bundle = it6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) ki2Var.e;
                if (str2 != null) {
                }
                str3 = (String) ki2Var.f;
                if (str3 != null) {
                }
                i2 = ki2Var.a;
                if (i2 != 0) {
                    it6.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i2);
                    int i32 = ki2Var.b;
                    it6.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i32);
                    if (sb2.length() > 0) {
                    }
                    sb2.append("(");
                    sb2.append(ki2Var.a);
                    sb2.append("x");
                    sb2.append(ki2Var.b);
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
                    it6Var = null;
                    break;
                }
                it6Var = (it6) ki2Var.h;
                if (it6Var == null) {
                }
                bundle = it6Var.b;
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                str2 = (String) ki2Var.e;
                if (str2 != null) {
                }
                str3 = (String) ki2Var.f;
                if (str3 != null) {
                }
                i2 = ki2Var.a;
                if (i2 != 0) {
                }
                if (sb.length() > 0) {
                }
                if (sb2.length() > 0) {
                }
                break;
        }
        this.b = it6Var;
        this.c = (Uri) ki2Var.g;
        this.d = (String) ki2Var.d;
        this.e = ki2Var.a;
        this.f = ki2Var.b;
    }
}
