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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class dq extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ eq d;

    public dq(eq eqVar, Context context) {
        this.d = eqVar;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        eq eqVar = this.d;
        ArrayList arrayList = eqVar.r;
        if (eqVar.G) {
            return (eqVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (eqVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        int j3 = j(i10);
        eq eqVar = this.d;
        if (j3 != 0) {
            if (j3 == 1) {
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                return;
            } else {
                if (j3 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) eqVar.r.get(i10 - (eqVar.G ? 2 : 3));
                boolean contains = eqVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.n2) eqVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        if (eqVar.G) {
            e9Var.setText(ChatObject.isChannelAndNotMegaGroup(eqVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = eqVar.v;
        if (i12 == 1) {
            e9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            e9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            e9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.e9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.l4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        eq eqVar = this.d;
        if (eqVar.s.getParent() != null) {
            ((ViewGroup) eqVar.s.getParent()).removeView(eqVar.s);
        }
        frameLayout.addView(eqVar.s);
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
