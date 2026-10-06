package org.telegram.ui.Components;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.widget.EditText;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((tg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                yc ycVar = (yc) obj;
                new rg.y0(ycVar.W(), 42, ycVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((ci.e4) obj);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = q5.q;
                ((q5) obj).v();
                break;
            case 5:
                m5 m5Var = (m5) obj;
                ArrayList arrayList = new ArrayList(m5Var.c);
                m5Var.c.clear();
                MessagesStorage.getInstance(m5Var.e).getStorageQueue().postRunnable(new j5(m5Var, arrayList, i11));
                m5Var.d = null;
                break;
            case 6:
                ((o5) obj).invalidate();
                break;
            case 7:
                ((o1.k) obj).f();
                break;
            case 8:
                p6 p6Var = (p6) obj;
                CharSequence charSequence = p6Var.f;
                if (charSequence != null) {
                    p6Var.c(charSequence, p6Var.h, true);
                    p6Var.f = null;
                    p6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((i8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((o8) obj).c.l1();
                break;
            case 11:
                ga gaVar = (ga) obj;
                gaVar.o = true;
                gaVar.d.invalidate();
                break;
            case 12:
                fa faVar = (fa) obj;
                if (!faVar.a) {
                    ga gaVar2 = faVar.d;
                    Bitmap[] bitmapArr = gaVar2.g;
                    Canvas[] canvasArr = gaVar2.h;
                    gaVar2.g = gaVar2.f;
                    gaVar2.h = gaVar2.i;
                    gaVar2.f = bitmapArr;
                    gaVar2.i = canvasArr;
                    gaVar2.k = false;
                    ci.r6 r6Var = gaVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ka kaVar = ((qa) obj).t;
                if (kaVar != null) {
                    kaVar.d();
                    break;
                }
                break;
            case 14:
                ka kaVar2 = (ka) obj;
                kaVar2.o = kaVar2.n.b;
                kaVar2.d();
                break;
            case 15:
                rc rcVar = ((kb) obj).b;
                vb vbVar = rcVar.e;
                vbVar.transitionRunningEnter = false;
                vbVar.onEnterTransitionEnd();
                if (rcVar.u) {
                    rcVar.i(true);
                    break;
                }
                break;
            case 16:
                jd jdVar = (jd) obj;
                jdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    jdVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                md mdVar = (md) obj;
                if (mdVar.o1) {
                    mdVar.o1 = false;
                    mdVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f;
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView2.p1();
                break;
            case 20:
                ((ch) obj).s = null;
                break;
            case 21:
                ((ki) obj).B0.A1.l();
                break;
            case 22:
                rk rkVar = (rk) ((androidx.mediarouter.app.g) obj).b;
                try {
                    File file = rkVar.O;
                    if (file == null) {
                        rkVar.M();
                    } else {
                        rkVar.L(file);
                    }
                    rkVar.T();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((xl) obj).c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                tm tmVar = (tm) obj;
                xi xiVar = tmVar.b;
                if (tmVar.Q && (chatAttachAlertPhotoLayout = xiVar.j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                xn xnVar = (xn) obj;
                xnVar.k1 = -1;
                xnVar.j1 = null;
                break;
            case 27:
                ((ro) obj).k();
                break;
            case 28:
                ((to) obj).setVisibility(8);
                break;
            default:
                ((sp) obj).b.a();
                break;
        }
    }
}
