package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.PhotoSize b;
    public final /* synthetic */ TLRPC.InputFile c;
    public final /* synthetic */ TLRPC.InputFile d;
    public final /* synthetic */ TLRPC.VideoSize e;
    public final /* synthetic */ TLRPC.PhotoSize f;
    public final /* synthetic */ double h;
    public final /* synthetic */ String n;
    public final /* synthetic */ org.telegram.ui.Components.w40 r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ed(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (org.telegram.ui.Components.w40) p2Var;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.n = str;
        this.h = d;
        this.b = photoSize;
        this.f = photoSize2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        boolean z10;
        switch (this.a) {
            case 0:
                pd pdVar = (pd) this.r;
                TLRPC.InputFile inputFile = this.c;
                TLRPC.InputFile inputFile2 = this.d;
                if (inputFile != null || inputFile2 != null) {
                    pdVar.i0 = inputFile;
                    pdVar.j0 = inputFile2;
                    pdVar.k0 = this.e;
                    pdVar.l0 = this.n;
                    pdVar.m0 = this.h;
                    if (pdVar.n0) {
                        org.telegram.ui.ActionBar.d2 d2Var = pdVar.r0;
                        if (d2Var != null) {
                            try {
                                d2Var.dismiss();
                                pdVar.r0 = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        pdVar.g0(false);
                        pdVar.o0 = false;
                        pdVar.a.performClick();
                    }
                    pdVar.e0(false, true);
                    pdVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation = this.b.location;
                    pdVar.x = fileLocation;
                    pdVar.y = this.f.location;
                    pdVar.e.h(ImageLocation.getForLocal(fileLocation), "50_50", pdVar.s, null);
                    pdVar.e0(true, false);
                    break;
                }
            case 1:
                ro roVar = (ro) this.r;
                TLRPC.PhotoSize photoSize = this.b;
                TLRPC.FileLocation fileLocation2 = photoSize.location;
                roVar.s0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize = this.e;
                if (inputFile3 != null || inputFile4 != null || videoSize != null) {
                    long j10 = roVar.z0;
                    TLRPC.PhotoSize photoSize2 = this.f;
                    double d = this.h;
                    long j11 = 0;
                    if (j10 != 0) {
                        TLRPC.User user = roVar.A0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = roVar.A0.photo;
                            if (inputFile3 != null) {
                                j11 = inputFile3.id;
                            } else if (inputFile4 != null) {
                                j11 = inputFile4.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize2.location;
                            userProfilePhoto.photo_small = photoSize.location;
                            roVar.getMessagesController().putUser(roVar.A0, true);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile3 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile3;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile4 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile4;
                            int i10 = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d;
                            tL_photos_uploadProfilePhoto.flags = i10 | 6;
                        }
                        if (videoSize != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = roVar.getMessagesController().getInputUser(roVar.A0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        roVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jo(roVar, 1));
                        z4 = false;
                    } else {
                        MessagesController messagesController = roVar.getMessagesController();
                        long j12 = roVar.t0;
                        TLRPC.FileLocation fileLocation3 = photoSize.location;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        z4 = false;
                        messagesController.changeChatAvatar(j12, null, inputFile3, inputFile4, videoSize, d, this.n, fileLocation3, fileLocation4, null);
                    }
                    if (roVar.J0) {
                        try {
                            org.telegram.ui.ActionBar.d2 d2Var2 = roVar.b;
                            if (d2Var2 != null && d2Var2.isShowing()) {
                                roVar.b.dismiss();
                                roVar.b = null;
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        roVar.K0 = z4;
                        roVar.a.performClick();
                    }
                    roVar.n0(z4, true);
                    break;
                } else {
                    nh.y3 y3Var = roVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation2);
                    org.telegram.ui.Components.z8 z8Var = roVar.r;
                    Object obj = roVar.A0;
                    if (obj == null) {
                        obj = roVar.u0;
                    }
                    y3Var.h(forLocal, "50_50", z8Var, obj);
                    roVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (roVar.O0 == null) {
                        roVar.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    roVar.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    roVar.Y.e.setAnimation(roVar.O0);
                    roVar.n0(true, false);
                    break;
                }
                break;
            case 2:
                m50 m50Var = (m50) this.r;
                long j13 = m50Var.e;
                e60 e60Var = m50Var.f;
                AccountInstance accountInstance = e60Var.d;
                TLRPC.InputFile inputFile5 = this.c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                TLRPC.PhotoSize photoSize3 = this.b;
                TLRPC.PhotoSize photoSize4 = this.f;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    double d10 = this.h;
                    String str = this.n;
                    if (j13 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile5, inputFile6, videoSize2, d10, str, photoSize3.location, photoSize4.location, new d10(m50Var, 6));
                        break;
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile5 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile5;
                            tL_photos_uploadProfilePhoto2.flags |= 1;
                        }
                        if (inputFile6 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile6;
                            int i11 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                            tL_photos_uploadProfilePhoto2.flags = i11 | 6;
                        }
                        if (videoSize2 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize2;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new no(23, m50Var, str));
                        break;
                    }
                } else {
                    m50Var.c = photoSize3.location;
                    TLRPC.FileLocation fileLocation5 = photoSize4.location;
                    m50Var.b = fileLocation5;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation5);
                    m50Var.d = forLocal2;
                    e60Var.b.A(forLocal2, ImageLocation.getForLocal(m50Var.c));
                    AndroidUtilities.updateVisibleRows(e60Var.N);
                    break;
                }
            case 3:
                g70 g70Var = (g70) this.r;
                TLRPC.InputFile inputFile7 = this.c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    g70Var.C = inputFile7;
                    g70Var.D = inputFile8;
                    g70Var.E = videoSize3;
                    g70Var.F = this.n;
                    g70Var.G = this.h;
                    if (g70Var.I) {
                        g70Var.getMessagesController().createChat(g70Var.c.getText().toString(), g70Var.H, null, g70Var.M, g70Var.P, g70Var.R, g70Var.Q, g70Var.T, g70Var);
                    }
                    g70Var.Z(false, true);
                    g70Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation6 = this.b.location;
                    g70Var.y = fileLocation6;
                    g70Var.B = this.f.location;
                    g70Var.d.h(ImageLocation.getForLocal(fileLocation6), "50_50", g70Var.r, null);
                    g70Var.Z(true, false);
                    break;
                }
            case 4:
                ProfileActivity.d0((ProfileActivity) this.r, this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
            case 5:
                w81.d0((w81) this.r, this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
            default:
                sh.n nVar = (sh.n) this.r;
                nVar.getClass();
                TLRPC.PhotoSize photoSize5 = this.b;
                TLRPC.FileLocation fileLocation7 = photoSize5.location;
                nVar.C = fileLocation7;
                TLRPC.InputFile inputFile9 = this.c;
                TLRPC.InputFile inputFile10 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    nVar.v.h(ImageLocation.getForLocal(fileLocation7), "50_50", nVar.y, nVar.E);
                    nVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    nVar.getMessagesController().changeChatAvatar(nVar.b, null, inputFile9, inputFile10, videoSize4, this.h, this.n, photoSize5.location, this.f.location, null);
                    nVar.a0(false, true);
                }
                nVar.d.V2.N(z10);
                break;
        }
    }

    public /* synthetic */ ed(ro roVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 1;
        this.r = roVar;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f = photoSize2;
        this.h = d;
        this.n = str;
    }

    public /* synthetic */ ed(org.telegram.ui.Components.w40 w40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = w40Var;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.b = photoSize;
        this.f = photoSize2;
    }

    public /* synthetic */ ed(sh.n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = 6;
        this.r = nVar;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.f = photoSize2;
    }
}
