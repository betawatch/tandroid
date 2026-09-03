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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((ig) obj).S;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.o4) {
                    chatActivityEnterView.F3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.L);
                chatActivityEnterView.V2.f1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.g1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                qc qcVar = (qc) obj;
                new eg.o1(qcVar.W(), 42, qcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((ph.f3) obj);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = l5.q;
                ((l5) obj).v();
                break;
            case 5:
                h5 h5Var = (h5) obj;
                ArrayList arrayList = new ArrayList(h5Var.c);
                h5Var.c.clear();
                MessagesStorage.getInstance(h5Var.e).getStorageQueue().postRunnable(new e5(h5Var, arrayList, i11));
                h5Var.d = null;
                break;
            case 6:
                ((j5) obj).invalidate();
                break;
            case 7:
                ((o1.j) obj).f();
                break;
            case 8:
                k6 k6Var = (k6) obj;
                CharSequence charSequence = k6Var.f;
                if (charSequence != null) {
                    k6Var.c(charSequence, k6Var.h, true);
                    k6Var.f = null;
                    k6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((b8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((h8) obj).c.i1();
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
                    eg.i0 i0Var = x9Var2.d;
                    if (i0Var != null) {
                        i0Var.invalidate();
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
                ic icVar = ((ab) obj).b;
                nb nbVar = icVar.e;
                nbVar.transitionRunningEnter = false;
                nbVar.onEnterTransitionEnd();
                if (icVar.u) {
                    icVar.i(true);
                    break;
                }
                break;
            case 16:
                zc zcVar = (zc) obj;
                zcVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    zcVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                bd bdVar = (bd) obj;
                if (bdVar.l1) {
                    bdVar.l1 = false;
                    bdVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((hf) obj).f;
                int i12 = ChatActivityEnterView.j5;
                chatActivityEnterView2.q1();
                break;
            case 20:
                ((qg) obj).s = null;
                break;
            case 21:
                ((bi) obj).y0.x1.l();
                break;
            case 22:
                hk hkVar = (hk) ((androidx.mediarouter.app.h) obj).b;
                try {
                    File file = hkVar.L;
                    if (file == null) {
                        hkVar.O();
                    } else {
                        hkVar.N(file);
                    }
                    hkVar.V();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((tl) obj).b;
                boolean z4 = ChatAttachAlertPhotoLayout.n1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((pl) obj).c;
                if (chatAttachAlertPhotoLayout3.M != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.M.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                nm nmVar = (nm) obj;
                li liVar = nmVar.b;
                if (nmVar.N && (chatAttachAlertPhotoLayout = liVar.g0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Z0;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                pn pnVar = (pn) obj;
                pnVar.h1 = -1;
                pnVar.g1 = null;
                break;
            case 27:
                ((jo) obj).k();
                break;
            case 28:
                ((lo) obj).setVisibility(8);
                break;
            default:
                ((mp) obj).b.a();
                break;
        }
    }
}
