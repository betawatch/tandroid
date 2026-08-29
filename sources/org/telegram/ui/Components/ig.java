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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ig(Object obj, int i10) {
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
                ChatActivityEnterView chatActivityEnterView = ((lg) obj).R;
                if (!MediaController.getInstance().isRecordingPaused()) {
                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.n4) {
                    chatActivityEnterView.E3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                chatActivityEnterView.U2.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                tc tcVar = (tc) obj;
                new cg.p1(tcVar.W(), 42, tcVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((nh.t3) obj);
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
                ((f8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((m8) obj).c.e1();
                break;
            case 11:
                ca caVar = (ca) obj;
                caVar.o = true;
                caVar.d.invalidate();
                break;
            case 12:
                ba baVar = (ba) obj;
                if (!baVar.a) {
                    ca caVar2 = baVar.d;
                    Bitmap[] bitmapArr = caVar2.g;
                    Canvas[] canvasArr = caVar2.h;
                    caVar2.g = caVar2.f;
                    caVar2.h = caVar2.i;
                    caVar2.f = bitmapArr;
                    caVar2.i = canvasArr;
                    caVar2.k = false;
                    cg.i0 i0Var = caVar2.d;
                    if (i0Var != null) {
                        i0Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ga gaVar = ((ma) obj).t;
                if (gaVar != null) {
                    gaVar.d();
                    break;
                }
                break;
            case 14:
                ga gaVar2 = (ga) obj;
                gaVar2.o = gaVar2.n.b;
                gaVar2.d();
                break;
            case 15:
                mc mcVar = ((fb) obj).b;
                rb rbVar = mcVar.e;
                rbVar.transitionRunningEnter = false;
                rbVar.onEnterTransitionEnd();
                if (mcVar.u) {
                    mcVar.i(true);
                    break;
                }
                break;
            case 16:
                cd cdVar = (cd) obj;
                cdVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    cdVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                ed edVar = (ed) obj;
                if (edVar.k1) {
                    edVar.k1 = false;
                    edVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((lf) obj).f;
                int i12 = ChatActivityEnterView.i5;
                chatActivityEnterView2.q1();
                break;
            case 20:
                ((tg) obj).s = null;
                break;
            case 21:
                ((di) obj).x0.w1.l();
                break;
            case 22:
                jk jkVar = (jk) ((af.c) obj).b;
                try {
                    File file = jkVar.K;
                    if (file == null) {
                        jkVar.O();
                    } else {
                        jkVar.M(file);
                    }
                    jkVar.V();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((sl) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((pl) obj).c;
                if (chatAttachAlertPhotoLayout3.L != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.L.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                lm lmVar = (lm) obj;
                ni niVar = lmVar.b;
                if (lmVar.M && (chatAttachAlertPhotoLayout = niVar.f0) != null) {
                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Y0;
                    g1Var.setIcon(R.drawable.ic_ab_back);
                    g1Var.setText(LocaleController.getString(R.string.Back));
                    g1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                on onVar = (on) obj;
                onVar.g1 = -1;
                onVar.f1 = null;
                break;
            case 27:
                ((io) obj).k();
                break;
            case 28:
                ((ko) obj).setVisibility(8);
                break;
            default:
                ((jp) obj).b.a();
                break;
        }
    }
}
