package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bl0, Utilities.Callback3Return, mc0, th.l0, org.telegram.ui.Components.qt, th.a4, androidx.car.app.utils.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fi1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // th.l0
    public org.telegram.ui.Components.j70 b(th.d1 d1Var) {
        oc.i iVar = (oc.i) this.b;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
        th.p pVar = (th.p) iVar.c;
        org.telegram.ui.Components.j70 j70Var = new org.telegram.ui.Components.j70(pVar, c6Var, d1Var, false, false, true);
        pVar.D = j70Var;
        return j70Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        return ph.d3.B0((ph.d3) this.b, (Context) this.c, view, i10);
    }

    @Override // androidx.car.app.utils.e
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
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
    @Override // org.telegram.ui.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        sf.v0 v0Var = (sf.v0) this.b;
        rc0 rc0Var = (rc0) this.c;
        v0Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(v0Var.y)) {
            fc0 fc0Var = rc0Var.P;
        }
    }

    @Override // org.telegram.ui.Components.qt
    public void e1() {
        switch (this.a) {
            case 11:
                th.h0 h0Var = (th.h0) this.b;
                th.g0 g0Var = (th.g0) this.c;
                h0Var.i();
                g0Var.l0();
                break;
            default:
                th.g5 g5Var = (th.g5) this.b;
                th.j5 j5Var = (th.j5) this.c;
                TL_iv.pageTableCell pagetablecell = j5Var.b;
                if (pagetablecell != null) {
                    th.x5.d(pagetablecell, j5Var.a.getText());
                }
                th.w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.a != null) {
                    th.p3.O1(w2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                f5.d dVar = (f5.d) this.b;
                boolean[] zArr = (boolean[]) this.c;
                dVar.accept(Boolean.TRUE);
                zArr[0] = true;
                c2Var.dismiss();
                break;
            case 1:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.b, (HashSet) this.c);
                break;
            case 2:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(z0Var.I).getInputUser(z0Var.Q);
                ConnectionsManager.getInstance(z0Var.I).sendRequest(allowsendmessage, new eg.z(z0Var, strArr, c2Var, 22));
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
                ph.d3.y0((ph.d3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 5:
            default:
                sf.u.d(r6.currentAccount).a((sf.r) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
            case 6:
                rf.v0 v0Var = (rf.v0) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                v0Var.getClass();
                zArr3[0] = true;
                v0Var.Q();
                break;
        }
    }

    @Override // th.a4
    public void run(long j10) {
        th.m3 m3Var = (th.m3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        m3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    public /* synthetic */ fi1(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.a = 3;
        this.c = zArr;
        this.b = jsPromptResult;
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        sf.l lVar = (sf.l) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        lVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(lVar.d);
        sf.j jVar = lVar.n;
        lVar.x = document;
        jVar.setSticker(document);
        ((org.telegram.ui.Cells.m8) view).setValueSticker(document);
        lVar.e0(true);
        return Boolean.TRUE;
    }
}
