package nh;

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
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w9 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ w9(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        bv0 bv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                gb gbVar = (gb) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = gbVar.c;
                if (obj != null && gbVar.l2 == null && !gbVar.S && gbVar.J()) {
                    int i11 = 0;
                    if (!this.b) {
                        gbVar.i0(false, true);
                        gbVar.M0.a(gbVar.K1);
                        o6 o6Var = gbVar.K0;
                        boolean z10 = gbVar.K1 == 1;
                        o6Var.j0 = -1.0f;
                        o6Var.k0 = z10;
                        o6Var.invalidate();
                        gbVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof o7) {
                                o7 o7Var = (o7) obj;
                                if (o7Var.L == null && !o7Var.v()) {
                                    gbVar.a1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i10).getStoriesController().w.c(o7Var);
                                    break;
                                } else {
                                    o7Var.J0 = gbVar.r0;
                                    o7Var.K0 = gbVar.s0;
                                    gbVar.K1 = o7Var.K ? 1 : 0;
                                    o7Var.M0 = bitmap;
                                    gbVar.H1 = false;
                                    gbVar.w0.n(o7Var);
                                    gbVar.G1 = o7Var;
                                    if (z11) {
                                        f9.a(i10, o7Var);
                                    }
                                    gbVar.K(1, true);
                                }
                            }
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            gbVar.K1 = i11;
                            o7 l10 = o7.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = gbVar.r0;
                            l10.K0 = gbVar.s0;
                            l10.A();
                            gbVar.H1 = true;
                            if (gbVar.w0.j()) {
                                gbVar.C1 = null;
                                l10.P = 1.0f;
                                if (gbVar.w0.l(l10)) {
                                    gbVar.G1 = o7.a(gbVar.w0.getLayout(), gbVar.w0.getContent());
                                }
                                gbVar.m0(true);
                            } else {
                                l10.B();
                                gbVar.G1 = l10;
                                if (z11) {
                                    f9.a(i10, l10);
                                }
                                gbVar.K(1, true);
                            }
                        }
                    } else if (gbVar.G1 != null) {
                        gbVar.u();
                        gbVar.G1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ja jaVar = gbVar.r1;
                            jaVar.d0(jaVar.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            ja jaVar2 = gbVar.r1;
                            TLObject tLObject = (TLObject) obj;
                            jaVar2.h2 = true;
                            n5 n5Var = jaVar2.N0;
                            float f9 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f9 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(jaVar2.N1, n5Var.getMeasuredWidth()) * 0.5d);
                                bv0Var = new bv0(floor, floor / f9);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(jaVar2.O1, n5Var.getMeasuredHeight()) * 0.5d);
                                bv0Var = new bv0(f9 * floor2, floor2);
                            }
                            bg.y2 y2Var = new bg.y2(jaVar2.getContext(), jaVar2.e0(), bv0Var, tLObject);
                            y2Var.setDelegate(jaVar2);
                            n5Var.addView(y2Var);
                            jaVar2.g0();
                            jaVar2.d0(y2Var);
                        }
                        gbVar.f(false);
                    }
                    ga gaVar = gbVar.I0;
                    if (gaVar != null) {
                        gbVar.h2 = gaVar.e.e0();
                        gbVar.i2 = gbVar.I0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (tc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.b;
                        if (intValue == 1) {
                            tc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            tc.l(DialogObject.getShortName(profileActivity.a1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            tc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.T1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        break;
                    }
                }
                break;
            default:
                qh.i0.m((qh.i0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
