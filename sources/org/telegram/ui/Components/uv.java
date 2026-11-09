package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uv extends ow {
    public static final /* synthetic */ int H0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ hy G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(hy hyVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        super(hyVar, context, g6Var);
        this.G0 = hyVar;
        this.E0 = f2Var;
        this.F0 = z9;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void j() {
        vv vvVar = this.G0.C0;
        if (vvVar != null) {
            vvVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.sk0
    public final void o(int i7, int i10) {
        hy hyVar = this.G0;
        et etVar = hyVar.f2;
        int i11 = hyVar.E1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = hyVar.c1;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i14);
        ArrayList arrayList = hyVar.d1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        int i15 = 1;
        Collections.sort(b02.s0(0), new el(this, i15));
        ArrayList arrayList2 = hyVar.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            hyVar.F2.addAll(arrayList);
        }
        hyVar.D();
        org.telegram.messenger.g0.r(etVar);
        org.telegram.messenger.g0.i3(etVar, 1500L);
        org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i14);
        b03.X[0] = org.telegram.messenger.ui.q(b03.G[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = hyVar.e0; i16 < arrayList.size(); i16 = com.google.android.recaptcha.internal.a.g(i16, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new di.v5(19));
        org.telegram.messenger.qs.f(i14).k(org.telegram.messenger.qs.x0, 0, Boolean.TRUE);
        hyVar.X(true);
        if (org.telegram.messenger.iz.X) {
            org.telegram.messenger.iz.P();
            org.telegram.ui.ActionBar.f2 f2Var = this.E0;
            if (f2Var != null) {
                hc.a0(f2Var).L(R.raw.filter_reorder, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null), org.telegram.messenger.id.N0("Settings"), new dd(i15, f2Var)).j();
                return;
            }
            FrameLayout frameLayout = hyVar.r;
            if (frameLayout != null) {
                new hc(frameLayout, hyVar.Z1).I(R.raw.filter_reorder, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null)).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final void p() {
        hy hyVar = this.G0;
        hyVar.Z();
        vv vvVar = hyVar.C0;
        if (vvVar != null) {
            vvVar.invalidate();
        }
        invalidate();
        ix ixVar = hyVar.t1;
        if (ixVar != null) {
            ixVar.u();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (this.F0) {
                return;
            }
            this.G0.x0.invalidate();
        }
    }
}
