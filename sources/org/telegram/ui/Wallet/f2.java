package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.b60;
import org.telegram.ui.lp0;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i3, e2 e2Var) {
        this.a = 0;
        this.b = i3;
        this.c = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i3 = this.a;
        int i10 = 1;
        int i11 = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                hs.f(i11).n((e2) obj, hs.a4);
                break;
            case 1:
                x5 x5Var = (x5) obj;
                org.telegram.messenger.g0.h3(new rw(x5Var, i11, x5.h(x5Var.R, i11), 17));
                break;
            case 2:
                u6 u6Var = (u6) obj;
                if (u6Var.r && !u6Var.y && i11 == u6Var.l0) {
                    u6Var.postDelayed(u6Var.m0, 500L);
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
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((na) arrayList.get(i11)).setText(split[i12]);
                            i11++;
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
                if (!w9Var.r && i11 == w9Var.K) {
                    w9Var.M = false;
                    w9Var.a.g3.O(true);
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
                ((ax) obj).w0(i11, 0, null);
                break;
            case 7:
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) obj;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    try {
                        s1Var.setOnCancelListener(new b60(i11, i10));
                        s1VarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 8:
                ug.j jVar = (ug.j) obj;
                jVar.M = i11;
                jVar.L = true;
                int i13 = 2;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused4) {
                }
                ValueAnimator valueAnimator = jVar.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.R;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.Q = duration;
                duration.setInterpolator(xq.f);
                jVar.Q.addUpdateListener(new ug.f(jVar, 5));
                jVar.Q.addListener(new ug.g(jVar, i13));
                jVar.Q.start();
                break;
            case 9:
                lp0 lp0Var = (lp0) obj;
                tg.h1 h1Var = lp0Var.u1;
                lp0Var.s0(h1Var, null);
                tg.k0.e(i11).j(h1Var.c);
                break;
            case 10:
                hs.f(i11).k(hs.s3, Boolean.FALSE);
                ((ug.c2) obj).h();
                break;
            default:
                s70 s70Var = ((xg.p0) obj).e;
                try {
                    if (s70Var.getLayout().getLineForOffset(i11) == 0) {
                        s70Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                break;
        }
    }

    public /* synthetic */ f2(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }
}
