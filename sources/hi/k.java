package hi;

import ci.k4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a50;
import org.telegram.ui.bo;
import org.telegram.ui.fz;
import org.telegram.ui.ko;
import org.telegram.ui.od;
import org.telegram.ui.s50;
import org.telegram.ui.u60;
import org.telegram.ui.z40;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
    public final /* synthetic */ d50 r;

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
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                o oVar = (o) this.r;
                oVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                oVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.b;
                TLRPC.InputFile inputFile2 = this.c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.y, oVar.H);
                    oVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.b, null, inputFile, inputFile2, videoSize, this.f, this.e, photoSize.location, this.n.location, null);
                    oVar.a0(false, true);
                }
                oVar.d.W2.N(z10);
                break;
            case 1:
                od odVar = (od) this.r;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                if (inputFile3 != null || inputFile4 != null) {
                    odVar.l0 = inputFile3;
                    odVar.m0 = inputFile4;
                    odVar.n0 = this.d;
                    odVar.o0 = this.e;
                    odVar.p0 = this.f;
                    if (odVar.q0) {
                        b2 b2Var = odVar.u0;
                        if (b2Var != null) {
                            try {
                                b2Var.dismiss();
                                odVar.u0 = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        odVar.g0(false);
                        odVar.r0 = false;
                        odVar.a.performClick();
                    }
                    odVar.e0(false, true);
                    odVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    odVar.x = fileLocation2;
                    odVar.y = this.n.location;
                    odVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", odVar.s, null);
                    odVar.e0(true, false);
                    break;
                }
            case 2:
                ko koVar = (ko) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                koVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j10 = koVar.C0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    long j11 = 0;
                    double d = this.f;
                    if (j10 != 0) {
                        TLRPC.User user = koVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = koVar.D0.photo;
                            if (inputFile5 != null) {
                                j11 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j11 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            koVar.getMessagesController().putUser(koVar.D0, true);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile5 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile5;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile6 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile6;
                            int i10 = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d;
                            tL_photos_uploadProfilePhoto.flags = i10 | 6;
                        }
                        if (videoSize2 != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = koVar.getMessagesController().getInputUser(koVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        koVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bo(koVar, 1));
                        z11 = false;
                    } else {
                        z11 = false;
                        koVar.getMessagesController().changeChatAvatar(koVar.w0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                    }
                    if (koVar.M0) {
                        try {
                            b2 b2Var2 = koVar.b;
                            if (b2Var2 != null && b2Var2.isShowing()) {
                                koVar.b.dismiss();
                                koVar.b = null;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        koVar.N0 = z11;
                        koVar.a.performClick();
                    }
                    koVar.n0(z11, true);
                    break;
                } else {
                    k4 k4Var = koVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = koVar.r;
                    Object obj = koVar.D0;
                    if (obj == null) {
                        obj = koVar.x0;
                    }
                    k4Var.h(forLocal, "50_50", h9Var, obj);
                    koVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (koVar.R0 == null) {
                        koVar.R0 = new uj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    koVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    koVar.b0.e.setAnimation(koVar.R0);
                    koVar.n0(true, false);
                    break;
                }
                break;
            case 3:
                a50 a50Var = (a50) this.r;
                long j12 = a50Var.e;
                s50 s50Var = a50Var.f;
                AccountInstance accountInstance = s50Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j12 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new fz(a50Var, 7));
                        break;
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile7 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile7;
                            tL_photos_uploadProfilePhoto2.flags |= 1;
                        }
                        if (inputFile8 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile8;
                            int i11 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                            tL_photos_uploadProfilePhoto2.flags = i11 | 6;
                        }
                        if (videoSize3 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize3;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new z40(0, a50Var, str));
                        break;
                    }
                } else {
                    a50Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    a50Var.b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    a50Var.d = forLocal2;
                    s50Var.b.A(forLocal2, ImageLocation.getForLocal(a50Var.c));
                    AndroidUtilities.updateVisibleRows(s50Var.Q);
                    break;
                }
            case 4:
                u60 u60Var = (u60) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    u60Var.F = inputFile9;
                    u60Var.G = inputFile10;
                    u60Var.H = videoSize4;
                    u60Var.I = this.e;
                    u60Var.J = this.f;
                    if (u60Var.L) {
                        u60Var.getMessagesController().createChat(u60Var.c.getText().toString(), u60Var.K, null, u60Var.P, u60Var.S, u60Var.U, u60Var.T, u60Var.W, u60Var);
                    }
                    u60Var.Z(false, true);
                    u60Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    u60Var.y = fileLocation5;
                    u60Var.E = this.n.location;
                    u60Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", u60Var.r, null);
                    u60Var.Z(true, false);
                    break;
                }
            case 5:
                ProfileActivity.X((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                z71.e0((z71) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (d50) n2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(ko koVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = koVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ k(d50 d50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = d50Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
