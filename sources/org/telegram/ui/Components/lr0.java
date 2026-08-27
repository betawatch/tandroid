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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lr0 implements sk0 {
    public final /* synthetic */ br0 a;
    public final /* synthetic */ hu0 b;

    public lr0(hu0 hu0Var, br0 br0Var) {
        this.b = hu0Var;
        this.a = br0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    @Override // org.telegram.ui.Components.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f10, float f11, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        hu0 hu0Var = this.b;
        qs0 qs0Var = hu0Var.T;
        int i12 = 0;
        if (hu0Var.k1) {
            return false;
        }
        br0 br0Var = this.a;
        if (br0Var.h.getAdapter() == hu0Var.O) {
            return false;
        }
        if (!hu0Var.y1 || br0Var.B == 11) {
            int i13 = br0Var.B;
            if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.sa)) {
                if (qs0Var.e.isEmpty()) {
                    i11 = i10;
                } else {
                    if (i10 >= qs0Var.e.size()) {
                        return false;
                    }
                    i11 = ((Integer) qs0Var.e.get(i10)).intValue();
                }
                if (i11 < 0 || i11 >= qs0Var.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = qs0Var.d.participants.participants.get(i11);
                zk0 zk0Var = (zk0) view2.getParent();
                while (true) {
                    if (i12 >= zk0Var.getChildCount()) {
                        break;
                    }
                    View childAt = zk0Var.getChildAt(i12);
                    if (RecyclerView.R(childAt) == i10) {
                        view2 = childAt;
                        break;
                    }
                    i12++;
                }
                return hu0Var.I0(chatParticipant, true, view2);
            }
            if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.f7)) {
                return hu0Var.H0(((org.telegram.ui.Cells.f7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.i7)) {
                return hu0Var.H0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
            }
            if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.e7)) {
                return hu0Var.H0(((org.telegram.ui.Cells.e7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.d2)) {
                return hu0Var.H0((MessageObject) ((org.telegram.ui.Cells.d2) view2).getParentObject(), view2, 0, true);
            }
            if ((i13 == 0 || (hu0.p0(i13) && hu0Var.C())) && (view2 instanceof org.telegram.ui.Cells.o7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.o7) view2).getMessageObject();
                if (messageObject != null) {
                    return hu0Var.H0(messageObject, view2, br0Var.B, true);
                }
                return false;
            }
            int i14 = br0Var.B;
            if (i14 != 10) {
                if (i14 != 11) {
                    return false;
                }
                hu0Var.N.E(view2);
                return true;
            }
            ps0 ps0Var = hu0Var.M;
            ArrayList arrayList = ps0Var.d;
            hu0 hu0Var2 = ps0Var.f;
            if (i10 >= 0 && i10 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i10);
                Bundle bundle = new Bundle();
                boolean z11 = tLObject instanceof TLRPC.Chat;
                if (z11) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundle);
                org.telegram.ui.ActionBar.n2 n2Var = hu0Var2.r1;
                if (n2Var instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) n2Var;
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
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, hu0Var2.getContext(), hu0Var2.B1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(hu0Var2.h0(org.telegram.ui.ActionBar.g6.G8));
                        if (z11) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z10;
                            }
                            n2Var.presentFragmentAsPreview(rnVar);
                            return z10;
                        }
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(hu0Var2.getContext(), false, false);
                        f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                        f1Var.setMinimumWidth(160);
                        f1Var.setOnClickListener(new l70(ps0Var, 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(hu0Var2.getContext(), false, false);
                        f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                        f1Var2.setMinimumWidth(160);
                        f1Var2.setOnClickListener(new gh.v2(ps0Var, (TLRPC.Chat) tLObject, i10, 12));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                        n2Var.presentFragmentAsPreviewWithMenu(rnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z10;
                    }
                }
                z10 = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, hu0Var2.getContext(), hu0Var2.B1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(hu0Var2.h0(org.telegram.ui.ActionBar.g6.G8));
                if (z11) {
                }
            }
        } else {
            er0 er0Var = br0Var.h;
            pk0 pk0Var = er0Var.R0;
            if (pk0Var != null) {
                pk0Var.a(i10, view2);
                return true;
            }
            qk0 qk0Var = er0Var.S0;
            if (qk0Var != null) {
                qk0Var.c(0.0f, 0.0f, i10, view2);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void i() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.r1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final void s(float f10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.r1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f10);
            }
        }
    }
}
