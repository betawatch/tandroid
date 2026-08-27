package lh;

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
import org.telegram.ui.Components.tu0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ ia(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        tu0 tu0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                sb sbVar = (sb) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = sbVar.c;
                if (obj != null && sbVar.l2 == null && !sbVar.S && sbVar.J()) {
                    int i11 = 0;
                    if (!this.b) {
                        sbVar.i0(false, true);
                        sbVar.M0.a(sbVar.K1);
                        y6 y6Var = sbVar.K0;
                        boolean z10 = sbVar.K1 == 1;
                        y6Var.j0 = -1.0f;
                        y6Var.k0 = z10;
                        y6Var.invalidate();
                        sbVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof z7) {
                                z7 z7Var = (z7) obj;
                                if (z7Var.L == null && !z7Var.v()) {
                                    sbVar.a1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i10).getStoriesController().w.c(z7Var);
                                    break;
                                } else {
                                    z7Var.J0 = sbVar.r0;
                                    z7Var.K0 = sbVar.s0;
                                    sbVar.K1 = z7Var.K ? 1 : 0;
                                    z7Var.M0 = bitmap;
                                    sbVar.H1 = false;
                                    sbVar.w0.n(z7Var);
                                    sbVar.G1 = z7Var;
                                    if (z11) {
                                        r9.a(i10, z7Var);
                                    }
                                    sbVar.K(1, true);
                                }
                            }
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            sbVar.K1 = i11;
                            z7 l10 = z7.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = sbVar.r0;
                            l10.K0 = sbVar.s0;
                            l10.A();
                            sbVar.H1 = true;
                            if (sbVar.w0.j()) {
                                sbVar.C1 = null;
                                l10.P = 1.0f;
                                if (sbVar.w0.l(l10)) {
                                    sbVar.G1 = z7.a(sbVar.w0.getLayout(), sbVar.w0.getContent());
                                }
                                sbVar.m0(true);
                            } else {
                                l10.B();
                                sbVar.G1 = l10;
                                if (z11) {
                                    r9.a(i10, l10);
                                }
                                sbVar.K(1, true);
                            }
                        }
                    } else if (sbVar.G1 != null) {
                        sbVar.u();
                        sbVar.G1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            va vaVar = sbVar.r1;
                            vaVar.d0(vaVar.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            va vaVar2 = sbVar.r1;
                            TLObject tLObject = (TLObject) obj;
                            vaVar2.h2 = true;
                            z5 z5Var = vaVar2.N0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f10 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(vaVar2.N1, z5Var.getMeasuredWidth()) * 0.5d);
                                tu0Var = new tu0(floor, floor / f10);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(vaVar2.O1, z5Var.getMeasuredHeight()) * 0.5d);
                                tu0Var = new tu0(f10 * floor2, floor2);
                            }
                            zf.x1 x1Var = new zf.x1(vaVar2.getContext(), vaVar2.e0(), tu0Var, tLObject);
                            x1Var.setDelegate(vaVar2);
                            z5Var.addView(x1Var);
                            vaVar2.g0();
                            vaVar2.d0(x1Var);
                        }
                        sbVar.f(false);
                    }
                    sa saVar = sbVar.I0;
                    if (saVar != null) {
                        sbVar.h2 = saVar.e.e0();
                        sbVar.i2 = sbVar.I0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                oh.j0.m((oh.j0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.mc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.mc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.mc.l(DialogObject.getShortName(profileActivity.a1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.mc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.T1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
