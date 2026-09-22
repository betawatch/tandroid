package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t71 {
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
        StringBuilder k10 = hg.k0.k(i10, "?account=", "&id=");
        k10.append(document.id);
        k10.append("&hash=");
        k10.append(document.access_hash);
        k10.append("&dc=");
        k10.append(document.dc_id);
        k10.append("&size=");
        k10.append(document.size);
        k10.append("&mime=");
        k10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        k10.append("&rid=");
        k10.append(i11);
        k10.append("&name=");
        k10.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        k10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        k10.append(Utilities.bytesToHex(bArr));
        return Uri.parse("tg://" + MessageObject.getFileName(document) + k10.toString());
    }

    public static t71 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        t71 t71Var = new t71();
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
        t71Var.a = i10;
        t71Var.g = document;
        t71Var.c = document.id;
        t71Var.d = a(i10, i11, document);
        if (document2 != null) {
            t71Var.h = document2;
            t71Var.e = document2.id;
            t71Var.f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    t71Var.f = Uri.fromFile(pathToAttach2);
                }
            } else {
                t71Var.f = Uri.fromFile(pathToAttach);
            }
        }
        t71Var.m = lowerCase;
        long j3 = document.size;
        t71Var.k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            t71Var.i = tL_documentAttributeVideo.w;
            t71Var.j = tL_documentAttributeVideo.h;
            t71Var.l = j3 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i10).getPathToAttach(document, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            t71Var.d = Uri.fromFile(pathToAttach3);
            return t71Var;
        }
        File pathToAttach4 = FileLoader.getInstance(i10).getPathToAttach(document, null, true, z10);
        if (pathToAttach4 != null && pathToAttach4.exists()) {
            t71Var.d = Uri.fromFile(pathToAttach4);
        }
        return t71Var;
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
