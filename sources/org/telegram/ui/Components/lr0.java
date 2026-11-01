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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lr0 implements kk0 {
    public final /* synthetic */ br0 a;
    public final /* synthetic */ au0 b;

    public lr0(au0 au0Var, br0 br0Var) {
        this.b = au0Var;
        this.a = br0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229  */
    @Override // org.telegram.ui.Components.kk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        au0 au0Var = this.b;
        ls0 ls0Var = au0Var.c0;
        int i12 = 0;
        if (!au0Var.q1) {
            br0 br0Var = this.a;
            if (br0Var.h.getAdapter() != au0Var.U) {
                if (!au0Var.E1 || br0Var.E == 11) {
                    int i13 = br0Var.E;
                    if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.pa)) {
                        if (ls0Var.e.isEmpty()) {
                            i11 = i10;
                        } else if (i10 < ls0Var.e.size()) {
                            i11 = ((Integer) ls0Var.e.get(i10)).intValue();
                        }
                        if (i11 >= 0 && i11 < ls0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = ls0Var.d.participants.participants.get(i11);
                            uk0 uk0Var = (uk0) view2.getParent();
                            while (true) {
                                if (i12 >= uk0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = uk0Var.getChildAt(i12);
                                if (RecyclerView.R(childAt) == i10) {
                                    view2 = childAt;
                                    break;
                                }
                                i12++;
                            }
                            return au0Var.R0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.l7)) {
                            return au0Var.Q0(((org.telegram.ui.Cells.l7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.o7)) {
                            return au0Var.Q0(((org.telegram.ui.Cells.o7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.k7)) {
                            return au0Var.Q0(((org.telegram.ui.Cells.k7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.h2)) {
                            return au0Var.Q0((org.telegram.messenger.kj) ((org.telegram.ui.Cells.h2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i13 == 0 || (au0.y0(i13) && au0Var.G())) && (view2 instanceof org.telegram.ui.Cells.s7)) {
                            org.telegram.messenger.kj messageObject = ((org.telegram.ui.Cells.s7) view2).getMessageObject();
                            if (messageObject != null) {
                                return au0Var.Q0(messageObject, view2, br0Var.E, true);
                            }
                        } else {
                            int i14 = br0Var.E;
                            if (i14 != 10) {
                                if (i14 != 11) {
                                    return false;
                                }
                                au0Var.T.E(view2);
                                return true;
                            }
                            ks0 ks0Var = au0Var.S;
                            ArrayList arrayList = ks0Var.d;
                            au0 au0Var2 = ks0Var.f;
                            if (i10 >= 0 && i10 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i10);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.un unVar = new org.telegram.ui.un(bundle);
                                org.telegram.ui.ActionBar.k2 k2Var = au0Var2.x1;
                                org.telegram.ui.ActionBar.p6 p6Var = au0Var2.H1;
                                if (k2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) k2Var;
                                    if (profileActivity.T != null) {
                                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                        z10 = true;
                                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.scale(0.16666667f, 0.16666667f);
                                        profileActivity.fragmentView.draw(canvas);
                                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.at.K2));
                                        profileActivity.T.setBackground(new BitmapDrawable(createBitmap));
                                        profileActivity.T.setAlpha(0.0f);
                                        profileActivity.T.setVisibility(0);
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, au0Var2.getContext(), p6Var);
                                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, p6Var);
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            k2Var.presentFragmentAsPreview(unVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(au0Var2.getContext(), false, false);
                                        b1Var.j(org.telegram.messenger.dd.L0(2131747827, null), R.drawable.msg_channel, null);
                                        b1Var.setMinimumWidth(org.telegram.messenger.at.q2);
                                        b1Var.setOnClickListener(new db0(ks0Var, 13));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                                        org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(au0Var2.getContext(), false, false);
                                        b1Var2.j(org.telegram.messenger.dd.L0(2131746677, null), R.drawable.msg_addbot, null);
                                        b1Var2.setMinimumWidth(org.telegram.messenger.at.q2);
                                        b1Var2.setOnClickListener(new jg.w1(ks0Var, (TLRPC.Chat) tLObject, i10, 12));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var2);
                                        k2Var.presentFragmentAsPreviewWithMenu(unVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, au0Var2.getContext(), p6Var);
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, p6Var);
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    er0 er0Var = br0Var.h;
                    hk0 hk0Var = er0Var.T0;
                    if (hk0Var != null) {
                        hk0Var.f(i10, view2);
                        return true;
                    }
                    ik0 ik0Var = er0Var.U0;
                    if (ik0Var != null) {
                        ik0Var.b(0.0f, 0.0f, i10, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kk0
    public final void g() {
        org.telegram.ui.ActionBar.k2 k2Var = this.b.x1;
        if (k2Var != null) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                k2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.kk0
    public final void p(float f7) {
        org.telegram.ui.ActionBar.k2 k2Var = this.b.x1;
        if (k2Var != null) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                k2Var.movePreviewFragment(f7);
            }
        }
    }
}
