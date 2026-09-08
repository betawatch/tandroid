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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ds0 implements cl0 {
    public final /* synthetic */ tr0 a;
    public final /* synthetic */ xu0 b;

    public ds0(xu0 xu0Var, tr0 tr0Var) {
        this.b = xu0Var;
        this.a = tr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    @Override // org.telegram.ui.Components.cl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        xu0 xu0Var = this.b;
        ht0 ht0Var = xu0Var.a0;
        int i12 = 0;
        if (xu0Var.o1) {
            return false;
        }
        tr0 tr0Var = this.a;
        if (tr0Var.h.getAdapter() == xu0Var.S) {
            return false;
        }
        if (!xu0Var.C1 || tr0Var.F == 11) {
            int i13 = tr0Var.F;
            if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.za)) {
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
                ll0 ll0Var = (ll0) view2.getParent();
                while (true) {
                    if (i12 >= ll0Var.getChildCount()) {
                        break;
                    }
                    View childAt = ll0Var.getChildAt(i12);
                    if (RecyclerView.R(childAt) == i10) {
                        view2 = childAt;
                        break;
                    }
                    i12++;
                }
                return xu0Var.I0(chatParticipant, true, view2);
            }
            if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.j7)) {
                return xu0Var.H0(((org.telegram.ui.Cells.j7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.n7)) {
                return xu0Var.H0(((org.telegram.ui.Cells.n7) view2).getMessage(), view2, 0, true);
            }
            if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.i7)) {
                return xu0Var.H0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.e2)) {
                return xu0Var.H0((MessageObject) ((org.telegram.ui.Cells.e2) view2).getParentObject(), view2, 0, true);
            }
            if ((i13 == 0 || (xu0.p0(i13) && xu0Var.C())) && (view2 instanceof org.telegram.ui.Cells.t7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.t7) view2).getMessageObject();
                if (messageObject != null) {
                    return xu0Var.H0(messageObject, view2, tr0Var.F, true);
                }
                return false;
            }
            int i14 = tr0Var.F;
            if (i14 != 10) {
                if (i14 != 11) {
                    return false;
                }
                xu0Var.R.E(view2);
                return true;
            }
            gt0 gt0Var = xu0Var.Q;
            ArrayList arrayList = gt0Var.d;
            xu0 xu0Var2 = gt0Var.f;
            if (i10 >= 0 && i10 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i10);
                Bundle bundle = new Bundle();
                boolean z11 = tLObject instanceof TLRPC.Chat;
                if (z11) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                org.telegram.ui.co coVar = new org.telegram.ui.co(bundle);
                org.telegram.ui.ActionBar.n2 n2Var = xu0Var2.v1;
                if (n2Var instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) n2Var;
                    if (profileActivity.U != null) {
                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                        z10 = true;
                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.scale(0.16666667f, 0.16666667f);
                        profileActivity.fragmentView.draw(canvas);
                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
                        profileActivity.U.setBackground(new BitmapDrawable(createBitmap));
                        profileActivity.U.setAlpha(0.0f);
                        profileActivity.U.setVisibility(0);
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, xu0Var2.getContext(), xu0Var2.F1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(xu0Var2.h0(org.telegram.ui.ActionBar.j6.G8));
                        if (z11) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z10;
                            }
                            n2Var.presentFragmentAsPreview(coVar);
                            return z10;
                        }
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(xu0Var2.getContext(), false, false);
                        f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                        f1Var.setMinimumWidth(160);
                        f1Var.setOnClickListener(new x70(gt0Var, 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(xu0Var2.getContext(), false, false);
                        f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                        f1Var2.setMinimumWidth(160);
                        f1Var2.setOnClickListener(new org.telegram.ui.Cells.ua(gt0Var, (TLRPC.Chat) tLObject, i10, 9));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                        n2Var.presentFragmentAsPreviewWithMenu(coVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z10;
                    }
                }
                z10 = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, xu0Var2.getContext(), xu0Var2.F1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(xu0Var2.h0(org.telegram.ui.ActionBar.j6.G8));
                if (z11) {
                }
            }
        } else {
            wr0 wr0Var = tr0Var.h;
            zk0 zk0Var = wr0Var.V0;
            if (zk0Var != null) {
                zk0Var.a(i10, view2);
                return true;
            }
            al0 al0Var = wr0Var.W0;
            if (al0Var != null) {
                al0Var.d(0.0f, 0.0f, i10, view2);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void h() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final void q(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
