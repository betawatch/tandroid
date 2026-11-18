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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lg(Object obj, int i7) {
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
                ChatActivityEnterView chatActivityEnterView = ((pg) obj).Q0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.mp.g1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.g5) {
                    chatActivityEnterView.x4 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.N3.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                lc lcVar = (lc) obj;
                new ug.z0(42, lcVar.X(), lcVar.c).show();
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
                ((f8) obj).n.s1.setVisibility(8);
                break;
            case 10:
                ((k8) ((org.telegram.messenger.pe) obj).d).d1();
                break;
            case 11:
                aa aaVar = (aa) obj;
                aaVar.o = true;
                aaVar.d.invalidate();
                break;
            case 12:
                z9 z9Var = (z9) obj;
                if (!z9Var.a) {
                    aa aaVar2 = z9Var.d;
                    Bitmap[] bitmapArr = aaVar2.g;
                    Canvas[] canvasArr = aaVar2.h;
                    aaVar2.g = aaVar2.f;
                    aaVar2.h = aaVar2.i;
                    aaVar2.f = bitmapArr;
                    aaVar2.i = canvasArr;
                    aaVar2.k = false;
                    hi.m5 m5Var = aaVar2.d;
                    if (m5Var != null) {
                        m5Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ca caVar = ((ha) obj).t;
                if (caVar != null) {
                    caVar.d();
                    break;
                }
                break;
            case 14:
                ca caVar2 = (ca) obj;
                caVar2.o = (Bitmap) caVar2.n.c;
                caVar2.d();
                break;
            case 15:
                gc gcVar = ((ab) obj).b;
                lb lbVar = gcVar.e;
                lbVar.transitionRunningEnter = false;
                lbVar.onEnterTransitionEnd();
                if (gcVar.u) {
                    gcVar.i(true);
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
                int i11 = ChatActivityEnterView.n7;
                ((hd) obj).a(Boolean.FALSE, 0, 0);
                break;
            case 19:
                int i12 = ChatActivityEnterView.n7;
                org.telegram.messenger.g0.O3((Activity) obj);
                break;
            case 20:
                ((Dialog) obj).dismiss();
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((jf) obj).f;
                int i13 = ChatActivityEnterView.n7;
                chatActivityEnterView2.Q1();
                break;
            case 22:
                org.telegram.messenger.g0.E2((ji.n) obj);
                break;
            case 23:
                ((yg) obj).s = null;
                break;
            case 24:
                ((fi) obj).l0.y3.f();
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
                si siVar = pmVar.b;
                if (pmVar.R && (chatAttachAlertPhotoLayout = siVar.e2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.d1;
                    z0Var.setIcon(R.drawable.ic_ab_back);
                    z0Var.setText(org.telegram.messenger.gd.M0(2131753754, null));
                    z0Var.setRightIcon(0);
                    break;
                }
                break;
            default:
                rn rnVar = (rn) obj;
                rnVar.m1 = -1;
                rnVar.l1 = null;
                break;
        }
    }
}
