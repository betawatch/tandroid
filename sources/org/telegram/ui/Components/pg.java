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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                chatActivityEnterView.Z2.X0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                xc xcVar = (xc) obj;
                new sg.y0(xcVar.W(), 42, xcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((ei.x3) obj);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = r5.q;
                ((r5) obj).v();
                break;
            case 5:
                n5 n5Var = (n5) obj;
                ArrayList arrayList = new ArrayList(n5Var.c);
                n5Var.c.clear();
                MessagesStorage.getInstance(n5Var.e).getStorageQueue().postRunnable(new k5(n5Var, arrayList, i11));
                n5Var.d = null;
                break;
            case 6:
                ((p5) obj).invalidate();
                break;
            case 7:
                ((o1.k) obj).h();
                break;
            case 8:
                q6 q6Var = (q6) obj;
                CharSequence charSequence = q6Var.f;
                if (charSequence != null) {
                    q6Var.c(charSequence, q6Var.h, true);
                    q6Var.f = null;
                    q6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((j8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((p8) obj).c.Y0();
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
                    ei.g6 g6Var = faVar2.d;
                    if (g6Var != null) {
                        g6Var.invalidate();
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
                id idVar = (id) obj;
                idVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    idVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                kd kdVar = (kd) obj;
                if (kdVar.o1) {
                    kdVar.o1 = false;
                    kdVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f;
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView2.o1();
                break;
            case 20:
                ((ah) obj).s = null;
                break;
            case 21:
                ((ji) obj).B0.D1.l();
                break;
            case 22:
                nk nkVar = (nk) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = nkVar.O;
                    if (file == null) {
                        nkVar.R();
                    } else {
                        nkVar.Q(file);
                    }
                    nkVar.Y();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((im) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((fm) obj).c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                bn bnVar = (bn) obj;
                ti tiVar = bnVar.b;
                if (bnVar.Q && (chatAttachAlertPhotoLayout = tiVar.j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                fo foVar = (fo) obj;
                foVar.k1 = -1;
                foVar.j1 = null;
                break;
            case 27:
                ((yo) obj).n();
                break;
            case 28:
                ((ap) obj).setVisibility(8);
                break;
            default:
                ((zp) obj).b.a();
                break;
        }
    }
}
