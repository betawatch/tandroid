// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g0b implements m7, yc7 {
    public final /* synthetic */ u0b a;

    public /* synthetic */ g0b(u0b u0bVar) {
        this.a = u0bVar;
    }

    @Override // yc7
    public final void a(String str) {
        u0b u0bVar = this.a;
        new bn5(u0bVar.getContext(), u0bVar.i2, null, u0bVar.J0).show();
    }

    @Override // m7
    public final void h(int i) {
        String str;
        u0b u0bVar = this.a;
        d dVar = u0bVar.F1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                str = "https://" + na7.q1(u0bVar.a).N2 + "/addstickers/" + u0bVar.M1.set.short_name;
            } else {
                str = "https://" + na7.q1(u0bVar.a).N2 + "/addemoji/" + u0bVar.M1.set.short_name;
            }
            String str2 = str;
            if (i == 1) {
                Context context = u0bVar.H1;
                if (context == null && dVar != null) {
                    context = dVar.getParentActivity();
                }
                if (context == null) {
                    context = u0bVar.getContext();
                }
                i0b i0bVar = new i0b(u0bVar, context, str2, str2, u0bVar.J0);
                if (dVar == null) {
                    i0bVar.show();
                    return;
                }
                dVar.showDialog(i0bVar);
                if (dVar instanceof mu1) {
                    boolean O7 = ((mu1) dVar).O7();
                    i0bVar.i0 = O7;
                    i0bVar.n = O7;
                    return;
                }
                return;
            }
            byte b = 2;
            if (i == 2) {
                try {
                    gl.g(str2);
                    new u21((FrameLayout) u0bVar.b, u0bVar.J0).k(false).j();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            if (i == 3) {
                if (u0bVar.L1) {
                    u0bVar.F0();
                    return;
                } else {
                    u0bVar.H0();
                    return;
                }
            }
            if (i == 4) {
                a1b.c(u0bVar.M1.set, u0bVar.J0, u0bVar.getContext(), new tf8(u0bVar, (byte) 29));
            } else if (i == 5) {
                a1b.b(u0bVar.M1.set, u0bVar.J0, u0bVar.getContext(), new h0b(u0bVar, b));
            }
        }
    }
}
