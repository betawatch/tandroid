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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((r2) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                fi.g gVar = ((uc) this.b).f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((tl) this.b).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 3:
                org.telegram.messenger.qp.s1(((vr) this.b).P).x3(null, (TLRPC.User) obj, null, 0, null, false, false);
                break;
            case 4:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((zs) this.b).G(((Integer) obj).intValue());
                break;
            case 6:
                ja0 ja0Var = (ja0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = ja0Var.e.a;
                o90 o90Var = ja0Var.f;
                if (((ga0) arrayList.get(o90Var.getCurrentPosition())).a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if (((ga0) arrayList.get(i10)).a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (o90Var.getCurrentPosition() != i7) {
                        o90Var.E(i7);
                        break;
                    }
                }
                break;
            case 7:
                da0 da0Var = (da0) this.b;
                da0Var.n.y(da0Var.f.T((View) obj));
                break;
            case 8:
                fc0 fc0Var = (fc0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = fc0Var.h;
                if (fc0Var.getContext() != null) {
                    boolean z9 = fc0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - org.telegram.messenger.g0.n;
                    if (org.telegram.messenger.iz.r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((fc0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z9 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        xq xqVar = xq.h;
                        duration.setInterpolator(xqVar).start();
                        fc0Var.M.animate().alpha(intValue > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(xqVar);
                        break;
                    }
                }
                break;
            case 9:
                bd0 bd0Var = (bd0) this.b;
                bd0Var.B1.a(bd0Var.E1, true, 0, ((Long) obj).longValue());
                bd0Var.dismiss();
                break;
            case 10:
                org.telegram.messenger.v10 v10Var = (org.telegram.messenger.v10) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.l6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.l6.I.q() ? -0.04f : -0.07f);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.l6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.l6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.l6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                v10Var.a(l10, l11);
                break;
            case 11:
                kw0 kw0Var = (kw0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i11 = kw0Var.a;
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(i11).b2(org.telegram.messenger.p10.i(i11).e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                    org.telegram.messenger.yr.a0(i11).j2(b22, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.f2(kw0Var, b22, tL_birthday2, 18), 1024);
                org.telegram.messenger.qp.s1(i11).m2();
                org.telegram.messenger.qp.s1(i11).k4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.qs.f(i11).k(org.telegram.messenger.qs.s1, new Object[0]);
                break;
            default:
                r41 r41Var = (r41) this.b;
                r41Var.f3.R(r41Var.T((View) obj), r41Var.j3);
                break;
        }
    }
}
