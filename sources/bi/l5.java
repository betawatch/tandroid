package bi;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class l5 implements us {
    public int D;
    public volatile String E;
    public String F;
    public TLRPC.InputFile G;
    public boolean H;
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int h;
    public final int n;
    public final TLRPC.Document r;
    public final k5 s;
    public boolean w;
    public boolean x;
    public boolean y;

    public l5(int i10, String str, boolean z10, int i11, int i12, int i13, p3 p3Var) {
        this.a = i10;
        this.b = str;
        this.c = z10;
        this.d = false;
        this.e = false;
        this.f = i11;
        this.h = i12;
        this.n = i13;
        this.r = null;
        this.s = p3Var;
    }

    public final void a(String str) {
        if (this.x || this.y) {
            return;
        }
        this.E = str;
        zs f7 = zs.f(this.a);
        f7.b(this, zs.U1);
        f7.b(this, zs.V1);
        f7.b(this, zs.W1);
        b8.G(this.a).i0(false, this.c ? 33554432 : this.d ? ConnectionsManager.FileTypeAudio : this.e ? 67108864 : 16777216, this.E, (this.c || this.d || this.e) ? false : true);
    }

    public final void b() {
        if (this.y || this.x) {
            return;
        }
        this.x = true;
        try {
            if (this.E != null) {
                b8.G(this.a).b(this.E, false);
            }
        } catch (Throwable unused) {
        }
        if (this.D != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.D, true);
            this.D = 0;
        }
        e();
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.n;
            tL_documentAttributeVideo.w = this.f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.e;
            if (z10 || z11) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.r;
                if (z11) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z11) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                            i10++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z11) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            } else {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            }
        }
        this.D = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_uploadMedia, new ag.c(this, 7));
    }

    public final void d() {
        int i10;
        int i11;
        if (this.w || this.x || this.y) {
            return;
        }
        this.w = true;
        if (this.c) {
            k5 k5Var = this.s;
            int i12 = this.f;
            if (i12 > 0 && (i11 = this.h) > 0) {
                k5Var.b(i12, i11);
            }
            a(this.b);
            return;
        }
        if (this.e) {
            Utilities.e.c(new j5(this, 0));
            return;
        }
        if (this.d) {
            a(this.b);
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.b, options);
            int i13 = options.outWidth;
            if (i13 > 0 && (i10 = options.outHeight) > 0) {
                this.s.b(i13, i10);
            }
        } catch (Exception unused) {
        }
        Utilities.e.c(new j5(this, 1));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputFile inputFile;
        if (i11 != this.a || this.x || this.y) {
            return;
        }
        String str = (String) objArr[0];
        if (this.E == null || !this.E.equals(str)) {
            return;
        }
        if (i10 == zs.U1) {
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            if (this.e && !this.H && !TextUtils.isEmpty(this.F)) {
                this.G = inputFile2;
                this.H = true;
                this.E = this.F;
                b8.G(this.a).i0(false, 16777216, this.E, true);
                return;
            }
            if (this.e && this.H) {
                c(this.G, inputFile2);
                return;
            } else {
                c(inputFile2, null);
                return;
            }
        }
        if (i10 == zs.V1) {
            if (this.e && this.H && (inputFile = this.G) != null) {
                c(inputFile, null);
                return;
            }
            this.y = true;
            e();
            this.s.a();
            return;
        }
        if (i10 == zs.W1) {
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            k5 k5Var = this.s;
            if (this.H) {
                return;
            }
            k5Var.g(longValue2 > 0 ? longValue / longValue2 : 0.0f);
        }
    }

    public final void e() {
        zs f7 = zs.f(this.a);
        f7.n(this, zs.U1);
        f7.n(this, zs.V1);
        f7.n(this, zs.W1);
    }

    public l5(int i10, String str, TLRPC.Document document, o3 o3Var) {
        this.a = i10;
        this.b = str;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = o3Var;
    }

    public l5(int i10, String str, TLRPC.Document document, n3 n3Var) {
        this.a = i10;
        this.b = str;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = n3Var;
    }
}
