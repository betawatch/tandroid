package gi;

import bi.k5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n60;
import org.telegram.ui.o91;
import org.telegram.ui.p70;
import org.telegram.ui.po;
import org.telegram.ui.sd;
import org.telegram.ui.to;
import org.telegram.ui.u50;
import org.telegram.ui.zo;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
    public final /* synthetic */ h50 r;

    public /* synthetic */ k(p pVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
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
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                p pVar = (p) this.r;
                pVar.getClass();
                TLRPC.PhotoSize photoSize = this.h;
                TLRPC.FileLocation fileLocation = photoSize.location;
                pVar.F = fileLocation;
                TLRPC.InputFile inputFile = this.b;
                TLRPC.InputFile inputFile2 = this.c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    pVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", pVar.y, pVar.H);
                    pVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    pVar.getMessagesController().changeChatAvatar(pVar.b, null, inputFile, inputFile2, videoSize, this.f, this.e, photoSize.location, this.n.location, null);
                    pVar.a0(false, true);
                }
                pVar.d.W2.N(z10);
                break;
            case 1:
                sd sdVar = (sd) this.r;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                if (inputFile3 != null || inputFile4 != null) {
                    sdVar.l0 = inputFile3;
                    sdVar.m0 = inputFile4;
                    sdVar.n0 = this.d;
                    sdVar.o0 = this.e;
                    sdVar.p0 = this.f;
                    if (sdVar.q0) {
                        a2 a2Var = sdVar.u0;
                        if (a2Var != null) {
                            try {
                                a2Var.dismiss();
                                sdVar.u0 = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        sdVar.g0(false);
                        sdVar.r0 = false;
                        sdVar.a.performClick();
                    }
                    sdVar.e0(false, true);
                    sdVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    sdVar.x = fileLocation2;
                    sdVar.y = this.n.location;
                    sdVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", sdVar.s, null);
                    sdVar.e0(true, false);
                    break;
                }
            case 2:
                zo zoVar = (zo) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                zoVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j10 = zoVar.C0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    long j11 = 0;
                    double d = this.f;
                    if (j10 != 0) {
                        TLRPC.User user = zoVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = zoVar.D0.photo;
                            if (inputFile5 != null) {
                                j11 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j11 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            zoVar.getMessagesController().putUser(zoVar.D0, true);
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
                        tL_photos_uploadProfilePhoto.bot = zoVar.getMessagesController().getInputUser(zoVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        zoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new po(zoVar, 1));
                        z11 = false;
                    } else {
                        z11 = false;
                        zoVar.getMessagesController().changeChatAvatar(zoVar.w0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                    }
                    if (zoVar.M0) {
                        try {
                            a2 a2Var2 = zoVar.b;
                            if (a2Var2 != null && a2Var2.isShowing()) {
                                zoVar.b.dismiss();
                                zoVar.b = null;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        zoVar.N0 = z11;
                        zoVar.a.performClick();
                    }
                    zoVar.n0(z11, true);
                    break;
                } else {
                    k5 k5Var = zoVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    k9 k9Var = zoVar.r;
                    Object obj = zoVar.D0;
                    if (obj == null) {
                        obj = zoVar.x0;
                    }
                    k5Var.h(forLocal, "50_50", k9Var, obj);
                    zoVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (zoVar.R0 == null) {
                        zoVar.R0 = new yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    zoVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    zoVar.b0.e.setAnimation(zoVar.R0);
                    zoVar.n0(true, false);
                    break;
                }
                break;
            case 3:
                u50 u50Var = (u50) this.r;
                long j12 = u50Var.e;
                n60 n60Var = u50Var.f;
                AccountInstance accountInstance = n60Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j12 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new zz(u50Var, 7));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new to(23, u50Var, str));
                        break;
                    }
                } else {
                    u50Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    u50Var.b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    u50Var.d = forLocal2;
                    n60Var.b.A(forLocal2, ImageLocation.getForLocal(u50Var.c));
                    AndroidUtilities.updateVisibleRows(n60Var.Q);
                    break;
                }
            case 4:
                p70 p70Var = (p70) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    p70Var.F = inputFile9;
                    p70Var.G = inputFile10;
                    p70Var.H = videoSize4;
                    p70Var.I = this.e;
                    p70Var.J = this.f;
                    if (p70Var.L) {
                        p70Var.getMessagesController().createChat(p70Var.c.getText().toString(), p70Var.K, null, p70Var.P, p70Var.S, p70Var.U, p70Var.T, p70Var.W, p70Var);
                    }
                    p70Var.Z(false, true);
                    p70Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    p70Var.y = fileLocation5;
                    p70Var.E = this.n.location;
                    p70Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", p70Var.r, null);
                    p70Var.Z(true, false);
                    break;
                }
            case 5:
                ProfileActivity.d0((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                o91.e0((o91) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(m2 m2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (h50) m2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(zo zoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = zoVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ k(h50 h50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = h50Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
