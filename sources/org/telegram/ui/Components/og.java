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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ og(Object obj, int i7) {
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
                ChatActivityEnterView chatActivityEnterView = ((rg) obj).Q0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.np.g1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.i5) {
                    chatActivityEnterView.z4 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.P3.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                lc lcVar = (lc) obj;
                new ug.y0(42, lcVar.X(), lcVar.c).show();
                break;
            case 2:
                b5 b5Var = (b5) obj;
                b5Var.requestFocus();
                org.telegram.messenger.g0.I3(b5Var);
                break;
            case 3:
                org.telegram.messenger.g0.I3((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = p5.r;
                ((p5) obj).u();
                break;
            case 5:
                l5 l5Var = (l5) obj;
                ArrayList arrayList = new ArrayList(l5Var.c);
                l5Var.c.clear();
                org.telegram.messenger.ur.a0(l5Var.e).a.c(new i5(l5Var, arrayList, i10));
                l5Var.d = null;
                break;
            case 6:
                ((n5) obj).invalidate();
                break;
            case 7:
                ((r1.g) obj).h();
                break;
            case 8:
                o6 o6Var = (o6) obj;
                CharSequence charSequence = o6Var.f;
                if (charSequence != null) {
                    o6Var.c(charSequence, o6Var.h, true);
                    o6Var.f = null;
                    o6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((e8) obj).n.s1.setVisibility(8);
                break;
            case 10:
                ((j8) ((org.telegram.messenger.qe) obj).d).d1();
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
                    hi.l5 l5Var2 = aaVar2.d;
                    if (l5Var2 != null) {
                        l5Var2.invalidate();
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
                if (org.telegram.messenger.qc.e(512)) {
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
                ChatActivityEnterView chatActivityEnterView2 = ((jf) obj).f;
                int i13 = ChatActivityEnterView.s7;
                chatActivityEnterView2.U1();
                break;
            case 22:
                org.telegram.messenger.g0.E2((ji.p) obj);
                break;
            case 23:
                ((ah) obj).s = null;
                break;
            case 24:
                ((hi) obj).l0.y3.f();
                break;
            case 25:
                mk mkVar = (mk) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = mkVar.P;
                    if (file == null) {
                        mkVar.T();
                    } else {
                        mkVar.S(file);
                    }
                    mkVar.a0();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((cm) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                break;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((am) obj).c;
                gm gmVar = chatAttachAlertPhotoLayout3.Q;
                if (gmVar != null && !chatAttachAlertPhotoLayout3.b.J) {
                    gmVar.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 28:
                rm rmVar = (rm) obj;
                ui uiVar = rmVar.b;
                if (rmVar.R && (chatAttachAlertPhotoLayout = uiVar.e2) != null) {
                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.d1;
                    y0Var.setIcon(R.drawable.ic_ab_back);
                    y0Var.setText(org.telegram.messenger.hd.N0(2131753753, null));
                    y0Var.setRightIcon(0);
                    break;
                }
                break;
            default:
                tn tnVar = (tn) obj;
                tnVar.m1 = -1;
                tnVar.l1 = null;
                break;
        }
    }
}
