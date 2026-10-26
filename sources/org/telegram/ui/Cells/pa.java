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
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pa(int i10, Object obj, Object obj2) {
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
                ra raVar = themesHorizontalListCell$InnerThemeView.a0;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.b.f = true;
                    break;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    if (!raVar.h3.containsKey(attachFileName)) {
                        raVar.h3.put(attachFileName, themesHorizontalListCell$InnerThemeView.b);
                        FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.b.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                        break;
                    }
                }
                break;
            case 1:
                n0 n0Var = (n0) this.b;
                m0 m0Var = (m0) this.c;
                s1 s1Var = n0Var.a;
                m0 m0Var2 = n0Var.F;
                if (m0Var == m0Var2) {
                    m0Var2.n.c(false);
                    m0 m0Var3 = n0Var.F;
                    if (!m0Var3.g) {
                        TLObject tLObject2 = m0Var3.o;
                        s1 s1Var2 = n0Var.a;
                        if (s1Var2.getDelegate() != null) {
                            s1Var2.getDelegate().t0(s1Var2, tLObject2, true);
                        }
                    } else if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().Z1();
                    }
                }
                n0Var.F = null;
                n0Var.G = null;
                n0Var.B = false;
                n0Var.A = false;
                n0Var.y.c(false);
                VelocityTracker velocityTracker = n0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    n0Var.D = null;
                    break;
                }
                break;
            case 2:
                v0 v0Var = (v0) this.b;
                v0Var.f1.H0(v0Var, ((TLRPC.TL_messageActionGiftCode) this.c).slug);
                break;
            case 3:
                final v0 v0Var2 = (v0) this.b;
                final org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var2.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() { // from class: org.telegram.ui.Cells.r0
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            MessagesController.getInstance(v0.this.H).lambda$processUpdates$379(updates, false);
                        }
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new pa(4, r2Var, tL_error));
                        }
                    }
                });
                break;
            case 4:
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.b;
                wc.b0(r2Var2).g0((TLRPC.TL_error) this.c, false);
                break;
            case 5:
                s1 s1Var3 = (s1) this.b;
                s1Var3.O0.draw((Canvas) this.c);
                break;
            case 6:
                ((s1) this.b).post(new a1(8, (s1) this.c));
                break;
            case 7:
                p8 p8Var = (p8) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                if (p8Var.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p8Var.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        p8Var.d(p8Var.r, p8Var.f, p8Var.s);
                        break;
                    }
                }
                break;
            default:
                ((ra) this.b).C1((org.telegram.ui.ActionBar.x6) this.c);
                break;
        }
    }
}
