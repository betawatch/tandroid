package kh;

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
import org.telegram.ui.Components.qu0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class la implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ la(boolean z10, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.a = i9;
        this.c = notificationCenterDelegate;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        qu0 qu0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                wb wbVar = (wb) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i9 = wbVar.c;
                if (obj != null && wbVar.l2 == null && !wbVar.S && wbVar.J()) {
                    int i10 = 0;
                    if (!this.b) {
                        wbVar.i0(false, true);
                        wbVar.M0.a(wbVar.K1);
                        z6 z6Var = wbVar.K0;
                        boolean z10 = wbVar.K1 == 1;
                        z6Var.j0 = -1.0f;
                        z6Var.k0 = z10;
                        z6Var.invalidate();
                        wbVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof a8) {
                                a8 a8Var = (a8) obj;
                                if (a8Var.L == null && !a8Var.v()) {
                                    wbVar.a1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i9).getStoriesController().w.c(a8Var);
                                    break;
                                } else {
                                    a8Var.J0 = wbVar.r0;
                                    a8Var.K0 = wbVar.s0;
                                    wbVar.K1 = a8Var.K ? 1 : 0;
                                    a8Var.M0 = bitmap;
                                    wbVar.H1 = false;
                                    wbVar.w0.n(a8Var);
                                    wbVar.G1 = a8Var;
                                    if (z11) {
                                        u9.a(i9, a8Var);
                                    }
                                    wbVar.K(1, true);
                                }
                            }
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i10 = 1;
                            }
                            wbVar.K1 = i10;
                            a8 l10 = a8.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = wbVar.r0;
                            l10.K0 = wbVar.s0;
                            l10.A();
                            wbVar.H1 = true;
                            if (wbVar.w0.j()) {
                                wbVar.C1 = null;
                                l10.P = 1.0f;
                                if (wbVar.w0.l(l10)) {
                                    wbVar.G1 = a8.a(wbVar.w0.getLayout(), wbVar.w0.getContent());
                                }
                                wbVar.m0(true);
                            } else {
                                l10.B();
                                wbVar.G1 = l10;
                                if (z11) {
                                    u9.a(i9, l10);
                                }
                                wbVar.K(1, true);
                            }
                        }
                    } else if (wbVar.G1 != null) {
                        wbVar.u();
                        wbVar.G1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ya yaVar = wbVar.r1;
                            yaVar.d0(yaVar.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            ya yaVar2 = wbVar.r1;
                            TLObject tLObject = (TLObject) obj;
                            yaVar2.h2 = true;
                            a6 a6Var = yaVar2.N0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f10 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(yaVar2.N1, a6Var.getMeasuredWidth()) * 0.5d);
                                qu0Var = new qu0(floor, floor / f10);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(yaVar2.O1, a6Var.getMeasuredHeight()) * 0.5d);
                                qu0Var = new qu0(f10 * floor2, floor2);
                            }
                            yf.x1 x1Var = new yf.x1(yaVar2.getContext(), yaVar2.e0(), qu0Var, tLObject);
                            x1Var.setDelegate(yaVar2);
                            a6Var.addView(x1Var);
                            yaVar2.g0();
                            yaVar2.d0(x1Var);
                        }
                        wbVar.f(false);
                    }
                    va vaVar = wbVar.I0;
                    if (vaVar != null) {
                        wbVar.h2 = vaVar.e.e0();
                        wbVar.i2 = wbVar.I0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                nh.j0.m((nh.j0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.oc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z12 = this.b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.oc.l(null, profileActivity, z12).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.oc.l(DialogObject.getShortName(profileActivity.a1), profileActivity, z12).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.oc.b0(tL_error);
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
