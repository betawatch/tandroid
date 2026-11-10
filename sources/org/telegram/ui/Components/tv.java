package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tv extends nw {
    public static final /* synthetic */ int H0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ gy G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(gy gyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        super(gyVar, context, h6Var);
        this.G0 = gyVar;
        this.E0 = f2Var;
        this.F0 = z9;
    }

    @Override // org.telegram.ui.Components.rk0
    public final void j() {
        uv uvVar = this.G0.C0;
        if (uvVar != null) {
            uvVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.rk0
    public final void o(int i7, int i10) {
        gy gyVar = this.G0;
        dt dtVar = gyVar.f2;
        int i11 = gyVar.E1;
        int i12 = i7 - i11;
        int i13 = i10 - i11;
        int i14 = gyVar.c1;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i14);
        ArrayList arrayList = gyVar.d1;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        int i15 = 1;
        Collections.sort(b02.s0(0), new dl(this, i15));
        ArrayList arrayList2 = gyVar.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            gyVar.F2.addAll(arrayList);
        }
        gyVar.D();
        org.telegram.messenger.g0.r(dtVar);
        org.telegram.messenger.g0.i3(dtVar, 1500L);
        org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i14);
        b03.X[0] = org.telegram.messenger.ui.q(b03.G[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = gyVar.e0; i16 < arrayList.size(); i16 = com.google.android.recaptcha.internal.a.g(i16, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new di.v5(19));
        org.telegram.messenger.qs.f(i14).k(org.telegram.messenger.qs.x0, 0, Boolean.TRUE);
        gyVar.X(true);
        if (org.telegram.messenger.iz.X) {
            org.telegram.messenger.iz.P();
            org.telegram.ui.ActionBar.f2 f2Var = this.E0;
            if (f2Var != null) {
                gc.a0(f2Var).L(R.raw.filter_reorder, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null), org.telegram.messenger.id.N0("Settings"), new cd(i15, f2Var)).j();
                return;
            }
            FrameLayout frameLayout = gyVar.r;
            if (frameLayout != null) {
                new gc(frameLayout, gyVar.Z1).I(R.raw.filter_reorder, org.telegram.messenger.id.M0(2131751337, null), org.telegram.messenger.id.M0(2131751336, null)).j();
            }
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public final void p() {
        gy gyVar = this.G0;
        gyVar.Z();
        uv uvVar = gyVar.C0;
        if (uvVar != null) {
            uvVar.invalidate();
        }
        invalidate();
        hx hxVar = gyVar.t1;
        if (hxVar != null) {
            hxVar.u();
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
