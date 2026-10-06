package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class c81 {
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

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder j3 = hg.c.j(i10, "?account=", "&id=");
        j3.append(document.id);
        j3.append("&hash=");
        j3.append(document.access_hash);
        j3.append("&dc=");
        j3.append(document.dc_id);
        j3.append("&size=");
        j3.append(document.size);
        j3.append("&mime=");
        j3.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        j3.append("&rid=");
        j3.append(i11);
        j3.append("&name=");
        j3.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        j3.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        j3.append(Utilities.bytesToHex(bArr));
        return Uri.parse("tg://" + MessageObject.getFileName(document) + j3.toString());
    }

    public static c81 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        c81 c81Var = new c81();
        int i12 = 0;
        while (true) {
            if (i12 >= document.attributes.size()) {
                tL_documentAttributeVideo = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                break;
            }
            i12++;
        }
        String lowerCase = (tL_documentAttributeVideo == null || (str = tL_documentAttributeVideo.video_codec) == null) ? null : str.toLowerCase();
        c81Var.a = i10;
        c81Var.g = document;
        c81Var.c = document.id;
        c81Var.d = a(i10, i11, document);
        if (document2 != null) {
            c81Var.h = document2;
            c81Var.e = document2.id;
            c81Var.f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    c81Var.f = Uri.fromFile(pathToAttach2);
                }
            } else {
                c81Var.f = Uri.fromFile(pathToAttach);
            }
        }
        c81Var.m = lowerCase;
        long j3 = document.size;
        c81Var.k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            c81Var.i = tL_documentAttributeVideo.w;
            c81Var.j = tL_documentAttributeVideo.h;
            c81Var.l = j3 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i10).getPathToAttach(document, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            c81Var.d = Uri.fromFile(pathToAttach3);
            return c81Var;
        }
        File pathToAttach4 = FileLoader.getInstance(i10).getPathToAttach(document, null, true, z10);
        if (pathToAttach4 != null && pathToAttach4.exists()) {
            c81Var.d = Uri.fromFile(pathToAttach4);
        }
        return c81Var;
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
