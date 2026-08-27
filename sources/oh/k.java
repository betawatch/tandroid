package oh;

import jh.z3;
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
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ao;
import org.telegram.ui.gg;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.r00;
import org.telegram.ui.s50;
import org.telegram.ui.u60;
import org.telegram.ui.x71;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final /* synthetic */ i40 r;

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
                oVar.B = fileLocation;
                TLRPC.InputFile inputFile = this.b;
                TLRPC.InputFile inputFile2 = this.c;
                TLRPC.VideoSize videoSize = this.d;
                if (inputFile == null && inputFile2 == null && videoSize == null) {
                    oVar.v.h(ImageLocation.getForLocal(fileLocation), "50_50", oVar.y, oVar.D);
                    oVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.b, null, inputFile, inputFile2, videoSize, this.f, this.e, photoSize.location, this.n.location, null);
                    oVar.a0(false, true);
                }
                oVar.d.U2.N(z10);
                break;
            case 1:
                id idVar = (id) this.r;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                if (inputFile3 != null || inputFile4 != null) {
                    idVar.h0 = inputFile3;
                    idVar.i0 = inputFile4;
                    idVar.j0 = this.d;
                    idVar.k0 = this.e;
                    idVar.l0 = this.f;
                    if (idVar.m0) {
                        b2 b2Var = idVar.q0;
                        if (b2Var != null) {
                            try {
                                b2Var.dismiss();
                                idVar.q0 = null;
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                        }
                        idVar.g0(false);
                        idVar.n0 = false;
                        idVar.a.performClick();
                    }
                    idVar.e0(false, true);
                    idVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    idVar.x = fileLocation2;
                    idVar.y = this.n.location;
                    idVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", idVar.s, null);
                    idVar.e0(true, false);
                    break;
                }
            case 2:
                jo joVar = (jo) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                joVar.r0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j10 = joVar.y0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    double d = this.f;
                    long j11 = 0;
                    if (j10 != 0) {
                        TLRPC.User user = joVar.z0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = joVar.z0.photo;
                            if (inputFile5 != null) {
                                j11 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j11 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            joVar.getMessagesController().putUser(joVar.z0, true);
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
                        tL_photos_uploadProfilePhoto.bot = joVar.getMessagesController().getInputUser(joVar.z0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        joVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ao(joVar, 1));
                        z11 = false;
                    } else {
                        MessagesController messagesController = joVar.getMessagesController();
                        long j12 = joVar.s0;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        TLRPC.FileLocation fileLocation5 = photoSize3.location;
                        z11 = false;
                        messagesController.changeChatAvatar(j12, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                    }
                    if (joVar.I0) {
                        try {
                            b2 b2Var2 = joVar.b;
                            if (b2Var2 != null && b2Var2.isShowing()) {
                                joVar.b.dismiss();
                                joVar.b = null;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        joVar.J0 = z11;
                        joVar.a.performClick();
                    }
                    joVar.n0(z11, true);
                    break;
                } else {
                    z3 z3Var = joVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    y8 y8Var = joVar.r;
                    Object obj = joVar.z0;
                    if (obj == null) {
                        obj = joVar.t0;
                    }
                    z3Var.h(forLocal, "50_50", y8Var, obj);
                    joVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (joVar.N0 == null) {
                        joVar.N0 = new oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    joVar.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    joVar.X.e.setAnimation(joVar.N0);
                    joVar.n0(true, false);
                    break;
                }
                break;
            case 3:
                z40 z40Var = (z40) this.r;
                long j13 = z40Var.e;
                s50 s50Var = z40Var.f;
                AccountInstance accountInstance = s50Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j13 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new r00(z40Var, 6));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new gg(27, z40Var, str));
                        break;
                    }
                } else {
                    z40Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    z40Var.b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    z40Var.d = forLocal2;
                    s50Var.b.A(forLocal2, ImageLocation.getForLocal(z40Var.c));
                    AndroidUtilities.updateVisibleRows(s50Var.M);
                    break;
                }
            case 4:
                u60 u60Var = (u60) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    u60Var.B = inputFile9;
                    u60Var.C = inputFile10;
                    u60Var.D = videoSize4;
                    u60Var.E = this.e;
                    u60Var.F = this.f;
                    if (u60Var.H) {
                        u60Var.getMessagesController().createChat(u60Var.c.getText().toString(), u60Var.G, null, u60Var.L, u60Var.O, u60Var.Q, u60Var.P, u60Var.S, u60Var);
                    }
                    u60Var.Z(false, true);
                    u60Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    u60Var.y = fileLocation7;
                    u60Var.A = this.n.location;
                    u60Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", u60Var.r, null);
                    u60Var.Z(true, false);
                    break;
                }
            case 5:
                ProfileActivity.d0((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                x71.d0((x71) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (i40) n2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(jo joVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = joVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ k(i40 i40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = i40Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
