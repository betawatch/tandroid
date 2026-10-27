package org.telegram.ui.Components;

import android.app.Activity;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ChatActivityEnterView chatActivityEnterView = ((sg) obj).b0;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.M0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                wc wcVar = (wc) obj;
                new tg.y0(wcVar.X(), 42, wcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((fi.v3) obj);
                break;
            case 3:
                f5 f5Var = (f5) obj;
                f5Var.requestFocus();
                AndroidUtilities.showKeyboard(f5Var);
                break;
            case 4:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 5:
                SparseArray sparseArray = t5.r;
                ((t5) obj).v();
                break;
            case 6:
                p5 p5Var = (p5) obj;
                ArrayList arrayList = new ArrayList(p5Var.c);
                p5Var.c.clear();
                MessagesStorage.getInstance(p5Var.e).getStorageQueue().postRunnable(new m5(p5Var, arrayList, i11));
                p5Var.d = null;
                break;
            case 7:
                ((r5) obj).invalidate();
                break;
            case 8:
                ((o1.j) obj).h();
                break;
            case 9:
                s6 s6Var = (s6) obj;
                CharSequence charSequence = s6Var.f;
                if (charSequence != null) {
                    s6Var.c(charSequence, s6Var.h, true);
                    s6Var.f = null;
                    s6Var.h = false;
                    break;
                }
                break;
            case 10:
                ((l8) obj).n.n.setVisibility(8);
                break;
            case 11:
                ((r8) obj).c.e1();
                break;
            case 12:
                ja jaVar = (ja) obj;
                jaVar.o = true;
                jaVar.d.invalidate();
                break;
            case 13:
                ia iaVar = (ia) obj;
                if (!iaVar.a) {
                    ja jaVar2 = iaVar.d;
                    Bitmap[] bitmapArr = jaVar2.g;
                    Canvas[] canvasArr = jaVar2.h;
                    jaVar2.g = jaVar2.f;
                    jaVar2.h = jaVar2.i;
                    jaVar2.f = bitmapArr;
                    jaVar2.i = canvasArr;
                    jaVar2.k = false;
                    fi.f6 f6Var = jaVar2.d;
                    if (f6Var != null) {
                        f6Var.invalidate();
                        break;
                    }
                }
                break;
            case 14:
                la laVar = ((ra) obj).t;
                if (laVar != null) {
                    laVar.d();
                    break;
                }
                break;
            case 15:
                la laVar2 = (la) obj;
                laVar2.o = laVar2.n.b;
                laVar2.d();
                break;
            case 16:
                qc qcVar = ((jb) obj).b;
                ub ubVar = qcVar.e;
                ubVar.transitionRunningEnter = false;
                ubVar.onEnterTransitionEnd();
                if (qcVar.v) {
                    qcVar.i(true);
                    break;
                }
                break;
            case 17:
                hd hdVar = (hd) obj;
                hdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    hdVar.invalidateSelf();
                    break;
                }
                break;
            case 18:
                jd jdVar = (jd) obj;
                if (jdVar.o1) {
                    jdVar.o1 = false;
                    jdVar.invalidate();
                    break;
                }
                break;
            case 19:
                int i12 = ChatActivityEnterView.r5;
                AndroidUtilities.unlockOrientation((Activity) obj);
                break;
            case 20:
                ((Dialog) obj).dismiss();
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f;
                int i13 = ChatActivityEnterView.r5;
                chatActivityEnterView2.m1();
                break;
            case 22:
                ((ah) obj).s = null;
                break;
            case 23:
                ((gi) obj).q0.D1.l();
                break;
            case 24:
                nk nkVar = (nk) ((androidx.mediarouter.app.g) obj).b;
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
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((jm) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.q0(-1, true);
                break;
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((gm) obj).c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 27:
                cn cnVar = (cn) obj;
                ti tiVar = cnVar.b;
                if (cnVar.Q && (chatAttachAlertPhotoLayout = tiVar.j0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.c1;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    break;
                }
                break;
            case 28:
                go goVar = (go) obj;
                goVar.l1 = -1;
                goVar.k1 = null;
                break;
            default:
                ((ap) obj).n();
                break;
        }
    }
}
