package nh;

import ih.d4;
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
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.o00;
import org.telegram.ui.o50;
import org.telegram.ui.r60;
import org.telegram.ui.v40;
import org.telegram.ui.w40;
import org.telegram.ui.z71;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final /* synthetic */ d40 r;

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
                    oVar.Z(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    oVar.getMessagesController().changeChatAvatar(oVar.b, null, inputFile, inputFile2, videoSize, this.f, this.e, photoSize.location, this.n.location, null);
                    oVar.Z(false, true);
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
                        c2 c2Var = idVar.q0;
                        if (c2Var != null) {
                            try {
                                c2Var.dismiss();
                                idVar.q0 = null;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                        idVar.f0(false);
                        idVar.n0 = false;
                        idVar.a.performClick();
                    }
                    idVar.d0(false, true);
                    idVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation2 = this.h.location;
                    idVar.x = fileLocation2;
                    idVar.y = this.n.location;
                    idVar.e.h(ImageLocation.getForLocal(fileLocation2), "50_50", idVar.s, null);
                    idVar.d0(true, false);
                    break;
                }
            case 2:
                ho hoVar = (ho) this.r;
                TLRPC.PhotoSize photoSize2 = this.h;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                hoVar.r0 = fileLocation3;
                TLRPC.InputFile inputFile5 = this.b;
                TLRPC.InputFile inputFile6 = this.c;
                TLRPC.VideoSize videoSize2 = this.d;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    long j10 = hoVar.y0;
                    TLRPC.PhotoSize photoSize3 = this.n;
                    double d = this.f;
                    long j11 = 0;
                    if (j10 != 0) {
                        TLRPC.User user = hoVar.z0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = hoVar.z0.photo;
                            if (inputFile5 != null) {
                                j11 = inputFile5.id;
                            } else if (inputFile6 != null) {
                                j11 = inputFile6.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize3.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            hoVar.getMessagesController().putUser(hoVar.z0, true);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile5 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile5;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile6 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile6;
                            int i9 = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d;
                            tL_photos_uploadProfilePhoto.flags = i9 | 6;
                        }
                        if (videoSize2 != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = hoVar.getMessagesController().getInputUser(hoVar.z0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        hoVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new zn(hoVar, 1));
                        z11 = false;
                    } else {
                        MessagesController messagesController = hoVar.getMessagesController();
                        long j12 = hoVar.s0;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        TLRPC.FileLocation fileLocation5 = photoSize3.location;
                        z11 = false;
                        messagesController.changeChatAvatar(j12, null, inputFile5, inputFile6, videoSize2, d, this.e, fileLocation4, fileLocation5, null);
                    }
                    if (hoVar.I0) {
                        try {
                            c2 c2Var2 = hoVar.b;
                            if (c2Var2 != null && c2Var2.isShowing()) {
                                hoVar.b.dismiss();
                                hoVar.b = null;
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        hoVar.J0 = z11;
                        hoVar.a.performClick();
                    }
                    hoVar.m0(z11, true);
                    break;
                } else {
                    d4 d4Var = hoVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation3);
                    z8 z8Var = hoVar.r;
                    Object obj = hoVar.z0;
                    if (obj == null) {
                        obj = hoVar.t0;
                    }
                    d4Var.h(forLocal, "50_50", z8Var, obj);
                    hoVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (hoVar.N0 == null) {
                        hoVar.N0 = new mi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    hoVar.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    hoVar.X.e.setAnimation(hoVar.N0);
                    hoVar.m0(true, false);
                    break;
                }
                break;
            case 3:
                w40 w40Var = (w40) this.r;
                long j13 = w40Var.e;
                o50 o50Var = w40Var.f;
                AccountInstance accountInstance = o50Var.d;
                TLRPC.InputFile inputFile7 = this.b;
                TLRPC.InputFile inputFile8 = this.c;
                TLRPC.VideoSize videoSize3 = this.d;
                TLRPC.PhotoSize photoSize4 = this.h;
                TLRPC.PhotoSize photoSize5 = this.n;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    double d9 = this.f;
                    String str = this.e;
                    if (j13 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile7, inputFile8, videoSize3, d9, str, photoSize4.location, photoSize5.location, new o00(w40Var, 6));
                        break;
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile7 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile7;
                            tL_photos_uploadProfilePhoto2.flags |= 1;
                        }
                        if (inputFile8 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile8;
                            int i10 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d9;
                            tL_photos_uploadProfilePhoto2.flags = i10 | 6;
                        }
                        if (videoSize3 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize3;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new v40(0, w40Var, str));
                        break;
                    }
                } else {
                    w40Var.c = photoSize4.location;
                    TLRPC.FileLocation fileLocation6 = photoSize5.location;
                    w40Var.b = fileLocation6;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation6);
                    w40Var.d = forLocal2;
                    o50Var.b.A(forLocal2, ImageLocation.getForLocal(w40Var.c));
                    AndroidUtilities.updateVisibleRows(o50Var.M);
                    break;
                }
            case 4:
                r60 r60Var = (r60) this.r;
                TLRPC.InputFile inputFile9 = this.b;
                TLRPC.InputFile inputFile10 = this.c;
                TLRPC.VideoSize videoSize4 = this.d;
                if (inputFile9 != null || inputFile10 != null || videoSize4 != null) {
                    r60Var.B = inputFile9;
                    r60Var.C = inputFile10;
                    r60Var.D = videoSize4;
                    r60Var.E = this.e;
                    r60Var.F = this.f;
                    if (r60Var.H) {
                        r60Var.getMessagesController().createChat(r60Var.c.getText().toString(), r60Var.G, null, r60Var.L, r60Var.O, r60Var.Q, r60Var.P, r60Var.S, r60Var);
                    }
                    r60Var.Y(false, true);
                    r60Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation7 = this.h.location;
                    r60Var.y = fileLocation7;
                    r60Var.A = this.n.location;
                    r60Var.d.h(ImageLocation.getForLocal(fileLocation7), "50_50", r60Var.r, null);
                    r60Var.Y(true, false);
                    break;
                }
            case 5:
                ProfileActivity.c0((ProfileActivity) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
            default:
                z71.c0((z71) this.r, this.b, this.c, this.d, this.f, this.e, this.h, this.n);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i9) {
        this.a = i9;
        this.r = (d40) o2Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.e = str;
        this.f = d;
        this.h = photoSize;
        this.n = photoSize2;
    }

    public /* synthetic */ k(ho hoVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 2;
        this.r = hoVar;
        this.h = photoSize;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.n = photoSize2;
        this.f = d;
        this.e = str;
    }

    public /* synthetic */ k(d40 d40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i9) {
        this.a = i9;
        this.r = d40Var;
        this.b = inputFile;
        this.c = inputFile2;
        this.d = videoSize;
        this.f = d;
        this.e = str;
        this.h = photoSize;
        this.n = photoSize2;
    }
}
