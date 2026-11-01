package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ag0 extends LinearLayout implements org.telegram.messenger.vs {
    public final org.telegram.ui.Components.g9 a;
    public final int b;

    public ag0(Context context) {
        super(context);
        this.b = org.telegram.messenger.e20.s0;
        setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        addView(g9Var, w7.b6.t(org.telegram.messenger.at.p1, org.telegram.messenger.at.p1, 49, 0, 2, 0, 0));
    }

    public final void a() {
        int i10 = this.b;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.vi.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.vi.b0(i10).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
            org.telegram.messenger.vi.b0(i10).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
        } else {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.k(org.telegram.messenger.jc.b(document), "104_104", "tgs", org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.a7, 1.0f, null), tL_messages_stickerSet);
        }
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.at.f(this.b).c(this, org.telegram.messenger.at.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.b).n(this, org.telegram.messenger.at.y0);
    }
}
