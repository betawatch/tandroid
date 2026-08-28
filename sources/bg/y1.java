package bg;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y1 extends vk0 {
    public final /* synthetic */ g2 c;

    public y1(g2 g2Var) {
        this.c = g2Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 3;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.U.size() + 3;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2) {
                return 3;
            }
        }
        return i10;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        g2 g2Var = this.c;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) g2Var.U.get(i9 - 3);
            fg.p pVar = (fg.p) view;
            pVar.setBoost(tL_myBoost);
            pVar.c(g2Var.T.contains(tL_myBoost), false);
            return;
        }
        if (i10 == 2) {
            m4 m4Var = (m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
            return;
        }
        if (i10 == 0) {
            f2 f2Var = (f2) view;
            g2Var.X = f2Var;
            TLRPC.Chat chat = g2Var.V;
            l80 l80Var = f2Var.e;
            try {
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), f6.gc, 2, new af.e(g2Var, 13));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                l80Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                l80Var.post(new c2(f2Var, indexOf, 0));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        b6 b6Var;
        Context context = viewGroup.getContext();
        g2 g2Var = this.c;
        if (i9 == 0) {
            f2 f2Var = new f2(context);
            f2Var.a(g2Var.T, g2Var.V);
            view = f2Var;
        } else if (i9 == 1) {
            view = new z6(context, f6.w0(null, f6.a7, false), 0);
        } else if (i9 == 2) {
            view = new m4(context, 22);
        } else if (i9 != 3) {
            view = new View(context);
        } else {
            b6Var = ((org.telegram.ui.ActionBar.f3) g2Var).resourcesProvider;
            view = new fg.p(context, true, false, b6Var, true);
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
