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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ii) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                hi.h hVar = ((yc) this.b).f;
                hVar.setText(charSequence);
                hVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ((ji.q) this.b).setEditMenuProgress(((Float) obj).floatValue());
                break;
            case 3:
                ((hi.c7) this.b).a((ai.c) obj);
                break;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((hm) this.b).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 5:
                org.telegram.messenger.mp.u1(((hs) this.b).Q).E3(null, (TLRPC.User) obj, null, 0, null, false, false);
                break;
            case 6:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ((mt) this.b).H(((Integer) obj).intValue());
                break;
            case 8:
                ta0 ta0Var = (ta0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = ta0Var.e.a;
                z90 z90Var = ta0Var.f;
                if (((qa0) arrayList.get(z90Var.getCurrentPosition())).a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if (((qa0) arrayList.get(i10)).a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (z90Var.getCurrentPosition() != i7) {
                        z90Var.C(i7);
                        break;
                    }
                }
                break;
            case 9:
                na0 na0Var = (na0) this.b;
                na0Var.n.y(na0Var.f.T((View) obj));
                break;
            case 10:
                oc0 oc0Var = (oc0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = oc0Var.h;
                if (oc0Var.getContext() != null) {
                    boolean z10 = oc0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - org.telegram.messenger.g0.n;
                    if (org.telegram.messenger.bz.r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((oc0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        kr krVar = kr.h;
                        duration.setInterpolator(krVar).start();
                        oc0Var.N.animate().alpha(intValue > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(krVar);
                        break;
                    }
                }
                break;
            case 11:
                kd0 kd0Var = (kd0) this.b;
                kd0Var.F1.a(kd0Var.I1, true, 0, ((Long) obj).longValue());
                kd0Var.dismiss();
                break;
            case 12:
                org.telegram.messenger.p10 p10Var = (org.telegram.messenger.p10) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.n6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.n6.I.q() ? -0.04f : -0.07f);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.n6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.n6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                p10Var.a(l10, l11);
                break;
            case 13:
                uw0 uw0Var = (uw0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i11 = uw0Var.a;
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i11).d2(org.telegram.messenger.i10.i(i11).e());
                TL_account.TL_birthday tL_birthday2 = d2 != null ? d2.birthday : null;
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday;
                    org.telegram.messenger.tr.a0(i11).j2(d2, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.q1(uw0Var, d2, tL_birthday2, 21), 1024);
                org.telegram.messenger.mp.u1(i11).o2();
                org.telegram.messenger.mp.u1(i11).s4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.ks.f(i11).k(org.telegram.messenger.ks.s1, new Object[0]);
                break;
            default:
                g51 g51Var = (g51) this.b;
                g51Var.g3.R(g51Var.T((View) obj), g51Var.k3);
                break;
        }
    }
}
