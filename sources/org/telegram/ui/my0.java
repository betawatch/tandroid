package org.telegram.ui;

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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class my0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ my0(boolean z4, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = z4;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        org.telegram.ui.Components.kv0 kv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.qc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z4 = this.b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.qc.l(null, profileActivity, z4).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.qc.l(DialogObject.getShortName(profileActivity.b1), profileActivity, z4).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.qc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.U1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                qh.ca caVar = (qh.ca) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = caVar.c;
                if (obj != null && caVar.m2 == null && !caVar.T && caVar.J()) {
                    int i11 = 0;
                    if (!this.b) {
                        caVar.i0(false, true);
                        caVar.N0.a(caVar.L1);
                        qh.r5 r5Var = caVar.L0;
                        boolean z10 = caVar.L1 == 1;
                        r5Var.k0 = -1.0f;
                        r5Var.l0 = z10;
                        r5Var.invalidate();
                        caVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof qh.s6) {
                                qh.s6 s6Var = (qh.s6) obj;
                                if (s6Var.L == null && !s6Var.v()) {
                                    caVar.b1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i10).getStoriesController().w.c(s6Var);
                                    break;
                                } else {
                                    s6Var.J0 = caVar.s0;
                                    s6Var.K0 = caVar.t0;
                                    caVar.L1 = s6Var.K ? 1 : 0;
                                    s6Var.M0 = bitmap;
                                    caVar.I1 = false;
                                    caVar.x0.n(s6Var);
                                    caVar.H1 = s6Var;
                                    if (z11) {
                                        qh.f8.a(i10, s6Var);
                                    }
                                    caVar.K(1, true);
                                }
                            }
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            caVar.L1 = i11;
                            qh.s6 l10 = qh.s6.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = caVar.s0;
                            l10.K0 = caVar.t0;
                            l10.A();
                            caVar.I1 = true;
                            if (caVar.x0.j()) {
                                caVar.D1 = null;
                                l10.P = 1.0f;
                                if (caVar.x0.l(l10)) {
                                    caVar.H1 = qh.s6.a(caVar.x0.getLayout(), caVar.x0.getContent());
                                }
                                caVar.m0(true);
                            } else {
                                l10.B();
                                caVar.H1 = l10;
                                if (z11) {
                                    qh.f8.a(i10, l10);
                                }
                                caVar.K(1, true);
                            }
                        }
                    } else if (caVar.H1 != null) {
                        caVar.u();
                        caVar.H1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            qh.f9 f9Var = caVar.s1;
                            f9Var.d0(f9Var.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            qh.f9 f9Var2 = caVar.s1;
                            TLObject tLObject = (TLObject) obj;
                            f9Var2.i2 = true;
                            qh.w4 w4Var = f9Var2.O0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f10 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(f9Var2.O1, w4Var.getMeasuredWidth()) * 0.5d);
                                kv0Var = new org.telegram.ui.Components.kv0(floor, floor / f10);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(f9Var2.P1, w4Var.getMeasuredHeight()) * 0.5d);
                                kv0Var = new org.telegram.ui.Components.kv0(f10 * floor2, floor2);
                            }
                            eg.t2 t2Var = new eg.t2(f9Var2.getContext(), f9Var2.e0(), kv0Var, tLObject);
                            t2Var.setDelegate(f9Var2);
                            w4Var.addView(t2Var);
                            f9Var2.g0();
                            f9Var2.d0(t2Var);
                        }
                        caVar.f(false);
                    }
                    qh.c9 c9Var = caVar.J0;
                    if (c9Var != null) {
                        caVar.i2 = c9Var.e.e0();
                        caVar.j2 = caVar.J0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            default:
                th.i0.m((th.i0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
