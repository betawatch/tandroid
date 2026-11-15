package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.VelocityTracker;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea(int i7, Object obj, Object obj2) {
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
                ga gaVar = themesHorizontalListCell$InnerThemeView.b0;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themesHorizontalListCell$InnerThemeView.b.f = true;
                    break;
                } else {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                    if (!gaVar.h3.containsKey(r10)) {
                        gaVar.h3.put(r10, themesHorizontalListCell$InnerThemeView.b);
                        org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.b.F).W(wallPaper.document, wallPaper, 1, 1);
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
                            q1Var2.getDelegate().B0(q1Var2, tLObject2, true);
                        }
                    } else if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().x2();
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
                t0 t0Var = (t0) this.b;
                t0Var.g1.k0(t0Var, ((TLRPC.TL_messageActionGiftCode) this.c).slug);
                break;
            case 3:
                final t0 t0Var2 = (t0) this.b;
                final org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = t0Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(t0Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new s10() { // from class: org.telegram.ui.Cells.p0
                    @Override // org.telegram.messenger.s10
                    public final void a(Object obj, Object obj2) {
                        TLRPC.Updates updates = (TLRPC.Updates) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (updates != null) {
                            np.s1(t0.this.I).O3(updates, false);
                        }
                        if (tL_error != null) {
                            org.telegram.messenger.g0.h3(new ea(4, e2Var, tL_error));
                        }
                    }
                });
                break;
            case 4:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.b;
                cc.a0(e2Var2).f0((TLRPC.TL_error) this.c, false);
                break;
            case 5:
                q1 q1Var3 = (q1) this.b;
                q1Var3.Q0.draw((Canvas) this.c);
                break;
            case 6:
                ((q1) this.b).post(new d1((q1) this.c, 7));
                break;
            case 7:
                f8 f8Var = (f8) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                if (f8Var.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = f8Var.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        f8Var.d(f8Var.r, f8Var.f, f8Var.s);
                        break;
                    }
                }
                break;
            default:
                ((ga) this.b).z1((org.telegram.ui.ActionBar.i6) this.c);
                break;
        }
    }
}
