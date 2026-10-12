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
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class la implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ la(int i10, Object obj, Object obj2) {
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
                na naVar = themesHorizontalListCell$InnerThemeView.a0;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.b.f = true;
                    break;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!naVar.X2.containsKey(attachFileName)) {
                        naVar.X2.put(attachFileName, themesHorizontalListCell$InnerThemeView.b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        break;
                    }
                }
                break;
            case 1:
                p0 p0Var = (p0) this.b;
                o0 o0Var = (o0) this.c;
                u1 u1Var = p0Var.a;
                o0 o0Var2 = p0Var.F;
                if (o0Var == o0Var2) {
                    o0Var2.n.c(false);
                    o0 o0Var3 = p0Var.F;
                    if (!o0Var3.g) {
                        TLObject tLObject2 = o0Var3.o;
                        u1 u1Var2 = p0Var.a;
                        if (u1Var2.getDelegate() != null) {
                            u1Var2.getDelegate().z0(u1Var2, tLObject2, true);
                        }
                    } else if (u1Var.getDelegate() != null) {
                        u1Var.getDelegate().n2();
                    }
                }
                p0Var.F = null;
                p0Var.G = null;
                p0Var.B = false;
                p0Var.A = false;
                p0Var.y.c(false);
                VelocityTracker velocityTracker = p0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    p0Var.D = null;
                    break;
                }
                break;
            case 2:
                x0 x0Var = (x0) this.b;
                x0Var.f1.X1(x0Var, ((TLRPC.TL_messageActionGiftCode) this.c).slug);
                break;
            case 3:
                final x0 x0Var2 = (x0) this.b;
                final org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = x0Var2.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(x0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() { // from class: org.telegram.ui.Cells.t0
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(x0.this.H).lambda$processUpdates$377(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new la(4, m2Var, tL_error));
                        }
                    }
                });
                break;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.b;
                zc.a0(m2Var2).f0((TLRPC.TL_error) this.c, false);
                break;
            case 5:
                u1 u1Var3 = (u1) this.b;
                u1Var3.O0.draw((Canvas) this.c);
                break;
            case 6:
                ((u1) this.b).post(new c1(8, (u1) this.c));
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
                ((na) this.b).x1((org.telegram.ui.ActionBar.f6) this.c);
                break;
        }
    }
}
