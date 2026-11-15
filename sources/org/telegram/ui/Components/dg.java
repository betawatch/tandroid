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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dg(Object obj, int i7) {
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
                ChatActivityEnterView chatActivityEnterView = ((gg) obj).Q0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.np.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.a5) {
                    chatActivityEnterView.r4 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.H3.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                cc ccVar = (cc) obj;
                new ug.x0(42, ccVar.W(), ccVar.c).show();
                break;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.requestFocus();
                org.telegram.messenger.g0.J3(s4Var);
                break;
            case 3:
                org.telegram.messenger.g0.J3((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = g5.r;
                ((g5) obj).u();
                break;
            case 5:
                c5 c5Var = (c5) obj;
                ArrayList arrayList = new ArrayList(c5Var.c);
                c5Var.c.clear();
                org.telegram.messenger.vr.a0(c5Var.e).a.c(new z4(c5Var, arrayList, i10));
                c5Var.d = null;
                break;
            case 6:
                ((e5) obj).invalidate();
                break;
            case 7:
                ((r1.g) obj).h();
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
                ((x7) obj).n.s1.setVisibility(8);
                break;
            case 10:
                ((c8) ((org.telegram.messenger.qe) obj).d).g1();
                break;
            case 11:
                s9 s9Var = (s9) obj;
                s9Var.o = true;
                s9Var.d.invalidate();
                break;
            case 12:
                r9 r9Var = (r9) obj;
                if (!r9Var.a) {
                    s9 s9Var2 = r9Var.d;
                    Bitmap[] bitmapArr = s9Var2.g;
                    Canvas[] canvasArr = s9Var2.h;
                    s9Var2.g = s9Var2.f;
                    s9Var2.h = s9Var2.i;
                    s9Var2.f = bitmapArr;
                    s9Var2.i = canvasArr;
                    s9Var2.k = false;
                    hi.n5 n5Var = s9Var2.d;
                    if (n5Var != null) {
                        n5Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                u9 u9Var = ((z9) obj).t;
                if (u9Var != null) {
                    u9Var.d();
                    break;
                }
                break;
            case 14:
                u9 u9Var2 = (u9) obj;
                u9Var2.o = (Bitmap) u9Var2.n.c;
                u9Var2.d();
                break;
            case 15:
                xb xbVar = ((ra) obj).b;
                cb cbVar = xbVar.e;
                cbVar.transitionRunningEnter = false;
                cbVar.onEnterTransitionEnd();
                if (xbVar.u) {
                    xbVar.i(true);
                    break;
                }
                break;
            case 16:
                nc ncVar = (nc) obj;
                ncVar.getClass();
                if (org.telegram.messenger.qc.e(512)) {
                    ncVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                pc pcVar = (pc) obj;
                if (pcVar.o1) {
                    pcVar.o1 = false;
                    pcVar.invalidate();
                    break;
                }
                break;
            case 18:
                int i11 = ChatActivityEnterView.N6;
                ((yc) obj).a(Boolean.FALSE, 0, 0);
                break;
            case 19:
                int i12 = ChatActivityEnterView.N6;
                org.telegram.messenger.g0.P3((Activity) obj);
                break;
            case 20:
                ((Dialog) obj).dismiss();
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((ze) obj).f;
                int i13 = ChatActivityEnterView.N6;
                chatActivityEnterView2.I1();
                break;
            case 22:
                org.telegram.messenger.g0.E2((ji.n) obj);
                break;
            case 23:
                ((pg) obj).s = null;
                break;
            case 24:
                ((xh) obj).l0.y3.f();
                break;
            case 25:
                dk dkVar = (dk) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = dkVar.P;
                    if (file == null) {
                        dkVar.T();
                    } else {
                        dkVar.S(file);
                    }
                    dkVar.a0();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((tl) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                break;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((rl) obj).c;
                xl xlVar = chatAttachAlertPhotoLayout3.Q;
                if (xlVar != null && !chatAttachAlertPhotoLayout3.b.J) {
                    xlVar.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 28:
                im imVar = (im) obj;
                ki kiVar = imVar.b;
                if (imVar.R && (chatAttachAlertPhotoLayout = kiVar.e2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.d1;
                    z0Var.setIcon(R.drawable.ic_ab_back);
                    z0Var.setText(org.telegram.messenger.hd.M0(2131753756, null));
                    z0Var.setRightIcon(0);
                    break;
                }
                break;
            default:
                jn jnVar = (jn) obj;
                jnVar.m1 = -1;
                jnVar.l1 = null;
                break;
        }
    }
}
