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
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ia(int i10, Object obj, Object obj2) {
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
                ka kaVar = themesHorizontalListCell$InnerThemeView.U;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.b.f = true;
                    break;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!kaVar.W2.containsKey(attachFileName)) {
                        kaVar.W2.put(attachFileName, themesHorizontalListCell$InnerThemeView.b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.b.B).loadFile(wallPaper.document, wallPaper, 1, 1);
                        break;
                    }
                }
                break;
            case 1:
                o0 o0Var = (o0) this.b;
                n0 n0Var = (n0) this.c;
                s1 s1Var = o0Var.a;
                n0 n0Var2 = o0Var.F;
                if (n0Var == n0Var2) {
                    n0Var2.n.c(false);
                    n0 n0Var3 = o0Var.F;
                    if (!n0Var3.g) {
                        TLObject tLObject2 = n0Var3.o;
                        s1 s1Var2 = o0Var.a;
                        if (s1Var2.getDelegate() != null) {
                            s1Var2.getDelegate().F0(s1Var2, tLObject2, true);
                        }
                    } else if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().B2();
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
                final v0 v0Var = (v0) this.b;
                final org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var.E).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() { // from class: org.telegram.ui.Cells.r0
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(v0.this.E).processUpdates(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new ia(3, p2Var, tL_error));
                        }
                    }
                });
                break;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.b;
                qc.a0(p2Var2).d0((TLRPC.TL_error) this.c, false);
                break;
            case 4:
                v0 v0Var2 = (v0) this.b;
                v0Var2.U0.m2(v0Var2, ((TLRPC.TL_messageActionGiftCode) this.c).slug);
                break;
            case 5:
                s1 s1Var3 = (s1) this.b;
                s1Var3.L0.draw((Canvas) this.c);
                break;
            case 6:
                ((s1) this.b).post(new a1(8, (s1) this.c));
                break;
            case 7:
                j8 j8Var = (j8) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                if (j8Var.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = j8Var.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        j8Var.d(j8Var.r, j8Var.f, j8Var.s);
                        break;
                    }
                }
                break;
            default:
                ((ka) this.b).v1((org.telegram.ui.ActionBar.i6) this.c);
                break;
        }
    }
}
