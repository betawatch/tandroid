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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((qg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.r4) {
                    chatActivityEnterView.I3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Y2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.j1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                vc vcVar = (vc) obj;
                new rg.x0(vcVar.W(), 42, vcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((ci.f4) obj);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = o5.q;
                ((o5) obj).v();
                break;
            case 5:
                k5 k5Var = (k5) obj;
                ArrayList arrayList = new ArrayList(k5Var.c);
                k5Var.c.clear();
                MessagesStorage.getInstance(k5Var.e).getStorageQueue().postRunnable(new h5(k5Var, arrayList, i11));
                k5Var.d = null;
                break;
            case 6:
                ((m5) obj).invalidate();
                break;
            case 7:
                ((o1.k) obj).f();
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
                ((g8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((m8) obj).c.j1();
                break;
            case 11:
                da daVar = (da) obj;
                daVar.o = true;
                daVar.d.invalidate();
                break;
            case 12:
                ca caVar = (ca) obj;
                if (!caVar.a) {
                    da daVar2 = caVar.d;
                    Bitmap[] bitmapArr = daVar2.g;
                    Canvas[] canvasArr = daVar2.h;
                    daVar2.g = daVar2.f;
                    daVar2.h = daVar2.i;
                    daVar2.f = bitmapArr;
                    daVar2.i = canvasArr;
                    daVar2.k = false;
                    ci.s6 s6Var = daVar2.d;
                    if (s6Var != null) {
                        s6Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ha haVar = ((na) obj).t;
                if (haVar != null) {
                    haVar.d();
                    break;
                }
                break;
            case 14:
                ha haVar2 = (ha) obj;
                haVar2.o = haVar2.n.b;
                haVar2.d();
                break;
            case 15:
                oc ocVar = ((hb) obj).b;
                sb sbVar = ocVar.e;
                sbVar.transitionRunningEnter = false;
                sbVar.onEnterTransitionEnd();
                if (ocVar.u) {
                    ocVar.i(true);
                    break;
                }
                break;
            case 16:
                gd gdVar = (gd) obj;
                gdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    gdVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                jd jdVar = (jd) obj;
                if (jdVar.o1) {
                    jdVar.o1 = false;
                    jdVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((qf) obj).f;
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView2.r1();
                break;
            case 20:
                ((zg) obj).s = null;
                break;
            case 21:
                ((li) obj).B0.A1.l();
                break;
            case 22:
                ok okVar = (ok) ((androidx.mediarouter.app.g) obj).b;
                try {
                    File file = okVar.O;
                    if (file == null) {
                        okVar.O();
                    } else {
                        okVar.N(file);
                    }
                    okVar.V();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((xl) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ul) obj).c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                qm qmVar = (qm) obj;
                vi viVar = qmVar.b;
                if (qmVar.Q && (chatAttachAlertPhotoLayout = viVar.j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                un unVar = (un) obj;
                unVar.k1 = -1;
                unVar.j1 = null;
                break;
            case 27:
                ((oo) obj).n();
                break;
            case 28:
                ((qo) obj).setVisibility(8);
                break;
            default:
                ((pp) obj).b.a();
                break;
        }
    }
}
