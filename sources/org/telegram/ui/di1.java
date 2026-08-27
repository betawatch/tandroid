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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di1 implements org.telegram.ui.ActionBar.a2, Utilities.Callback3Return, oc0, rh.l0, org.telegram.ui.Components.jt, rh.a4, androidx.car.app.utils.d, y9.a, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ di1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // y9.a
    public void b(y9.b bVar) {
        y9.a aVar = (y9.a) this.b;
        y9.a aVar2 = (y9.a) this.c;
        aVar.b(bVar);
        aVar2.b(bVar);
    }

    @Override // androidx.car.app.utils.d
    public Object call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
        return null;
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
    
        r2.Y();
        r2.a.U2.N(true);
        r2.U(true);
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
    @Override // org.telegram.ui.oc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        qf.w0 w0Var = (qf.w0) this.b;
        tc0 tc0Var = (tc0) this.c;
        w0Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(w0Var.y)) {
            hc0 hc0Var = tc0Var.P;
        }
    }

    @Override // rh.l0
    public org.telegram.ui.Components.b70 e(rh.d1 d1Var) {
        i6 i6Var = (i6) this.b;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
        rh.p pVar = (rh.p) i6Var.c;
        org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(pVar, c6Var, d1Var, false, false, true);
        pVar.D = b70Var;
        return b70Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                d5.d dVar = (d5.d) this.b;
                boolean[] zArr = (boolean[]) this.c;
                dVar.accept(Boolean.TRUE);
                zArr[0] = true;
                b2Var.dismiss();
                break;
            case 1:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.b, (HashSet) this.c);
                break;
            case 2:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(z0Var.I).getInputUser(z0Var.Q);
                ConnectionsManager.getInstance(z0Var.I).sendRequest(allowsendmessage, new cg.y(z0Var, strArr, b2Var, 24));
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
                pf.u0 u0Var = (pf.u0) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                u0Var.getClass();
                zArr3[0] = true;
                u0Var.Q();
                break;
            default:
                qf.v.d(r6.currentAccount).a((qf.s) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jt
    public void k1() {
        switch (this.a) {
            case 9:
                rh.h0 h0Var = (rh.h0) this.b;
                rh.g0 g0Var = (rh.g0) this.c;
                h0Var.i();
                g0Var.X0();
                break;
            default:
                rh.g5 g5Var = (rh.g5) this.b;
                rh.j5 j5Var = (rh.j5) this.c;
                TL_iv.pageTableCell pagetablecell = j5Var.b;
                if (pagetablecell != null) {
                    rh.x5.d(pagetablecell, j5Var.a.getText());
                }
                rh.w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.a != null) {
                    rh.p3.O1(w2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        zf.x1 x1Var = (zf.x1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        x1Var.x0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof va.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && x1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new rh.o2(11, x1Var, bitmap), 2000L);
        } else {
            x1Var.y0 = true;
        }
    }

    @Override // rh.a4
    public void run(long j10) {
        rh.m3 m3Var = (rh.m3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        m3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    public /* synthetic */ di1(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.a = 3;
        this.c = zArr;
        this.b = jsPromptResult;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        qf.m mVar = (qf.m) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        mVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.d);
        qf.k kVar = mVar.n;
        mVar.x = document;
        kVar.setSticker(document);
        ((org.telegram.ui.Cells.l8) view).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }
}
