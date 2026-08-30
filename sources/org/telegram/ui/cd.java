package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.PhotoSize b;
    public final /* synthetic */ TLRPC.InputFile c;
    public final /* synthetic */ TLRPC.InputFile d;
    public final /* synthetic */ TLRPC.VideoSize e;
    public final /* synthetic */ TLRPC.PhotoSize f;
    public final /* synthetic */ double h;
    public final /* synthetic */ String n;
    public final /* synthetic */ org.telegram.ui.Components.v40 r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cd(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (org.telegram.ui.Components.v40) p2Var;
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
                nd ndVar = (nd) this.r;
                TLRPC.InputFile inputFile = this.c;
                TLRPC.InputFile inputFile2 = this.d;
                if (inputFile != null || inputFile2 != null) {
                    ndVar.i0 = inputFile;
                    ndVar.j0 = inputFile2;
                    ndVar.k0 = this.e;
                    ndVar.l0 = this.n;
                    ndVar.m0 = this.h;
                    if (ndVar.n0) {
                        org.telegram.ui.ActionBar.d2 d2Var = ndVar.r0;
                        if (d2Var != null) {
                            try {
                                d2Var.dismiss();
                                ndVar.r0 = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        ndVar.g0(false);
                        ndVar.o0 = false;
                        ndVar.a.performClick();
                    }
                    ndVar.e0(false, true);
                    ndVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation = this.b.location;
                    ndVar.x = fileLocation;
                    ndVar.y = this.f.location;
                    ndVar.e.h(ImageLocation.getForLocal(fileLocation), "50_50", ndVar.s, null);
                    ndVar.e0(true, false);
                    break;
                }
            case 1:
                po poVar = (po) this.r;
                TLRPC.PhotoSize photoSize = this.b;
                TLRPC.FileLocation fileLocation2 = photoSize.location;
                poVar.s0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize = this.e;
                if (inputFile3 != null || inputFile4 != null || videoSize != null) {
                    long j10 = poVar.z0;
                    TLRPC.PhotoSize photoSize2 = this.f;
                    double d = this.h;
                    long j11 = 0;
                    if (j10 != 0) {
                        TLRPC.User user = poVar.A0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = poVar.A0.photo;
                            if (inputFile3 != null) {
                                j11 = inputFile3.id;
                            } else if (inputFile4 != null) {
                                j11 = inputFile4.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize2.location;
                            userProfilePhoto.photo_small = photoSize.location;
                            poVar.getMessagesController().putUser(poVar.A0, true);
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
                        tL_photos_uploadProfilePhoto.bot = poVar.getMessagesController().getInputUser(poVar.A0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        poVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ho(poVar, 1));
                        z4 = false;
                    } else {
                        MessagesController messagesController = poVar.getMessagesController();
                        long j12 = poVar.t0;
                        TLRPC.FileLocation fileLocation3 = photoSize.location;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        z4 = false;
                        messagesController.changeChatAvatar(j12, null, inputFile3, inputFile4, videoSize, d, this.n, fileLocation3, fileLocation4, null);
                    }
                    if (poVar.J0) {
                        try {
                            org.telegram.ui.ActionBar.d2 d2Var2 = poVar.b;
                            if (d2Var2 != null && d2Var2.isShowing()) {
                                poVar.b.dismiss();
                                poVar.b = null;
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        poVar.K0 = z4;
                        poVar.a.performClick();
                    }
                    poVar.n0(z4, true);
                    break;
                } else {
                    nh.y3 y3Var = poVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation2);
                    org.telegram.ui.Components.z8 z8Var = poVar.r;
                    Object obj = poVar.A0;
                    if (obj == null) {
                        obj = poVar.u0;
                    }
                    y3Var.h(forLocal, "50_50", z8Var, obj);
                    poVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (poVar.O0 == null) {
                        poVar.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    poVar.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    poVar.Y.e.setAnimation(poVar.O0);
                    poVar.n0(true, false);
                    break;
                }
                break;
            case 2:
                k50 k50Var = (k50) this.r;
                long j13 = k50Var.e;
                c60 c60Var = k50Var.f;
                AccountInstance accountInstance = c60Var.d;
                TLRPC.InputFile inputFile5 = this.c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                TLRPC.PhotoSize photoSize3 = this.b;
                TLRPC.PhotoSize photoSize4 = this.f;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    double d10 = this.h;
                    String str = this.n;
                    if (j13 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile5, inputFile6, videoSize2, d10, str, photoSize3.location, photoSize4.location, new c10(k50Var, 6));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new lo(23, k50Var, str));
                        break;
                    }
                } else {
                    k50Var.c = photoSize3.location;
                    TLRPC.FileLocation fileLocation5 = photoSize4.location;
                    k50Var.b = fileLocation5;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation5);
                    k50Var.d = forLocal2;
                    c60Var.b.A(forLocal2, ImageLocation.getForLocal(k50Var.c));
                    AndroidUtilities.updateVisibleRows(c60Var.N);
                    break;
                }
            case 3:
                e70 e70Var = (e70) this.r;
                TLRPC.InputFile inputFile7 = this.c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    e70Var.C = inputFile7;
                    e70Var.D = inputFile8;
                    e70Var.E = videoSize3;
                    e70Var.F = this.n;
                    e70Var.G = this.h;
                    if (e70Var.I) {
                        e70Var.getMessagesController().createChat(e70Var.c.getText().toString(), e70Var.H, null, e70Var.M, e70Var.P, e70Var.R, e70Var.Q, e70Var.T, e70Var);
                    }
                    e70Var.Z(false, true);
                    e70Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation6 = this.b.location;
                    e70Var.y = fileLocation6;
                    e70Var.B = this.f.location;
                    e70Var.d.h(ImageLocation.getForLocal(fileLocation6), "50_50", e70Var.r, null);
                    e70Var.Z(true, false);
                    break;
                }
            case 4:
                ProfileActivity.d0((ProfileActivity) this.r, this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
            case 5:
                o81.d0((o81) this.r, this.c, this.d, this.e, this.h, this.n, this.b, this.f);
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

    public /* synthetic */ cd(po poVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 1;
        this.r = poVar;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f = photoSize2;
        this.h = d;
        this.n = str;
    }

    public /* synthetic */ cd(org.telegram.ui.Components.v40 v40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = v40Var;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.b = photoSize;
        this.f = photoSize2;
    }

    public /* synthetic */ cd(sh.n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
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
