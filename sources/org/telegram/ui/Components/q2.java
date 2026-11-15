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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((a2) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                hi.g gVar = ((pc) this.b).f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ((hi.g7) this.b).a((ai.h) obj);
                break;
            case 3:
                ((ji.p) this.b).setEditMenuProgress(((Float) obj).floatValue());
                break;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((am) this.b).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 5:
                org.telegram.messenger.np.s1(((bs) this.b).Q).x3(null, (TLRPC.User) obj, null, 0, null, false, false);
                break;
            case 6:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ((ft) this.b).H(((Integer) obj).intValue());
                break;
            case 8:
                ka0 ka0Var = (ka0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = ka0Var.e.a;
                q90 q90Var = ka0Var.f;
                if (((ha0) arrayList.get(q90Var.getCurrentPosition())).a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if (((ha0) arrayList.get(i10)).a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (q90Var.getCurrentPosition() != i7) {
                        q90Var.C(i7);
                        break;
                    }
                }
                break;
            case 9:
                ea0 ea0Var = (ea0) this.b;
                ea0Var.n.y(ea0Var.f.T((View) obj));
                break;
            case 10:
                fc0 fc0Var = (fc0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = fc0Var.h;
                if (fc0Var.getContext() != null) {
                    boolean z10 = fc0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - org.telegram.messenger.g0.n;
                    if (org.telegram.messenger.gz.r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((fc0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        er erVar = er.h;
                        duration.setInterpolator(erVar).start();
                        fc0Var.N.animate().alpha(intValue > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar);
                        break;
                    }
                }
                break;
            case 11:
                bd0 bd0Var = (bd0) this.b;
                bd0Var.F1.a(bd0Var.I1, true, 0, ((Long) obj).longValue());
                bd0Var.dismiss();
                break;
            case 12:
                org.telegram.messenger.s10 s10Var = (org.telegram.messenger.s10) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.04f : -0.07f);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.j6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                s10Var.a(l10, l11);
                break;
            case 13:
                mw0 mw0Var = (mw0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i11 = mw0Var.a;
                TLRPC.UserFull b22 = org.telegram.messenger.np.s1(i11).b2(org.telegram.messenger.m10.i(i11).e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                    org.telegram.messenger.vr.a0(i11).j2(b22, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.j6(mw0Var, b22, tL_birthday2, 19), 1024);
                org.telegram.messenger.np.s1(i11).m2();
                org.telegram.messenger.np.s1(i11).k4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.ns.f(i11).k(org.telegram.messenger.ns.s1, new Object[0]);
                break;
            default:
                u41 u41Var = (u41) this.b;
                u41Var.g3.R(u41Var.T((View) obj), u41Var.k3);
                break;
        }
    }
}
