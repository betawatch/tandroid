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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((ug) obj).V;
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
                wc wcVar = (wc) obj;
                new qg.a1(wcVar.W(), 42, wcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((bi.x4) obj);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = p5.q;
                ((p5) obj).v();
                break;
            case 5:
                l5 l5Var = (l5) obj;
                ArrayList arrayList = new ArrayList(l5Var.c);
                l5Var.c.clear();
                MessagesStorage.getInstance(l5Var.e).getStorageQueue().postRunnable(new i5(l5Var, arrayList, i11));
                l5Var.d = null;
                break;
            case 6:
                ((n5) obj).invalidate();
                break;
            case 7:
                ((o1.k) obj).f();
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
                ((i8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((o8) obj).c.i1();
                break;
            case 11:
                ea eaVar = (ea) obj;
                eaVar.o = true;
                eaVar.d.invalidate();
                break;
            case 12:
                da daVar = (da) obj;
                if (!daVar.a) {
                    ea eaVar2 = daVar.d;
                    Bitmap[] bitmapArr = eaVar2.g;
                    Canvas[] canvasArr = eaVar2.h;
                    eaVar2.g = eaVar2.f;
                    eaVar2.h = eaVar2.i;
                    eaVar2.f = bitmapArr;
                    eaVar2.i = canvasArr;
                    eaVar2.k = false;
                    bi.s7 s7Var = eaVar2.d;
                    if (s7Var != null) {
                        s7Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ia iaVar = ((oa) obj).t;
                if (iaVar != null) {
                    iaVar.d();
                    break;
                }
                break;
            case 14:
                ia iaVar2 = (ia) obj;
                iaVar2.o = iaVar2.n.b;
                iaVar2.d();
                break;
            case 15:
                pc pcVar = ((ib) obj).b;
                tb tbVar = pcVar.e;
                tbVar.transitionRunningEnter = false;
                tbVar.onEnterTransitionEnd();
                if (pcVar.u) {
                    pcVar.i(true);
                    break;
                }
                break;
            case 16:
                hd hdVar = (hd) obj;
                hdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    hdVar.invalidateSelf();
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
                ChatActivityEnterView chatActivityEnterView2 = ((tf) obj).f;
                int i12 = ChatActivityEnterView.m5;
                chatActivityEnterView2.q1();
                break;
            case 20:
                ((dh) obj).s = null;
                break;
            case 21:
                ((oi) obj).B0.A1.l();
                break;
            case 22:
                tk tkVar = (tk) ((androidx.mediarouter.app.g) obj).b;
                try {
                    File file = tkVar.O;
                    if (file == null) {
                        tkVar.O();
                    } else {
                        tkVar.N(file);
                    }
                    tkVar.V();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((cm) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((zl) obj).c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                xm xmVar = (xm) obj;
                yi yiVar = xmVar.b;
                if (xmVar.Q && (chatAttachAlertPhotoLayout = yiVar.j0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.c1;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                zn znVar = (zn) obj;
                znVar.k1 = -1;
                znVar.j1 = null;
                break;
            case 27:
                ((to) obj).n();
                break;
            case 28:
                ((vo) obj).setVisibility(8);
                break;
            default:
                ((vp) obj).b.a();
                break;
        }
    }
}
