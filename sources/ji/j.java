package ji;

import ei.d4;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.u8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.c31;
import org.telegram.ui.fn;
import org.telegram.ui.fz;
import org.telegram.ui.g30;
import org.telegram.ui.ln;
import org.telegram.ui.x30;
import org.telegram.ui.xy;
import org.telegram.ui.y40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.InputFile b;
    public final /* synthetic */ TLRPC.InputFile c;
    public final /* synthetic */ TLRPC.VideoSize d;
    public final /* synthetic */ String e;
    public final /* synthetic */ double f;
    public final /* synthetic */ TLRPC.PhotoSize h;
    public final /* synthetic */ TLRPC.PhotoSize n;
    public final /* synthetic */ e30 r;

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
        int i3 = this.a;
        double d = this.f;
        String str = this.e;
        TLRPC.VideoSize videoSize = this.d;
        TLRPC.InputFile inputFile = this.c;
        TLRPC.InputFile inputFile2 = this.b;
        int i10 = 6;
        TLRPC.PhotoSize photoSize = this.n;
        TLRPC.PhotoSize photoSize2 = this.h;
        int i11 = 1;
        e30 e30Var = this.r;
        switch (i3) {
            case 0:
                n nVar = (n) e30Var;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                nVar.H = fileLocation;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    nVar.x.j(ac.e(fileLocation), "50_50", nVar.F, nVar.J);
                    nVar.f0(true, false);
                } else {
                    nVar.getMessagesController().B(nVar.c, null, inputFile3, inputFile4, videoSize2, this.f, this.e, photoSize2.location, photoSize.location, null);
                    nVar.f0(false, true);
                }
                nVar.e.g3.O(true);
                break;
            case 1:
                ad adVar = (ad) e30Var;
                if (inputFile2 != null || inputFile != null) {
                    adVar.n0 = inputFile2;
                    adVar.o0 = inputFile;
                    adVar.p0 = videoSize;
                    adVar.q0 = str;
                    adVar.r0 = d;
                    if (adVar.s0) {
                        s1 s1Var = adVar.w0;
                        if (s1Var != null) {
                            try {
                                s1Var.dismiss();
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
                    adVar.f.j(ac.e(fileLocation2), "50_50", adVar.w, null);
                    adVar.k0(true, false);
                    break;
                }
            case 2:
                ln lnVar = (ln) e30Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                lnVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize3 != null) {
                    long j10 = lnVar.C0;
                    double d10 = this.f;
                    if (j10 != 0) {
                        TLRPC.User user = lnVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = lnVar.D0.photo;
                            userProfilePhoto.photo_id = inputFile5 != null ? inputFile5.id : inputFile6 != null ? inputFile6.id : 0L;
                            userProfilePhoto.photo_big = photoSize.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            lnVar.getMessagesController().X3(lnVar.D0, true, false);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile5 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile5;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile6 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile6;
                            int i12 = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d10;
                            tL_photos_uploadProfilePhoto.flags = i12 | 6;
                        }
                        if (videoSize3 != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize3;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = lnVar.getMessagesController().q1(lnVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        lnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new fn(lnVar, i11));
                    } else {
                        lnVar.getMessagesController().B(lnVar.w0, null, inputFile5, inputFile6, videoSize3, d10, this.e, photoSize2.location, photoSize.location, null);
                    }
                    if (lnVar.N0) {
                        try {
                            s1 s1Var2 = lnVar.b;
                            if (s1Var2 != null && s1Var2.isShowing()) {
                                lnVar.b.dismiss();
                                lnVar.b = null;
                            }
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        lnVar.O0 = false;
                        lnVar.a.performClick();
                    }
                    lnVar.s0(false, true);
                    break;
                } else {
                    d4 d4Var = lnVar.e;
                    ac e12 = ac.e(fileLocation3);
                    u8 u8Var = lnVar.r;
                    Object obj = lnVar.D0;
                    if (obj == null) {
                        obj = lnVar.x0;
                    }
                    d4Var.j(e12, "50_50", u8Var, obj);
                    lnVar.c0.o(R.drawable.msg_addphoto, bd.M0(2131752213, "ChatSetNewPhoto"), true);
                    if (lnVar.S0 == null) {
                        lnVar.S0 = new ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    lnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    lnVar.c0.e.setAnimation(lnVar.S0);
                    lnVar.s0(true, false);
                    break;
                }
            case 3:
                g30 g30Var = (g30) e30Var;
                long j11 = g30Var.e;
                x30 x30Var = g30Var.f;
                org.telegram.messenger.c cVar = x30Var.l1;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile7 != null || inputFile8 != null || videoSize4 != null) {
                    double d11 = this.f;
                    String str2 = this.e;
                    if (j11 <= 0) {
                        hp.s1(cVar.a).B(-j11, null, inputFile7, inputFile8, videoSize4, d11, str2, photoSize2.location, photoSize.location, new fz(g30Var, i10));
                        break;
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile7 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile7;
                            tL_photos_uploadProfilePhoto2.flags = 1 | tL_photos_uploadProfilePhoto2.flags;
                        }
                        if (inputFile8 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile8;
                            int i13 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d11;
                            tL_photos_uploadProfilePhoto2.flags = i13 | 6;
                        }
                        if (videoSize4 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize4;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        ConnectionsManager.getInstance(cVar.a).sendRequest(tL_photos_uploadProfilePhoto2, new xy(2, g30Var, str2));
                        break;
                    }
                } else {
                    g30Var.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    g30Var.b = fileLocation4;
                    ac e13 = ac.e(fileLocation4);
                    g30Var.d = e13;
                    x30Var.j1.A(e13, ac.e(g30Var.c));
                    org.telegram.messenger.g0.b4(x30Var.I1);
                    break;
                }
            case 4:
                y40 y40Var = (y40) e30Var;
                if (inputFile2 != null || inputFile != null || videoSize != null) {
                    y40Var.G = inputFile2;
                    y40Var.H = inputFile;
                    y40Var.I = videoSize;
                    y40Var.J = str;
                    y40Var.K = d;
                    if (y40Var.M) {
                        y40Var.getMessagesController().U(y40Var.c.getText().toString(), y40Var.L, null, y40Var.Q, y40Var.T, y40Var.V, y40Var.U, y40Var.X, y40Var);
                    }
                    y40Var.e0(false, true);
                    y40Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    y40Var.E = fileLocation5;
                    y40Var.F = photoSize.location;
                    y40Var.d.j(ac.e(fileLocation5), "50_50", y40Var.r, null);
                    y40Var.e0(true, false);
                    break;
                }
            case 5:
                ProfileActivity.j0((ProfileActivity) e30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                c31.e0((c31) e30Var, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(d2 d2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i3) {
        this.a = i3;
        this.r = (e30) d2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ j(ln lnVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = lnVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ j(e30 e30Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i3) {
        this.a = i3;
        this.r = e30Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
