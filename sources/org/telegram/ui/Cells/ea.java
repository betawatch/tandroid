package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea(int i10, Object obj, Object obj2) {
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
                ga gaVar = themesHorizontalListCell$InnerThemeView.a0;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.b.f = true;
                    break;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.b8.r(null, wallPaper.document);
                    if (!gaVar.g3.containsKey(r10)) {
                        gaVar.g3.put(r10, themesHorizontalListCell$InnerThemeView.b);
                        org.telegram.messenger.b8.G(themesHorizontalListCell$InnerThemeView.b.E).X(wallPaper.document, wallPaper, 1, 1);
                        break;
                    }
                }
                break;
            case 1:
                l0 l0Var = (l0) this.b;
                k0 k0Var = (k0) this.c;
                q1 q1Var = l0Var.a;
                k0 k0Var2 = l0Var.F;
                if (k0Var == k0Var2) {
                    k0Var2.n.c(false);
                    k0 k0Var3 = l0Var.F;
                    if (!k0Var3.g) {
                        TLObject tLObject2 = k0Var3.o;
                        q1 q1Var2 = l0Var.a;
                        if (q1Var2.getDelegate() != null) {
                            q1Var2.getDelegate().z0(q1Var2, tLObject2, true);
                        }
                    } else if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().e2();
                    }
                }
                l0Var.F = null;
                l0Var.G = null;
                l0Var.B = false;
                l0Var.A = false;
                l0Var.y.c(false);
                VelocityTracker velocityTracker = l0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    l0Var.D = null;
                    break;
                }
                break;
            case 2:
                s0 s0Var = (s0) this.b;
                s0Var.f1.e1(s0Var, ((TLRPC.TL_messageActionGiftCode) this.c).slug);
                break;
            case 3:
                final s0 s0Var2 = (s0) this.b;
                final org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = s0Var2.getMessageObject().f1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(s0Var2.H).sendRequestTyped(tL_resolveStarGiftOffer, new j20() { // from class: org.telegram.ui.Cells.p0
                    @Override // org.telegram.messenger.j20
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            vp.r1(s0.this.H).L3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.i0.g3(new ea(4, k2Var, tL_error));
                        }
                    }
                });
                break;
            case 4:
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.b;
                cc.a0(k2Var2).f0((TLRPC.TL_error) this.c, false);
                break;
            case 5:
                q1 q1Var3 = (q1) this.b;
                q1Var3.P0.draw((Canvas) this.c);
                break;
            case 6:
                ((q1) this.b).post(new b1((q1) this.c, 7));
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
                ((ga) this.b).z1((org.telegram.ui.ActionBar.s6) this.c);
                break;
        }
    }
}
