package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n50 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ p50 d;

    public n50(p50 p50Var, Context context) {
        this.d = p50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.G;
    }

    @Override // v4.g0
    public final int d(int i7) {
        p50 p50Var = this.d;
        if ((i7 >= p50Var.E && i7 < p50Var.F) || i7 == p50Var.J) {
            return 0;
        }
        if (i7 == p50Var.D || i7 == p50Var.H) {
            return 4;
        }
        if (i7 == p50Var.y || i7 == p50Var.K) {
            return 1;
        }
        return i7 == p50Var.I ? 5 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        p50 p50Var = this.d;
        boolean z9 = p50Var.N;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
            if (i7 == p50Var.J) {
                g8Var.b(false, false);
                g8Var.d(p50Var.r, false, false);
                g8Var.setDeleteAction(new j40(this, 2));
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.f2) p50Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(p50Var.h0());
            int i12 = i7 - p50Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i12);
            g8Var.d((TLRPC.TL_messages_stickerSet) s02.get(i12), i12 != s02.size() - 1, false);
            g8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = p50Var.r;
            g8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : p50Var.g0(p50Var.w) != null ? p50Var.g0(p50Var.w).id : 0L), false);
            return;
        }
        if (i11 == 1) {
            if (i7 != p50Var.y) {
                if (i7 == p50Var.K) {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.id.M0(2131754429, null));
                    return;
                }
                return;
            }
            String M0 = org.telegram.messenger.id.M0(z9 ? 2131752129 : 2131752114, null);
            int indexOf = M0.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.z8) view).setText(M0);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.z8) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                ((org.telegram.ui.Cells.z8) view).setText(M0);
                return;
            }
        }
        if (i11 == 4) {
            if (i7 == p50Var.H) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(2131754434, null));
                return;
            } else {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(z9 ? 2131752130 : 2131752115, null));
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        m50 m50Var = (m50) view;
        boolean z10 = p50Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = p50Var.r;
        m50Var.b = z10;
        org.telegram.ui.Components.ys ysVar = m50Var.a;
        l50 l50Var = m50Var.f;
        ysVar.removeTextChangedListener(l50Var);
        if (tL_messages_stickerSet3 == null) {
            ysVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            ysVar.setText(str);
            ysVar.setSelection(str.length());
        }
        ysVar.addTextChangedListener(l50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout g8Var = new org.telegram.ui.Cells.g8(context, 3);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, g8Var, null);
            frameLayout = g8Var;
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.z8(context);
        } else if (i7 != 5) {
            FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n4Var, null);
            frameLayout = n4Var;
        } else {
            p50 p50Var = this.d;
            m50 m50Var = new m50(p50Var, context);
            p50Var.O = m50Var;
            frameLayout = m50Var;
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
