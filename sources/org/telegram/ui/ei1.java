package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei1 implements org.telegram.ui.ActionBar.b2, Utilities.Callback3Return, kc0, qh.l0, org.telegram.ui.Components.kt, qh.z3, androidx.car.app.utils.e, x9.a, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ei1(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.car.app.utils.e
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i9 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.y = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.d = true;
        r1.setText(r2.y);
        r1 = r2.f;
        r1.setSelection(r1.getText().length());
        r2.d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.X();
        r2.a.U2.N(true);
        r2.T(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.A != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.N : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.A = true;
        r1 = r3.P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.kc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        pf.w0 w0Var = (pf.w0) this.b;
        pc0 pc0Var = (pc0) this.c;
        w0Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(w0Var.y)) {
            dc0 dc0Var = pc0Var.P;
        }
    }

    @Override // x9.a
    public void e(x9.b bVar) {
        x9.a aVar = (x9.a) this.b;
        x9.a aVar2 = (x9.a) this.c;
        aVar.e(bVar);
        aVar2.e(bVar);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                d5.d dVar = (d5.d) this.b;
                boolean[] zArr = (boolean[]) this.c;
                dVar.accept(Boolean.TRUE);
                zArr[0] = true;
                c2Var.dismiss();
                break;
            case 1:
                org.telegram.ui.web.o.X((org.telegram.ui.web.o) this.b, (HashSet) this.c);
                break;
            case 2:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(y0Var.I).getInputUser(y0Var.Q);
                ConnectionsManager.getInstance(y0Var.I).sendRequest(allowsendmessage, new bg.b0(y0Var, strArr, c2Var, 24));
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) this.c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 4:
            default:
                zf.j0.P((zf.j0) this.b, (ArrayList) this.c);
                break;
            case 5:
                pf.u.d(r6.currentAccount).a((pf.r) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // qh.l0
    public org.telegram.ui.Components.x60 g(qh.d1 d1Var) {
        org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) this.b;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
        qh.p pVar = (qh.p) e3Var.c;
        org.telegram.ui.Components.x60 x60Var = new org.telegram.ui.Components.x60(pVar, b6Var, d1Var, false, false, true);
        pVar.D = x60Var;
        return x60Var;
    }

    @Override // org.telegram.ui.Components.kt
    public void m1() {
        switch (this.a) {
            case 8:
                qh.h0 h0Var = (qh.h0) this.b;
                qh.g0 g0Var = (qh.g0) this.c;
                h0Var.i();
                g0Var.N0();
                break;
            default:
                qh.f5 f5Var = (qh.f5) this.b;
                qh.i5 i5Var = (qh.i5) this.c;
                TL_iv.pageTableCell pagetablecell = i5Var.b;
                if (pagetablecell != null) {
                    qh.w5.d(pagetablecell, i5Var.a.getText());
                }
                qh.v2 v2Var = f5Var.A;
                if (v2Var != null && f5Var.a != null) {
                    qh.o3.O1(v2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        yf.x1 x1Var = (yf.x1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        x1Var.x0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof ua.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && x1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new xf.o0(5, x1Var, bitmap), 2000L);
        } else {
            x1Var.y0 = true;
        }
    }

    @Override // qh.z3
    public void run(long j10) {
        qh.l3 l3Var = (qh.l3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        l3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    public /* synthetic */ ei1(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.a = 3;
        this.c = zArr;
        this.b = jsPromptResult;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        pf.l lVar = (pf.l) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        lVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(lVar.d);
        pf.j jVar = lVar.n;
        lVar.x = document;
        jVar.setSticker(document);
        ((org.telegram.ui.Cells.p8) view).setValueSticker(document);
        lVar.d0(true);
        return Boolean.TRUE;
    }
}
