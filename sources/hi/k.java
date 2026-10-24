package hi;

import ci.j4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a50;
import org.telegram.ui.b50;
import org.telegram.ui.bo;
import org.telegram.ui.c81;
import org.telegram.ui.fz;
import org.telegram.ui.ko;
import org.telegram.ui.md;
import org.telegram.ui.u50;
import org.telegram.ui.w60;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                oVar.G = fileLocation;
                TLRPC.InputFile inputFile = this.b;
                TLRPC.InputFile inputFile2 = this.c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.w.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.E, oVar.I);
                    oVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.c, null, inputFile, inputFile2, videoSize, this.f, this.e, photoSize.location, this.n.location, null);
                    oVar.a0(false, true);
                }
                oVar.e.Z2.N(z10);
                break;
            case 1:
                md mdVar = (md) this.r;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                if (inputFile3 != null || inputFile4 != null) {
                    mdVar.m0 = inputFile3;
                    mdVar.n0 = inputFile4;
                    mdVar.o0 = this.d;
                    mdVar.p0 = this.e;
                    mdVar.q0 = this.f;
                    if (mdVar.r0) {
                        c2 c2Var = mdVar.v0;
                        if (c2Var != null) {
                            try {
                                c2Var.dismiss();
                                mdVar.v0 = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        mdVar.h0(false);
                        mdVar.s0 = false;
                        mdVar.a.performClick();
                    }
                    mdVar.f0(false, true);
                    mdVar.n.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    mdVar.y = fileLocation2;
                    mdVar.E = this.n.location;
                    mdVar.f.h(ImageLocation.getForLocal(fileLocation2), "50_50", mdVar.v, null);
                    mdVar.f0(true, false);
                    break;
                }
            case 2:
                ko koVar = (ko) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                koVar.u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j10 = koVar.B0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    long j11 = 0;
                    double d = this.f;
                    if (j10 != 0) {
                        TLRPC.User user = koVar.C0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = koVar.C0.photo;
                            if (inputFile5 != null) {
                                j11 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j11 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            koVar.getMessagesController().putUser(koVar.C0, true);
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
                        tL_photos_uploadProfilePhoto.bot = koVar.getMessagesController().getInputUser(koVar.C0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        koVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bo(koVar, 1));
                        z11 = false;
                    } else {
                        z11 = false;
                        koVar.getMessagesController().changeChatAvatar(koVar.v0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                    }
                    if (koVar.L0) {
                        try {
                            c2 c2Var2 = koVar.b;
                            if (c2Var2 != null && c2Var2.isShowing()) {
                                koVar.b.dismiss();
                                koVar.b = null;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        koVar.M0 = z11;
                        koVar.a.performClick();
                    }
                    koVar.n0(z11, true);
                    break;
                } else {
                    j4 j4Var = koVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = koVar.r;
                    Object obj = koVar.C0;
                    if (obj == null) {
                        obj = koVar.w0;
                    }
                    j4Var.h(forLocal, "50_50", h9Var, obj);
                    koVar.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (koVar.Q0 == null) {
                        koVar.Q0 = new yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    koVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    koVar.b0.e.setAnimation(koVar.Q0);
                    koVar.n0(true, false);
                    break;
                }
                break;
            case 3:
                b50 b50Var = (b50) this.r;
                long j12 = b50Var.e;
                u50 u50Var = b50Var.f;
                AccountInstance accountInstance = u50Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j12 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new fz(b50Var, 7));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new a50(0, b50Var, str));
                        break;
                    }
                } else {
                    b50Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    b50Var.b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    b50Var.d = forLocal2;
                    u50Var.b.A(forLocal2, ImageLocation.getForLocal(b50Var.c));
                    AndroidUtilities.updateVisibleRows(u50Var.Q);
                    break;
                }
            case 4:
                w60 w60Var = (w60) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    w60Var.F = inputFile9;
                    w60Var.G = inputFile10;
                    w60Var.H = videoSize4;
                    w60Var.I = this.e;
                    w60Var.J = this.f;
                    if (w60Var.L) {
                        w60Var.getMessagesController().createChat(w60Var.c.getText().toString(), w60Var.K, null, w60Var.P, w60Var.S, w60Var.U, w60Var.T, w60Var.W, w60Var);
                    }
                    w60Var.Z(false, true);
                    w60Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    w60Var.y = fileLocation5;
                    w60Var.E = this.n.location;
                    w60Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", w60Var.r, null);
                    w60Var.Z(true, false);
                    break;
                }
            case 5:
                ProfileActivity.X((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                c81.e0((c81) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (d50) o2Var;
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
