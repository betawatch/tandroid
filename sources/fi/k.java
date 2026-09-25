package fi;

import ai.y5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c10;
import org.telegram.ui.d60;
import org.telegram.ui.g70;
import org.telegram.ui.ho;
import org.telegram.ui.k50;
import org.telegram.ui.ld;
import org.telegram.ui.lo;
import org.telegram.ui.ro;
import org.telegram.ui.z81;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
    public final /* synthetic */ u40 r;

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
                ld ldVar = (ld) this.r;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                if (inputFile3 != null || inputFile4 != null) {
                    ldVar.l0 = inputFile3;
                    ldVar.m0 = inputFile4;
                    ldVar.n0 = this.d;
                    ldVar.o0 = this.e;
                    ldVar.p0 = this.f;
                    if (ldVar.q0) {
                        a2 a2Var = ldVar.u0;
                        if (a2Var != null) {
                            try {
                                a2Var.dismiss();
                                ldVar.u0 = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        ldVar.g0(false);
                        ldVar.r0 = false;
                        ldVar.a.performClick();
                    }
                    ldVar.e0(false, true);
                    ldVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ldVar.x = fileLocation2;
                    ldVar.y = this.n.location;
                    ldVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", ldVar.s, null);
                    ldVar.e0(true, false);
                    break;
                }
            case 2:
                ro roVar = (ro) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                roVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j3 = roVar.C0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    double d = this.f;
                    long j10 = 0;
                    if (j3 != 0) {
                        TLRPC.User user = roVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = roVar.D0.photo;
                            if (inputFile5 != null) {
                                j10 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j10 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j10;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            roVar.getMessagesController().putUser(roVar.D0, true);
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
                        tL_photos_uploadProfilePhoto.bot = roVar.getMessagesController().getInputUser(roVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        roVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ho(roVar, 1));
                        z11 = false;
                    } else {
                        MessagesController messagesController = roVar.getMessagesController();
                        long j11 = roVar.w0;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        TLRPC.FileLocation fileLocation5 = photoSize3.location;
                        z11 = false;
                        messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                    }
                    if (roVar.M0) {
                        try {
                            a2 a2Var2 = roVar.b;
                            if (a2Var2 != null && a2Var2.isShowing()) {
                                roVar.b.dismiss();
                                roVar.b = null;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        roVar.N0 = z11;
                        roVar.a.performClick();
                    }
                    roVar.n0(z11, true);
                    break;
                } else {
                    y5 y5Var = roVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = roVar.r;
                    Object obj = roVar.D0;
                    if (obj == null) {
                        obj = roVar.x0;
                    }
                    y5Var.h(forLocal, "50_50", h9Var, obj);
                    roVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (roVar.R0 == null) {
                        roVar.R0 = new ij0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    roVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    roVar.b0.e.setAnimation(roVar.R0);
                    roVar.n0(true, false);
                    break;
                }
                break;
            case 3:
                k50 k50Var = (k50) this.r;
                long j12 = k50Var.e;
                d60 d60Var = k50Var.f;
                AccountInstance accountInstance = d60Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j12 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new c10(k50Var, 6));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new lo(23, k50Var, str));
                        break;
                    }
                } else {
                    k50Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    k50Var.b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    k50Var.d = forLocal2;
                    d60Var.b.A(forLocal2, ImageLocation.getForLocal(k50Var.c));
                    AndroidUtilities.updateVisibleRows(d60Var.Q);
                    break;
                }
            case 4:
                g70 g70Var = (g70) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    g70Var.F = inputFile9;
                    g70Var.G = inputFile10;
                    g70Var.H = videoSize4;
                    g70Var.I = this.e;
                    g70Var.J = this.f;
                    if (g70Var.L) {
                        g70Var.getMessagesController().createChat(g70Var.c.getText().toString(), g70Var.K, null, g70Var.P, g70Var.S, g70Var.U, g70Var.T, g70Var.W, g70Var);
                    }
                    g70Var.Z(false, true);
                    g70Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    g70Var.y = fileLocation7;
                    g70Var.E = this.n.location;
                    g70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", g70Var.r, null);
                    g70Var.Z(true, false);
                    break;
                }
            case 5:
                ProfileActivity.d0((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                z81.e0((z81) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(m2 m2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (u40) m2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(ro roVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = roVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ k(u40 u40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = u40Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
