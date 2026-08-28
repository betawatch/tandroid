package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.b;
                TLObject tLObject = (TLObject) this.c;
                ma maVar = themesHorizontalListCell$InnerThemeView.T;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.b.f = true;
                    break;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!maVar.V2.containsKey(attachFileName)) {
                        maVar.V2.put(attachFileName, themesHorizontalListCell$InnerThemeView.b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.b.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                        break;
                    }
                }
                break;
            case 1:
                o0 o0Var = (o0) this.b;
                n0 n0Var = (n0) this.c;
                t1 t1Var = o0Var.a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (!n0Var3.g) {
                        TLObject tLObject2 = n0Var3.o;
                        t1 t1Var2 = o0Var.a;
                        if (t1Var2.getDelegate() != null) {
                            t1Var2.getDelegate().D0(t1Var2, tLObject2, true);
                        }
                    } else if (t1Var.getDelegate() != null) {
                        t1Var.getDelegate().o2();
                    }
                }
                o0Var.F = null;
                o0Var.G = null;
                o0Var.B = false;
                o0Var.A = false;
                o0Var.y.c(false);
                VelocityTracker velocityTracker = o0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0Var.D = null;
                    break;
                }
                break;
            case 2:
                final w0 w0Var = (w0) this.b;
                final org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = w0Var.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(w0Var.D).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() { // from class: org.telegram.ui.Cells.r0
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(w0.this.D).processUpdates(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new ka(3, o2Var, tL_error));
                        }
                    }
                });
                break;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.b;
                oc.a0(o2Var2).d0((TLRPC.TL_error) this.c, false);
                break;
            case 4:
                w0 w0Var2 = (w0) this.b;
                w0Var2.T0.N1(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.c).slug);
                break;
            case 5:
                t1 t1Var3 = (t1) this.b;
                t1Var3.K0.draw((Canvas) this.c);
                break;
            case 6:
                ((t1) this.b).post(new b1(8, (t1) this.c));
                break;
            case 7:
                k8 k8Var = (k8) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                if (k8Var.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = k8Var.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        k8Var.d(k8Var.r, k8Var.f, k8Var.s);
                        break;
                    }
                }
                break;
            default:
                ((ma) this.b).w1((org.telegram.ui.ActionBar.e6) this.c);
                break;
        }
    }
}
