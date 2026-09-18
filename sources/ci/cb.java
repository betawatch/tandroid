package ci;

import android.graphics.Bitmap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class cb implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ cb(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        vv0 vv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                oc ocVar = (oc) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = ocVar.c;
                if (obj != null && ocVar.p2 == null && !ocVar.W && ocVar.J()) {
                    int i11 = 0;
                    if (!this.b) {
                        ocVar.i0(false, true);
                        ocVar.Q0.a(ocVar.O1);
                        l7 l7Var = ocVar.O0;
                        boolean z10 = ocVar.O1 == 1;
                        l7Var.n0 = -1.0f;
                        l7Var.o0 = z10;
                        l7Var.invalidate();
                        ocVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof o8) {
                                o8 o8Var = (o8) obj;
                                if (o8Var.L == null && !o8Var.v()) {
                                    ocVar.e1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i10).getStoriesController().w.b(o8Var);
                                    break;
                                } else {
                                    o8Var.J0 = ocVar.v0;
                                    o8Var.K0 = ocVar.w0;
                                    ocVar.O1 = o8Var.K ? 1 : 0;
                                    o8Var.M0 = bitmap;
                                    ocVar.L1 = false;
                                    ocVar.A0.n(o8Var);
                                    ocVar.K1 = o8Var;
                                    if (z11) {
                                        ja.a(i10, o8Var);
                                    }
                                    ocVar.K(1, true);
                                }
                            }
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            ocVar.O1 = i11;
                            o8 l4 = o8.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = ocVar.v0;
                            l4.K0 = ocVar.w0;
                            l4.A();
                            ocVar.L1 = true;
                            if (ocVar.A0.j()) {
                                ocVar.G1 = null;
                                l4.P = 1.0f;
                                if (ocVar.A0.l(l4)) {
                                    ocVar.K1 = o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
                                }
                                ocVar.m0(true);
                            } else {
                                l4.B();
                                ocVar.K1 = l4;
                                if (z11) {
                                    ja.a(i10, l4);
                                }
                                ocVar.K(1, true);
                            }
                        }
                    } else if (ocVar.K1 != null) {
                        ocVar.u();
                        ocVar.K1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            qb qbVar = ocVar.v1;
                            qbVar.d0(qbVar.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            qb qbVar2 = ocVar.v1;
                            TLObject tLObject = (TLObject) obj;
                            qbVar2.l2 = true;
                            k6 k6Var = qbVar2.R0;
                            float f7 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f7 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(qbVar2.R1, k6Var.getMeasuredWidth()) * 0.5d);
                                vv0Var = new vv0(floor, floor / f7);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(qbVar2.S1, k6Var.getMeasuredHeight()) * 0.5d);
                                vv0Var = new vv0(f7 * floor2, floor2);
                            }
                            qg.x1 x1Var = new qg.x1(qbVar2.getContext(), qbVar2.e0(), vv0Var, tLObject);
                            x1Var.setDelegate(qbVar2);
                            k6Var.addView(x1Var);
                            qbVar2.g0();
                            qbVar2.d0(x1Var);
                        }
                        ocVar.f(false);
                    }
                    nb nbVar = ocVar.M0;
                    if (nbVar != null) {
                        ocVar.l2 = nbVar.e.e0();
                        ocVar.m2 = ocVar.M0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                fi.k0.m((fi.k0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.xc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.xc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.xc.l(DialogObject.getShortName(profileActivity.e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.xc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.X1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
