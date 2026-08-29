package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v61 {
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
        StringBuilder o10 = j7.l1.o(i10, "?account=", "&id=");
        o10.append(document.id);
        o10.append("&hash=");
        o10.append(document.access_hash);
        o10.append("&dc=");
        o10.append(document.dc_id);
        o10.append("&size=");
        o10.append(document.size);
        o10.append("&mime=");
        o10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        o10.append("&rid=");
        o10.append(i11);
        o10.append("&name=");
        o10.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        o10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        o10.append(Utilities.bytesToHex(bArr));
        return Uri.parse("tg://" + MessageObject.getFileName(document) + o10.toString());
    }

    public static v61 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        v61 v61Var = new v61();
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
        v61Var.a = i10;
        v61Var.g = document;
        v61Var.c = document.id;
        v61Var.d = a(i10, i11, document);
        if (document2 != null) {
            v61Var.h = document2;
            v61Var.e = document2.id;
            v61Var.f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    v61Var.f = Uri.fromFile(pathToAttach2);
                }
            } else {
                v61Var.f = Uri.fromFile(pathToAttach);
            }
        }
        v61Var.m = lowerCase;
        long j10 = document.size;
        v61Var.k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            v61Var.i = tL_documentAttributeVideo.w;
            v61Var.j = tL_documentAttributeVideo.h;
            v61Var.l = j10 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i10).getPathToAttach(document, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            v61Var.d = Uri.fromFile(pathToAttach3);
            return v61Var;
        }
        File pathToAttach4 = FileLoader.getInstance(i10).getPathToAttach(document, null, true, z10);
        if (pathToAttach4 != null && pathToAttach4.exists()) {
            v61Var.d = Uri.fromFile(pathToAttach4);
        }
        return v61Var;
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
