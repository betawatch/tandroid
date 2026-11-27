// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f59 extends c79 {
    public final /* synthetic */ j59 c;

    public f59(j59 j59Var) {
        this.c = j59Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 3;
    }

    @Override // j79
    public final int b() {
        return this.c.T1.size() + 3;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        j59 j59Var = this.c;
        if (i2 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) j59Var.T1.get(i - 3);
            e3a e3aVar = (e3a) view;
            e3aVar.setBoost(tL_myBoost);
            e3aVar.c(j59Var.S1.contains(tL_myBoost), false);
            return;
        }
        if (i2 == 2) {
            mf5 mf5Var = (mf5) view;
            mf5Var.setTextSize(15.0f);
            mf5Var.setPadding(0, 0, 0, hl.L(2.0f));
            mf5Var.setText(ob6.M0(2131753288, null));
            return;
        }
        if (i2 == 0) {
            i59 i59Var = (i59) view;
            j59Var.W1 = i59Var;
            TLRPC.Chat chat = j59Var.U1;
            p66 p66Var = i59Var.e;
            try {
                SpannableStringBuilder S2 = hl.S2(ob6.G(on0.b(), "BoostingReassignBoostTextPluralWithLink", chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder N2 = hl.N2(ob6.M0(2131753313, "BoostingReassignBoostTextLink"), aob.Xc, 2, new ax0(j59Var, (byte) 4), null);
                int indexOf = TextUtils.indexOf(S2, "%3$s");
                S2.replace(indexOf, indexOf + 4, (CharSequence) N2);
                p66Var.setText(S2, TextView.BufferType.EDITABLE);
                p66Var.post(new me7(i59Var, indexOf, (byte) 13));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        j59 j59Var = this.c;
        if (i == 0) {
            i59 i59Var = new i59(context);
            i59Var.a(j59Var.S1, j59Var.U1);
            view = i59Var;
        } else if (i != 1) {
            view = i != 2 ? i != 3 ? new View(context) : new e3a(context, true, false, j59Var.J0, true) : new mf5(context, 22);
        } else {
            int i2 = aob.a7;
            view = new rca(context, aob.w0(null, i2, false), 0);
            yob.h(i2, null, view);
        }
        return qu6.h(view, view, -1, -2);
    }
}
