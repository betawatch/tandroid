package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i61 {
    public int a;
    public boolean b;
    public long c;
    public Uri d;
    public long e;
    public Uri f;
    public TLRPC.Document g;
    public TLRPC.Document h;
    public int i;
    public int j;
    public long k;
    public double l;
    public String m;

    public static Uri a(int i9, int i10, TLRPC.Document document) {
        StringBuilder p6 = j3.r0.p(i9, "?account=", "&id=");
        p6.append(document.id);
        p6.append("&hash=");
        p6.append(document.access_hash);
        p6.append("&dc=");
        p6.append(document.dc_id);
        p6.append("&size=");
        p6.append(document.size);
        p6.append("&mime=");
        p6.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        p6.append("&rid=");
        p6.append(i10);
        p6.append("&name=");
        p6.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        p6.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        p6.append(Utilities.bytesToHex(bArr));
        return Uri.parse("tg://" + MessageObject.getFileName(document) + p6.toString());
    }

    public static i61 d(int i9, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        i61 i61Var = new i61();
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                tL_documentAttributeVideo = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                break;
            }
            i11++;
        }
        String lowerCase = (tL_documentAttributeVideo == null || (str = tL_documentAttributeVideo.video_codec) == null) ? null : str.toLowerCase();
        i61Var.a = i9;
        i61Var.g = document;
        i61Var.c = document.id;
        i61Var.d = a(i9, i10, document);
        if (document2 != null) {
            i61Var.h = document2;
            i61Var.e = document2.id;
            i61Var.f = a(i9, i10, document2);
            File pathToAttach = FileLoader.getInstance(i9).getPathToAttach(document2, null, false, z10);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(i9).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    i61Var.f = Uri.fromFile(pathToAttach2);
                }
            } else {
                i61Var.f = Uri.fromFile(pathToAttach);
            }
        }
        i61Var.m = lowerCase;
        long j10 = document.size;
        i61Var.k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            i61Var.i = tL_documentAttributeVideo.w;
            i61Var.j = tL_documentAttributeVideo.h;
            i61Var.l = j10 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i9).getPathToAttach(document, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            i61Var.d = Uri.fromFile(pathToAttach3);
            return i61Var;
        }
        File pathToAttach4 = FileLoader.getInstance(i9).getPathToAttach(document, null, true, z10);
        if (pathToAttach4 != null && pathToAttach4.exists()) {
            i61Var.d = Uri.fromFile(pathToAttach4);
        }
        return i61Var;
    }

    public final boolean b() {
        Uri uri = this.d;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final boolean c() {
        Uri uri = this.f;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final void e(boolean z10) {
        if (!b() && this.g != null) {
            File pathToAttach = FileLoader.getInstance(this.a).getPathToAttach(this.g, null, false, z10);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(this.a).getPathToAttach(this.g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            } else {
                this.d = Uri.fromFile(pathToAttach);
            }
        }
        if (c() || this.h == null) {
            return;
        }
        File pathToAttach3 = FileLoader.getInstance(this.a).getPathToAttach(this.h, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            this.f = Uri.fromFile(pathToAttach3);
            return;
        }
        File pathToAttach4 = FileLoader.getInstance(this.a).getPathToAttach(this.h, null, true, z10);
        if (pathToAttach4 == null || !pathToAttach4.exists()) {
            return;
        }
        this.f = Uri.fromFile(pathToAttach4);
    }
}
