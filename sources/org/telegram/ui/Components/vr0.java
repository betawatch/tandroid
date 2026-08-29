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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vr0 implements cl0 {
    public final /* synthetic */ lr0 a;
    public final /* synthetic */ qu0 b;

    public vr0(qu0 qu0Var, lr0 lr0Var) {
        this.b = qu0Var;
        this.a = lr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    @Override // org.telegram.ui.Components.cl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(float f9, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        qu0 qu0Var = this.b;
        zs0 zs0Var = qu0Var.T;
        int i12 = 0;
        if (qu0Var.k1) {
            return false;
        }
        lr0 lr0Var = this.a;
        if (lr0Var.h.getAdapter() == qu0Var.O) {
            return false;
        }
        if (!qu0Var.y1 || lr0Var.B == 11) {
            int i13 = lr0Var.B;
            if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.sa)) {
                if (zs0Var.e.isEmpty()) {
                    i11 = i10;
                } else {
                    if (i10 >= zs0Var.e.size()) {
                        return false;
                    }
                    i11 = ((Integer) zs0Var.e.get(i10)).intValue();
                }
                if (i11 < 0 || i11 >= zs0Var.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = zs0Var.d.participants.participants.get(i11);
                jl0 jl0Var = (jl0) view2.getParent();
                while (true) {
                    if (i12 >= jl0Var.getChildCount()) {
                        break;
                    }
                    View childAt = jl0Var.getChildAt(i12);
                    if (RecyclerView.R(childAt) == i10) {
                        view2 = childAt;
                        break;
                    }
                    i12++;
                }
                return qu0Var.I0(chatParticipant, true, view2);
            }
            if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.g7)) {
                return qu0Var.H0(((org.telegram.ui.Cells.g7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.j7)) {
                return qu0Var.H0(((org.telegram.ui.Cells.j7) view2).getMessage(), view2, 0, true);
            }
            if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.f7)) {
                return qu0Var.H0(((org.telegram.ui.Cells.f7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.d2)) {
                return qu0Var.H0((MessageObject) ((org.telegram.ui.Cells.d2) view2).getParentObject(), view2, 0, true);
            }
            if ((i13 == 0 || (qu0.p0(i13) && qu0Var.C())) && (view2 instanceof org.telegram.ui.Cells.p7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.p7) view2).getMessageObject();
                if (messageObject != null) {
                    return qu0Var.H0(messageObject, view2, lr0Var.B, true);
                }
                return false;
            }
            int i14 = lr0Var.B;
            if (i14 != 10) {
                if (i14 != 11) {
                    return false;
                }
                qu0Var.N.E(view2);
                return true;
            }
            ys0 ys0Var = qu0Var.M;
            ArrayList arrayList = ys0Var.d;
            qu0 qu0Var2 = ys0Var.f;
            if (i10 >= 0 && i10 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i10);
                Bundle bundle = new Bundle();
                boolean z11 = tLObject instanceof TLRPC.Chat;
                if (z11) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                org.telegram.ui.tn tnVar = new org.telegram.ui.tn(bundle);
                org.telegram.ui.ActionBar.o2 o2Var = qu0Var2.r1;
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
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, qu0Var2.getContext(), qu0Var2.B1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(qu0Var2.h0(org.telegram.ui.ActionBar.g6.G8));
                        if (z11) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z10;
                            }
                            o2Var.presentFragmentAsPreview(tnVar);
                            return z10;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(qu0Var2.getContext(), false, false);
                        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                        g1Var.setMinimumWidth(160);
                        g1Var.setOnClickListener(new u70(ys0Var, 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(qu0Var2.getContext(), false, false);
                        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                        g1Var2.setMinimumWidth(160);
                        g1Var2.setOnClickListener(new bg.p2(ys0Var, (TLRPC.Chat) tLObject, i10, 13));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                        o2Var.presentFragmentAsPreviewWithMenu(tnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z10;
                    }
                }
                z10 = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, qu0Var2.getContext(), qu0Var2.B1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(qu0Var2.h0(org.telegram.ui.ActionBar.g6.G8));
                if (z11) {
                }
            }
        } else {
            or0 or0Var = lr0Var.h;
            zk0 zk0Var = or0Var.R0;
            if (zk0Var != null) {
                zk0Var.c(i10, view2);
                return true;
            }
            al0 al0Var = or0Var.S0;
            if (al0Var != null) {
                al0Var.b(0.0f, 0.0f, i10, view2);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void h() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.r1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final void r(float f9) {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.r1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.movePreviewFragment(f9);
            }
        }
    }
}
