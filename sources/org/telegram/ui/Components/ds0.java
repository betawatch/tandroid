package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ds0 implements kl0 {
    public final /* synthetic */ tr0 a;
    public final /* synthetic */ yu0 b;

    public ds0(yu0 yu0Var, tr0 tr0Var) {
        this.b = yu0Var;
        this.a = tr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    @Override // org.telegram.ui.Components.kl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f10, float f11, int i10, View view) {
        boolean z4;
        int i11;
        View view2 = view;
        yu0 yu0Var = this.b;
        ht0 ht0Var = yu0Var.U;
        int i12 = 0;
        if (yu0Var.l1) {
            return false;
        }
        tr0 tr0Var = this.a;
        if (tr0Var.h.getAdapter() == yu0Var.P) {
            return false;
        }
        if (!yu0Var.z1 || tr0Var.C == 11) {
            int i13 = tr0Var.C;
            if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.ua)) {
                if (ht0Var.e.isEmpty()) {
                    i11 = i10;
                } else {
                    if (i10 >= ht0Var.e.size()) {
                        return false;
                    }
                    i11 = ((Integer) ht0Var.e.get(i10)).intValue();
                }
                if (i11 < 0 || i11 >= ht0Var.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = ht0Var.d.participants.participants.get(i11);
                rl0 rl0Var = (rl0) view2.getParent();
                while (true) {
                    if (i12 >= rl0Var.getChildCount()) {
                        break;
                    }
                    View childAt = rl0Var.getChildAt(i12);
                    if (RecyclerView.R(childAt) == i10) {
                        view2 = childAt;
                        break;
                    }
                    i12++;
                }
                return yu0Var.I0(chatParticipant, true, view2);
            }
            if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.h7)) {
                return yu0Var.H0(((org.telegram.ui.Cells.h7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.k7)) {
                return yu0Var.H0(((org.telegram.ui.Cells.k7) view2).getMessage(), view2, 0, true);
            }
            if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.g7)) {
                return yu0Var.H0(((org.telegram.ui.Cells.g7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.d2)) {
                return yu0Var.H0((MessageObject) ((org.telegram.ui.Cells.d2) view2).getParentObject(), view2, 0, true);
            }
            if ((i13 == 0 || (yu0.p0(i13) && yu0Var.C())) && (view2 instanceof org.telegram.ui.Cells.q7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.q7) view2).getMessageObject();
                if (messageObject != null) {
                    return yu0Var.H0(messageObject, view2, tr0Var.C, true);
                }
                return false;
            }
            int i14 = tr0Var.C;
            if (i14 != 10) {
                if (i14 != 11) {
                    return false;
                }
                yu0Var.O.E(view2);
                return true;
            }
            gt0 gt0Var = yu0Var.N;
            ArrayList arrayList = gt0Var.d;
            yu0 yu0Var2 = gt0Var.f;
            if (i10 >= 0 && i10 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i10);
                Bundle bundle = new Bundle();
                boolean z10 = tLObject instanceof TLRPC.Chat;
                if (z10) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                org.telegram.ui.zn znVar = new org.telegram.ui.zn(bundle);
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var2.s1;
                if (p2Var instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) p2Var;
                    if (profileActivity.R != null) {
                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                        z4 = true;
                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.scale(0.16666667f, 0.16666667f);
                        profileActivity.fragmentView.draw(canvas);
                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
                        profileActivity.R.setBackground(new BitmapDrawable(createBitmap));
                        profileActivity.R.setAlpha(0.0f);
                        profileActivity.R.setVisibility(0);
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, yu0Var2.getContext(), yu0Var2.C1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(yu0Var2.h0(org.telegram.ui.ActionBar.j6.G8));
                        if (z10) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z4;
                            }
                            p2Var.presentFragmentAsPreview(znVar);
                            return z4;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(yu0Var2.getContext(), false, false);
                        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                        g1Var.setMinimumWidth(160);
                        g1Var.setOnClickListener(new a80(gt0Var, 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(yu0Var2.getContext(), false, false);
                        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                        g1Var2.setMinimumWidth(160);
                        g1Var2.setOnClickListener(new dg.m2(gt0Var, (TLRPC.Chat) tLObject, i10, 13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                        p2Var.presentFragmentAsPreviewWithMenu(znVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z4;
                    }
                }
                z4 = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, yu0Var2.getContext(), yu0Var2.C1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(yu0Var2.h0(org.telegram.ui.ActionBar.j6.G8));
                if (z10) {
                }
            }
        } else {
            wr0 wr0Var = tr0Var.h;
            hl0 hl0Var = wr0Var.S0;
            if (hl0Var != null) {
                hl0Var.d(i10, view2);
                return true;
            }
            il0 il0Var = wr0Var.T0;
            if (il0Var != null) {
                il0Var.c(0.0f, 0.0f, i10, view2);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void h() {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.s1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final void p(float f10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.s1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.movePreviewFragment(f10);
            }
        }
    }
}
