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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i3 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((yf) obj).c0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.hp.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.t4) {
                    chatActivityEnterView.K3 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.a3.M0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.l1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                fc fcVar = (fc) obj;
                new vg.v0(42, fcVar.W(), fcVar.c).show();
                break;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.requestFocus();
                org.telegram.messenger.g0.K3(s4Var);
                break;
            case 3:
                org.telegram.messenger.g0.K3((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = g5.r;
                ((g5) obj).u();
                break;
            case 5:
                c5 c5Var = (c5) obj;
                ArrayList arrayList = new ArrayList(c5Var.c);
                c5Var.c.clear();
                org.telegram.messenger.qr.a0(c5Var.e).a.c(new z4(c5Var, arrayList, i10));
                c5Var.d = null;
                break;
            case 6:
                ((e5) obj).invalidate();
                break;
            case 7:
                ((q1.g) obj).h();
                break;
            case 8:
                h6 h6Var = (h6) obj;
                CharSequence charSequence = h6Var.f;
                if (charSequence != null) {
                    h6Var.c(charSequence, h6Var.h, true);
                    h6Var.f = null;
                    h6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((y7) obj).n.p1.setVisibility(8);
                break;
            case 10:
                ((d8) ((o4.m0) obj).c).g1();
                break;
            case 11:
                v9 v9Var = (v9) obj;
                v9Var.o = true;
                v9Var.d.invalidate();
                break;
            case 12:
                u9 u9Var = (u9) obj;
                if (!u9Var.a) {
                    v9 v9Var2 = u9Var.d;
                    Bitmap[] bitmapArr = v9Var2.g;
                    Canvas[] canvasArr = v9Var2.h;
                    v9Var2.g = v9Var2.f;
                    v9Var2.h = v9Var2.i;
                    v9Var2.f = bitmapArr;
                    v9Var2.i = canvasArr;
                    v9Var2.k = false;
                    gi.n5 n5Var = v9Var2.d;
                    if (n5Var != null) {
                        n5Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                x9 x9Var = ((ca) obj).t;
                if (x9Var != null) {
                    x9Var.d();
                    break;
                }
                break;
            case 14:
                x9 x9Var2 = (x9) obj;
                x9Var2.o = (Bitmap) x9Var2.n.c;
                x9Var2.d();
                break;
            case 15:
                ac acVar = ((ua) obj).b;
                fb fbVar = acVar.e;
                fbVar.transitionRunningEnter = false;
                fbVar.onEnterTransitionEnd();
                if (acVar.u) {
                    acVar.i(true);
                    break;
                }
                break;
            case 16:
                qc qcVar = (qc) obj;
                qcVar.getClass();
                if (org.telegram.messenger.lc.e(512)) {
                    qcVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                sc scVar = (sc) obj;
                if (scVar.o1) {
                    scVar.o1 = false;
                    scVar.invalidate();
                    break;
                }
                break;
            case 18:
                int i11 = ChatActivityEnterView.t5;
                org.telegram.messenger.g0.Q3((Activity) obj);
                break;
            case 19:
                ((Dialog) obj).dismiss();
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = ((xe) obj).f;
                int i12 = ChatActivityEnterView.t5;
                chatActivityEnterView2.p1();
                break;
            case 21:
                ((hg) obj).s = null;
                break;
            case 22:
                ((oh) obj).l0.v3.f();
                break;
            case 23:
                uj ujVar = (uj) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = ujVar.P;
                    if (file == null) {
                        ujVar.S();
                    } else {
                        ujVar.R(file);
                    }
                    ujVar.a0();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ll) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                break;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((jl) obj).c;
                pl plVar = chatAttachAlertPhotoLayout3.Q;
                if (plVar != null && !chatAttachAlertPhotoLayout3.b.J) {
                    plVar.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 26:
                am amVar = (am) obj;
                bi biVar = amVar.b;
                if (amVar.R && (chatAttachAlertPhotoLayout = biVar.b2) != null) {
                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.d1;
                    y0Var.setIcon(R.drawable.ic_ab_back);
                    y0Var.setText(org.telegram.messenger.bd.M0(2131753756, null));
                    y0Var.setRightIcon(0);
                    break;
                }
                break;
            case 27:
                an anVar = (an) obj;
                anVar.m1 = -1;
                anVar.l1 = null;
                break;
            case 28:
                ((wn) obj).q();
                break;
            default:
                ((yn) obj).setVisibility(8);
                break;
        }
    }
}
