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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bg(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((eg) obj).R;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.n4) {
                    chatActivityEnterView.E3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                chatActivityEnterView.U2.N0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                mc mcVar = (mc) obj;
                new ag.g2(mcVar.W(), 42, mcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((lh.w3) obj);
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
                MessagesStorage.getInstance(g5Var.e).getStorageQueue().postRunnable(new d5(g5Var, arrayList, i11));
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
                ((a8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((g8) obj).c.j1();
                break;
            case 11:
                v9 v9Var = (v9) obj;
                v9Var.o = true;
                v9Var.d.invalidate();
                break;
            case 12:
                u9 u9Var = (u9) obj;
                if (!u9Var.a) {
                    v9 v9Var2 = u9Var.d;
                    Bitmap[] bitmapArr = v9Var2.g;
                    Canvas[] canvasArr = v9Var2.h;
                    v9Var2.g = v9Var2.f;
                    v9Var2.h = v9Var2.i;
                    v9Var2.f = bitmapArr;
                    v9Var2.i = canvasArr;
                    v9Var2.k = false;
                    ag.t0 t0Var = v9Var2.d;
                    if (t0Var != null) {
                        t0Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                z9 z9Var = ((fa) obj).t;
                if (z9Var != null) {
                    z9Var.d();
                    break;
                }
                break;
            case 14:
                z9 z9Var2 = (z9) obj;
                z9Var2.o = z9Var2.n.b;
                z9Var2.d();
                break;
            case 15:
                ec ecVar = ((ya) obj).b;
                jb jbVar = ecVar.e;
                jbVar.transitionRunningEnter = false;
                jbVar.onEnterTransitionEnd();
                if (ecVar.u) {
                    ecVar.i(true);
                    break;
                }
                break;
            case 16:
                vc vcVar = (vc) obj;
                vcVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    vcVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                xc xcVar = (xc) obj;
                if (xcVar.k1) {
                    xcVar.k1 = false;
                    xcVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((df) obj).f;
                int i12 = ChatActivityEnterView.i5;
                chatActivityEnterView2.p1();
                break;
            case 20:
                ((mg) obj).s = null;
                break;
            case 21:
                ((wh) obj).x0.w1.l();
                break;
            case 22:
                bk bkVar = (bk) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = bkVar.K;
                    if (file == null) {
                        bkVar.O();
                    } else {
                        bkVar.N(file);
                    }
                    bkVar.V();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((kl) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((hl) obj).c;
                if (chatAttachAlertPhotoLayout3.L != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.L.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                em emVar = (em) obj;
                gi giVar = emVar.b;
                if (emVar.M && (chatAttachAlertPhotoLayout = giVar.f0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.Y0;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                in inVar = (in) obj;
                inVar.g1 = -1;
                inVar.f1 = null;
                break;
            case 27:
                ((bo) obj).m();
                break;
            case 28:
                ((eo) obj).setVisibility(8);
                break;
            default:
                ((dp) obj).b.a();
                break;
        }
    }
}
