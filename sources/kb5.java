// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kb5 extends n39 {
    public final Context c;
    public final /* synthetic */ mb5 d;

    public kb5(mb5 mb5Var, Context context) {
        this.d = mb5Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 0;
    }

    @Override // w39
    public final int b() {
        return this.d.H;
    }

    @Override // w39
    public final int d(int i) {
        mb5 mb5Var = this.d;
        if ((i >= mb5Var.F && i < mb5Var.G) || i == mb5Var.K) {
            return 0;
        }
        if (i == mb5Var.E || i == mb5Var.I) {
            return 4;
        }
        if (i == mb5Var.y || i == mb5Var.L) {
            return 1;
        }
        return i == mb5Var.J ? 5 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        mb5 mb5Var = this.d;
        boolean z = mb5Var.O;
        int i3 = s49Var.f;
        View view = s49Var.a;
        byte b = 5;
        if (i3 == 0) {
            rza rzaVar = (rza) view;
            if (i == mb5Var.K) {
                rzaVar.b(false, false);
                rzaVar.d(mb5Var.r, false, false);
                rzaVar.setDeleteAction(new b95(this, b));
                return;
            }
            i2 = ((d) mb5Var).currentAccount;
            ArrayList t0 = hq6.d0(i2).t0(mb5Var.d0());
            int i4 = i - mb5Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t0.get(i4);
            rzaVar.d((TLRPC.TL_messages_stickerSet) t0.get(i4), i4 != t0.size() - 1, false);
            rzaVar.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = mb5Var.r;
            rzaVar.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : mb5Var.c0(mb5Var.w) != null ? mb5Var.c0(mb5Var.w).id : 0L), false);
            return;
        }
        if (i3 == 1) {
            if (i != mb5Var.y) {
                if (i == mb5Var.L) {
                    ((mhb) view).setText(k96.M0(2131754426, null));
                    return;
                }
                return;
            }
            String M0 = k96.M0(z ? 2131752117 : 2131752102, null);
            int indexOf = M0.indexOf("@stickers");
            if (indexOf == -1) {
                ((mhb) view).setText(M0);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                spannableStringBuilder.setSpan(new ui(this, r5 ? (byte) 1 : (byte) 0), indexOf, indexOf + 9, 18);
                ((mhb) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                ((mhb) view).setText(M0);
                return;
            }
        }
        if (i3 == 4) {
            if (i == mb5Var.I) {
                ((ld5) view).setText(k96.M0(2131754431, null));
                return;
            } else {
                ((ld5) view).setText(k96.M0(z ? 2131752118 : 2131752103, null));
                return;
            }
        }
        if (i3 == 5) {
            jb5 jb5Var = (jb5) view;
            boolean z2 = mb5Var.K > 0;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = mb5Var.r;
            jb5Var.b = z2;
            gt3 gt3Var = jb5Var.a;
            TextWatcher textWatcher = jb5Var.f;
            gt3Var.removeTextChangedListener(textWatcher);
            if (tL_messages_stickerSet3 == null) {
                gt3Var.setText("");
            } else {
                String str = tL_messages_stickerSet3.set.short_name;
                gt3Var.setText(str);
                gt3Var.setSelection(str.length());
            }
            gt3Var.addTextChangedListener(textWatcher);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View rzaVar;
        Context context = this.c;
        if (i == 0) {
            rzaVar = new rza(context, 3);
            zkb.h(bkb.c6, null, rzaVar);
        } else if (i == 1) {
            rzaVar = new mhb(context);
        } else if (i != 5) {
            rzaVar = new ld5(context);
            zkb.h(bkb.c6, null, rzaVar);
        } else {
            mb5 mb5Var = this.d;
            jb5 jb5Var = new jb5(mb5Var, context);
            mb5Var.P = jb5Var;
            rzaVar = jb5Var;
        }
        rzaVar.setLayoutParams(new e49(-1, -2));
        return new y29(rzaVar);
    }
}
