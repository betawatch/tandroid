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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class np extends f2.r0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ op d;

    public np(op opVar, Context context) {
        this.d = opVar;
        this.c = context;
    }

    @Override // f2.r0
    public final int h() {
        op opVar = this.d;
        ArrayList arrayList = opVar.r;
        if (opVar.C) {
            return (opVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (opVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (this.d.C) {
            if (i9 == 0) {
                return 0;
            }
            return i9 == 1 ? 1 : 2;
        }
        if (i9 == 0) {
            return 3;
        }
        if (i9 == 1) {
            return 0;
        }
        return i9 == 2 ? 1 : 2;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        View view = q1Var.a;
        int j10 = j(i9);
        op opVar = this.d;
        if (j10 != 0) {
            if (j10 == 1) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) opVar.r.get(i9 - (opVar.C ? 2 : 3));
                boolean contains = opVar.d.contains(tL_availableReaction.reaction);
                i10 = ((org.telegram.ui.ActionBar.o2) opVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i10);
                return;
            }
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        b9Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
        if (opVar.C) {
            b9Var.setText(ChatObject.isChannelAndNotMegaGroup(opVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i11 = opVar.v;
        if (i11 == 1) {
            b9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i11 == 0) {
            b9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i11 == 2) {
            b9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        if (i9 == 0) {
            return new org.telegram.ui.Components.ik0(new org.telegram.ui.Cells.b9(context));
        }
        if (i9 == 1) {
            return new org.telegram.ui.Components.ik0(new org.telegram.ui.Cells.m4(context, 23));
        }
        if (i9 != 3) {
            return new org.telegram.ui.Components.ik0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        op opVar = this.d;
        if (opVar.s.getParent() != null) {
            ((ViewGroup) opVar.s.getParent()).removeView(opVar.s);
        }
        frameLayout.addView(opVar.s);
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new org.telegram.ui.Components.ik0(frameLayout);
    }
}
