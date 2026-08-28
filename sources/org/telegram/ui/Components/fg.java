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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i9 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i9) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ig) obj).R;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.n4) {
                    chatActivityEnterView.E3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                chatActivityEnterView.U2.L0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                oc ocVar = (oc) obj;
                new zf.x0(ocVar.W(), 42, ocVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((kh.x3) obj);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = k5.q;
                ((k5) obj).v();
                break;
            case 5:
                g5 g5Var = (g5) obj;
                ArrayList arrayList = new ArrayList(g5Var.c);
                g5Var.c.clear();
                MessagesStorage.getInstance(g5Var.e).getStorageQueue().postRunnable(new d5(g5Var, arrayList, i10));
                g5Var.d = null;
                break;
            case 6:
                ((i5) obj).invalidate();
                break;
            case 7:
                ((o1.j) obj).f();
                break;
            case 8:
                j6 j6Var = (j6) obj;
                CharSequence charSequence = j6Var.f;
                if (charSequence != null) {
                    j6Var.c(charSequence, j6Var.h, true);
                    j6Var.f = null;
                    j6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((b8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((h8) obj).c.h1();
                break;
            case 11:
                x9 x9Var = (x9) obj;
                x9Var.o = true;
                x9Var.d.invalidate();
                break;
            case 12:
                w9 w9Var = (w9) obj;
                if (!w9Var.a) {
                    x9 x9Var2 = w9Var.d;
                    Bitmap[] bitmapArr = x9Var2.g;
                    Canvas[] canvasArr = x9Var2.h;
                    x9Var2.g = x9Var2.f;
                    x9Var2.h = x9Var2.i;
                    x9Var2.f = bitmapArr;
                    x9Var2.i = canvasArr;
                    x9Var2.k = false;
                    kh.h6 h6Var = x9Var2.d;
                    if (h6Var != null) {
                        h6Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ba baVar = ((ha) obj).t;
                if (baVar != null) {
                    baVar.d();
                    break;
                }
                break;
            case 14:
                ba baVar2 = (ba) obj;
                baVar2.o = baVar2.n.b;
                baVar2.d();
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
                yc ycVar = (yc) obj;
                ycVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    ycVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                ad adVar = (ad) obj;
                if (adVar.k1) {
                    adVar.k1 = false;
                    adVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((hf) obj).f;
                int i11 = ChatActivityEnterView.i5;
                chatActivityEnterView2.q1();
                break;
            case 20:
                ((qg) obj).s = null;
                break;
            case 21:
                ((ai) obj).x0.w1.l();
                break;
            case 22:
                fk fkVar = (fk) ((androidx.mediarouter.app.h) obj).b;
                try {
                    File file = fkVar.K;
                    if (file == null) {
                        fkVar.N();
                    } else {
                        fkVar.M(file);
                    }
                    fkVar.U();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ol) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout2.o0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ll) obj).c;
                if (chatAttachAlertPhotoLayout3.L != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.L.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                hm hmVar = (hm) obj;
                ki kiVar = hmVar.b;
                if (hmVar.M && (chatAttachAlertPhotoLayout = kiVar.f0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Y0;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                jn jnVar = (jn) obj;
                jnVar.g1 = -1;
                jnVar.f1 = null;
                break;
            case 27:
                ((eo) obj).p();
                break;
            case 28:
                ((go) obj).setVisibility(8);
                break;
            default:
                ((fp) obj).b.a();
                break;
        }
    }
}
