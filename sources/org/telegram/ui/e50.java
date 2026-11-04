package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e50 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ g50 d;

    public e50(g50 g50Var, Context context) {
        this.d = g50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.H;
    }

    @Override // u4.h0
    public final int d(int i3) {
        g50 g50Var = this.d;
        if ((i3 >= g50Var.F && i3 < g50Var.G) || i3 == g50Var.K) {
            return 0;
        }
        if (i3 == g50Var.E || i3 == g50Var.I) {
            return 4;
        }
        if (i3 == g50Var.y || i3 == g50Var.L) {
            return 1;
        }
        return i3 == g50Var.J ? 5 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        g50 g50Var = this.d;
        boolean z10 = g50Var.O;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
            if (i3 == g50Var.K) {
                f8Var.b(false, false);
                f8Var.d(g50Var.r, false, false);
                f8Var.setDeleteAction(new b40(this, 2));
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.d2) g50Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.li.b0(i10).s0(g50Var.h0());
            int i12 = i3 - g50Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i12);
            f8Var.d((TLRPC.TL_messages_stickerSet) s02.get(i12), i12 != s02.size() - 1, false);
            f8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = g50Var.r;
            f8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : g50Var.g0(g50Var.w) != null ? g50Var.g0(g50Var.w).id : 0L), false);
            return;
        }
        if (i11 == 1) {
            if (i3 != g50Var.y) {
                if (i3 == g50Var.L) {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.bd.M0(2131754429, null));
                    return;
                }
                return;
            }
            String M0 = org.telegram.messenger.bd.M0(z10 ? 2131752129 : 2131752114, null);
            int indexOf = M0.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.y8) view).setText(M0);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.y8) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                ((org.telegram.ui.Cells.y8) view).setText(M0);
                return;
            }
        }
        if (i11 == 4) {
            if (i3 == g50Var.I) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131754434, null));
                return;
            } else {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(z10 ? 2131752130 : 2131752115, null));
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        d50 d50Var = (d50) view;
        boolean z11 = g50Var.K > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = g50Var.r;
        d50Var.b = z11;
        org.telegram.ui.Components.xs xsVar = d50Var.a;
        c50 c50Var = d50Var.f;
        xsVar.removeTextChangedListener(c50Var);
        if (tL_messages_stickerSet3 == null) {
            xsVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            xsVar.setText(str);
            xsVar.setSelection(str.length());
        }
        xsVar.addTextChangedListener(c50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i3 == 0) {
            FrameLayout f8Var = new org.telegram.ui.Cells.f8(context, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, f8Var, null);
            frameLayout = f8Var;
        } else if (i3 == 1) {
            frameLayout = new org.telegram.ui.Cells.y8(context);
        } else if (i3 != 5) {
            FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, null);
            frameLayout = n4Var;
        } else {
            g50 g50Var = this.d;
            d50 d50Var = new d50(g50Var, context);
            g50Var.P = d50Var;
            frameLayout = d50Var;
        }
        frameLayout.setLayoutParams(new u4.p0(-1, -2));
        return new org.telegram.ui.Components.bj0(frameLayout);
    }
}
