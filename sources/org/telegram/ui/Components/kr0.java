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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kr0 implements pk0 {
    public final /* synthetic */ ar0 a;
    public final /* synthetic */ eu0 b;

    public kr0(eu0 eu0Var, ar0 ar0Var) {
        this.b = eu0Var;
        this.a = ar0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    @Override // org.telegram.ui.Components.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f10, float f11, int i9, View view) {
        boolean z10;
        int i10;
        View view2 = view;
        eu0 eu0Var = this.b;
        os0 os0Var = eu0Var.T;
        int i11 = 0;
        if (eu0Var.k1) {
            return false;
        }
        ar0 ar0Var = this.a;
        if (ar0Var.h.getAdapter() == eu0Var.O) {
            return false;
        }
        if (!eu0Var.y1 || ar0Var.B == 11) {
            int i12 = ar0Var.B;
            if (i12 == 7 && (view2 instanceof org.telegram.ui.Cells.va)) {
                if (os0Var.e.isEmpty()) {
                    i10 = i9;
                } else {
                    if (i9 >= os0Var.e.size()) {
                        return false;
                    }
                    i10 = ((Integer) os0Var.e.get(i9)).intValue();
                }
                if (i10 < 0 || i10 >= os0Var.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = os0Var.d.participants.participants.get(i10);
                wk0 wk0Var = (wk0) view2.getParent();
                while (true) {
                    if (i11 >= wk0Var.getChildCount()) {
                        break;
                    }
                    View childAt = wk0Var.getChildAt(i11);
                    if (RecyclerView.R(childAt) == i9) {
                        view2 = childAt;
                        break;
                    }
                    i11++;
                }
                return eu0Var.I0(chatParticipant, true, view2);
            }
            if (i12 == 1 && (view2 instanceof org.telegram.ui.Cells.i7)) {
                return eu0Var.H0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
            }
            if (i12 == 3 && (view2 instanceof org.telegram.ui.Cells.l7)) {
                return eu0Var.H0(((org.telegram.ui.Cells.l7) view2).getMessage(), view2, 0, true);
            }
            if ((i12 == 2 || i12 == 4) && (view2 instanceof org.telegram.ui.Cells.h7)) {
                return eu0Var.H0(((org.telegram.ui.Cells.h7) view2).getMessage(), view2, 0, true);
            }
            if (i12 == 5 && (view2 instanceof org.telegram.ui.Cells.e2)) {
                return eu0Var.H0((MessageObject) ((org.telegram.ui.Cells.e2) view2).getParentObject(), view2, 0, true);
            }
            if ((i12 == 0 || (eu0.p0(i12) && eu0Var.C())) && (view2 instanceof org.telegram.ui.Cells.r7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.r7) view2).getMessageObject();
                if (messageObject != null) {
                    return eu0Var.H0(messageObject, view2, ar0Var.B, true);
                }
                return false;
            }
            int i13 = ar0Var.B;
            if (i13 != 10) {
                if (i13 != 11) {
                    return false;
                }
                eu0Var.N.E(view2);
                return true;
            }
            ns0 ns0Var = eu0Var.M;
            ArrayList arrayList = ns0Var.d;
            eu0 eu0Var2 = ns0Var.f;
            if (i9 >= 0 && i9 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i9);
                Bundle bundle = new Bundle();
                boolean z11 = tLObject instanceof TLRPC.Chat;
                if (z11) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                org.telegram.ui.qn qnVar = new org.telegram.ui.qn(bundle);
                org.telegram.ui.ActionBar.o2 o2Var = eu0Var2.r1;
                if (o2Var instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) o2Var;
                    if (profileActivity.Q != null) {
                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                        z10 = true;
                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.scale(0.16666667f, 0.16666667f);
                        profileActivity.fragmentView.draw(canvas);
                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
                        profileActivity.Q.setBackground(new BitmapDrawable(createBitmap));
                        profileActivity.Q.setAlpha(0.0f);
                        profileActivity.Q.setVisibility(0);
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, eu0Var2.getContext(), eu0Var2.B1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(eu0Var2.h0(org.telegram.ui.ActionBar.f6.G8));
                        if (z11) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z10;
                            }
                            o2Var.presentFragmentAsPreview(qnVar);
                            return z10;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(eu0Var2.getContext(), false, false);
                        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                        g1Var.setMinimumWidth(160);
                        g1Var.setOnClickListener(new h70(ns0Var, 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(eu0Var2.getContext(), false, false);
                        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                        g1Var2.setMinimumWidth(160);
                        g1Var2.setOnClickListener(new fh.a3(ns0Var, (TLRPC.Chat) tLObject, i9, 12));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                        o2Var.presentFragmentAsPreviewWithMenu(qnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z10;
                    }
                }
                z10 = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, eu0Var2.getContext(), eu0Var2.B1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(eu0Var2.h0(org.telegram.ui.ActionBar.f6.G8));
                if (z11) {
                }
            }
        } else {
            dr0 dr0Var = ar0Var.h;
            mk0 mk0Var = dr0Var.R0;
            if (mk0Var != null) {
                mk0Var.a(i9, view2);
                return true;
            }
            nk0 nk0Var = dr0Var.S0;
            if (nk0Var != null) {
                nk0Var.c(0.0f, 0.0f, i9, view2);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void j() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.r1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final void u(float f10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.r1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.movePreviewFragment(f10);
            }
        }
    }
}
