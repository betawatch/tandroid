package mi;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class z4 implements cs {
    public int E;
    public volatile String F;
    public String G;
    public TLRPC.InputFile H;
    public boolean I;
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int h;
    public final int n;
    public final TLRPC.Document r;
    public final y4 s;
    public boolean w;
    public boolean x;
    public boolean y;

    public z4(int i3, String str, boolean z10, int i10, int i11, int i12, g3 g3Var) {
        this.a = i3;
        this.b = str;
        this.c = z10;
        this.d = false;
        this.e = false;
        this.f = i10;
        this.h = i11;
        this.n = i12;
        this.r = null;
        this.s = g3Var;
    }

    public final void a(String str) {
        if (this.x || this.y) {
            return;
        }
        this.F = str;
        hs f10 = hs.f(this.a);
        f10.b(this, hs.U1);
        f10.b(this, hs.V1);
        f10.b(this, hs.W1);
        w7.G(this.a).i0(false, this.c ? 33554432 : this.d ? ConnectionsManager.FileTypeAudio : this.e ? 67108864 : 16777216, this.F, (this.c || this.d || this.e) ? false : true);
    }

    public final void b() {
        if (this.y || this.x) {
            return;
        }
        this.x = true;
        try {
            if (this.F != null) {
                w7.G(this.a).b(this.F, false);
            }
        } catch (Throwable unused) {
        }
        if (this.E != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.E, true);
            this.E = 0;
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
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i3);
                            i3++;
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
        this.E = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_uploadMedia, new ci.d0(this, 21));
    }

    public final void d() {
        int i3;
        int i10;
        if (this.w || this.x || this.y) {
            return;
        }
        this.w = true;
        if (this.c) {
            y4 y4Var = this.s;
            int i11 = this.f;
            if (i11 > 0 && (i10 = this.h) > 0) {
                y4Var.b(i11, i10);
            }
            a(this.b);
            return;
        }
        if (this.e) {
            Utilities.e.c(new x4(this, 0));
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
            if (i12 > 0 && (i3 = options.outHeight) > 0) {
                this.s.b(i12, i3);
            }
        } catch (Exception unused) {
        }
        Utilities.e.c(new x4(this, 1));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.InputFile inputFile;
        if (i10 != this.a || this.x || this.y) {
            return;
        }
        String str = (String) objArr[0];
        if (this.F == null || !this.F.equals(str)) {
            return;
        }
        if (i3 == hs.U1) {
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            if (this.e && !this.I && !TextUtils.isEmpty(this.G)) {
                this.H = inputFile2;
                this.I = true;
                this.F = this.G;
                w7.G(this.a).i0(false, 16777216, this.F, true);
                return;
            }
            if (this.e && this.I) {
                c(this.H, inputFile2);
                return;
            } else {
                c(inputFile2, null);
                return;
            }
        }
        if (i3 == hs.V1) {
            if (this.e && this.I && (inputFile = this.H) != null) {
                c(inputFile, null);
                return;
            }
            this.y = true;
            e();
            this.s.a();
            return;
        }
        if (i3 == hs.W1) {
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            y4 y4Var = this.s;
            if (this.I) {
                return;
            }
            y4Var.g(longValue2 > 0 ? longValue / longValue2 : 0.0f);
        }
    }

    public final void e() {
        hs f10 = hs.f(this.a);
        f10.n(this, hs.U1);
        f10.n(this, hs.V1);
        f10.n(this, hs.W1);
    }

    public z4(int i3, String str, TLRPC.Document document, f3 f3Var) {
        this.a = i3;
        this.b = str;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = f3Var;
    }

    public z4(int i3, String str, TLRPC.Document document, e3 e3Var) {
        this.a = i3;
        this.b = str;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = e3Var;
    }
}
