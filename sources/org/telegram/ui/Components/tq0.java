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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tq0 implements rj0 {
    public final /* synthetic */ iq0 a;
    public final /* synthetic */ gt0 b;

    public tq0(gt0 gt0Var, iq0 iq0Var) {
        this.b = gt0Var;
        this.a = iq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229  */
    @Override // org.telegram.ui.Components.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(float f10, float f11, int i7, View view) {
        boolean z10;
        int i10;
        View view2 = view;
        gt0 gt0Var = this.b;
        tr0 tr0Var = gt0Var.d0;
        int i11 = 0;
        if (!gt0Var.r1) {
            iq0 iq0Var = this.a;
            if (iq0Var.h.getAdapter() != gt0Var.V) {
                if (!gt0Var.F1 || iq0Var.F == 11) {
                    int i12 = iq0Var.F;
                    if (i12 == 7 && (view2 instanceof org.telegram.ui.Cells.ra)) {
                        if (tr0Var.e.isEmpty()) {
                            i10 = i7;
                        } else if (i7 < tr0Var.e.size()) {
                            i10 = ((Integer) tr0Var.e.get(i7)).intValue();
                        }
                        if (i10 >= 0 && i10 < tr0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = tr0Var.d.participants.participants.get(i10);
                            ck0 ck0Var = (ck0) view2.getParent();
                            while (true) {
                                if (i11 >= ck0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = ck0Var.getChildAt(i11);
                                if (RecyclerView.R(childAt) == i7) {
                                    view2 = childAt;
                                    break;
                                }
                                i11++;
                            }
                            return gt0Var.U0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i12 == 1 && (view2 instanceof org.telegram.ui.Cells.i7)) {
                            return gt0Var.T0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 3 && (view2 instanceof org.telegram.ui.Cells.l7)) {
                            return gt0Var.T0(((org.telegram.ui.Cells.l7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i12 == 2 || i12 == 4) && (view2 instanceof org.telegram.ui.Cells.h7)) {
                            return gt0Var.T0(((org.telegram.ui.Cells.h7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 5 && (view2 instanceof org.telegram.ui.Cells.i2)) {
                            return gt0Var.T0((org.telegram.messenger.fj) ((org.telegram.ui.Cells.i2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i12 == 0 || (gt0.z0(i12) && gt0Var.H())) && (view2 instanceof org.telegram.ui.Cells.p7)) {
                            org.telegram.messenger.fj messageObject = ((org.telegram.ui.Cells.p7) view2).getMessageObject();
                            if (messageObject != null) {
                                return gt0Var.T0(messageObject, view2, iq0Var.F, true);
                            }
                        } else {
                            int i13 = iq0Var.F;
                            if (i13 != 10) {
                                if (i13 != 11) {
                                    return false;
                                }
                                gt0Var.U.E(view2);
                                return true;
                            }
                            sr0 sr0Var = gt0Var.T;
                            ArrayList arrayList = sr0Var.d;
                            gt0 gt0Var2 = sr0Var.f;
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
                                org.telegram.ui.ActionBar.h2 h2Var = gt0Var2.y1;
                                org.telegram.ui.ActionBar.i6 i6Var = gt0Var2.I1;
                                if (h2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) h2Var;
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
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, gt0Var2.getContext(), i6Var);
                                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, i6Var);
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            h2Var.presentFragmentAsPreview(bnVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(gt0Var2.getContext(), false, false);
                                        z0Var.j(org.telegram.messenger.gd.M0(2131747618, null), R.drawable.msg_channel, null);
                                        z0Var.setMinimumWidth(org.telegram.messenger.ks.q2);
                                        z0Var.setOnClickListener(new h70(sr0Var, 14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(gt0Var2.getContext(), false, false);
                                        z0Var2.j(org.telegram.messenger.gd.M0(2131746467, null), R.drawable.msg_addbot, null);
                                        z0Var2.setMinimumWidth(org.telegram.messenger.ks.q2);
                                        z0Var2.setOnClickListener(new bi.e5(sr0Var, (TLRPC.Chat) tLObject, i7, 15));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                                        h2Var.presentFragmentAsPreviewWithMenu(bnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, gt0Var2.getContext(), i6Var);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, i6Var);
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    lq0 lq0Var = iq0Var.h;
                    oj0 oj0Var = lq0Var.U0;
                    if (oj0Var != null) {
                        oj0Var.c(i7, view2);
                        return true;
                    }
                    pj0 pj0Var = lq0Var.V0;
                    if (pj0Var != null) {
                        pj0Var.f(0.0f, 0.0f, i7, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public final void j() {
        org.telegram.ui.ActionBar.h2 h2Var = this.b.y1;
        if (h2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                h2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public final void r(float f10) {
        org.telegram.ui.ActionBar.h2 h2Var = this.b.y1;
        if (h2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                h2Var.movePreviewFragment(f10);
            }
        }
    }
}
