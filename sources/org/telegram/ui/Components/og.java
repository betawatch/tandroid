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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ og(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((rg) obj).V;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.b1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                xc xcVar = (xc) obj;
                new rg.x0(xcVar.W(), 42, xcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((ci.f4) obj);
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
                ((h8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((n8) obj).c.j1();
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
                    ci.s6 s6Var = eaVar2.d;
                    if (s6Var != null) {
                        s6Var.invalidate();
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
                id idVar = (id) obj;
                idVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    idVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                ld ldVar = (ld) obj;
                if (ldVar.o1) {
                    ldVar.o1 = false;
                    ldVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((rf) obj).f;
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView2.p1();
                break;
            case 20:
                ((ah) obj).s = null;
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
