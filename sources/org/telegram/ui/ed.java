package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public final /* synthetic */ org.telegram.ui.Components.a40 r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ed(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (org.telegram.ui.Components.a40) k2Var;
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
        int i10 = this.a;
        double d = this.h;
        String str = this.n;
        TLRPC.VideoSize videoSize = this.e;
        TLRPC.InputFile inputFile = this.d;
        TLRPC.InputFile inputFile2 = this.c;
        TLRPC.PhotoSize photoSize = this.f;
        TLRPC.PhotoSize photoSize2 = this.b;
        int i11 = 1;
        org.telegram.ui.Components.a40 a40Var = this.r;
        switch (i10) {
            case 0:
                kd kdVar = (kd) a40Var;
                if (inputFile2 != null || inputFile != null) {
                    kdVar.m0 = inputFile2;
                    kdVar.n0 = inputFile;
                    kdVar.o0 = videoSize;
                    kdVar.p0 = str;
                    kdVar.q0 = d;
                    if (kdVar.r0) {
                        org.telegram.ui.ActionBar.x1 x1Var = kdVar.v0;
                        if (x1Var != null) {
                            try {
                                x1Var.dismiss();
                                kdVar.v0 = null;
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                        }
                        kdVar.m0(false);
                        kdVar.s0 = false;
                        kdVar.a.performClick();
                    }
                    kdVar.k0(false, true);
                    kdVar.n.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation = photoSize2.location;
                    kdVar.D = fileLocation;
                    kdVar.E = photoSize.location;
                    kdVar.f.j(org.telegram.messenger.jc.e(fileLocation), "50_50", kdVar.w, null);
                    kdVar.k0(true, false);
                    break;
                }
            case 1:
                oo ooVar = (oo) a40Var;
                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                ooVar.u0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                if (inputFile3 != null || inputFile4 != null || videoSize2 != null) {
                    long j10 = ooVar.B0;
                    double d10 = this.h;
                    if (j10 != 0) {
                        TLRPC.User user = ooVar.C0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = ooVar.C0.photo;
                            userProfilePhoto.photo_id = inputFile3 != null ? inputFile3.id : inputFile4 != null ? inputFile4.id : 0L;
                            userProfilePhoto.photo_big = photoSize.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            ooVar.getMessagesController().U3(ooVar.C0, true, false);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile3 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile3;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile4 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile4;
                            int i12 = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d10;
                            tL_photos_uploadProfilePhoto.flags = i12 | 6;
                        }
                        if (videoSize2 != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = ooVar.getMessagesController().p1(ooVar.C0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        ooVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new fo(ooVar, i11));
                    } else {
                        ooVar.getMessagesController().B(ooVar.v0, null, inputFile3, inputFile4, videoSize2, d10, this.n, photoSize2.location, photoSize.location, null);
                    }
                    if (ooVar.M0) {
                        try {
                            org.telegram.ui.ActionBar.x1 x1Var2 = ooVar.b;
                            if (x1Var2 != null && x1Var2.isShowing()) {
                                ooVar.b.dismiss();
                                ooVar.b = null;
                            }
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        ooVar.N0 = false;
                        ooVar.a.performClick();
                    }
                    ooVar.s0(false, true);
                    break;
                } else {
                    ag.d2 d2Var = ooVar.e;
                    org.telegram.messenger.jc e10 = org.telegram.messenger.jc.e(fileLocation2);
                    org.telegram.ui.Components.r8 r8Var = ooVar.r;
                    Object obj = ooVar.C0;
                    if (obj == null) {
                        obj = ooVar.w0;
                    }
                    d2Var.j(e10, "50_50", r8Var, obj);
                    ooVar.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.dd.L0(2131752213, "ChatSetNewPhoto"), true);
                    if (ooVar.R0 == null) {
                        ooVar.R0 = new org.telegram.ui.Components.ci0(R.raw.camera_outline, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                    }
                    ooVar.b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                    ooVar.b0.e.setAnimation(ooVar.R0);
                    ooVar.s0(true, false);
                    break;
                }
                break;
            case 2:
                i40 i40Var = (i40) a40Var;
                long j11 = i40Var.e;
                a50 a50Var = i40Var.f;
                org.telegram.messenger.c cVar = a50Var.k1;
                TLRPC.InputFile inputFile5 = this.c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile5 != null || inputFile6 != null || videoSize3 != null) {
                    double d11 = this.h;
                    String str2 = this.n;
                    if (j11 <= 0) {
                        org.telegram.messenger.wp.r1(cVar.a).B(-j11, null, inputFile5, inputFile6, videoSize3, d11, str2, photoSize2.location, photoSize.location, new yy(i40Var, 7));
                        break;
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile5 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile5;
                            tL_photos_uploadProfilePhoto2.flags |= 1;
                        }
                        if (inputFile6 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile6;
                            int i13 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d11;
                            tL_photos_uploadProfilePhoto2.flags = i13 | 6;
                        }
                        if (videoSize3 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize3;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        ConnectionsManager.getInstance(cVar.a).sendRequest(tL_photos_uploadProfilePhoto2, new org.telegram.ui.Components.t20(13, i40Var, str2));
                        break;
                    }
                } else {
                    i40Var.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    i40Var.b = fileLocation3;
                    org.telegram.messenger.jc e11 = org.telegram.messenger.jc.e(fileLocation3);
                    i40Var.d = e11;
                    a50Var.i1.A(e11, org.telegram.messenger.jc.e(i40Var.c));
                    org.telegram.messenger.i0.a4(a50Var.H1);
                    break;
                }
            case 3:
                b60 b60Var = (b60) a40Var;
                if (inputFile2 != null || inputFile != null || videoSize != null) {
                    b60Var.F = inputFile2;
                    b60Var.G = inputFile;
                    b60Var.H = videoSize;
                    b60Var.I = str;
                    b60Var.J = d;
                    if (b60Var.L) {
                        b60Var.getMessagesController().U(b60Var.c.getText().toString(), b60Var.K, null, b60Var.P, b60Var.S, b60Var.U, b60Var.T, b60Var.W, b60Var);
                    }
                    b60Var.e0(false, true);
                    b60Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    b60Var.D = fileLocation4;
                    b60Var.E = photoSize.location;
                    b60Var.d.j(org.telegram.messenger.jc.e(fileLocation4), "50_50", b60Var.r, null);
                    b60Var.e0(true, false);
                    break;
                }
            case 4:
                ProfileActivity.j0((ProfileActivity) a40Var, this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
            case 5:
                c51.e0((c51) a40Var, this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
            default:
                yh.l lVar = (yh.l) a40Var;
                TLRPC.FileLocation fileLocation5 = photoSize2.location;
                lVar.G = fileLocation5;
                TLRPC.InputFile inputFile7 = this.c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    lVar.x.j(org.telegram.messenger.jc.e(fileLocation5), "50_50", lVar.E, lVar.I);
                    lVar.f0(true, false);
                } else {
                    lVar.getMessagesController().B(lVar.c, null, inputFile7, inputFile8, videoSize4, this.h, this.n, photoSize2.location, photoSize.location, null);
                    lVar.f0(false, true);
                }
                lVar.e.f3.O(true);
                break;
        }
    }

    public /* synthetic */ ed(oo ooVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 1;
        this.r = ooVar;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f = photoSize2;
        this.h = d;
        this.n = str;
    }

    public /* synthetic */ ed(org.telegram.ui.Components.a40 a40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = a40Var;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.b = photoSize;
        this.f = photoSize2;
    }

    public /* synthetic */ ed(yh.l lVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = 6;
        this.r = lVar;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.f = photoSize2;
    }
}
