package ii;

import di.k4;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e50;
import org.telegram.ui.f81;
import org.telegram.ui.go;
import org.telegram.ui.l10;
import org.telegram.ui.nd;
import org.telegram.ui.oo;
import org.telegram.ui.r00;
import org.telegram.ui.x50;
import org.telegram.ui.z60;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final /* synthetic */ f50 r;

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
                    oVar.b0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.c, null, inputFile, inputFile2, videoSize, this.f, this.e, photoSize.location, this.n.location, null);
                    oVar.b0(false, true);
                }
                oVar.e.g3.O(z10);
                break;
            case 1:
                nd ndVar = (nd) this.r;
                TLRPC.InputFile inputFile3 = this.b;
                TLRPC.InputFile inputFile4 = this.c;
                if (inputFile3 != null || inputFile4 != null) {
                    ndVar.m0 = inputFile3;
                    ndVar.n0 = inputFile4;
                    ndVar.o0 = this.d;
                    ndVar.p0 = this.e;
                    ndVar.q0 = this.f;
                    if (ndVar.r0) {
                        e2 e2Var = ndVar.v0;
                        if (e2Var != null) {
                            try {
                                e2Var.dismiss();
                                ndVar.v0 = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        ndVar.i0(false);
                        ndVar.s0 = false;
                        ndVar.a.performClick();
                    }
                    ndVar.g0(false, true);
                    ndVar.n.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    ndVar.y = fileLocation2;
                    ndVar.E = this.n.location;
                    ndVar.f.h(ImageLocation.getForLocal(fileLocation2), "50_50", ndVar.v, null);
                    ndVar.g0(true, false);
                    break;
                }
            case 2:
                oo ooVar = (oo) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                ooVar.u0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j10 = ooVar.B0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    long j11 = 0;
                    double d = this.f;
                    if (j10 != 0) {
                        TLRPC.User user = ooVar.C0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = ooVar.C0.photo;
                            if (inputFile5 != null) {
                                j11 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j11 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            ooVar.getMessagesController().putUser(ooVar.C0, true);
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
                        tL_photos_uploadProfilePhoto.bot = ooVar.getMessagesController().getInputUser(ooVar.C0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        ooVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new go(ooVar, 1));
                        z11 = false;
                    } else {
                        z11 = false;
                        ooVar.getMessagesController().changeChatAvatar(ooVar.v0, null, inputFile5, inputFile6, videoSize2, d, this.e, photoSize2.location, photoSize3.location, null);
                    }
                    if (ooVar.L0) {
                        try {
                            e2 e2Var2 = ooVar.b;
                            if (e2Var2 != null && e2Var2.isShowing()) {
                                ooVar.b.dismiss();
                                ooVar.b = null;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        ooVar.M0 = z11;
                        ooVar.a.performClick();
                    }
                    ooVar.o0(z11, true);
                    break;
                } else {
                    k4 k4Var = ooVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    j9 j9Var = ooVar.r;
                    Object obj = ooVar.C0;
                    if (obj == null) {
                        obj = ooVar.w0;
                    }
                    k4Var.h(forLocal, "50_50", j9Var, obj);
                    ooVar.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (ooVar.Q0 == null) {
                        ooVar.Q0 = new yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    ooVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    ooVar.b0.e.setAnimation(ooVar.Q0);
                    ooVar.o0(true, false);
                    break;
                }
                break;
            case 3:
                e50 e50Var = (e50) this.r;
                long j12 = e50Var.e;
                x50 x50Var = e50Var.f;
                AccountInstance accountInstance = x50Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d10 = this.f;
                    String str = this.e;
                    if (j12 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j12, null, inputFile7, inputFile8, videoSize3, d10, str, photoSize4.location, photoSize5.location, new r00(e50Var, 6));
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
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new l10(1, e50Var, str));
                        break;
                    }
                } else {
                    e50Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation4 = photoSize5.location;
                    e50Var.b = fileLocation4;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation4);
                    e50Var.d = forLocal2;
                    x50Var.b.A(forLocal2, ImageLocation.getForLocal(e50Var.c));
                    AndroidUtilities.updateVisibleRows(x50Var.Q);
                    break;
                }
            case 4:
                z60 z60Var = (z60) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    z60Var.F = inputFile9;
                    z60Var.G = inputFile10;
                    z60Var.H = videoSize4;
                    z60Var.I = this.e;
                    z60Var.J = this.f;
                    if (z60Var.L) {
                        z60Var.getMessagesController().createChat(z60Var.c.getText().toString(), z60Var.K, null, z60Var.P, z60Var.S, z60Var.U, z60Var.T, z60Var.W, z60Var);
                    }
                    z60Var.a0(false, true);
                    z60Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = this.h.location;
                    z60Var.y = fileLocation5;
                    z60Var.E = this.n.location;
                    z60Var.d.h(ImageLocation.getForLocal(fileLocation5), "50_50", z60Var.r, null);
                    z60Var.a0(true, false);
                    break;
                }
            case 5:
                ProfileActivity.l0((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                f81.e0((f81) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(r2 r2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (f50) r2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(oo ooVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = ooVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ k(f50 f50Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = f50Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
