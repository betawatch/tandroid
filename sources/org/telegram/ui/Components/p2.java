package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p2(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((o2) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                gi.g gVar = ((sc) this.b).f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((sl) this.b).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 3:
                org.telegram.messenger.hp.s1(((vr) this.b).Q).x3(null, (TLRPC.User) obj, null, 0, null, false, false);
                break;
            case 4:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((xs) this.b).G(((Integer) obj).intValue());
                break;
            case 6:
                da0 da0Var = (da0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = da0Var.e.a;
                j90 j90Var = da0Var.f;
                if (((aa0) arrayList.get(j90Var.getCurrentPosition())).a != num.intValue()) {
                    int i3 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if (((aa0) arrayList.get(i10)).a == num.intValue()) {
                                i3 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (j90Var.getCurrentPosition() != i3) {
                        j90Var.D(i3);
                        break;
                    }
                }
                break;
            case 7:
                x90 x90Var = (x90) this.b;
                x90Var.n.y(x90Var.f.T((View) obj));
                break;
            case 8:
                zb0 zb0Var = (zb0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = zb0Var.h;
                if (zb0Var.getContext() != null) {
                    boolean z10 = zb0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - org.telegram.messenger.g0.n;
                    if (org.telegram.messenger.az.r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((zb0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        xq xqVar = xq.h;
                        duration.setInterpolator(xqVar).start();
                        zb0Var.N.animate().alpha(intValue > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(xqVar);
                        break;
                    }
                }
                break;
            case 9:
                vc0 vc0Var = (vc0) this.b;
                vc0Var.C1.a(vc0Var.F1, true, 0, ((Long) obj).longValue());
                vc0Var.dismiss();
                break;
            case 10:
                org.telegram.messenger.n10 n10Var = (org.telegram.messenger.n10) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? -0.04f : -0.07f);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.k6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                n10Var.a(l10, l11);
                break;
            case 11:
                iw0 iw0Var = (iw0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i11 = iw0Var.a;
                TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(i11).b2(org.telegram.messenger.h10.i(i11).e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                    org.telegram.messenger.qr.a0(i11).j2(b22, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new ai.r6(iw0Var, b22, tL_birthday2, 19), 1024);
                org.telegram.messenger.hp.s1(i11).m2();
                org.telegram.messenger.hp.s1(i11).k4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.hs.f(i11).k(org.telegram.messenger.hs.s1, new Object[0]);
                break;
            default:
                l41 l41Var = (l41) this.b;
                l41Var.g3.R(l41Var.T((View) obj), l41Var.k3);
                break;
        }
    }
}
