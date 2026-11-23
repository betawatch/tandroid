package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jw0(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i7;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        int i14 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                kw0 kw0Var = (kw0) obj;
                ProfileActivity profileActivity = kw0Var.h.e;
                profileActivity.getNotificationCenter().n(profileActivity, org.telegram.messenger.ls.s1);
                if (i14 == 2) {
                    profileActivity.getMessagesController().s4(0L, "PREMIUM_GRACE");
                    vf.c.t(kw0Var.getContext(), profileActivity.getMessagesController().O5);
                } else {
                    profileActivity.getMessagesController().s4(0L, i14 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity.getNotificationCenter().c(profileActivity, org.telegram.messenger.ls.s1);
                profileActivity.H5(false, false);
                break;
            case 1:
                yx0 yx0Var = (yx0) obj;
                org.telegram.messenger.g0.v1(yx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.a;
                    if (i13 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i13 != 0 && ((i14 != 3 || i13 != 4) && ((i14 != 2 || (i13 != 4 && i13 != 1)) && (i14 != 1 || (i13 != 1 && i13 != 2 && i13 != 3))))) {
                            editTextBoldCursorArr[i13].setText((CharSequence) null);
                        }
                        i13++;
                    }
                }
                break;
            case 2:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f.remove(i14);
                sessionsActivity.r0();
                a31 a31Var = sessionsActivity.a;
                if (a31Var != null) {
                    a31Var.f();
                    break;
                }
                break;
            case 3:
                hc1 hc1Var = (hc1) obj;
                hc1Var.G.setSignalBarCount(i14);
                if (i14 > 1) {
                    org.telegram.ui.Components.voip.x2 x2Var = hc1Var.w;
                    if (x2Var.W != 2) {
                        x2Var.W = 2;
                        x2Var.c();
                        ValueAnimator valueAnimator = x2Var.P;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            x2Var.P.cancel();
                        }
                        ValueAnimator ofInt = ValueAnimator.ofInt(x2Var.I, 0);
                        x2Var.P = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.v2(x2Var, 0));
                        x2Var.P.setDuration(500L);
                        x2Var.P.start();
                    }
                    hc1Var.G.c(false);
                    break;
                } else {
                    org.telegram.ui.Components.voip.x2 x2Var2 = hc1Var.w;
                    if (x2Var2.W != 3) {
                        x2Var2.W = 3;
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(x2Var2.I, org.telegram.messenger.ls.e4);
                        x2Var2.P = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.v2(x2Var2, 2));
                        x2Var2.P.setDuration(500L);
                        x2Var2.P.start();
                    }
                    hc1Var.G.c(true);
                    break;
                }
            case 4:
                org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i14);
                org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(i14);
                org.telegram.ui.Wallet.h0 h0Var = new org.telegram.ui.Wallet.h0(f10, (fe0) obj, D);
                f10.b(h0Var, org.telegram.messenger.ls.d4);
                org.telegram.messenger.g0.h3(h0Var, 10000L);
                if (D.e == null && D.C < 0) {
                    D.h0();
                }
                D.f0();
                h0Var.a();
                break;
            case 5:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj;
                HashSet hashSet = u0Var.G;
                hashSet.remove(Integer.valueOf(i14));
                if (hashSet.isEmpty()) {
                    u0Var.a0();
                    break;
                }
                break;
            case 6:
                org.telegram.messenger.ls.f(i14).n((org.telegram.ui.Wallet.m2) obj, org.telegram.messenger.ls.d4);
                break;
            case 7:
                org.telegram.ui.Wallet.p6 p6Var = (org.telegram.ui.Wallet.p6) obj;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.f21(p6Var, i14, org.telegram.ui.Wallet.p6.h(p6Var.R, i14), 19));
                break;
            case 8:
                org.telegram.ui.Wallet.m7 m7Var = (org.telegram.ui.Wallet.m7) obj;
                if (m7Var.r && !m7Var.y && i14 == m7Var.l0) {
                    m7Var.postDelayed(m7Var.m0, 500L);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) obj;
                ArrayList arrayList = u8Var.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) u8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i14 < arrayList.size() && i13 < split.length) {
                            ((org.telegram.ui.Wallet.db) arrayList.get(i14)).setText(split[i13]);
                            i14++;
                            i13++;
                        }
                        u8Var.d0();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 10:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) obj;
                if (!naVar.r && i14 == naVar.K) {
                    naVar.M = false;
                    naVar.a.g3.O(true);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.ox) obj).w0(i14, 0, null);
                break;
            case 12:
                tg.j jVar = (tg.j) obj;
                jVar.M = i14;
                jVar.L = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.R;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.Q = duration;
                duration.setInterpolator(org.telegram.ui.Components.nr.f);
                jVar.Q.addUpdateListener(new tg.f(jVar, 5));
                jVar.Q.addListener(new tg.g(jVar, i11));
                jVar.Q.start();
                break;
            case 13:
                vp0 vp0Var = (vp0) obj;
                sg.h1 h1Var = vp0Var.u1;
                vp0Var.s0(h1Var, null);
                sg.k0.e(i14).j(h1Var.c);
                break;
            case 14:
                org.telegram.messenger.ls.f(i14).k(org.telegram.messenger.ls.u3, Boolean.FALSE);
                ((tg.f2) obj).h();
                break;
            case 15:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    try {
                        t1Var.setOnCancelListener(new i60(i14, i12));
                        t1VarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 16:
                org.telegram.ui.Components.m80 m80Var = ((wg.p0) obj).e;
                try {
                    if (m80Var.getLayout().getLineForOffset(i14) == 0) {
                        m80Var.getEditableText().insert(i14, "\n");
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                zi.d0 d0Var = ((zi.t) obj).N;
                if (d0Var != null && d0Var.s != (i7 = ((i14 % 360) + 360) % 360)) {
                    d0Var.s = i7;
                    d0Var.v();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jw0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
