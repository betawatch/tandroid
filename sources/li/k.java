package li;

import fi.t3;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.d00;
import org.telegram.ui.e40;
import org.telegram.ui.e50;
import org.telegram.ui.kn;
import org.telegram.ui.kz;
import org.telegram.ui.n30;
import org.telegram.ui.n31;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.InputFile b;
    public final /* synthetic */ TLRPC.InputFile c;
    public final /* synthetic */ TLRPC.VideoSize d;
    public final /* synthetic */ String e;
    public final /* synthetic */ double f;
    public final /* synthetic */ TLRPC.PhotoSize h;
    public final /* synthetic */ TLRPC.PhotoSize n;
    public final /* synthetic */ t30 r;

    public /* synthetic */ k(o oVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = 0;
        this.r = oVar;
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
        t30 t30Var = this.r;
        switch (i7) {
            case 0:
                o oVar = (o) t30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                oVar.H = fileLocation;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    oVar.x.j(fc.e(fileLocation), "50_50", oVar.F, oVar.J);
                    oVar.f0(true, false);
                } else {
                    oVar.getMessagesController().B(oVar.c, null, inputFile3, inputFile4, videoSize2, this.f, this.e, photoSize2.location, photoSize.location, null);
                    oVar.f0(false, true);
                }
                oVar.e.g3.O(true);
                break;
            case 1:
                ad adVar = (ad) t30Var;
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
                    adVar.f.j(fc.e(fileLocation2), "50_50", adVar.w, null);
                    adVar.k0(true, false);
                    break;
                }
            case 2:
                rn rnVar = (rn) t30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                rnVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize3 != null) {
                    long j3 = rnVar.C0;
                    double d2 = this.f;
                    if (j3 != 0) {
                        TLRPC.User user = rnVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = rnVar.D0.photo;
                            userProfilePhoto.photo_id = inputFile5 != null ? inputFile5.id : inputFile6 != null ? inputFile6.id : 0L;
                            userProfilePhoto.photo_big = photoSize.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            rnVar.getMessagesController().e4(rnVar.D0, true, false);
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
                        tL_photos_uploadProfilePhoto.bot = rnVar.getMessagesController().s1(rnVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        rnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new kn(rnVar, i10));
                    } else {
                        rnVar.getMessagesController().B(rnVar.w0, null, inputFile5, inputFile6, videoSize3, d2, this.e, photoSize2.location, photoSize.location, null);
                    }
                    if (rnVar.N0) {
                        try {
                            t1 t1Var2 = rnVar.b;
                            if (t1Var2 != null && t1Var2.isShowing()) {
                                rnVar.b.dismiss();
                                rnVar.b = null;
                            }
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        rnVar.O0 = false;
                        rnVar.a.performClick();
                    }
                    rnVar.s0(false, true);
                    break;
                } else {
                    t3 t3Var = rnVar.e;
                    fc e12 = fc.e(fileLocation3);
                    a9 a9Var = rnVar.r;
                    Object obj = rnVar.D0;
                    if (obj == null) {
                        obj = rnVar.x0;
                    }
                    t3Var.j(e12, "50_50", a9Var, obj);
                    rnVar.c0.o(R.drawable.msg_addphoto, gd.N0(2131752201, "ChatSetNewPhoto"), true);
                    if (rnVar.S0 == null) {
                        rnVar.S0 = new nh0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    rnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    rnVar.c0.e.setAnimation(rnVar.S0);
                    rnVar.s0(true, false);
                    break;
                }
                break;
            case 3:
                n30 n30Var = (n30) t30Var;
                long j10 = n30Var.e;
                e40 e40Var = n30Var.f;
                org.telegram.messenger.c cVar = e40Var.o1;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 != null || inputFile8 != null || videoSize4 != null) {
                    double d10 = this.f;
                    String str2 = this.e;
                    if (j10 <= 0) {
                        mp.u1(cVar.a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new kz(n30Var, 7));
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
                        ConnectionsManager.getInstance(cVar.a).sendRequest(tL_photos_uploadProfilePhoto2, new d00(i10, n30Var, str2));
                        break;
                    }
                } else {
                    n30Var.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    n30Var.b = fileLocation4;
                    fc e13 = fc.e(fileLocation4);
                    n30Var.d = e13;
                    e40Var.m1.A(e13, fc.e(n30Var.c));
                    org.telegram.messenger.g0.Z3(e40Var.L1);
                    break;
                }
            case 4:
                e50 e50Var = (e50) t30Var;
                if (inputFile2 != null || inputFile != null || videoSize != null) {
                    e50Var.G = inputFile2;
                    e50Var.H = inputFile;
                    e50Var.I = videoSize;
                    e50Var.J = str;
                    e50Var.K = d;
                    if (e50Var.M) {
                        e50Var.getMessagesController().U(e50Var.c.getText().toString(), e50Var.L, null, e50Var.Q, e50Var.T, e50Var.V, e50Var.U, e50Var.X, e50Var);
                    }
                    e50Var.e0(false, true);
                    e50Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    e50Var.E = fileLocation5;
                    e50Var.F = photoSize.location;
                    e50Var.d.j(fc.e(fileLocation5), "50_50", e50Var.r, null);
                    e50Var.e0(true, false);
                    break;
                }
            case 5:
                ProfileActivity.r0((ProfileActivity) t30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                n31.e0((n31) t30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(g2 g2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.a = i7;
        this.r = (t30) g2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(rn rnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = rnVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ k(t30 t30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.a = i7;
        this.r = t30Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
