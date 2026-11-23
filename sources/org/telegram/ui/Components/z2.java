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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.y10
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
                ((ji.r) this.b).setEditMenuProgress(((Float) obj).floatValue());
                break;
            case 3:
                ((hi.s6) this.b).a((ai.g) obj);
                break;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((jm) this.b).w;
                chatAttachAlertPhotoLayout.u0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 5:
                org.telegram.messenger.np.u1(((ks) this.b).Q).E3(null, (TLRPC.User) obj, null, 0, null, false, false);
                break;
            case 6:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ((ot) this.b).H(((Integer) obj).intValue());
                break;
            case 8:
                wa0 wa0Var = (wa0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = wa0Var.e.a;
                ca0 ca0Var = wa0Var.f;
                if (((ta0) arrayList.get(ca0Var.getCurrentPosition())).a != num.intValue()) {
                    int i7 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if (((ta0) arrayList.get(i10)).a == num.intValue()) {
                                i7 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (ca0Var.getCurrentPosition() != i7) {
                        ca0Var.A(i7);
                        break;
                    }
                }
                break;
            case 9:
                qa0 qa0Var = (qa0) this.b;
                qa0Var.n.y(qa0Var.f.T((View) obj));
                break;
            case 10:
                qc0 qc0Var = (qc0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = qc0Var.h;
                if (qc0Var.getContext() != null) {
                    boolean z10 = qc0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - org.telegram.messenger.g0.n;
                    if (org.telegram.messenger.cz.r == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= org.telegram.messenger.g0.L(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((qc0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        nr nrVar = nr.h;
                        duration.setInterpolator(nrVar).start();
                        qc0Var.N.animate().alpha(intValue > org.telegram.messenger.g0.L(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(nrVar);
                        break;
                    }
                }
                break;
            case 11:
                md0 md0Var = (md0) this.b;
                md0Var.F1.a(md0Var.I1, true, 0, ((Long) obj).longValue());
                md0Var.dismiss();
                break;
            case 12:
                org.telegram.messenger.r10 r10Var = (org.telegram.messenger.r10) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.m6.I.q() ? 0.04f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.m6.I.q() ? -0.04f : -0.07f);
                Bitmap l10 = org.telegram.messenger.g0.l(bitmap, colorMatrix);
                l10.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.m6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.m6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.m6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap l11 = org.telegram.messenger.g0.l(bitmap, colorMatrix2);
                l11.setHasAlpha(false);
                bitmap.recycle();
                r10Var.a(l10, l11);
                break;
            case 13:
                vw0 vw0Var = (vw0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i11 = vw0Var.a;
                TLRPC.UserFull d2 = org.telegram.messenger.np.u1(i11).d2(org.telegram.messenger.k10.i(i11).e());
                TL_account.TL_birthday tL_birthday2 = d2 != null ? d2.birthday : null;
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday;
                    org.telegram.messenger.ur.a0(i11).j2(d2, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bi.q1(vw0Var, d2, tL_birthday2, 21), 1024);
                org.telegram.messenger.np.u1(i11).o2();
                org.telegram.messenger.np.u1(i11).s4(0L, "BIRTHDAY_SETUP");
                org.telegram.messenger.ls.f(i11).k(org.telegram.messenger.ls.s1, new Object[0]);
                break;
            default:
                h51 h51Var = (h51) this.b;
                h51Var.g3.R(h51Var.T((View) obj), h51Var.k3);
                break;
        }
    }
}
