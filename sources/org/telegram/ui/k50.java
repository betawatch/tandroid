package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class k50 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ m50 d;

    public k50(m50 m50Var, Context context) {
        this.d = m50Var;
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
        m50 m50Var = this.d;
        if ((i7 >= m50Var.E && i7 < m50Var.F) || i7 == m50Var.J) {
            return 0;
        }
        if (i7 == m50Var.D || i7 == m50Var.H) {
            return 4;
        }
        if (i7 == m50Var.y || i7 == m50Var.K) {
            return 1;
        }
        return i7 == m50Var.I ? 5 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        m50 m50Var = this.d;
        boolean z9 = m50Var.N;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
            if (i7 == m50Var.J) {
                g8Var.b(false, false);
                g8Var.d(m50Var.r, false, false);
                g8Var.setDeleteAction(new g40(this, 2));
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.f2) m50Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(m50Var.h0());
            int i12 = i7 - m50Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i12);
            g8Var.d((TLRPC.TL_messages_stickerSet) s02.get(i12), i12 != s02.size() - 1, false);
            g8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = m50Var.r;
            g8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : m50Var.g0(m50Var.w) != null ? m50Var.g0(m50Var.w).id : 0L), false);
            return;
        }
        if (i11 == 1) {
            if (i7 != m50Var.y) {
                if (i7 == m50Var.K) {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.hd.M0(2131754429, null));
                    return;
                }
                return;
            }
            String M0 = org.telegram.messenger.hd.M0(z9 ? 2131752129 : 2131752114, null);
            int indexOf = M0.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.z8) view).setText(M0);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.z8) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                ((org.telegram.ui.Cells.z8) view).setText(M0);
                return;
            }
        }
        if (i11 == 4) {
            if (i7 == m50Var.H) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131754434, null));
                return;
            } else {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(z9 ? 2131752130 : 2131752115, null));
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        j50 j50Var = (j50) view;
        boolean z10 = m50Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = m50Var.r;
        j50Var.b = z10;
        org.telegram.ui.Components.ys ysVar = j50Var.a;
        i50 i50Var = j50Var.f;
        ysVar.removeTextChangedListener(i50Var);
        if (tL_messages_stickerSet3 == null) {
            ysVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            ysVar.setText(str);
            ysVar.setSelection(str.length());
        }
        ysVar.addTextChangedListener(i50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout g8Var = new org.telegram.ui.Cells.g8(context, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, g8Var, null);
            frameLayout = g8Var;
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.z8(context);
        } else if (i7 != 5) {
            FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, null);
            frameLayout = n4Var;
        } else {
            m50 m50Var = this.d;
            j50 j50Var = new j50(m50Var, context);
            m50Var.O = j50Var;
            frameLayout = j50Var;
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
