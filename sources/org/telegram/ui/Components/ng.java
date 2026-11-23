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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng(Object obj, int i7) {
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
                ChatActivityEnterView chatActivityEnterView = ((qg) obj).Q0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.mp.g1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.i5) {
                    chatActivityEnterView.z4 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.P3.U0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                kc kcVar = (kc) obj;
                new ug.y0(42, kcVar.X(), kcVar.c).show();
                break;
            case 2:
                a5 a5Var = (a5) obj;
                a5Var.requestFocus();
                org.telegram.messenger.g0.I3(a5Var);
                break;
            case 3:
                org.telegram.messenger.g0.I3((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = o5.r;
                ((o5) obj).u();
                break;
            case 5:
                k5 k5Var = (k5) obj;
                ArrayList arrayList = new ArrayList(k5Var.c);
                k5Var.c.clear();
                org.telegram.messenger.tr.a0(k5Var.e).a.c(new h5(k5Var, arrayList, i10));
                k5Var.d = null;
                break;
            case 6:
                ((m5) obj).invalidate();
                break;
            case 7:
                ((r1.g) obj).h();
                break;
            case 8:
                n6 n6Var = (n6) obj;
                CharSequence charSequence = n6Var.f;
                if (charSequence != null) {
                    n6Var.c(charSequence, n6Var.h, true);
                    n6Var.f = null;
                    n6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((d8) obj).n.s1.setVisibility(8);
                break;
            case 10:
                ((i8) ((org.telegram.messenger.pe) obj).d).X0();
                break;
            case 11:
                z9 z9Var = (z9) obj;
                z9Var.o = true;
                z9Var.d.invalidate();
                break;
            case 12:
                y9 y9Var = (y9) obj;
                if (!y9Var.a) {
                    z9 z9Var2 = y9Var.d;
                    Bitmap[] bitmapArr = z9Var2.g;
                    Canvas[] canvasArr = z9Var2.h;
                    z9Var2.g = z9Var2.f;
                    z9Var2.h = z9Var2.i;
                    z9Var2.f = bitmapArr;
                    z9Var2.i = canvasArr;
                    z9Var2.k = false;
                    hi.w5 w5Var = z9Var2.d;
                    if (w5Var != null) {
                        w5Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ba baVar = ((ga) obj).t;
                if (baVar != null) {
                    baVar.d();
                    break;
                }
                break;
            case 14:
                ba baVar2 = (ba) obj;
                baVar2.o = (Bitmap) baVar2.n.c;
                baVar2.d();
                break;
            case 15:
                fc fcVar = ((za) obj).b;
                kb kbVar = fcVar.e;
                kbVar.transitionRunningEnter = false;
                kbVar.onEnterTransitionEnd();
                if (fcVar.u) {
                    fcVar.i(true);
                    break;
                }
                break;
            case 16:
                wc wcVar = (wc) obj;
                wcVar.getClass();
                if (org.telegram.messenger.pc.e(512)) {
                    wcVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                yc ycVar = (yc) obj;
                if (ycVar.o1) {
                    ycVar.o1 = false;
                    ycVar.invalidate();
                    break;
                }
                break;
            case 18:
                int i11 = ChatActivityEnterView.s7;
                ((hd) obj).a(Boolean.FALSE, 0, 0);
                break;
            case 19:
                int i12 = ChatActivityEnterView.s7;
                org.telegram.messenger.g0.O3((Activity) obj);
                break;
            case 20:
                ((Dialog) obj).dismiss();
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((kf) obj).f;
                int i13 = ChatActivityEnterView.s7;
                chatActivityEnterView2.W1();
                break;
            case 22:
                org.telegram.messenger.g0.E2((ji.o) obj);
                break;
            case 23:
                ((zg) obj).s = null;
                break;
            case 24:
                ((gi) obj).l0.y3.f();
                break;
            case 25:
                kk kkVar = (kk) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = kkVar.P;
                    if (file == null) {
                        kkVar.T();
                    } else {
                        kkVar.S(file);
                    }
                    kkVar.a0();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                break;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((yl) obj).c;
                em emVar = chatAttachAlertPhotoLayout3.Q;
                if (emVar != null && !chatAttachAlertPhotoLayout3.b.J) {
                    emVar.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 28:
                pm pmVar = (pm) obj;
                ti tiVar = pmVar.b;
                if (pmVar.R && (chatAttachAlertPhotoLayout = tiVar.e2) != null) {
                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.d1;
                    y0Var.setIcon(R.drawable.ic_ab_back);
                    y0Var.setText(org.telegram.messenger.gd.N0(2131753753, null));
                    y0Var.setRightIcon(0);
                    break;
                }
                break;
            default:
                qn qnVar = (qn) obj;
                qnVar.m1 = -1;
                qnVar.l1 = null;
                break;
        }
    }
}
