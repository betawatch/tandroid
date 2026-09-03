package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g71 {
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
        StringBuilder m9 = kf.k0.m(i10, "?account=", "&id=");
        m9.append(document.id);
        m9.append("&hash=");
        m9.append(document.access_hash);
        m9.append("&dc=");
        m9.append(document.dc_id);
        m9.append("&size=");
        m9.append(document.size);
        m9.append("&mime=");
        m9.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        m9.append("&rid=");
        m9.append(i11);
        m9.append("&name=");
        m9.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        m9.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        m9.append(Utilities.bytesToHex(bArr));
        return Uri.parse("tg://" + MessageObject.getFileName(document) + m9.toString());
    }

    public static g71 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z4) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        g71 g71Var = new g71();
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
        g71Var.a = i10;
        g71Var.g = document;
        g71Var.c = document.id;
        g71Var.d = a(i10, i11, document);
        if (document2 != null) {
            g71Var.h = document2;
            g71Var.e = document2.id;
            g71Var.f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z4);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z4);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    g71Var.f = Uri.fromFile(pathToAttach2);
                }
            } else {
                g71Var.f = Uri.fromFile(pathToAttach);
            }
        }
        g71Var.m = lowerCase;
        long j10 = document.size;
        g71Var.k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            g71Var.i = tL_documentAttributeVideo.w;
            g71Var.j = tL_documentAttributeVideo.h;
            g71Var.l = j10 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i10).getPathToAttach(document, null, false, z4);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            g71Var.d = Uri.fromFile(pathToAttach3);
            return g71Var;
        }
        File pathToAttach4 = FileLoader.getInstance(i10).getPathToAttach(document, null, true, z4);
        if (pathToAttach4 != null && pathToAttach4.exists()) {
            g71Var.d = Uri.fromFile(pathToAttach4);
        }
        return g71Var;
    }

    public final boolean b() {
        Uri uri = this.d;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final boolean c() {
        Uri uri = this.f;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final void e(boolean z4) {
        if (!b() && this.g != null) {
            File pathToAttach = FileLoader.getInstance(this.a).getPathToAttach(this.g, null, false, z4);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(this.a).getPathToAttach(this.g, null, true, z4);
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
        File pathToAttach3 = FileLoader.getInstance(this.a).getPathToAttach(this.h, null, false, z4);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            this.f = Uri.fromFile(pathToAttach3);
            return;
        }
        File pathToAttach4 = FileLoader.getInstance(this.a).getPathToAttach(this.h, null, true, z4);
        if (pathToAttach4 == null || !pathToAttach4.exists()) {
            return;
        }
        this.f = Uri.fromFile(pathToAttach4);
    }
}
