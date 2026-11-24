// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class id5 extends q59 {
    public final Context c;
    public final /* synthetic */ kd5 d;

    public id5(kd5 kd5Var, Context context) {
        this.d = kd5Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
    }

    @Override // y59
    public final int b() {
        return this.d.H;
    }

    @Override // y59
    public final int d(int i) {
        kd5 kd5Var = this.d;
        if ((i >= kd5Var.F && i < kd5Var.G) || i == kd5Var.K) {
            return 0;
        }
        if (i == kd5Var.E || i == kd5Var.I) {
            return 4;
        }
        if (i == kd5Var.y || i == kd5Var.L) {
            return 1;
        }
        return i == kd5Var.J ? 5 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        kd5 kd5Var = this.d;
        boolean z = kd5Var.O;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 == 0) {
            s1b s1bVar = (s1b) view;
            if (i == kd5Var.K) {
                s1bVar.b(false, false);
                s1bVar.d(kd5Var.r, false, false);
                s1bVar.setDeleteAction(new ca5(this, (byte) 8));
                return;
            }
            i2 = ((d) kd5Var).currentAccount;
            ArrayList t0 = hs6.d0(i2).t0(kd5Var.e0());
            int i4 = i - kd5Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i4);
            s1bVar.d((TLRPC.TL_messages_stickerSet) t0.get(i4), i4 != t0.size() - 1, false);
            s1bVar.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kd5Var.r;
            s1bVar.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : kd5Var.d0(kd5Var.w) != null ? kd5Var.d0(kd5Var.w).id : 0L), false);
            return;
        }
        if (i3 == 1) {
            if (i != kd5Var.y) {
                if (i == kd5Var.L) {
                    ((njb) view).setText(jb6.M0(2131754426, null));
                    return;
                }
                return;
            }
            String M0 = jb6.M0(z ? 2131752066 : 2131752051, null);
            int indexOf = M0.indexOf("@stickers");
            if (indexOf == -1) {
                ((njb) view).setText(M0);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                spannableStringBuilder.setSpan(new uj(this, r4 ? (byte) 1 : (byte) 0), indexOf, indexOf + 9, 18);
                ((njb) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                ((njb) view).setText(M0);
                return;
            }
        }
        if (i3 == 4) {
            if (i == kd5Var.I) {
                ((jf5) view).setText(jb6.M0(2131754431, null));
                return;
            } else {
                ((jf5) view).setText(jb6.M0(z ? 2131752067 : 2131752052, null));
                return;
            }
        }
        if (i3 == 5) {
            hd5 hd5Var = (hd5) view;
            boolean z2 = kd5Var.K > 0;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = kd5Var.r;
            hd5Var.b = z2;
            qu3 qu3Var = hd5Var.a;
            TextWatcher textWatcher = hd5Var.f;
            qu3Var.removeTextChangedListener(textWatcher);
            if (tL_messages_stickerSet3 == null) {
                qu3Var.setText("");
            } else {
                String str = tL_messages_stickerSet3.set.short_name;
                qu3Var.setText(str);
                qu3Var.setSelection(str.length());
            }
            qu3Var.addTextChangedListener(textWatcher);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View s1bVar;
        Context context = this.c;
        if (i == 0) {
            s1bVar = new s1b(context, 3);
            anb.h(cmb.c6, null, s1bVar);
        } else if (i == 1) {
            s1bVar = new njb(context);
        } else if (i != 5) {
            s1bVar = new jf5(context);
            anb.h(cmb.c6, null, s1bVar);
        } else {
            kd5 kd5Var = this.d;
            hd5 hd5Var = new hd5(kd5Var, context);
            kd5Var.P = hd5Var;
            s1bVar = hd5Var;
        }
        s1bVar.setLayoutParams(new g69(-1, -2));
        return new b59(s1bVar);
    }
}
