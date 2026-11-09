package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.f10;
import org.telegram.ui.j60;
import org.telegram.ui.wp0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i7, e2 e2Var) {
        this.a = 0;
        this.b = i7;
        this.c = e2Var;
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
                qs.f(i12).n((e2) obj, qs.a4);
                break;
            case 1:
                x5 x5Var = (x5) obj;
                org.telegram.messenger.g0.h3(new f10(x5Var, i12, x5.h(x5Var.R, i12), 16));
                break;
            case 2:
                u6 u6Var = (u6) obj;
                if (u6Var.r && !u6Var.y && i12 == u6Var.k0) {
                    u6Var.postDelayed(u6Var.l0, 500L);
                    break;
                }
                break;
            case 3:
                d8 d8Var = (d8) obj;
                ArrayList arrayList = d8Var.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) d8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i13 = 0; i12 < arrayList.size() && i13 < split.length; i13++) {
                            ((ma) arrayList.get(i12)).setText(split[i13]);
                            i12++;
                        }
                        d8Var.d0();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 4:
                v9 v9Var = (v9) obj;
                if (!v9Var.r && i12 == v9Var.J) {
                    v9Var.L = false;
                    v9Var.a.f3.O(true);
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
                wp0 wp0Var = (wp0) obj;
                sg.i1 i1Var = wp0Var.t1;
                wp0Var.s0(i1Var, null);
                sg.l0.e(i12).j(i1Var.c);
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
                        u1Var.setOnCancelListener(new j60(i12, i11));
                        u1VarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 10:
                x70 x70Var = ((wg.p0) obj).e;
                try {
                    if (x70Var.getLayout().getLineForOffset(i12) == 0) {
                        x70Var.getEditableText().insert(i12, "\n");
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

    public /* synthetic */ f2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
