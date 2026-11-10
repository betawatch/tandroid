package org.telegram.ui.Cells;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public interface q0 {
    void D(t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize);

    void E(long j3);

    void F(t0 t0Var);

    void W(t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str);

    long a();

    long b();

    void c0(t0 t0Var, String str);

    boolean g();

    void i(t0 t0Var, int i7);

    void l(t0 t0Var);

    void m(t0 t0Var, int i7, int i10);

    void q(t0 t0Var);

    boolean r0(t0 t0Var, float f10, float f11);

    void s(t0 t0Var);

    org.telegram.ui.ActionBar.f2 t();

    void t0(t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11);

    void w(TLRPC.TL_chatInviteExported tL_chatInviteExported);
}
