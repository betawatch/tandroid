package ii;

import di.c4;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.c40;
import org.telegram.ui.d50;
import org.telegram.ui.hz;
import org.telegram.ui.jn;
import org.telegram.ui.l30;
import org.telegram.ui.ld;
import org.telegram.ui.m31;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.InputFile b;
    public final /* synthetic */ TLRPC.InputFile c;
    public final /* synthetic */ TLRPC.VideoSize d;
    public final /* synthetic */ String e;
    public final /* synthetic */ double f;
    public final /* synthetic */ TLRPC.PhotoSize h;
    public final /* synthetic */ TLRPC.PhotoSize n;
    public final /* synthetic */ i30 r;

    public /* synthetic */ l(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = 0;
        this.r = pVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.n = photoSize2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        double d = this.f;
        String str = this.e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.c;
        TLRPC.InputFile inputFile2 = this.b;
        TLRPC.PhotoSize photoSize = this.n;
        TLRPC.PhotoSize photoSize2 = this.h;
        int i10 = 1;
        i30 i30Var = this.r;
        switch (i7) {
            case 0:
                p pVar = (p) i30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                pVar.G = fileLocation;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    pVar.x.j(hc.e(fileLocation), "50_50", pVar.E, pVar.I);
                    pVar.f0(true, false);
                } else {
                    pVar.getMessagesController().B(pVar.c, null, inputFile3, inputFile4, videoSize2, this.f, this.e, photoSize2.location, photoSize.location, null);
                    pVar.f0(false, true);
                }
                pVar.e.f3.O(true);
                break;
            case 1:
                bd bdVar = (bd) i30Var;
                if (inputFile2 != null || inputFile != null) {
                    bdVar.m0 = inputFile2;
                    bdVar.n0 = inputFile;
                    bdVar.o0 = videoSize;
                    bdVar.p0 = str;
                    bdVar.q0 = d;
                    if (bdVar.r0) {
                        u1 u1Var = bdVar.v0;
                        if (u1Var != null) {
                            try {
                                u1Var.dismiss();
                                bdVar.v0 = null;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        }
                        bdVar.m0(false);
                        bdVar.s0 = false;
                        bdVar.a.performClick();
                    }
                    bdVar.k0(false, true);
                    bdVar.n.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    bdVar.D = fileLocation2;
                    bdVar.E = photoSize.location;
                    bdVar.f.j(hc.e(fileLocation2), "50_50", bdVar.w, null);
                    bdVar.k0(true, false);
                    break;
                }
            case 2:
                pn pnVar = (pn) i30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                pnVar.u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize3 != null) {
                    long j3 = pnVar.B0;
                    double d2 = this.f;
                    if (j3 != 0) {
                        TLRPC.User user = pnVar.C0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = pnVar.C0.photo;
                            userProfilePhoto.photo_id = inputFile5 != null ? inputFile5.id : inputFile6 != null ? inputFile6.id : 0L;
                            userProfilePhoto.photo_big = photoSize.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            pnVar.getMessagesController().X3(pnVar.C0, true, false);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile5 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile5;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile6 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile6;
                            int i11 = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d2;
                            tL_photos_uploadProfilePhoto.flags = i11 | 6;
                        }
                        if (videoSize3 != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize3;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = pnVar.getMessagesController().q1(pnVar.C0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        pnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jn(pnVar, i10));
                    } else {
                        pnVar.getMessagesController().B(pnVar.v0, null, inputFile5, inputFile6, videoSize3, d2, this.e, photoSize2.location, photoSize.location, null);
                    }
                    if (pnVar.M0) {
                        try {
                            u1 u1Var2 = pnVar.b;
                            if (u1Var2 != null && u1Var2.isShowing()) {
                                pnVar.b.dismiss();
                                pnVar.b = null;
                            }
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        pnVar.N0 = false;
                        pnVar.a.performClick();
                    }
                    pnVar.s0(false, true);
                    break;
                } else {
                    c4 c4Var = pnVar.e;
                    hc e12 = hc.e(fileLocation3);
                    w8 w8Var = pnVar.r;
                    Object obj = pnVar.C0;
                    if (obj == null) {
                        obj = pnVar.w0;
                    }
                    c4Var.j(e12, "50_50", w8Var, obj);
                    pnVar.b0.o(R.drawable.msg_addphoto, hd.M0(2131752213, "ChatSetNewPhoto"), true);
                    if (pnVar.R0 == null) {
                        pnVar.R0 = new zg0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    pnVar.b0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    pnVar.b0.e.setAnimation(pnVar.R0);
                    pnVar.s0(true, false);
                    break;
                }
                break;
            case 3:
                l30 l30Var = (l30) i30Var;
                long j10 = l30Var.e;
                c40 c40Var = l30Var.f;
                org.telegram.messenger.c cVar = c40Var.k1;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 != null || inputFile8 != null || videoSize4 != null) {
                    double d10 = this.f;
                    String str2 = this.e;
                    if (j10 <= 0) {
                        qp.s1(cVar.a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new hz(l30Var, 7));
                        break;
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile7 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile7;
                            tL_photos_uploadProfilePhoto2.flags |= 1;
                        }
                        if (inputFile8 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile8;
                            int i12 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                            tL_photos_uploadProfilePhoto2.flags = i12 | 6;
                        }
                        if (videoSize4 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize4;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        ConnectionsManager.getInstance(cVar.a).sendRequest(tL_photos_uploadProfilePhoto2, new ld(29, l30Var, str2));
                        break;
                    }
                } else {
                    l30Var.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    l30Var.b = fileLocation4;
                    hc e13 = hc.e(fileLocation4);
                    l30Var.d = e13;
                    c40Var.i1.A(e13, hc.e(l30Var.c));
                    org.telegram.messenger.g0.b4(c40Var.H1);
                    break;
                }
            case 4:
                d50 d50Var = (d50) i30Var;
                if (inputFile2 != null || inputFile != null || videoSize != null) {
                    d50Var.F = inputFile2;
                    d50Var.G = inputFile;
                    d50Var.H = videoSize;
                    d50Var.I = str;
                    d50Var.J = d;
                    if (d50Var.L) {
                        d50Var.getMessagesController().U(d50Var.c.getText().toString(), d50Var.K, null, d50Var.P, d50Var.S, d50Var.U, d50Var.T, d50Var.W, d50Var);
                    }
                    d50Var.e0(false, true);
                    d50Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    d50Var.D = fileLocation5;
                    d50Var.E = photoSize.location;
                    d50Var.d.j(hc.e(fileLocation5), "50_50", d50Var.r, null);
                    d50Var.e0(true, false);
                    break;
                }
            case 5:
                ProfileActivity.j0((ProfileActivity) i30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                m31.e0((m31) i30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l(f2 f2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.a = i7;
        this.r = (i30) f2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ l(pn pnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = pnVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ l(i30 i30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.a = i7;
        this.r = i30Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
