package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l50 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ n50 d;

    public l50(n50 n50Var, Context context) {
        this.d = n50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 0;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.H;
    }

    @Override // v4.i0
    public final int d(int i7) {
        n50 n50Var = this.d;
        if ((i7 >= n50Var.F && i7 < n50Var.G) || i7 == n50Var.K) {
            return 0;
        }
        if (i7 == n50Var.E || i7 == n50Var.I) {
            return 4;
        }
        if (i7 == n50Var.y || i7 == n50Var.L) {
            return 1;
        }
        return i7 == n50Var.J ? 5 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        n50 n50Var = this.d;
        boolean z10 = n50Var.O;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
            if (i7 == n50Var.K) {
                g8Var.b(false, false);
                g8Var.d(n50Var.r, false, false);
                g8Var.setDeleteAction(new i40(this, 2));
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.g2) n50Var).currentAccount;
            ArrayList u02 = org.telegram.messenger.ri.d0(i10).u0(n50Var.h0());
            int i12 = i7 - n50Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) u02.get(i12);
            g8Var.d((TLRPC.TL_messages_stickerSet) u02.get(i12), i12 != u02.size() - 1, false);
            g8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = n50Var.r;
            g8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : n50Var.g0(n50Var.w) != null ? n50Var.g0(n50Var.w).id : 0L), false);
            return;
        }
        if (i11 == 1) {
            if (i7 != n50Var.y) {
                if (i7 == n50Var.L) {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.gd.N0(2131754426, null));
                    return;
                }
                return;
            }
            String N0 = org.telegram.messenger.gd.N0(z10 ? 2131752117 : 2131752102, null);
            int indexOf = N0.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.z8) view).setText(N0);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.z8) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                ((org.telegram.ui.Cells.z8) view).setText(N0);
                return;
            }
        }
        if (i11 == 4) {
            if (i7 == n50Var.I) {
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.N0(2131754431, null));
                return;
            } else {
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.N0(z10 ? 2131752118 : 2131752103, null));
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        k50 k50Var = (k50) view;
        boolean z11 = n50Var.K > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = n50Var.r;
        k50Var.b = z11;
        org.telegram.ui.Components.mt mtVar = k50Var.a;
        j50 j50Var = k50Var.f;
        mtVar.removeTextChangedListener(j50Var);
        if (tL_messages_stickerSet3 == null) {
            mtVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            mtVar.setText(str);
            mtVar.setSelection(str.length());
        }
        mtVar.addTextChangedListener(j50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout g8Var = new org.telegram.ui.Cells.g8(context, 3);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, g8Var, null);
            frameLayout = g8Var;
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.z8(context);
        } else if (i7 != 5) {
            FrameLayout o4Var = new org.telegram.ui.Cells.o4(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, null);
            frameLayout = o4Var;
        } else {
            n50 n50Var = this.d;
            k50 k50Var = new k50(n50Var, context);
            n50Var.P = k50Var;
            frameLayout = k50Var;
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
