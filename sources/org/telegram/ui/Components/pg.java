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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pg(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).V;
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
                new rg.x0(ycVar.W(), 42, ycVar.c).show();
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
                ((o8) obj).c.j1();
                break;
            case 11:
                fa faVar = (fa) obj;
                faVar.o = true;
                faVar.d.invalidate();
                break;
            case 12:
                ea eaVar = (ea) obj;
                if (!eaVar.a) {
                    fa faVar2 = eaVar.d;
                    Bitmap[] bitmapArr = faVar2.g;
                    Canvas[] canvasArr = faVar2.h;
                    faVar2.g = faVar2.f;
                    faVar2.h = faVar2.i;
                    faVar2.f = bitmapArr;
                    faVar2.i = canvasArr;
                    faVar2.k = false;
                    ci.r6 r6Var = faVar2.d;
                    if (r6Var != null) {
                        r6Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ja jaVar = ((pa) obj).t;
                if (jaVar != null) {
                    jaVar.d();
                    break;
                }
                break;
            case 14:
                ja jaVar2 = (ja) obj;
                jaVar2.o = jaVar2.n.b;
                jaVar2.d();
                break;
            case 15:
                qc qcVar = ((jb) obj).b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.u) {
                    qcVar.i(true);
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
                ChatActivityEnterView chatActivityEnterView2 = ((sf) obj).f;
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView2.q1();
                break;
            case 20:
                ((bh) obj).s = null;
                break;
            case 21:
                ((mi) obj).B0.A1.l();
                break;
            case 22:
                pk pkVar = (pk) ((androidx.mediarouter.app.g) obj).b;
                try {
                    File file = pkVar.O;
                    if (file == null) {
                        pkVar.O();
                    } else {
                        pkVar.N(file);
                    }
                    pkVar.V();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((yl) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((vl) obj).c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                rm rmVar = (rm) obj;
                wi wiVar = rmVar.b;
                if (rmVar.Q && (chatAttachAlertPhotoLayout = wiVar.j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                vn vnVar = (vn) obj;
                vnVar.k1 = -1;
                vnVar.j1 = null;
                break;
            case 27:
                ((po) obj).n();
                break;
            case 28:
                ((ro) obj).setVisibility(8);
                break;
            default:
                ((qp) obj).b.a();
                break;
        }
    }
}
