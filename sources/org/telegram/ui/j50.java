package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ l50 d;

    public j50(l50 l50Var, Context context) {
        this.d = l50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.H;
    }

    @Override // v4.h0
    public final int d(int i7) {
        l50 l50Var = this.d;
        if ((i7 >= l50Var.F && i7 < l50Var.G) || i7 == l50Var.K) {
            return 0;
        }
        if (i7 == l50Var.E || i7 == l50Var.I) {
            return 4;
        }
        if (i7 == l50Var.y || i7 == l50Var.L) {
            return 1;
        }
        return i7 == l50Var.J ? 5 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        l50 l50Var = this.d;
        boolean z10 = l50Var.O;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
            if (i7 == l50Var.K) {
                f8Var.b(false, false);
                f8Var.d(l50Var.r, false, false);
                f8Var.setDeleteAction(new g40(this, 2));
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.e2) l50Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.si.b0(i10).s0(l50Var.h0());
            int i12 = i7 - l50Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i12);
            f8Var.d((TLRPC.TL_messages_stickerSet) s02.get(i12), i12 != s02.size() - 1, false);
            f8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = l50Var.r;
            f8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : l50Var.g0(l50Var.w) != null ? l50Var.g0(l50Var.w).id : 0L), false);
            return;
        }
        if (i11 == 1) {
            if (i7 != l50Var.y) {
                if (i7 == l50Var.L) {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.hd.M0(2131754429, null));
                    return;
                }
                return;
            }
            String M0 = org.telegram.messenger.hd.M0(z10 ? 2131752129 : 2131752114, null);
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
            if (i7 == l50Var.I) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131754434, null));
                return;
            } else {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(z10 ? 2131752130 : 2131752115, null));
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        i50 i50Var = (i50) view;
        boolean z11 = l50Var.K > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = l50Var.r;
        i50Var.b = z11;
        org.telegram.ui.Components.ft ftVar = i50Var.a;
        h50 h50Var = i50Var.f;
        ftVar.removeTextChangedListener(h50Var);
        if (tL_messages_stickerSet3 == null) {
            ftVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            ftVar.setText(str);
            ftVar.setSelection(str.length());
        }
        ftVar.addTextChangedListener(h50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout f8Var = new org.telegram.ui.Cells.f8(context, 3);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, f8Var, null);
            frameLayout = f8Var;
        } else if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.y8(context);
        } else if (i7 != 5) {
            FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, null);
            frameLayout = n4Var;
        } else {
            l50 l50Var = this.d;
            i50 i50Var = new i50(l50Var, context);
            l50Var.P = i50Var;
            frameLayout = i50Var;
        }
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new org.telegram.ui.Components.cj0(frameLayout);
    }
}
