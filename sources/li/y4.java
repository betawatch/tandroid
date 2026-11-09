package li;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class y4 implements ls {
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
    public final x4 s;
    public boolean w;
    public boolean x;
    public boolean y;

    public y4(int i7, String str, boolean z9, int i10, int i11, int i12, f3 f3Var) {
        this.a = i7;
        this.b = str;
        this.c = z9;
        this.d = false;
        this.e = false;
        this.f = i10;
        this.h = i11;
        this.n = i12;
        this.r = null;
        this.s = f3Var;
    }

    public final void a(String str) {
        if (this.x || this.y) {
            return;
        }
        this.E = str;
        qs f10 = qs.f(this.a);
        f10.b(this, qs.U1);
        f10.b(this, qs.V1);
        f10.b(this, qs.W1);
        w7.G(this.a).h0(false, this.c ? 33554432 : this.d ? ConnectionsManager.FileTypeAudio : this.e ? 67108864 : 16777216, this.E, (this.c || this.d || this.e) ? false : true);
    }

    public final void b() {
        if (this.y || this.x) {
            return;
        }
        this.x = true;
        try {
            if (this.E != null) {
                w7.G(this.a).b(this.E, false);
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
            boolean z9 = this.d;
            boolean z10 = this.e;
            if (z9 || z10) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.r;
                if (z10) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z10) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i7);
                            i7++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z10) {
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
        this.D = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_uploadMedia, new bi.j0(this, 21));
    }

    public final void d() {
        int i7;
        int i10;
        if (this.w || this.x || this.y) {
            return;
        }
        this.w = true;
        if (this.c) {
            x4 x4Var = this.s;
            int i11 = this.f;
            if (i11 > 0 && (i10 = this.h) > 0) {
                x4Var.b(i11, i10);
            }
            a(this.b);
            return;
        }
        if (this.e) {
            Utilities.e.c(new w4(this, 0));
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
            int i12 = options.outWidth;
            if (i12 > 0 && (i7 = options.outHeight) > 0) {
                this.s.b(i12, i7);
            }
        } catch (Exception unused) {
        }
        Utilities.e.c(new w4(this, 1));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputFile inputFile;
        if (i10 != this.a || this.x || this.y) {
            return;
        }
        String str = (String) objArr[0];
        if (this.E == null || !this.E.equals(str)) {
            return;
        }
        if (i7 == qs.U1) {
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            if (this.e && !this.H && !TextUtils.isEmpty(this.F)) {
                this.G = inputFile2;
                this.H = true;
                this.E = this.F;
                w7.G(this.a).h0(false, 16777216, this.E, true);
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
        if (i7 == qs.V1) {
            if (this.e && this.H && (inputFile = this.G) != null) {
                c(inputFile, null);
                return;
            }
            this.y = true;
            e();
            this.s.a();
            return;
        }
        if (i7 == qs.W1) {
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            x4 x4Var = this.s;
            if (this.H) {
                return;
            }
            x4Var.g(longValue2 > 0 ? longValue / longValue2 : 0.0f);
        }
    }

    public final void e() {
        qs f10 = qs.f(this.a);
        f10.n(this, qs.U1);
        f10.n(this, qs.V1);
        f10.n(this, qs.W1);
    }

    public y4(int i7, String str, TLRPC.Document document, e3 e3Var) {
        this.a = i7;
        this.b = str;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = e3Var;
    }

    public y4(int i7, String str, TLRPC.Document document, d3 d3Var) {
        this.a = i7;
        this.b = str;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = d3Var;
    }
}
