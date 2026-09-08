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
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ na(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.b;
                TLObject tLObject = (TLObject) this.c;
                pa paVar = themesHorizontalListCell$InnerThemeView.a0;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.b.f = true;
                    break;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!paVar.Z2.containsKey(attachFileName)) {
                        paVar.Z2.put(attachFileName, themesHorizontalListCell$InnerThemeView.b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
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
                            t1Var2.getDelegate().x0(t1Var2, tLObject2, true);
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
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = w0Var.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(w0Var.H).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() { // from class: org.telegram.ui.Cells.r0
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(w0.this.H).processUpdates(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new na(3, n2Var, tL_error));
                        }
                    }
                });
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.b;
                yc.a0(n2Var2).d0((TLRPC.TL_error) this.c, false);
                break;
            case 4:
                w0 w0Var2 = (w0) this.b;
                w0Var2.X0.Z1(w0Var2, ((TLRPC.TL_messageActionGiftCode) this.c).slug);
                break;
            case 5:
                t1 t1Var3 = (t1) this.b;
                t1Var3.O0.draw((Canvas) this.c);
                break;
            case 6:
                ((t1) this.b).post(new b1(8, (t1) this.c));
                break;
            case 7:
                m8 m8Var = (m8) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                if (m8Var.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m8Var.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        m8Var.d(m8Var.r, m8Var.f, m8Var.s);
                        break;
                    }
                }
                break;
            default:
                ((pa) this.b).v1((org.telegram.ui.ActionBar.i6) this.c);
                break;
        }
    }
}
