package li;

import fi.v3;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.t8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.b00;
import org.telegram.ui.c40;
import org.telegram.ui.c50;
import org.telegram.ui.iz;
import org.telegram.ui.jn;
import org.telegram.ui.k31;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.InputFile b;
    public final /* synthetic */ TLRPC.InputFile c;
    public final /* synthetic */ TLRPC.VideoSize d;
    public final /* synthetic */ String e;
    public final /* synthetic */ double f;
    public final /* synthetic */ TLRPC.PhotoSize h;
    public final /* synthetic */ TLRPC.PhotoSize n;
    public final /* synthetic */ l30 r;

    public /* synthetic */ j(n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = 0;
        this.r = nVar;
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
        l30 l30Var = this.r;
        switch (i7) {
            case 0:
                n nVar = (n) l30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                nVar.H = fileLocation;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    nVar.x.j(gc.e(fileLocation), "50_50", nVar.F, nVar.J);
                    nVar.f0(true, false);
                } else {
                    nVar.getMessagesController().B(nVar.c, null, inputFile3, inputFile4, videoSize2, this.f, this.e, photoSize2.location, photoSize.location, null);
                    nVar.f0(false, true);
                }
                nVar.e.g3.O(true);
                break;
            case 1:
                ad adVar = (ad) l30Var;
                if (inputFile2 != null || inputFile != null) {
                    adVar.n0 = inputFile2;
                    adVar.o0 = inputFile;
                    adVar.p0 = videoSize;
                    adVar.q0 = str;
                    adVar.r0 = d;
                    if (adVar.s0) {
                        t1 t1Var = adVar.w0;
                        if (t1Var != null) {
                            try {
                                t1Var.dismiss();
                                adVar.w0 = null;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        }
                        adVar.m0(false);
                        adVar.t0 = false;
                        adVar.a.performClick();
                    }
                    adVar.k0(false, true);
                    adVar.n.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = photoSize2.location;
                    adVar.E = fileLocation2;
                    adVar.F = photoSize.location;
                    adVar.f.j(gc.e(fileLocation2), "50_50", adVar.w, null);
                    adVar.k0(true, false);
                    break;
                }
            case 2:
                qn qnVar = (qn) l30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                qnVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize3 != null) {
                    long j3 = qnVar.C0;
                    double d2 = this.f;
                    if (j3 != 0) {
                        TLRPC.User user = qnVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = qnVar.D0.photo;
                            userProfilePhoto.photo_id = inputFile5 != null ? inputFile5.id : inputFile6 != null ? inputFile6.id : 0L;
                            userProfilePhoto.photo_big = photoSize.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            qnVar.getMessagesController().X3(qnVar.D0, true, false);
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
                        tL_photos_uploadProfilePhoto.bot = qnVar.getMessagesController().q1(qnVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        qnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jn(qnVar, i10));
                    } else {
                        qnVar.getMessagesController().B(qnVar.w0, null, inputFile5, inputFile6, videoSize3, d2, this.e, photoSize2.location, photoSize.location, null);
                    }
                    if (qnVar.N0) {
                        try {
                            t1 t1Var2 = qnVar.b;
                            if (t1Var2 != null && t1Var2.isShowing()) {
                                qnVar.b.dismiss();
                                qnVar.b = null;
                            }
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        qnVar.O0 = false;
                        qnVar.a.performClick();
                    }
                    qnVar.s0(false, true);
                    break;
                } else {
                    v3 v3Var = qnVar.e;
                    gc e12 = gc.e(fileLocation3);
                    t8 t8Var = qnVar.r;
                    Object obj = qnVar.D0;
                    if (obj == null) {
                        obj = qnVar.x0;
                    }
                    v3Var.j(e12, "50_50", t8Var, obj);
                    qnVar.c0.o(R.drawable.msg_addphoto, hd.M0(2131752213, "ChatSetNewPhoto"), true);
                    if (qnVar.S0 == null) {
                        qnVar.S0 = new ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    qnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    qnVar.c0.e.setAnimation(qnVar.S0);
                    qnVar.s0(true, false);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.l30 l30Var2 = (org.telegram.ui.l30) l30Var;
                long j10 = l30Var2.e;
                c40 c40Var = l30Var2.f;
                org.telegram.messenger.c cVar = c40Var.o1;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 != null || inputFile8 != null || videoSize4 != null) {
                    double d10 = this.f;
                    String str2 = this.e;
                    if (j10 <= 0) {
                        np.s1(cVar.a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new iz(l30Var2, 7));
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
                        ConnectionsManager.getInstance(cVar.a).sendRequest(tL_photos_uploadProfilePhoto2, new b00(i10, l30Var2, str2));
                        break;
                    }
                } else {
                    l30Var2.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    l30Var2.b = fileLocation4;
                    gc e13 = gc.e(fileLocation4);
                    l30Var2.d = e13;
                    c40Var.m1.A(e13, gc.e(l30Var2.c));
                    org.telegram.messenger.g0.a4(c40Var.L1);
                    break;
                }
            case 4:
                c50 c50Var = (c50) l30Var;
                if (inputFile2 != null || inputFile != null || videoSize != null) {
                    c50Var.G = inputFile2;
                    c50Var.H = inputFile;
                    c50Var.I = videoSize;
                    c50Var.J = str;
                    c50Var.K = d;
                    if (c50Var.M) {
                        c50Var.getMessagesController().U(c50Var.c.getText().toString(), c50Var.L, null, c50Var.Q, c50Var.T, c50Var.V, c50Var.U, c50Var.X, c50Var);
                    }
                    c50Var.e0(false, true);
                    c50Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    c50Var.E = fileLocation5;
                    c50Var.F = photoSize.location;
                    c50Var.d.j(gc.e(fileLocation5), "50_50", c50Var.r, null);
                    c50Var.e0(true, false);
                    break;
                }
            case 5:
                ProfileActivity.r0((ProfileActivity) l30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                k31.e0((k31) l30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(e2 e2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.a = i7;
        this.r = (l30) e2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ j(qn qnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = qnVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ j(l30 l30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.a = i7;
        this.r = l30Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
