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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf(Object obj, int i7) {
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
                ChatActivityEnterView chatActivityEnterView = ((zf) obj).b0;
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
                gc gcVar = (gc) obj;
                new ug.w0(42, gcVar.W(), gcVar.c).show();
                break;
            case 2:
                t4 t4Var = (t4) obj;
                t4Var.requestFocus();
                org.telegram.messenger.g0.K3(t4Var);
                break;
            case 3:
                org.telegram.messenger.g0.K3((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = h5.r;
                ((h5) obj).u();
                break;
            case 5:
                d5 d5Var = (d5) obj;
                ArrayList arrayList = new ArrayList(d5Var.c);
                d5Var.c.clear();
                org.telegram.messenger.yr.a0(d5Var.e).a.c(new a5(d5Var, arrayList, i10));
                d5Var.d = null;
                break;
            case 6:
                ((f5) obj).invalidate();
                break;
            case 7:
                ((r1.g) obj).h();
                break;
            case 8:
                i6 i6Var = (i6) obj;
                CharSequence charSequence = i6Var.f;
                if (charSequence != null) {
                    i6Var.c(charSequence, i6Var.h, true);
                    i6Var.f = null;
                    i6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((z7) obj).n.r1.setVisibility(8);
                break;
            case 10:
                ((e8) ((org.telegram.messenger.re) obj).d).i1();
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
                    fi.p5 p5Var = v9Var2.d;
                    if (p5Var != null) {
                        p5Var.invalidate();
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
                bc bcVar = ((ua) obj).b;
                fb fbVar = bcVar.e;
                fbVar.transitionRunningEnter = false;
                fbVar.onEnterTransitionEnd();
                if (bcVar.u) {
                    bcVar.i(true);
                    break;
                }
                break;
            case 16:
                rc rcVar = (rc) obj;
                rcVar.getClass();
                if (org.telegram.messenger.sc.e(512)) {
                    rcVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                tc tcVar = (tc) obj;
                if (tcVar.n1) {
                    tcVar.n1 = false;
                    tcVar.invalidate();
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
                ChatActivityEnterView chatActivityEnterView2 = ((ye) obj).f;
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView2.q1();
                break;
            case 21:
                ((ig) obj).s = null;
                break;
            case 22:
                ((ph) obj).k0.x3.f();
                break;
            case 23:
                uj ujVar = (uj) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = ujVar.O;
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
                boolean z9 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                break;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((jl) obj).c;
                pl plVar = chatAttachAlertPhotoLayout3.P;
                if (plVar != null && !chatAttachAlertPhotoLayout3.b.I) {
                    plVar.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 26:
                am amVar = (am) obj;
                ci ciVar = amVar.b;
                if (amVar.Q && (chatAttachAlertPhotoLayout = ciVar.d2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.c1;
                    z0Var.setIcon(R.drawable.ic_ab_back);
                    z0Var.setText(org.telegram.messenger.id.M0(2131753756, null));
                    z0Var.setRightIcon(0);
                    break;
                }
                break;
            case 27:
                an anVar = (an) obj;
                anVar.l1 = -1;
                anVar.k1 = null;
                break;
            case 28:
                ((wn) obj).p();
                break;
            default:
                ((yn) obj).setVisibility(8);
                break;
        }
    }
}
