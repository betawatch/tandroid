package fi;

import ai.z5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g91;
import org.telegram.ui.i10;
import org.telegram.ui.k60;
import org.telegram.ui.mo;
import org.telegram.ui.n70;
import org.telegram.ui.nd;
import org.telegram.ui.qo;
import org.telegram.ui.r50;
import org.telegram.ui.wo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                nd ndVar = (nd) this.r;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                if (inputFile3 != null || inputFile4 != null) {
                    ndVar.l0 = inputFile3;
                    ndVar.m0 = inputFile4;
                    ndVar.n0 = this.d;
                    ndVar.o0 = this.e;
                    ndVar.p0 = this.f;
                    if (ndVar.q0) {
                        c2 c2Var = ndVar.u0;
                        if (c2Var != null) {
                            try {
                                c2Var.dismiss();
                                ndVar.u0 = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        ndVar.g0(false);
                        ndVar.r0 = false;
                        ndVar.a.performClick();
                    }
                    ndVar.e0(false, true);
                    ndVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ndVar.x = fileLocation2;
                    ndVar.y = this.n.location;
                    ndVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", ndVar.s, null);
                    ndVar.e0(true, false);
                    break;
                }
            case 2:
                wo woVar = (wo) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                woVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j3 = woVar.C0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    double d = this.f;
                    long j10 = 0;
                    if (j3 != 0) {
                        TLRPC.User user = woVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = woVar.D0.photo;
                            if (inputFile5 != null) {
                                j10 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j10 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j10;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            woVar.getMessagesController().putUser(woVar.D0, true);
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
                        tL_photos_uploadProfilePhoto.bot = woVar.getMessagesController().getInputUser(woVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        woVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new mo(woVar, 1));
                        z11 = false;
                    } else {
                        MessagesController messagesController = woVar.getMessagesController();
                        long j11 = woVar.w0;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        TLRPC.FileLocation fileLocation5 = photoSize3.location;
                        z11 = false;
                        messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                    }
                    if (woVar.M0) {
                        try {
                            c2 c2Var2 = woVar.b;
                            if (c2Var2 != null && c2Var2.isShowing()) {
                                woVar.b.dismiss();
                                woVar.b = null;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        woVar.N0 = z11;
                        woVar.a.performClick();
                    }
                    woVar.n0(z11, true);
                    break;
                } else {
                    z5 z5Var = woVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    f9 f9Var = woVar.r;
                    Object obj = woVar.D0;
                    if (obj == null) {
                        obj = woVar.x0;
                    }
                    z5Var.h(forLocal, "50_50", f9Var, obj);
                    woVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (woVar.R0 == null) {
                        woVar.R0 = new yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    woVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    woVar.b0.e.setAnimation(woVar.R0);
                    woVar.n0(true, false);
                    break;
                }
                break;
            case 3:
                r50 r50Var = (r50) this.r;
                long j12 = r50Var.e;
                k60 k60Var = r50Var.f;
                AccountInstance accountInstance = k60Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j12 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new i10(r50Var, 6));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new qo(23, r50Var, str));
                        break;
                    }
                } else {
                    r50Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    r50Var.b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    r50Var.d = forLocal2;
                    k60Var.b.A(forLocal2, ImageLocation.getForLocal(r50Var.c));
                    AndroidUtilities.updateVisibleRows(k60Var.Q);
                    break;
                }
            case 4:
                n70 n70Var = (n70) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    n70Var.F = inputFile9;
                    n70Var.G = inputFile10;
                    n70Var.H = videoSize4;
                    n70Var.I = this.e;
                    n70Var.J = this.f;
                    if (n70Var.L) {
                        n70Var.getMessagesController().createChat(n70Var.c.getText().toString(), n70Var.K, null, n70Var.P, n70Var.S, n70Var.U, n70Var.T, n70Var.W, n70Var);
                    }
                    n70Var.Z(false, true);
                    n70Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    n70Var.y = fileLocation7;
                    n70Var.E = this.n.location;
                    n70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", n70Var.r, null);
                    n70Var.Z(true, false);
                    break;
                }
            case 5:
                ProfileActivity.d0((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                g91.e0((g91) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (t40) o2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(wo woVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = woVar;
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
