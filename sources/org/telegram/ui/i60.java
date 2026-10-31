package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i60 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ k60 d;

    public i60(k60 k60Var, Context context) {
        this.d = k60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.G;
    }

    @Override // s4.g0
    public final int d(int i10) {
        k60 k60Var = this.d;
        if ((i10 >= k60Var.E && i10 < k60Var.F) || i10 == k60Var.J) {
            return 0;
        }
        if (i10 == k60Var.D || i10 == k60Var.H) {
            return 4;
        }
        if (i10 == k60Var.y || i10 == k60Var.K) {
            return 1;
        }
        return i10 == k60Var.I ? 5 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        k60 k60Var = this.d;
        boolean z10 = k60Var.N;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            if (i10 == k60Var.J) {
                k8Var.b(false, false);
                k8Var.d(k60Var.r, false, false);
                k8Var.setDeleteAction(new f50(this, 2));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.k2) k60Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.ui.b0(i11).s0(k60Var.g0());
            int i13 = i10 - k60Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i13);
            k8Var.d((TLRPC.TL_messages_stickerSet) s02.get(i13), i13 != s02.size() - 1, false);
            k8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = k60Var.r;
            k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : k60Var.f0(k60Var.w) != null ? k60Var.f0(k60Var.w).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != k60Var.y) {
                if (i10 == k60Var.K) {
                    ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.cd.L0(2131754429, null));
                    return;
                }
                return;
            }
            String L0 = org.telegram.messenger.cd.L0(z10 ? 2131752129 : 2131752114, null);
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
            if (i10 == k60Var.H) {
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(2131754434, null));
                return;
            } else {
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(z10 ? 2131752130 : 2131752115, null));
                return;
            }
        }
        if (i12 != 5) {
            return;
        }
        h60 h60Var = (h60) view;
        boolean z11 = k60Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = k60Var.r;
        h60Var.b = z11;
        org.telegram.ui.Components.mt mtVar = h60Var.a;
        g60 g60Var = h60Var.f;
        mtVar.removeTextChangedListener(g60Var);
        if (tL_messages_stickerSet3 == null) {
            mtVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            mtVar.setText(str);
            mtVar.setSelection(str.length());
        }
        mtVar.addTextChangedListener(g60Var);
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
            k60 k60Var = this.d;
            h60 h60Var = new h60(k60Var, context);
            k60Var.O = h60Var;
            frameLayout = h60Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.ck0(frameLayout);
    }
}
