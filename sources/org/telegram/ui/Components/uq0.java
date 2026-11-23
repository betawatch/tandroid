package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class uq0 implements tj0 {
    public final /* synthetic */ jq0 a;
    public final /* synthetic */ it0 b;

    public uq0(it0 it0Var, jq0 jq0Var) {
        this.b = it0Var;
        this.a = jq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @Override // org.telegram.ui.Components.tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(float f10, float f11, int i7, View view) {
        boolean z10;
        int i10;
        View view2 = view;
        it0 it0Var = this.b;
        ur0 ur0Var = it0Var.d0;
        int i11 = 0;
        if (!it0Var.r1) {
            jq0 jq0Var = this.a;
            if (jq0Var.h.getAdapter() != it0Var.V) {
                if (!it0Var.F1 || jq0Var.F == 11) {
                    int i12 = jq0Var.F;
                    if (i12 == 7 && (view2 instanceof org.telegram.ui.Cells.sa)) {
                        if (ur0Var.e.isEmpty()) {
                            i10 = i7;
                        } else if (i7 < ur0Var.e.size()) {
                            i10 = ((Integer) ur0Var.e.get(i7)).intValue();
                        }
                        if (i10 >= 0 && i10 < ur0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = ur0Var.d.participants.participants.get(i10);
                            ek0 ek0Var = (ek0) view2.getParent();
                            while (true) {
                                if (i11 >= ek0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = ek0Var.getChildAt(i11);
                                if (RecyclerView.R(childAt) == i7) {
                                    view2 = childAt;
                                    break;
                                }
                                i11++;
                            }
                            return it0Var.U0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i12 == 1 && (view2 instanceof org.telegram.ui.Cells.h7)) {
                            return it0Var.T0(((org.telegram.ui.Cells.h7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 3 && (view2 instanceof org.telegram.ui.Cells.k7)) {
                            return it0Var.T0(((org.telegram.ui.Cells.k7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i12 == 2 || i12 == 4) && (view2 instanceof org.telegram.ui.Cells.g7)) {
                            return it0Var.T0(((org.telegram.ui.Cells.g7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 5 && (view2 instanceof org.telegram.ui.Cells.i2)) {
                            return it0Var.T0((org.telegram.messenger.fj) ((org.telegram.ui.Cells.i2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i12 == 0 || (it0.z0(i12) && it0Var.H())) && (view2 instanceof org.telegram.ui.Cells.o7)) {
                            org.telegram.messenger.fj messageObject = ((org.telegram.ui.Cells.o7) view2).getMessageObject();
                            if (messageObject != null) {
                                return it0Var.T0(messageObject, view2, jq0Var.F, true);
                            }
                        } else {
                            int i13 = jq0Var.F;
                            if (i13 != 10) {
                                if (i13 != 11) {
                                    return false;
                                }
                                it0Var.U.E(view2);
                                return true;
                            }
                            tr0 tr0Var = it0Var.T;
                            ArrayList arrayList = tr0Var.d;
                            it0 it0Var2 = tr0Var.f;
                            if (i7 >= 0 && i7 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i7);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.bn bnVar = new org.telegram.ui.bn(bundle);
                                org.telegram.ui.ActionBar.g2 g2Var = it0Var2.y1;
                                org.telegram.ui.ActionBar.i6 i6Var = it0Var2.I1;
                                if (g2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) g2Var;
                                    if (profileActivity.U != null) {
                                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                        z10 = true;
                                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.scale(0.16666667f, 0.16666667f);
                                        profileActivity.fragmentView.draw(canvas);
                                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ks.K2));
                                        profileActivity.U.setBackground(new BitmapDrawable(createBitmap));
                                        profileActivity.U.setAlpha(0.0f);
                                        profileActivity.U.setVisibility(0);
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, it0Var2.getContext(), i6Var);
                                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, i6Var);
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            g2Var.presentFragmentAsPreview(bnVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(it0Var2.getContext(), false, false);
                                        y0Var.j(org.telegram.messenger.gd.N0(2131747617, null), R.drawable.msg_channel, null);
                                        y0Var.setMinimumWidth(org.telegram.messenger.ks.q2);
                                        int i14 = 15;
                                        y0Var.setOnClickListener(new g70(tr0Var, i14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(it0Var2.getContext(), false, false);
                                        y0Var2.j(org.telegram.messenger.gd.N0(2131746466, null), R.drawable.msg_addbot, null);
                                        y0Var2.setMinimumWidth(org.telegram.messenger.ks.q2);
                                        y0Var2.setOnClickListener(new bi.k5(tr0Var, (TLRPC.Chat) tLObject, i7, i14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
                                        g2Var.presentFragmentAsPreviewWithMenu(bnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, it0Var2.getContext(), i6Var);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, i6Var);
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    mq0 mq0Var = jq0Var.h;
                    qj0 qj0Var = mq0Var.U0;
                    if (qj0Var != null) {
                        qj0Var.b(i7, view2);
                        return true;
                    }
                    rj0 rj0Var = mq0Var.V0;
                    if (rj0Var != null) {
                        rj0Var.g(0.0f, 0.0f, i7, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final void h() {
        org.telegram.ui.ActionBar.g2 g2Var = this.b.y1;
        if (g2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                g2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final void l(float f10) {
        org.telegram.ui.ActionBar.g2 g2Var = this.b.y1;
        if (g2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                g2Var.movePreviewFragment(f10);
            }
        }
    }
}
