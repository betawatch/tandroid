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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((ag.d3) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                vh.f fVar = ((nc) this.b).f;
                fVar.setText(charSequence);
                fVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bm) this.b).w;
                chatAttachAlertPhotoLayout.s0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 3:
                org.telegram.messenger.vp.r1(((gs) this.b).P).u3(null, (TLRPC.User) obj, null, 0, null, false, false);
                break;
            case 4:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((mt) this.b).G(((Integer) obj).intValue());
                break;
            case 6:
                ab0 ab0Var = (ab0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = ab0Var.e.a;
                fa0 fa0Var = ab0Var.f;
                if (((xa0) arrayList.get(fa0Var.getCurrentPosition())).a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (((xa0) arrayList.get(i11)).a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (fa0Var.getCurrentPosition() != i10) {
                        fa0Var.E(i10);
                        break;
                    }
                }
                break;
            case 7:
                ua0 ua0Var = (ua0) this.b;
                ua0Var.n.y(ua0Var.f.T((View) obj));
                break;
            case 8:
                zc0 zc0Var = (zc0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = zc0Var.h;
                if (zc0Var.getContext() != null) {
                    boolean z10 = zc0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - org.telegram.messenger.i0.n;
                    if (org.telegram.messenger.tz.r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= org.telegram.messenger.i0.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((zc0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        gr grVar = gr.h;
                        duration.setInterpolator(grVar).start();
                        zc0Var.M.animate().alpha(intValue > org.telegram.messenger.i0.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(grVar);
                        break;
                    }
                }
                break;
            case 9:
                vd0 vd0Var = (vd0) this.b;
                vd0Var.B1.a(vd0Var.E1, true, 0, ((Long) obj).longValue());
                vd0Var.dismiss();
                break;
            case 10:
                org.telegram.messenger.j20 j20Var = (org.telegram.messenger.j20) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.i0.i(colorMatrix, org.telegram.ui.ActionBar.t6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.i0.h(colorMatrix, org.telegram.ui.ActionBar.t6.I.q() ? -0.04f : -0.07f);
                Bitmap l4 = org.telegram.messenger.i0.l(bitmap, colorMatrix);
                l4.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.t6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.t6.I.q()) {
                    org.telegram.messenger.i0.h(colorMatrix2, org.telegram.ui.ActionBar.t6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap l10 = org.telegram.messenger.i0.l(bitmap, colorMatrix2);
                l10.setHasAlpha(false);
                bitmap.recycle();
                j20Var.a(l4, l10);
                break;
            case 11:
                nx0 nx0Var = (nx0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i12 = nx0Var.a;
                TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(i12).a2(org.telegram.messenger.d20.i(i12).e());
                TL_account.TL_birthday tL_birthday2 = a2 != null ? a2.birthday : null;
                if (a2 != null) {
                    a2.flags2 |= 32;
                    a2.birthday = tL_birthday;
                    org.telegram.messenger.hs.a0(i12).j2(a2, false);
                }
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new ag.p0(nx0Var, a2, tL_birthday2, 14), 1024);
                org.telegram.messenger.vp.r1(i12).l2();
                org.telegram.messenger.vp.r1(i12).h4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.zs.f(i12).k(org.telegram.messenger.zs.s1, new Object[0]);
                break;
            default:
                u51 u51Var = (u51) this.b;
                u51Var.f3.R(u51Var.T((View) obj), u51Var.j3);
                break;
        }
    }
}
