// default package

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bg9 implements gk7 {
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
    public final ag9 s;
    public boolean w;
    public boolean x;
    public boolean y;

    public bg9(int i, String str, boolean z, int i2, int i3, int i4, le9 le9Var) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = false;
        this.e = false;
        this.f = i2;
        this.h = i3;
        this.n = i4;
        this.r = null;
        this.s = le9Var;
    }

    public final void a(String str) {
        if (this.x || this.y) {
            return;
        }
        this.F = str;
        kk7 f = kk7.f(this.a);
        f.a(this, kk7.T1);
        f.a(this, kk7.U1);
        f.a(this, kk7.V1);
        ba4.G(this.a).h0(false, this.c ? 33554432 : this.d ? ConnectionsManager.FileTypeAudio : this.e ? 67108864 : 16777216, this.F, (this.c || this.d || this.e) ? false : true);
    }

    public final void b() {
        if (this.y || this.x) {
            return;
        }
        this.x = true;
        try {
            if (this.F != null) {
                ba4.G(this.a).b(this.F, false);
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
            boolean z = this.d;
            boolean z2 = this.e;
            if (z || z2) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.r;
                if (z2) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z2) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i);
                            i++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z2) {
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
        this.E = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_uploadMedia, new n35(this, (byte) 26));
    }

    public final void d() {
        int i;
        int i2;
        if (this.w || this.x || this.y) {
            return;
        }
        byte b = 1;
        this.w = true;
        if (this.c) {
            ag9 ag9Var = this.s;
            int i3 = this.f;
            if (i3 > 0 && (i2 = this.h) > 0) {
                ag9Var.b(i3, i2);
            }
            a(this.b);
            return;
        }
        if (this.e) {
            Utilities.e.c(new zf9(this, (byte) 0));
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
            int i4 = options.outWidth;
            if (i4 > 0 && (i = options.outHeight) > 0) {
                this.s.b(i4, i);
            }
        } catch (Exception unused) {
        }
        Utilities.e.c(new zf9(this, b));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.InputFile inputFile;
        if (i2 != this.a || this.x || this.y) {
            return;
        }
        String str = (String) objArr[0];
        if (this.F == null || !this.F.equals(str)) {
            return;
        }
        if (i == kk7.T1) {
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            if (this.e && !this.I && !TextUtils.isEmpty(this.G)) {
                this.H = inputFile2;
                this.I = true;
                this.F = this.G;
                ba4.G(this.a).h0(false, 16777216, this.F, true);
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
        if (i == kk7.U1) {
            if (this.e && this.I && (inputFile = this.H) != null) {
                c(inputFile, null);
                return;
            }
            this.y = true;
            e();
            this.s.a();
            return;
        }
        if (i == kk7.V1) {
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            ag9 ag9Var = this.s;
            if (this.I) {
                return;
            }
            ag9Var.g(longValue2 > 0 ? longValue / longValue2 : 0.0f);
        }
    }

    public final void e() {
        kk7 f = kk7.f(this.a);
        f.n(this, kk7.T1);
        f.n(this, kk7.U1);
        f.n(this, kk7.V1);
    }

    public bg9(int i, String str, TLRPC.Document document, ke9 ke9Var) {
        this.a = i;
        this.b = str;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = ke9Var;
    }

    public bg9(int i, String str, TLRPC.Document document, je9 je9Var) {
        this.a = i;
        this.b = str;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = 0;
        this.h = 0;
        this.n = 0;
        this.r = document;
        this.s = je9Var;
    }
}
