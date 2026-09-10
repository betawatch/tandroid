package bi;

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
import org.telegram.ui.Components.tv0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class lc implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ lc(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        tv0 tv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                ce ceVar = (ce) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = ceVar.c;
                if (obj != null && ceVar.p2 == null && !ceVar.W && ceVar.J()) {
                    int i11 = 0;
                    if (!this.b) {
                        ceVar.i0(false, true);
                        ceVar.Q0.a(ceVar.O1);
                        m8 m8Var = ceVar.O0;
                        boolean z10 = ceVar.O1 == 1;
                        m8Var.n0 = -1.0f;
                        m8Var.o0 = z10;
                        m8Var.invalidate();
                        ceVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof r9) {
                                r9 r9Var = (r9) obj;
                                if (r9Var.L == null && !r9Var.v()) {
                                    ceVar.e1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i10).getStoriesController().w.b(r9Var);
                                    break;
                                } else {
                                    r9Var.J0 = ceVar.v0;
                                    r9Var.K0 = ceVar.w0;
                                    ceVar.O1 = r9Var.K ? 1 : 0;
                                    r9Var.M0 = bitmap;
                                    ceVar.L1 = false;
                                    ceVar.A0.n(r9Var);
                                    ceVar.K1 = r9Var;
                                    if (z11) {
                                        sb.a(i10, r9Var);
                                    }
                                    ceVar.K(1, true);
                                }
                            }
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            ceVar.O1 = i11;
                            r9 l4 = r9.l(photoEntry);
                            l4.M0 = bitmap;
                            l4.J0 = ceVar.v0;
                            l4.K0 = ceVar.w0;
                            l4.A();
                            ceVar.L1 = true;
                            if (ceVar.A0.j()) {
                                ceVar.G1 = null;
                                l4.P = 1.0f;
                                if (ceVar.A0.l(l4)) {
                                    ceVar.K1 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
                                }
                                ceVar.m0(true);
                            } else {
                                l4.B();
                                ceVar.K1 = l4;
                                if (z11) {
                                    sb.a(i10, l4);
                                }
                                ceVar.K(1, true);
                            }
                        }
                    } else if (ceVar.K1 != null) {
                        ceVar.u();
                        ceVar.K1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ad adVar = ceVar.v1;
                            adVar.d0(adVar.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            ad adVar2 = ceVar.v1;
                            TLObject tLObject = (TLObject) obj;
                            adVar2.l2 = true;
                            j7 j7Var = adVar2.R0;
                            float f7 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f7 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(adVar2.R1, j7Var.getMeasuredWidth()) * 0.5d);
                                tv0Var = new tv0(floor, floor / f7);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(adVar2.S1, j7Var.getMeasuredHeight()) * 0.5d);
                                tv0Var = new tv0(f7 * floor2, floor2);
                            }
                            pg.x1 x1Var = new pg.x1(adVar2.getContext(), adVar2.e0(), tv0Var, tLObject);
                            x1Var.setDelegate(adVar2);
                            j7Var.addView(x1Var);
                            adVar2.g0();
                            adVar2.d0(x1Var);
                        }
                        ceVar.f(false);
                    }
                    xc xcVar = ceVar.M0;
                    if (xcVar != null) {
                        ceVar.l2 = xcVar.e.e0();
                        ceVar.m2 = ceVar.M0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                ei.k0.m((ei.k0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.wc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.wc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.wc.l(DialogObject.getShortName(profileActivity.e1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.wc.b0(tL_error);
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
