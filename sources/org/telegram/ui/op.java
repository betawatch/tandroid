package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class op extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ pp d;

    public op(pp ppVar, Context context) {
        this.d = ppVar;
        this.c = context;
    }

    @Override // s4.g0
    public final int h() {
        pp ppVar = this.d;
        ArrayList arrayList = ppVar.r;
        if (ppVar.G) {
            return (ppVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (ppVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (this.d.G) {
            if (i10 == 0) {
                return 0;
            }
            return i10 == 1 ? 1 : 2;
        }
        if (i10 == 0) {
            return 3;
        }
        if (i10 == 1) {
            return 0;
        }
        return i10 == 2 ? 1 : 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        View view = b1Var.a;
        int j10 = j(i10);
        pp ppVar = this.d;
        if (j10 != 0) {
            if (j10 == 1) {
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ppVar.r.get(i10 - (ppVar.G ? 2 : 3));
                boolean contains = ppVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.n2) ppVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        d9Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
        if (ppVar.G) {
            d9Var.setText(ChatObject.isChannelAndNotMegaGroup(ppVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = ppVar.v;
        if (i12 == 1) {
            d9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            d9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            d9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.tl0(new org.telegram.ui.Cells.d9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.tl0(new org.telegram.ui.Cells.l4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.tl0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        pp ppVar = this.d;
        if (ppVar.s.getParent() != null) {
            ((ViewGroup) ppVar.s.getParent()).removeView(ppVar.s);
        }
        frameLayout.addView(ppVar.s);
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.tl0(frameLayout);
    }
}
