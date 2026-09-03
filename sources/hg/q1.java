package hg;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q1 extends rl0 {
    public final /* synthetic */ w1 c;

    public q1(w1 w1Var) {
        this.c = w1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 3;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.V.size() + 3;
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
        w1 w1Var = this.c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) w1Var.V.get(i10 - 3);
            lg.n nVar = (lg.n) view;
            nVar.setBoost(tL_myBoost);
            nVar.c(w1Var.U.contains(tL_myBoost), false);
            return;
        }
        if (i11 == 2) {
            m4 m4Var = (m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
            return;
        }
        if (i11 == 0) {
            v1 v1Var = (v1) view;
            w1Var.Y = v1Var;
            TLRPC.Chat chat = w1Var.W;
            g90 g90Var = v1Var.e;
            try {
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), k6.gc, 2, new eh.m(w1Var, 16));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                g90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                g90Var.post(new af.b(v1Var, indexOf, 5));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        g6 g6Var;
        Context context = viewGroup.getContext();
        w1 w1Var = this.c;
        if (i10 == 0) {
            v1 v1Var = new v1(context);
            v1Var.a(w1Var.U, w1Var.W);
            view = v1Var;
        } else if (i10 == 1) {
            view = new z6(context, k6.w0(null, k6.a7, false), 0);
        } else if (i10 == 2) {
            view = new m4(context, 22);
        } else if (i10 != 3) {
            view = new View(context);
        } else {
            g6Var = ((h3) w1Var).resourcesProvider;
            view = new lg.n(context, true, false, g6Var, true);
        }
        return yh.o(view, view, -1, -2);
    }
}
