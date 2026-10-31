package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.widget.EditText;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((wf) obj).b0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.vp.d1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.B().D0(chatActivityEnterView.O);
                chatActivityEnterView.Z2.G0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                cc ccVar = (cc) obj;
                new kg.i1(42, ccVar.W(), ccVar.c).show();
                break;
            case 2:
                r4 r4Var = (r4) obj;
                r4Var.requestFocus();
                org.telegram.messenger.i0.J3(r4Var);
                break;
            case 3:
                org.telegram.messenger.i0.J3((EditText) obj);
                break;
            case 4:
                org.telegram.messenger.i0.E2((vh.p2) obj);
                break;
            case 5:
                SparseArray sparseArray = f5.r;
                ((f5) obj).u();
                break;
            case 6:
                b5 b5Var = (b5) obj;
                ArrayList arrayList = new ArrayList(b5Var.c);
                b5Var.c.clear();
                org.telegram.messenger.hs.a0(b5Var.e).a.c(new y4(b5Var, arrayList, i11));
                b5Var.d = null;
                break;
            case 7:
                ((d5) obj).invalidate();
                break;
            case 8:
                ((o1.j) obj).h();
                break;
            case 9:
                f6 f6Var = (f6) obj;
                CharSequence charSequence = f6Var.f;
                if (charSequence != null) {
                    f6Var.c(charSequence, f6Var.h, true);
                    f6Var.f = null;
                    f6Var.h = false;
                    break;
                }
                break;
            case 10:
                ((v7) obj).n.o1.setVisibility(8);
                break;
            case 11:
                ((a8) ((m4.n0) obj).c).t1();
                break;
            case 12:
                q9 q9Var = (q9) obj;
                q9Var.o = true;
                q9Var.d.invalidate();
                break;
            case 13:
                p9 p9Var = (p9) obj;
                if (!p9Var.a) {
                    q9 q9Var2 = p9Var.d;
                    Bitmap[] bitmapArr = q9Var2.g;
                    Canvas[] canvasArr = q9Var2.h;
                    q9Var2.g = q9Var2.f;
                    q9Var2.h = q9Var2.i;
                    q9Var2.f = bitmapArr;
                    q9Var2.i = canvasArr;
                    q9Var2.k = false;
                    kg.f0 f0Var = q9Var2.d;
                    if (f0Var != null) {
                        f0Var.invalidate();
                        break;
                    }
                }
                break;
            case 14:
                s9 s9Var = ((x9) obj).t;
                if (s9Var != null) {
                    s9Var.d();
                    break;
                }
                break;
            case 15:
                s9 s9Var2 = (s9) obj;
                s9Var2.o = (Bitmap) s9Var2.n.c;
                s9Var2.d();
                break;
            case 16:
                wb wbVar = ((pa) obj).b;
                bb bbVar = wbVar.e;
                bbVar.transitionRunningEnter = false;
                bbVar.onEnterTransitionEnd();
                if (wbVar.u) {
                    wbVar.i(true);
                    break;
                }
                break;
            case 17:
                lc lcVar = (lc) obj;
                lcVar.getClass();
                if (org.telegram.messenger.sc.e(512)) {
                    lcVar.invalidateSelf();
                    break;
                }
                break;
            case 18:
                nc ncVar = (nc) obj;
                if (ncVar.n1) {
                    ncVar.n1 = false;
                    ncVar.invalidate();
                    break;
                }
                break;
            case 19:
                int i12 = ChatActivityEnterView.s5;
                org.telegram.messenger.i0.P3((Activity) obj);
                break;
            case 20:
                ((Dialog) obj).dismiss();
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((ue) obj).f;
                int i13 = ChatActivityEnterView.s5;
                chatActivityEnterView2.o1();
                break;
            case 22:
                ((fg) obj).s = null;
                break;
            case 23:
                ((ph) obj).k0.u3.f();
                break;
            case 24:
                xj xjVar = (xj) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = xjVar.O;
                    if (file == null) {
                        xjVar.R();
                    } else {
                        xjVar.Q(file);
                    }
                    xjVar.Y();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((sl) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.q0(-1, true);
                break;
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ql) obj).c;
                yl ylVar = chatAttachAlertPhotoLayout3.P;
                if (ylVar != null && !chatAttachAlertPhotoLayout3.b.I) {
                    ylVar.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 27:
                jm jmVar = (jm) obj;
                bi biVar = jmVar.b;
                if (jmVar.Q && (chatAttachAlertPhotoLayout = biVar.a2) != null) {
                    org.telegram.ui.ActionBar.b1 b1Var = chatAttachAlertPhotoLayout.c1;
                    b1Var.setIcon(R.drawable.ic_ab_back);
                    b1Var.setText(org.telegram.messenger.cd.L0(2131753756, null));
                    b1Var.setRightIcon(0);
                    break;
                }
                break;
            case 28:
                jn jnVar = (jn) obj;
                jnVar.l1 = -1;
                jnVar.k1 = null;
                break;
            default:
                ((fo) obj).v();
                break;
        }
    }
}
