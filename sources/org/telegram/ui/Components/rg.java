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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                if (chatActivityEnterView.s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                chatActivityEnterView.Z2.g1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 1:
                ad adVar = (ad) obj;
                new rg.y0(adVar.W(), 42, adVar.c).show();
                break;
            case 2:
                AndroidUtilities.removeFromParent((ci.d4) obj);
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
                r6 r6Var = (r6) obj;
                CharSequence charSequence = r6Var.f;
                if (charSequence != null) {
                    r6Var.c(charSequence, r6Var.h, true);
                    r6Var.f = null;
                    r6Var.h = false;
                    break;
                }
                break;
            case 9:
                ((k8) obj).n.n.setVisibility(8);
                break;
            case 10:
                ((q8) obj).c.h1();
                break;
            case 11:
                ia iaVar = (ia) obj;
                iaVar.o = true;
                iaVar.d.invalidate();
                break;
            case 12:
                ha haVar = (ha) obj;
                if (!haVar.a) {
                    ia iaVar2 = haVar.d;
                    Bitmap[] bitmapArr = iaVar2.g;
                    Canvas[] canvasArr = iaVar2.h;
                    iaVar2.g = iaVar2.f;
                    iaVar2.h = iaVar2.i;
                    iaVar2.f = bitmapArr;
                    iaVar2.i = canvasArr;
                    iaVar2.k = false;
                    ci.r6 r6Var2 = iaVar2.d;
                    if (r6Var2 != null) {
                        r6Var2.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ma maVar = ((sa) obj).t;
                if (maVar != null) {
                    maVar.d();
                    break;
                }
                break;
            case 14:
                ma maVar2 = (ma) obj;
                maVar2.o = maVar2.n.b;
                maVar2.d();
                break;
            case 15:
                tc tcVar = ((mb) obj).b;
                xb xbVar = tcVar.e;
                xbVar.transitionRunningEnter = false;
                xbVar.onEnterTransitionEnd();
                if (tcVar.u) {
                    tcVar.i(true);
                    break;
                }
                break;
            case 16:
                ld ldVar = (ld) obj;
                ldVar.getClass();
                if (LiteMode.isEnabled(512)) {
                    ldVar.invalidateSelf();
                    break;
                }
                break;
            case 17:
                od odVar = (od) obj;
                if (odVar.o1) {
                    odVar.o1 = false;
                    odVar.invalidate();
                    break;
                }
                break;
            case 18:
                ((Dialog) obj).dismiss();
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = ((uf) obj).f;
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView2.o1();
                break;
            case 20:
                ((dh) obj).s = null;
                break;
            case 21:
                ((oi) obj).B0.D1.l();
                break;
            case 22:
                sk skVar = (sk) ((androidx.mediarouter.app.g) obj).b;
                try {
                    File file = skVar.O;
                    if (file == null) {
                        skVar.R();
                    } else {
                        skVar.Q(file);
                    }
                    skVar.Y();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((om) obj).b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout2.p0(-1, true);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((lm) obj).c;
                if (chatAttachAlertPhotoLayout3.P != null && !chatAttachAlertPhotoLayout3.b.isDismissed()) {
                    chatAttachAlertPhotoLayout3.P.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 25:
                hn hnVar = (hn) obj;
                yi yiVar = hnVar.b;
                if (hnVar.Q && (chatAttachAlertPhotoLayout = yiVar.j0) != null) {
                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.c1;
                    f1Var.setIcon(R.drawable.ic_ab_back);
                    f1Var.setText(LocaleController.getString(R.string.Back));
                    f1Var.setRightIcon(0);
                    break;
                }
                break;
            case 26:
                lo loVar = (lo) obj;
                loVar.k1 = -1;
                loVar.j1 = null;
                break;
            case 27:
                ((ep) obj).o();
                break;
            case 28:
                ((gp) obj).setVisibility(8);
                break;
            default:
                ((fq) obj).b.a();
                break;
        }
    }
}
