// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ld5 extends c79 {
    public final Context c;
    public final /* synthetic */ nd5 d;

    public ld5(nd5 nd5Var, Context context) {
        this.d = nd5Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 0;
    }

    @Override // j79
    public final int b() {
        return this.d.H;
    }

    @Override // j79
    public final int d(int i) {
        nd5 nd5Var = this.d;
        if ((i >= nd5Var.F && i < nd5Var.G) || i == nd5Var.K) {
            return 0;
        }
        if (i == nd5Var.E || i == nd5Var.I) {
            return 4;
        }
        if (i == nd5Var.y || i == nd5Var.L) {
            return 1;
        }
        return i == nd5Var.J ? 5 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        nd5 nd5Var = this.d;
        boolean z = nd5Var.O;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 == 0) {
            p3b p3bVar = (p3b) view;
            if (i == nd5Var.K) {
                p3bVar.b(false, false);
                p3bVar.d(nd5Var.r, false, false);
                p3bVar.setDeleteAction(new sa5(this, (byte) 6));
                return;
            }
            i2 = ((e) nd5Var).currentAccount;
            ArrayList t0 = ls6.d0(i2).t0(nd5Var.d0());
            int i4 = i - nd5Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i4);
            p3bVar.d((TLRPC.TL_messages_stickerSet) t0.get(i4), i4 != t0.size() - 1, false);
            p3bVar.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nd5Var.r;
            p3bVar.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : nd5Var.c0(nd5Var.w) != null ? nd5Var.c0(nd5Var.w).id : 0L), false);
            return;
        }
        if (i3 == 1) {
            if (i != nd5Var.y) {
                if (i == nd5Var.L) {
                    ((ilb) view).setText(ob6.M0(2131754422, null));
                    return;
                }
                return;
            }
            String M0 = ob6.M0(z ? 2131752094 : 2131752079, null);
            int indexOf = M0.indexOf("@stickers");
            if (indexOf == -1) {
                ((ilb) view).setText(M0);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                spannableStringBuilder.setSpan(new vi(this, r4 ? (byte) 1 : (byte) 0), indexOf, indexOf + 9, 18);
                ((ilb) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                ((ilb) view).setText(M0);
                return;
            }
        }
        if (i3 == 4) {
            if (i == nd5Var.I) {
                ((mf5) view).setText(ob6.M0(2131754427, null));
                return;
            } else {
                ((mf5) view).setText(ob6.M0(z ? 2131752095 : 2131752080, null));
                return;
            }
        }
        if (i3 == 5) {
            kd5 kd5Var = (kd5) view;
            boolean z2 = nd5Var.K > 0;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = nd5Var.r;
            kd5Var.b = z2;
            xt3 xt3Var = kd5Var.a;
            TextWatcher textWatcher = kd5Var.f;
            xt3Var.removeTextChangedListener(textWatcher);
            if (tL_messages_stickerSet3 == null) {
                xt3Var.setText("");
            } else {
                String str = tL_messages_stickerSet3.set.short_name;
                xt3Var.setText(str);
                xt3Var.setSelection(str.length());
            }
            xt3Var.addTextChangedListener(textWatcher);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View p3bVar;
        Context context = this.c;
        if (i == 0) {
            p3bVar = new p3b(context, 3);
            yob.h(aob.d6, null, p3bVar);
        } else if (i == 1) {
            p3bVar = new ilb(context);
        } else if (i != 5) {
            p3bVar = new mf5(context);
            yob.h(aob.d6, null, p3bVar);
        } else {
            nd5 nd5Var = this.d;
            kd5 kd5Var = new kd5(nd5Var, context);
            nd5Var.P = kd5Var;
            p3bVar = kd5Var;
        }
        p3bVar.setLayoutParams(new r79(-1, -2));
        return new n69(p3bVar);
    }
}
