package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h60 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public final /* synthetic */ j60 d;

    public h60(j60 j60Var, Context context) {
        this.d = j60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.G;
    }

    @Override // s4.g0
    public final int d(int i10) {
        j60 j60Var = this.d;
        if ((i10 >= j60Var.E && i10 < j60Var.F) || i10 == j60Var.J) {
            return 0;
        }
        if (i10 == j60Var.D || i10 == j60Var.H) {
            return 4;
        }
        if (i10 == j60Var.y || i10 == j60Var.K) {
            return 1;
        }
        return i10 == j60Var.I ? 5 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        j60 j60Var = this.d;
        boolean z10 = j60Var.N;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            if (i10 == j60Var.J) {
                k8Var.b(false, false);
                k8Var.d(j60Var.r, false, false);
                k8Var.setDeleteAction(new e50(this, 2));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.k2) j60Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.vi.b0(i11).s0(j60Var.h0());
            int i13 = i10 - j60Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i13);
            k8Var.d((TLRPC.TL_messages_stickerSet) s02.get(i13), i13 != s02.size() - 1, false);
            k8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = j60Var.r;
            k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : j60Var.g0(j60Var.w) != null ? j60Var.g0(j60Var.w).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != j60Var.y) {
                if (i10 == j60Var.K) {
                    ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.dd.L0(2131754429, null));
                    return;
                }
                return;
            }
            String L0 = org.telegram.messenger.dd.L0(z10 ? 2131752129 : 2131752114, null);
            int indexOf = L0.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.b9) view).setText(L0);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.f4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.b9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                ((org.telegram.ui.Cells.b9) view).setText(L0);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == j60Var.H) {
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.dd.L0(2131754434, null));
                return;
            } else {
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.dd.L0(z10 ? 2131752130 : 2131752115, null));
                return;
            }
        }
        if (i12 != 5) {
            return;
        }
        g60 g60Var = (g60) view;
        boolean z11 = j60Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = j60Var.r;
        g60Var.b = z11;
        org.telegram.ui.Components.mt mtVar = g60Var.a;
        f60 f60Var = g60Var.f;
        mtVar.removeTextChangedListener(f60Var);
        if (tL_messages_stickerSet3 == null) {
            mtVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            mtVar.setText(str);
            mtVar.setSelection(str.length());
        }
        mtVar.addTextChangedListener(f60Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, k8Var, null);
            frameLayout = k8Var;
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.b9(context);
        } else if (i10 != 5) {
            FrameLayout p4Var = new org.telegram.ui.Cells.p4(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, null);
            frameLayout = p4Var;
        } else {
            j60 j60Var = this.d;
            g60 g60Var = new g60(j60Var, context);
            j60Var.O = g60Var;
            frameLayout = g60Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.dk0(frameLayout);
    }
}
