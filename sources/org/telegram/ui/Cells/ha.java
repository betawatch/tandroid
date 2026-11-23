package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ha(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) this.b;
                TLObject tLObject = (TLObject) this.c;
                ja jaVar = themesHorizontalListCell$InnerThemeView.b0;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.b.f = true;
                    break;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                    if (!jaVar.h3.containsKey(r10)) {
                        jaVar.h3.put(r10, themesHorizontalListCell$InnerThemeView.b);
                        org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.b.F).W(wallPaper.document, wallPaper, 1, 1);
                        break;
                    }
                }
                break;
            case 1:
                m0 m0Var = (m0) this.b;
                l0 l0Var = (l0) this.c;
                r1 r1Var = m0Var.a;
                l0 l0Var2 = m0Var.F;
                if (l0Var == l0Var2) {
                    l0Var2.n.c(false);
                    l0 l0Var3 = m0Var.F;
                    if (!l0Var3.g) {
                        TLObject tLObject2 = l0Var3.o;
                        r1 r1Var2 = m0Var.a;
                        if (r1Var2.getDelegate() != null) {
                            r1Var2.getDelegate().I0(r1Var2, tLObject2, true);
                        }
                    } else if (r1Var.getDelegate() != null) {
                        r1Var.getDelegate().z2();
                    }
                }
                m0Var.F = null;
                m0Var.G = null;
                m0Var.B = false;
                m0Var.A = false;
                m0Var.y.c(false);
                VelocityTracker velocityTracker = m0Var.D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    m0Var.D = null;
                    break;
                }
                break;
            case 2:
                v0 v0Var = (v0) this.b;
                v0Var.g1.V(v0Var, ((TLRPC.TL_messageActionGiftCode) this.c).slug);
                break;
            case 3:
                final v0 v0Var2 = (v0) this.b;
                final org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = v0Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(v0Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new p10() { // from class: org.telegram.ui.Cells.q0
                    @Override // org.telegram.messenger.p10
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            mp.u1(v0.this.I).V3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.g0.g3(new ha(4, g2Var, tL_error));
                        }
                    }
                });
                break;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.b;
                kc.b0(g2Var2).g0((TLRPC.TL_error) this.c, false);
                break;
            case 5:
                r1 r1Var3 = (r1) this.b;
                r1Var3.Q0.draw((Canvas) this.c);
                break;
            case 6:
                ((r1) this.b).post(new e1((r1) this.c, 7));
                break;
            case 7:
                g8 g8Var = (g8) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                if (g8Var.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = g8Var.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        g8Var.d(g8Var.r, g8Var.f, g8Var.s);
                        break;
                    }
                }
                break;
            default:
                ((ja) this.b).z1((org.telegram.ui.ActionBar.m6) this.c);
                break;
        }
    }
}
