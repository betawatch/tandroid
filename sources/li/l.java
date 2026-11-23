package li;

import fi.t3;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.e00;
import org.telegram.ui.f40;
import org.telegram.ui.f50;
import org.telegram.ui.kn;
import org.telegram.ui.lz;
import org.telegram.ui.o30;
import org.telegram.ui.o31;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    public final /* synthetic */ w30 r;

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
        w30 w30Var = this.r;
        switch (i7) {
            case 0:
                p pVar = (p) w30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                pVar.H = fileLocation;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    pVar.x.j(gc.e(fileLocation), "50_50", pVar.F, pVar.J);
                    pVar.f0(true, false);
                } else {
                    pVar.getMessagesController().B(pVar.c, null, inputFile3, inputFile4, videoSize2, this.f, this.e, photoSize2.location, photoSize.location, null);
                    pVar.f0(false, true);
                }
                pVar.e.g3.O(true);
                break;
            case 1:
                ad adVar = (ad) w30Var;
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
                rn rnVar = (rn) w30Var;
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
                    gc e12 = gc.e(fileLocation3);
                    b9 b9Var = rnVar.r;
                    Object obj = rnVar.D0;
                    if (obj == null) {
                        obj = rnVar.x0;
                    }
                    t3Var.j(e12, "50_50", b9Var, obj);
                    rnVar.c0.o(R.drawable.msg_addphoto, hd.N0(2131752201, "ChatSetNewPhoto"), true);
                    if (rnVar.S0 == null) {
                        rnVar.S0 = new oh0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    rnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    rnVar.c0.e.setAnimation(rnVar.S0);
                    rnVar.s0(true, false);
                    break;
                }
                break;
            case 3:
                o30 o30Var = (o30) w30Var;
                long j10 = o30Var.e;
                f40 f40Var = o30Var.f;
                org.telegram.messenger.c cVar = f40Var.o1;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 != null || inputFile8 != null || videoSize4 != null) {
                    double d10 = this.f;
                    String str2 = this.e;
                    if (j10 <= 0) {
                        np.u1(cVar.a).B(-j10, null, inputFile7, inputFile8, videoSize4, d10, str2, photoSize2.location, photoSize.location, new lz(o30Var, 7));
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
                        ConnectionsManager.getInstance(cVar.a).sendRequest(tL_photos_uploadProfilePhoto2, new e00(i10, o30Var, str2));
                        break;
                    }
                } else {
                    o30Var.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    o30Var.b = fileLocation4;
                    gc e13 = gc.e(fileLocation4);
                    o30Var.d = e13;
                    f40Var.m1.A(e13, gc.e(o30Var.c));
                    org.telegram.messenger.g0.Z3(f40Var.L1);
                    break;
                }
            case 4:
                f50 f50Var = (f50) w30Var;
                if (inputFile2 != null || inputFile != null || videoSize != null) {
                    f50Var.G = inputFile2;
                    f50Var.H = inputFile;
                    f50Var.I = videoSize;
                    f50Var.J = str;
                    f50Var.K = d;
                    if (f50Var.M) {
                        f50Var.getMessagesController().U(f50Var.c.getText().toString(), f50Var.L, null, f50Var.Q, f50Var.T, f50Var.V, f50Var.U, f50Var.X, f50Var);
                    }
                    f50Var.e0(false, true);
                    f50Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    f50Var.E = fileLocation5;
                    f50Var.F = photoSize.location;
                    f50Var.d.j(gc.e(fileLocation5), "50_50", f50Var.r, null);
                    f50Var.e0(true, false);
                    break;
                }
            case 5:
                ProfileActivity.r0((ProfileActivity) w30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                o31.e0((o31) w30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l(g2 g2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.a = i7;
        this.r = (w30) g2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ l(rn rnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
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

    public /* synthetic */ l(w30 w30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i7) {
        this.a = i7;
        this.r = w30Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
