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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ag) obj).b0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.qp.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.B().D0(chatActivityEnterView.O);
                chatActivityEnterView.Z2.R0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                hc hcVar = (hc) obj;
                new ug.w0(42, hcVar.W(), hcVar.c).show();
                break;
            case 2:
                u4 u4Var = (u4) obj;
                u4Var.requestFocus();
                org.telegram.messenger.g0.K3(u4Var);
                break;
            case 3:
                org.telegram.messenger.g0.K3((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = i5.r;
                ((i5) obj).u();
                break;
            case 5:
                e5 e5Var = (e5) obj;
                ArrayList arrayList = new ArrayList(e5Var.c);
                e5Var.c.clear();
                org.telegram.messenger.yr.a0(e5Var.e).a.c(new b5(e5Var, arrayList, i10));
                e5Var.d = null;
                break;
            case 6:
                ((g5) obj).invalidate();
                break;
            case 7:
                ((r1.g) obj).h();
                break;
            case 8:
                j6 j6Var = (j6) obj;
                CharSequence charSequence = j6Var.f;
                if (charSequence != null) {
                    j6Var.c(charSequence, j6Var.h, true);
                    j6Var.f = null;
                    j6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((a8) obj).n.o1.setVisibility(8);
                break;
            case 10:
                ((f8) ((org.telegram.messenger.re) obj).d).i1();
                break;
            case 11:
                w9 w9Var = (w9) obj;
                w9Var.o = true;
                w9Var.d.invalidate();
                break;
            case 12:
                v9 v9Var = (v9) obj;
                if (!v9Var.a) {
                    w9 w9Var2 = v9Var.d;
                    Bitmap[] bitmapArr = w9Var2.g;
                    Canvas[] canvasArr = w9Var2.h;
                    w9Var2.g = w9Var2.f;
                    w9Var2.h = w9Var2.i;
                    w9Var2.f = bitmapArr;
                    w9Var2.i = canvasArr;
                    w9Var2.k = false;
                    fi.p5 p5Var = w9Var2.d;
                    if (p5Var != null) {
                        p5Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                y9 y9Var = ((da) obj).t;
                if (y9Var != null) {
                    y9Var.d();
                    break;
                }
                break;
            case 14:
                y9 y9Var2 = (y9) obj;
                y9Var2.o = (Bitmap) y9Var2.n.c;
                y9Var2.d();
                break;
            case 15:
                cc ccVar = ((va) obj).b;
                gb gbVar = ccVar.e;
                gbVar.transitionRunningEnter = false;
                gbVar.onEnterTransitionEnd();
                if (ccVar.u) {
                    ccVar.i(true);
                    break;
                }
                break;
            case 16:
                sc scVar = (sc) obj;
                scVar.getClass();
                if (org.telegram.messenger.rc.e(512)) {
                    scVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                uc ucVar = (uc) obj;
                if (ucVar.n1) {
                    ucVar.n1 = false;
                    ucVar.invalidate();
                    break;
                }
                break;
            case 18:
                int i11 = ChatActivityEnterView.s5;
                org.telegram.messenger.g0.Q3((Activity) obj);
                break;
            case 19:
                ((Dialog) obj).dismiss();
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = ((ze) obj).f;
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView2.q1();
                break;
            case 21:
                ((jg) obj).s = null;
                break;
            case 22:
                ((qh) obj).k0.u3.f();
                break;
            case 23:
                vj vjVar = (vj) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = vjVar.O;
                    if (file == null) {
                        vjVar.S();
                    } else {
                        vjVar.R(file);
                    }
                    vjVar.a0();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ml) obj).b;
                boolean z9 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                break;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((kl) obj).c;
                ql qlVar = chatAttachAlertPhotoLayout3.P;
                if (qlVar != null && !chatAttachAlertPhotoLayout3.b.I) {
                    qlVar.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 26:
                bm bmVar = (bm) obj;
                di diVar = bmVar.b;
                if (bmVar.Q && (chatAttachAlertPhotoLayout = diVar.a2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.c1;
                    z0Var.setIcon(R.drawable.ic_ab_back);
                    z0Var.setText(org.telegram.messenger.hd.M0(2131753756, null));
                    z0Var.setRightIcon(0);
                    break;
                }
                break;
            case 27:
                bn bnVar = (bn) obj;
                bnVar.l1 = -1;
                bnVar.k1 = null;
                break;
            case 28:
                ((xn) obj).p();
                break;
            default:
                ((zn) obj).setVisibility(8);
                break;
        }
    }
}
