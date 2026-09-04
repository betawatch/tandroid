package gi;

import bi.i5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g10;
import org.telegram.ui.i91;
import org.telegram.ui.j60;
import org.telegram.ui.l70;
import org.telegram.ui.md;
import org.telegram.ui.no;
import org.telegram.ui.q50;
import org.telegram.ui.ro;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    public final /* synthetic */ t40 r;

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
                pVar.d.Y2.N(z10);
                break;
            case 1:
                md mdVar = (md) this.r;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                if (inputFile3 != null || inputFile4 != null) {
                    mdVar.l0 = inputFile3;
                    mdVar.m0 = inputFile4;
                    mdVar.n0 = this.d;
                    mdVar.o0 = this.e;
                    mdVar.p0 = this.f;
                    if (mdVar.q0) {
                        b2 b2Var = mdVar.u0;
                        if (b2Var != null) {
                            try {
                                b2Var.dismiss();
                                mdVar.u0 = null;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                        }
                        mdVar.g0(false);
                        mdVar.r0 = false;
                        mdVar.a.performClick();
                    }
                    mdVar.e0(false, true);
                    mdVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    mdVar.x = fileLocation2;
                    mdVar.y = this.n.location;
                    mdVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", mdVar.s, null);
                    mdVar.e0(true, false);
                    break;
                }
            case 2:
                xo xoVar = (xo) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                xoVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j3 = xoVar.C0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    double d = this.f;
                    long j10 = 0;
                    if (j3 != 0) {
                        TLRPC.User user = xoVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = xoVar.D0.photo;
                            if (inputFile5 != null) {
                                j10 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j10 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j10;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            xoVar.getMessagesController().putUser(xoVar.D0, true);
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
                        tL_photos_uploadProfilePhoto.bot = xoVar.getMessagesController().getInputUser(xoVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        xoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new no(xoVar, 1));
                        z11 = false;
                    } else {
                        MessagesController messagesController = xoVar.getMessagesController();
                        long j11 = xoVar.w0;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        TLRPC.FileLocation fileLocation5 = photoSize3.location;
                        z11 = false;
                        messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                    }
                    if (xoVar.M0) {
                        try {
                            b2 b2Var2 = xoVar.b;
                            if (b2Var2 != null && b2Var2.isShowing()) {
                                xoVar.b.dismiss();
                                xoVar.b = null;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        xoVar.N0 = z11;
                        xoVar.a.performClick();
                    }
                    xoVar.n0(z11, true);
                    break;
                } else {
                    i5 i5Var = xoVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    i9 i9Var = xoVar.r;
                    Object obj = xoVar.D0;
                    if (obj == null) {
                        obj = xoVar.x0;
                    }
                    i5Var.h(forLocal, "50_50", i9Var, obj);
                    xoVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (xoVar.R0 == null) {
                        xoVar.R0 = new xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    xoVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    xoVar.b0.e.setAnimation(xoVar.R0);
                    xoVar.n0(true, false);
                    break;
                }
                break;
            case 3:
                q50 q50Var = (q50) this.r;
                long j12 = q50Var.e;
                j60 j60Var = q50Var.f;
                AccountInstance accountInstance = j60Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j12 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new g10(q50Var, 6));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new ro(23, q50Var, str));
                        break;
                    }
                } else {
                    q50Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    q50Var.b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    q50Var.d = forLocal2;
                    j60Var.b.A(forLocal2, ImageLocation.getForLocal(q50Var.c));
                    AndroidUtilities.updateVisibleRows(j60Var.Q);
                    break;
                }
            case 4:
                l70 l70Var = (l70) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    l70Var.F = inputFile9;
                    l70Var.G = inputFile10;
                    l70Var.H = videoSize4;
                    l70Var.I = this.e;
                    l70Var.J = this.f;
                    if (l70Var.L) {
                        l70Var.getMessagesController().createChat(l70Var.c.getText().toString(), l70Var.K, null, l70Var.P, l70Var.S, l70Var.U, l70Var.T, l70Var.W, l70Var);
                    }
                    l70Var.Z(false, true);
                    l70Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    l70Var.y = fileLocation7;
                    l70Var.E = this.n.location;
                    l70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", l70Var.r, null);
                    l70Var.Z(true, false);
                    break;
                }
            case 5:
                ProfileActivity.d0((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                i91.e0((i91) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (t40) n2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(xo xoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = xoVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ k(t40 t40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = t40Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
