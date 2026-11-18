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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ii) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                hi.g gVar = ((yc) this.b).f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ((hi.t6) this.b).a((ai.g) obj);
                break;
            case 3:
                ((ji.p) this.b).setEditMenuProgress(((Float) obj).floatValue());
                break;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((hm) this.b).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 5:
                org.telegram.messenger.mp.u1(((is) this.b).Q).E3(null, (TLRPC.User) obj, null, 0, null, false, false);
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
                ua0 ua0Var = (ua0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = ua0Var.e.a;
                aa0 aa0Var = ua0Var.f;
                if (((ra0) arrayList.get(aa0Var.getCurrentPosition())).a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if (((ra0) arrayList.get(i10)).a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (aa0Var.getCurrentPosition() != i7) {
                        aa0Var.A(i7);
                        break;
                    }
                }
                break;
            case 9:
                oa0 oa0Var = (oa0) this.b;
                oa0Var.n.y(oa0Var.f.T((View) obj));
                break;
            case 10:
                pc0 pc0Var = (pc0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = pc0Var.h;
                if (pc0Var.getContext() != null) {
                    boolean z10 = pc0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - org.telegram.messenger.g0.n;
                    if (org.telegram.messenger.bz.r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((pc0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        lr lrVar = lr.h;
                        duration.setInterpolator(lrVar).start();
                        pc0Var.N.animate().alpha(intValue > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(lrVar);
                        break;
                    }
                }
                break;
            case 11:
                ld0 ld0Var = (ld0) this.b;
                ld0Var.F1.a(ld0Var.I1, true, 0, ((Long) obj).longValue());
                ld0Var.dismiss();
                break;
            case 12:
                org.telegram.messenger.q10 q10Var = (org.telegram.messenger.q10) this.b;
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
                q10Var.a(l10, l11);
                break;
            case 13:
                tw0 tw0Var = (tw0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i11 = tw0Var.a;
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i11).d2(org.telegram.messenger.j10.i(i11).e());
                TL_account.TL_birthday tL_birthday2 = d2 != null ? d2.birthday : null;
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday;
                    org.telegram.messenger.tr.a0(i11).j2(d2, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.m1(tw0Var, d2, tL_birthday2, 21), 1024);
                org.telegram.messenger.mp.u1(i11).o2();
                org.telegram.messenger.mp.u1(i11).s4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.ks.f(i11).k(org.telegram.messenger.ks.s1, new Object[0]);
                break;
            default:
                e51 e51Var = (e51) this.b;
                e51Var.g3.R(e51Var.T((View) obj), e51Var.k3);
                break;
        }
    }
}
