// default package

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gz3 extends b04 {
    public final /* synthetic */ d F0;
    public final /* synthetic */ boolean G0;
    public final /* synthetic */ t14 H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz3(t14 t14Var, Context context, wjb wjbVar, d dVar, boolean z) {
        super(t14Var, context, wjbVar);
        this.H0 = t14Var;
        this.F0 = dVar;
        this.G0 = z;
    }

    @Override // er9
    public final void j() {
        hz3 hz3Var = this.H0.D0;
        if (hz3Var != null) {
            hz3Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // er9
    public final void o(int i, int i2) {
        t14 t14Var = this.H0;
        ez3 ez3Var = t14Var.g2;
        int i3 = t14Var.F1;
        int i4 = i - i3;
        int i5 = i2 - i3;
        int i6 = t14Var.d1;
        hq6 d0 = hq6.d0(i6);
        ArrayList arrayList = t14Var.e1;
        arrayList.add(i5, (TLRPC.TL_messages_stickerSet) arrayList.remove(i4));
        byte b = 0;
        byte b2 = 1;
        Collections.sort(d0.t0(0), new bz0(this, (byte) 1));
        ArrayList arrayList2 = t14Var.F2;
        if (arrayList2 != null) {
            arrayList2.clear();
            t14Var.F2.addAll(arrayList);
        }
        t14Var.C();
        gl.r(ez3Var);
        gl.d3(ez3Var, 1500L);
        hq6 d02 = hq6.d0(i6);
        d02.Y[0] = hq6.s(d02.H[0]);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i7 = t14Var.f0; i7 < arrayList.size(); i7 = mue.c(i7, 1, ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set.id, tL_messages_reorderStickerSets.order)) {
        }
        ConnectionsManager.getInstance(i6).sendRequest(tL_messages_reorderStickerSets, new ce2(b));
        kk7.f(i6).k(kk7.w0, 0, Boolean.TRUE);
        t14Var.Y(true);
        if (gba.W) {
            gba.N();
            d dVar = this.F0;
            if (dVar != null) {
                u21.b0(dVar).L(R.raw.filter_reorder, k96.M0(2131751325, null), k96.M0(2131751324, null), k96.N0("Settings"), new kv1(dVar, b2)).j();
                return;
            }
            FrameLayout frameLayout = t14Var.r;
            if (frameLayout != null) {
                new u21(frameLayout, t14Var.a2).I(R.raw.filter_reorder, k96.M0(2131751325, null), k96.M0(2131751324, null)).j();
            }
        }
    }

    @Override // er9
    public final void p() {
        t14 t14Var = this.H0;
        t14Var.Z();
        hz3 hz3Var = t14Var.D0;
        if (hz3Var != null) {
            hz3Var.invalidate();
        }
        invalidate();
        u04 u04Var = t14Var.u1;
        if (u04Var != null) {
            u04Var.t();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            if (this.G0) {
                return;
            }
            this.H0.y0.invalidate();
        }
    }
}
