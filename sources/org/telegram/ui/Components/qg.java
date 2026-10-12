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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                chatActivityEnterView.Z2.X0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                zc zcVar = (zc) obj;
                new sg.y0(zcVar.W(), 42, zcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((di.d4) obj);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 4:
                SparseArray sparseArray = s5.q;
                ((s5) obj).v();
                break;
            case 5:
                o5 o5Var = (o5) obj;
                ArrayList arrayList = new ArrayList(o5Var.c);
                o5Var.c.clear();
                MessagesStorage.getInstance(o5Var.e).getStorageQueue().postRunnable(new l5(o5Var, arrayList, i11));
                o5Var.d = null;
                break;
            case 6:
                ((q5) obj).invalidate();
                break;
            case 7:
                ((o1.k) obj).h();
                break;
            case 8:
                s6 s6Var = (s6) obj;
                CharSequence charSequence = s6Var.f;
                if (charSequence != null) {
                    s6Var.c(charSequence, s6Var.h, true);
                    s6Var.f = null;
                    s6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((l8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((s8) obj).c.l1();
                break;
            case 11:
                ha haVar = (ha) obj;
                haVar.o = true;
                haVar.d.invalidate();
                break;
            case 12:
                ga gaVar = (ga) obj;
                if (!gaVar.a) {
                    ha haVar2 = gaVar.d;
                    Bitmap[] bitmapArr = haVar2.g;
                    Canvas[] canvasArr = haVar2.h;
                    haVar2.g = haVar2.f;
                    haVar2.h = haVar2.i;
                    haVar2.f = bitmapArr;
                    haVar2.i = canvasArr;
                    haVar2.k = false;
                    di.p6 p6Var = haVar2.d;
                    if (p6Var != null) {
                        p6Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                la laVar = ((ra) obj).t;
                if (laVar != null) {
                    laVar.d();
                    break;
                }
                break;
            case 14:
                la laVar2 = (la) obj;
                laVar2.o = laVar2.n.b;
                laVar2.d();
                break;
            case 15:
                sc scVar = ((lb) obj).b;
                wb wbVar = scVar.e;
                wbVar.transitionRunningEnter = false;
                wbVar.onEnterTransitionEnd();
                if (scVar.u) {
                    scVar.i(true);
                    break;
                }
                break;
            case 16:
                kd kdVar = (kd) obj;
                kdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    kdVar.invalidateSelf();
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
                chatActivityEnterView2.o1();
                break;
            case 20:
                ((bh) obj).s = null;
                break;
            case 21:
                ((li) obj).B0.D1.l();
                break;
            case 22:
                pk pkVar = (pk) ((androidx.mediarouter.app.f) obj).b;
                try {
                    File file = pkVar.O;
                    if (file == null) {
                        pkVar.R();
                    } else {
                        pkVar.Q(file);
                    }
                    pkVar.Y();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((lm) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((im) obj).c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                en enVar = (en) obj;
                vi viVar = enVar.b;
                if (enVar.Q && (chatAttachAlertPhotoLayout = viVar.j0) != null) {
                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.c1;
                    e1Var.setIcon(R.drawable.ic_ab_back);
                    e1Var.setText(LocaleController.getString(R.string.Back));
                    e1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                io ioVar = (io) obj;
                ioVar.k1 = -1;
                ioVar.j1 = null;
                break;
            case 27:
                ((bp) obj).n();
                break;
            case 28:
                ((dp) obj).setVisibility(8);
                break;
            default:
                ((cq) obj).b.a();
                break;
        }
    }
}
