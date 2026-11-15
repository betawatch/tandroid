package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nb1(int i7, Object obj, int i10) {
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
        int i13 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ec1 ec1Var = (ec1) obj;
                ec1Var.G.setSignalBarCount(i13);
                if (i13 <= 1) {
                    org.telegram.ui.Components.voip.y2 y2Var = ec1Var.w;
                    if (y2Var.W != 3) {
                        y2Var.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(y2Var.I, org.telegram.messenger.ns.e4);
                        y2Var.P = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.w2(y2Var, 2));
                        y2Var.P.setDuration(500L);
                        y2Var.P.start();
                    }
                    ec1Var.G.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.y2 y2Var2 = ec1Var.w;
                    if (y2Var2.W != 2) {
                        y2Var2.W = 2;
                        y2Var2.c();
                        ValueAnimator valueAnimator = y2Var2.P;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            y2Var2.P.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(y2Var2.I, 0);
                        y2Var2.P = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.w2(y2Var2, 0));
                        y2Var2.P.setDuration(500L);
                        y2Var2.P.start();
                    }
                    ec1Var.G.c(false);
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                HashSet hashSet = l0Var.E;
                hashSet.remove(Integer.valueOf(i13));
                if (hashSet.isEmpty()) {
                    l0Var.S();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i13);
                org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(i13);
                org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(f10, (jd0) obj, x10);
                f10.b(a0Var, org.telegram.messenger.ns.a4);
                org.telegram.messenger.g0.i3(a0Var, 10000L);
                if (x10.e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                a0Var.a();
                break;
            case 3:
                org.telegram.messenger.ns.f(i13).n((org.telegram.ui.Wallet.e2) obj, org.telegram.messenger.ns.a4);
                break;
            case 4:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) obj;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u11(z5Var, i13, org.telegram.ui.Wallet.z5.h(z5Var.R, i13), 19));
                break;
            case 5:
                org.telegram.ui.Wallet.w6 w6Var = (org.telegram.ui.Wallet.w6) obj;
                if (w6Var.r && !w6Var.y && i13 == w6Var.l0) {
                    w6Var.postDelayed(w6Var.m0, 500L);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.f8 f8Var = (org.telegram.ui.Wallet.f8) obj;
                ArrayList arrayList = f8Var.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) f8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i14 = 0; i13 < arrayList.size() && i14 < split.length; i14++) {
                            ((org.telegram.ui.Wallet.pa) arrayList.get(i13)).setText(split[i14]);
                            i13++;
                        }
                        f8Var.d0();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.z9 z9Var = (org.telegram.ui.Wallet.z9) obj;
                if (!z9Var.r && i13 == z9Var.K) {
                    z9Var.M = false;
                    z9Var.a.g3.O(true);
                    break;
                }
                break;
            case 8:
                ((org.telegram.ui.Components.hx) obj).w0(i13, 0, null);
                break;
            case 9:
                tg.j jVar = (tg.j) obj;
                jVar.M = i13;
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
                duration.setInterpolator(org.telegram.ui.Components.er.f);
                jVar.Q.addUpdateListener(new tg.f(jVar, 5));
                jVar.Q.addListener(new tg.g(jVar, i11));
                jVar.Q.start();
                break;
            case 10:
                tp0 tp0Var = (tp0) obj;
                sg.h1 h1Var = tp0Var.u1;
                tp0Var.s0(h1Var, null);
                sg.k0.e(i13).j(h1Var.c);
                break;
            case 11:
                org.telegram.messenger.ns.f(i13).k(org.telegram.messenger.ns.s3, Boolean.FALSE);
                ((tg.e2) obj).h();
                break;
            case 12:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    try {
                        t1Var.setOnCancelListener(new g60(i13, i12));
                        t1VarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 13:
                org.telegram.ui.Components.z70 z70Var = ((wg.n0) obj).e;
                try {
                    if (z70Var.getLayout().getLineForOffset(i13) == 0) {
                        z70Var.getEditableText().insert(i13, "\n");
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                zi.e0 e0Var = ((zi.u) obj).N;
                if (e0Var != null && e0Var.s != (i7 = ((i13 % 360) + 360) % 360)) {
                    e0Var.s = i7;
                    e0Var.v();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nb1(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
