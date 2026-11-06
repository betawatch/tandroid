package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.d10;
import org.telegram.ui.h60;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h2(int i7, g2 g2Var) {
        this.a = 0;
        this.b = i7;
        this.c = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i7 = this.a;
        int i10 = 1;
        int i11 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                qs.f(i11).n((g2) obj, qs.a4);
                break;
            case 1:
                z5 z5Var = (z5) obj;
                org.telegram.messenger.g0.h3(new d10(z5Var, i11, z5.h(z5Var.R, i11), 16));
                break;
            case 2:
                w6 w6Var = (w6) obj;
                if (w6Var.r && !w6Var.y && i11 == w6Var.k0) {
                    w6Var.postDelayed(w6Var.l0, 500L);
                    break;
                }
                break;
            case 3:
                f8 f8Var = (f8) obj;
                ArrayList arrayList = f8Var.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) f8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((oa) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        f8Var.d0();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 4:
                x9 x9Var = (x9) obj;
                if (!x9Var.r && i11 == x9Var.J) {
                    x9Var.L = false;
                    x9Var.a.f3.O(true);
                    break;
                }
                break;
            case 5:
                try {
                    ((org.telegram.utils.twidget.h0) obj).e(i11);
                    break;
                } catch (Exception unused2) {
                    return;
                }
            case 6:
                ((bx) obj).w0(i11, 0, null);
                break;
            case 7:
                tg.j jVar = (tg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                int i13 = 2;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
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
                jVar.P.addListener(new tg.g(jVar, i13));
                jVar.P.start();
                break;
            case 8:
                tp0 tp0Var = (tp0) obj;
                sg.j1 j1Var = tp0Var.t1;
                tp0Var.s0(j1Var, null);
                sg.l0.e(i11).j(j1Var.c);
                break;
            case 9:
                qs.f(i11).k(qs.s3, Boolean.FALSE);
                ((tg.c2) obj).h();
                break;
            case 10:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    try {
                        u1Var.setOnCancelListener(new h60(i11, i10));
                        u1VarArr[0].show();
                        break;
                    } catch (Exception unused4) {
                        return;
                    }
                }
                break;
            default:
                w70 w70Var = ((wg.p0) obj).e;
                try {
                    if (w70Var.getLayout().getLineForOffset(i11) == 0) {
                        w70Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                break;
        }
    }

    public /* synthetic */ h2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
