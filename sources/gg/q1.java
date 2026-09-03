package gg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q1 extends ql0 {
    public final /* synthetic */ w1 c;

    public q1(w1 w1Var) {
        this.c = w1Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 3;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.V.size() + 3;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        w1 w1Var = this.c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) w1Var.V.get(i10 - 3);
            kg.n nVar = (kg.n) view;
            nVar.setBoost(tL_myBoost);
            nVar.c(w1Var.U.contains(tL_myBoost), false);
            return;
        }
        if (i11 == 2) {
            l4 l4Var = (l4) view;
            l4Var.setTextSize(15.0f);
            l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            l4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
            return;
        }
        if (i11 == 0) {
            v1 v1Var = (v1) view;
            w1Var.Y = v1Var;
            TLRPC.Chat chat = w1Var.W;
            f90 f90Var = v1Var.e;
            try {
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), j6.gc, 2, new e3.h(w1Var, 14));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                f90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                f90Var.post(new ah.b(v1Var, indexOf, 4));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        f6 f6Var;
        Context context = viewGroup.getContext();
        w1 w1Var = this.c;
        if (i10 == 0) {
            v1 v1Var = new v1(context);
            v1Var.a(w1Var.U, w1Var.W);
            view = v1Var;
        } else if (i10 == 1) {
            view = new y6(context, j6.w0(null, j6.a7, false), 0);
        } else if (i10 == 2) {
            view = new l4(context, 22);
        } else if (i10 != 3) {
            view = new View(context);
        } else {
            f6Var = ((g3) w1Var).resourcesProvider;
            view = new kg.n(context, true, false, f6Var, true);
        }
        return ai.n(view, view, -1, -2);
    }
}
