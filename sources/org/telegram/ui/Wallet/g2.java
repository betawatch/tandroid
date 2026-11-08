package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.d10;
import org.telegram.ui.h60;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2(int i7, f2 f2Var) {
        this.a = 0;
        this.b = i7;
        this.c = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i7;
        int i10 = this.a;
        int i11 = 1;
        int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                qs.f(i12).n((f2) obj, qs.a4);
                break;
            case 1:
                y5 y5Var = (y5) obj;
                org.telegram.messenger.g0.h3(new d10(y5Var, i12, y5.h(y5Var.R, i12), 16));
                break;
            case 2:
                v6 v6Var = (v6) obj;
                if (v6Var.r && !v6Var.y && i12 == v6Var.k0) {
                    v6Var.postDelayed(v6Var.l0, 500L);
                    break;
                }
                break;
            case 3:
                e8 e8Var = (e8) obj;
                ArrayList arrayList = e8Var.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) e8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i13 = 0; i12 < arrayList.size() && i13 < split.length; i13++) {
                            ((na) arrayList.get(i12)).setText(split[i13]);
                            i12++;
                        }
                        e8Var.d0();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 4:
                w9 w9Var = (w9) obj;
                if (!w9Var.r && i12 == w9Var.J) {
                    w9Var.L = false;
                    w9Var.a.f3.O(true);
                    break;
                }
                break;
            case 5:
                ((cx) obj).w0(i12, 0, null);
                break;
            case 6:
                tg.j jVar = (tg.j) obj;
                jVar.L = i12;
                jVar.K = true;
                int i14 = 2;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = jVar.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(xq.f);
                jVar.P.addUpdateListener(new tg.f(jVar, 5));
                jVar.P.addListener(new tg.g(jVar, i14));
                jVar.P.start();
                break;
            case 7:
                up0 up0Var = (up0) obj;
                sg.j1 j1Var = up0Var.t1;
                up0Var.s0(j1Var, null);
                sg.l0.e(i12).j(j1Var.c);
                break;
            case 8:
                qs.f(i12).k(qs.s3, Boolean.FALSE);
                ((tg.c2) obj).h();
                break;
            case 9:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    try {
                        u1Var.setOnCancelListener(new h60(i12, i11));
                        u1VarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 10:
                w70 w70Var = ((wg.p0) obj).e;
                try {
                    if (w70Var.getLayout().getLineForOffset(i12) == 0) {
                        w70Var.getEditableText().insert(i12, "\n");
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                wi.d0 d0Var = ((wi.t) obj).N;
                if (d0Var != null && d0Var.s != (i7 = ((i12 % 360) + 360) % 360)) {
                    d0Var.s = i7;
                    d0Var.v();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
