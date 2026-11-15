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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lq0 implements jj0 {
    public final /* synthetic */ aq0 a;
    public final /* synthetic */ ys0 b;

    public lq0(ys0 ys0Var, aq0 aq0Var) {
        this.b = ys0Var;
        this.a = aq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229  */
    @Override // org.telegram.ui.Components.jj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(float f10, float f11, int i7, View view) {
        boolean z10;
        int i10;
        View view2 = view;
        ys0 ys0Var = this.b;
        lr0 lr0Var = ys0Var.d0;
        int i11 = 0;
        if (!ys0Var.r1) {
            aq0 aq0Var = this.a;
            if (aq0Var.h.getAdapter() != ys0Var.V) {
                if (!ys0Var.F1 || aq0Var.F == 11) {
                    int i12 = aq0Var.F;
                    if (i12 == 7 && (view2 instanceof org.telegram.ui.Cells.pa)) {
                        if (lr0Var.e.isEmpty()) {
                            i10 = i7;
                        } else if (i7 < lr0Var.e.size()) {
                            i10 = ((Integer) lr0Var.e.get(i7)).intValue();
                        }
                        if (i10 >= 0 && i10 < lr0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = lr0Var.d.participants.participants.get(i10);
                            uj0 uj0Var = (uj0) view2.getParent();
                            while (true) {
                                if (i11 >= uj0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = uj0Var.getChildAt(i11);
                                if (RecyclerView.R(childAt) == i7) {
                                    view2 = childAt;
                                    break;
                                }
                                i11++;
                            }
                            return ys0Var.U0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i12 == 1 && (view2 instanceof org.telegram.ui.Cells.g7)) {
                            return ys0Var.T0(((org.telegram.ui.Cells.g7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 3 && (view2 instanceof org.telegram.ui.Cells.j7)) {
                            return ys0Var.T0(((org.telegram.ui.Cells.j7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i12 == 2 || i12 == 4) && (view2 instanceof org.telegram.ui.Cells.f7)) {
                            return ys0Var.T0(((org.telegram.ui.Cells.f7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 5 && (view2 instanceof org.telegram.ui.Cells.h2)) {
                            return ys0Var.T0((org.telegram.messenger.gj) ((org.telegram.ui.Cells.h2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i12 == 0 || (ys0.z0(i12) && ys0Var.H())) && (view2 instanceof org.telegram.ui.Cells.n7)) {
                            org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.n7) view2).getMessageObject();
                            if (messageObject != null) {
                                return ys0Var.T0(messageObject, view2, aq0Var.F, true);
                            }
                        } else {
                            int i13 = aq0Var.F;
                            if (i13 != 10) {
                                if (i13 != 11) {
                                    return false;
                                }
                                ys0Var.U.E(view2);
                                return true;
                            }
                            kr0 kr0Var = ys0Var.T;
                            ArrayList arrayList = kr0Var.d;
                            ys0 ys0Var2 = kr0Var.f;
                            if (i7 >= 0 && i7 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i7);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.an anVar = new org.telegram.ui.an(bundle);
                                org.telegram.ui.ActionBar.e2 e2Var = ys0Var2.y1;
                                org.telegram.ui.ActionBar.e6 e6Var = ys0Var2.I1;
                                if (e2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) e2Var;
                                    if (profileActivity.U != null) {
                                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                        z10 = true;
                                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.scale(0.16666667f, 0.16666667f);
                                        profileActivity.fragmentView.draw(canvas);
                                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ns.K2));
                                        profileActivity.U.setBackground(new BitmapDrawable(createBitmap));
                                        profileActivity.U.setAlpha(0.0f);
                                        profileActivity.U.setVisibility(0);
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, ys0Var2.getContext(), e6Var);
                                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, e6Var);
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            e2Var.presentFragmentAsPreview(anVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(ys0Var2.getContext(), false, false);
                                        z0Var.j(org.telegram.messenger.hd.M0(2131747811, null), R.drawable.msg_channel, null);
                                        z0Var.setMinimumWidth(org.telegram.messenger.ns.q2);
                                        z0Var.setOnClickListener(new y60(kr0Var, 13));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(ys0Var2.getContext(), false, false);
                                        z0Var2.j(org.telegram.messenger.hd.M0(2131746662, null), R.drawable.msg_addbot, null);
                                        z0Var2.setMinimumWidth(org.telegram.messenger.ns.q2);
                                        z0Var2.setOnClickListener(new bi.x2(kr0Var, (TLRPC.Chat) tLObject, i7, 15));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                                        e2Var.presentFragmentAsPreviewWithMenu(anVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, ys0Var2.getContext(), e6Var);
                                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, e6Var);
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    dq0 dq0Var = aq0Var.h;
                    gj0 gj0Var = dq0Var.U0;
                    if (gj0Var != null) {
                        gj0Var.b(i7, view2);
                        return true;
                    }
                    hj0 hj0Var = dq0Var.V0;
                    if (hj0Var != null) {
                        hj0Var.f(0.0f, 0.0f, i7, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public final void i() {
        org.telegram.ui.ActionBar.e2 e2Var = this.b.y1;
        if (e2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                e2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.jj0
    public final void q(float f10) {
        org.telegram.ui.ActionBar.e2 e2Var = this.b.y1;
        if (e2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                e2Var.movePreviewFragment(f10);
            }
        }
    }
}
