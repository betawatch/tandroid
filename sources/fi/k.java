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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d10;
import org.telegram.ui.f60;
import org.telegram.ui.i70;
import org.telegram.ui.io;
import org.telegram.ui.ld;
import org.telegram.ui.m50;
import org.telegram.ui.mo;
import org.telegram.ui.so;
import org.telegram.ui.x81;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                        b2 b2Var = ldVar.u0;
                        if (b2Var != null) {
                            try {
                                b2Var.dismiss();
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
                so soVar = (so) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                soVar.v0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j3 = soVar.C0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    double d = this.f;
                    long j10 = 0;
                    if (j3 != 0) {
                        TLRPC.User user = soVar.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = soVar.D0.photo;
                            if (inputFile5 != null) {
                                j10 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j10 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j10;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            soVar.getMessagesController().putUser(soVar.D0, true);
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
                        tL_photos_uploadProfilePhoto.bot = soVar.getMessagesController().getInputUser(soVar.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        soVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new io(soVar, 1));
                        z11 = false;
                    } else {
                        MessagesController messagesController = soVar.getMessagesController();
                        long j11 = soVar.w0;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        TLRPC.FileLocation fileLocation5 = photoSize3.location;
                        z11 = false;
                        messagesController.changeChatAvatar(j11, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                    }
                    if (soVar.M0) {
                        try {
                            b2 b2Var2 = soVar.b;
                            if (b2Var2 != null && b2Var2.isShowing()) {
                                soVar.b.dismiss();
                                soVar.b = null;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        soVar.N0 = z11;
                        soVar.a.performClick();
                    }
                    soVar.n0(z11, true);
                    break;
                } else {
                    y5 y5Var = soVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    h9 h9Var = soVar.r;
                    Object obj = soVar.D0;
                    if (obj == null) {
                        obj = soVar.x0;
                    }
                    y5Var.h(forLocal, "50_50", h9Var, obj);
                    soVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (soVar.R0 == null) {
                        soVar.R0 = new yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    soVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    soVar.b0.e.setAnimation(soVar.R0);
                    soVar.n0(true, false);
                    break;
                }
                break;
            case 3:
                m50 m50Var = (m50) this.r;
                long j12 = m50Var.e;
                f60 f60Var = m50Var.f;
                AccountInstance accountInstance = f60Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j12 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new d10(m50Var, 6));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new mo(23, m50Var, str));
                        break;
                    }
                } else {
                    m50Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    m50Var.b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    m50Var.d = forLocal2;
                    f60Var.b.A(forLocal2, ImageLocation.getForLocal(m50Var.c));
                    AndroidUtilities.updateVisibleRows(f60Var.Q);
                    break;
                }
            case 4:
                i70 i70Var = (i70) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    i70Var.F = inputFile9;
                    i70Var.G = inputFile10;
                    i70Var.H = videoSize4;
                    i70Var.I = this.e;
                    i70Var.J = this.f;
                    if (i70Var.L) {
                        i70Var.getMessagesController().createChat(i70Var.c.getText().toString(), i70Var.K, null, i70Var.P, i70Var.S, i70Var.U, i70Var.T, i70Var.W, i70Var);
                    }
                    i70Var.Z(false, true);
                    i70Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    i70Var.y = fileLocation7;
                    i70Var.E = this.n.location;
                    i70Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", i70Var.r, null);
                    i70Var.Z(true, false);
                    break;
                }
            case 5:
                ProfileActivity.d0((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                x81.e0((x81) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(n2 n2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (u40) n2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(so soVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = soVar;
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
