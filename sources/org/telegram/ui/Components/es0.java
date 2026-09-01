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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class es0 implements ml0 {
    public final /* synthetic */ ur0 a;
    public final /* synthetic */ zu0 b;

    public es0(zu0 zu0Var, ur0 ur0Var) {
        this.b = zu0Var;
        this.a = ur0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    @Override // org.telegram.ui.Components.ml0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f10, float f11, int i10, View view) {
        boolean z4;
        int i11;
        View view2 = view;
        zu0 zu0Var = this.b;
        it0 it0Var = zu0Var.U;
        int i12 = 0;
        if (zu0Var.l1) {
            return false;
        }
        ur0 ur0Var = this.a;
        if (ur0Var.h.getAdapter() == zu0Var.P) {
            return false;
        }
        if (!zu0Var.z1 || ur0Var.C == 11) {
            int i13 = ur0Var.C;
            if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.va)) {
                if (it0Var.e.isEmpty()) {
                    i11 = i10;
                } else {
                    if (i10 >= it0Var.e.size()) {
                        return false;
                    }
                    i11 = ((Integer) it0Var.e.get(i10)).intValue();
                }
                if (i11 < 0 || i11 >= it0Var.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = it0Var.d.participants.participants.get(i11);
                tl0 tl0Var = (tl0) view2.getParent();
                while (true) {
                    if (i12 >= tl0Var.getChildCount()) {
                        break;
                    }
                    View childAt = tl0Var.getChildAt(i12);
                    if (RecyclerView.R(childAt) == i10) {
                        view2 = childAt;
                        break;
                    }
                    i12++;
                }
                return zu0Var.I0(chatParticipant, true, view2);
            }
            if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.i7)) {
                return zu0Var.H0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.l7)) {
                return zu0Var.H0(((org.telegram.ui.Cells.l7) view2).getMessage(), view2, 0, true);
            }
            if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.h7)) {
                return zu0Var.H0(((org.telegram.ui.Cells.h7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.e2)) {
                return zu0Var.H0((MessageObject) ((org.telegram.ui.Cells.e2) view2).getParentObject(), view2, 0, true);
            }
            if ((i13 == 0 || (zu0.p0(i13) && zu0Var.C())) && (view2 instanceof org.telegram.ui.Cells.r7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.r7) view2).getMessageObject();
                if (messageObject != null) {
                    return zu0Var.H0(messageObject, view2, ur0Var.C, true);
                }
                return false;
            }
            int i14 = ur0Var.C;
            if (i14 != 10) {
                if (i14 != 11) {
                    return false;
                }
                zu0Var.O.E(view2);
                return true;
            }
            ht0 ht0Var = zu0Var.N;
            ArrayList arrayList = ht0Var.d;
            zu0 zu0Var2 = ht0Var.f;
            if (i10 >= 0 && i10 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i10);
                Bundle bundle = new Bundle();
                boolean z10 = tLObject instanceof TLRPC.Chat;
                if (z10) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                org.telegram.ui.xn xnVar = new org.telegram.ui.xn(bundle);
                org.telegram.ui.ActionBar.p2 p2Var = zu0Var2.s1;
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
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, zu0Var2.getContext(), zu0Var2.C1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(zu0Var2.h0(org.telegram.ui.ActionBar.k6.G8));
                        if (z10) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z4;
                            }
                            p2Var.presentFragmentAsPreview(xnVar);
                            return z4;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(zu0Var2.getContext(), false, false);
                        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                        g1Var.setMinimumWidth(160);
                        g1Var.setOnClickListener(new b80(ht0Var, 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(zu0Var2.getContext(), false, false);
                        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                        g1Var2.setMinimumWidth(160);
                        g1Var2.setOnClickListener(new eg.k2(ht0Var, (TLRPC.Chat) tLObject, i10, 13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                        p2Var.presentFragmentAsPreviewWithMenu(xnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z4;
                    }
                }
                z4 = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, zu0Var2.getContext(), zu0Var2.C1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(zu0Var2.h0(org.telegram.ui.ActionBar.k6.G8));
                if (z10) {
                }
            }
        } else {
            xr0 xr0Var = ur0Var.h;
            jl0 jl0Var = xr0Var.S0;
            if (jl0Var != null) {
                jl0Var.f(i10, view2);
                return true;
            }
            kl0 kl0Var = xr0Var.T0;
            if (kl0Var != null) {
                kl0Var.c(0.0f, 0.0f, i10, view2);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void h() {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.s1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.ml0
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
