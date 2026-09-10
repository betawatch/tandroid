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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ns0 implements ml0 {
    public final /* synthetic */ ds0 a;
    public final /* synthetic */ iv0 b;

    public ns0(iv0 iv0Var, ds0 ds0Var) {
        this.b = iv0Var;
        this.a = ds0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    @Override // org.telegram.ui.Components.ml0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        iv0 iv0Var = this.b;
        rt0 rt0Var = iv0Var.a0;
        int i12 = 0;
        if (iv0Var.o1) {
            return false;
        }
        ds0 ds0Var = this.a;
        if (ds0Var.h.getAdapter() == iv0Var.S) {
            return false;
        }
        if (!iv0Var.C1 || ds0Var.F == 11) {
            int i13 = ds0Var.F;
            if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.bb)) {
                if (rt0Var.e.isEmpty()) {
                    i11 = i10;
                } else {
                    if (i10 >= rt0Var.e.size()) {
                        return false;
                    }
                    i11 = ((Integer) rt0Var.e.get(i10)).intValue();
                }
                if (i11 < 0 || i11 >= rt0Var.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = rt0Var.d.participants.participants.get(i11);
                vl0 vl0Var = (vl0) view2.getParent();
                while (true) {
                    if (i12 >= vl0Var.getChildCount()) {
                        break;
                    }
                    View childAt = vl0Var.getChildAt(i12);
                    if (RecyclerView.R(childAt) == i10) {
                        view2 = childAt;
                        break;
                    }
                    i12++;
                }
                return iv0Var.I0(chatParticipant, true, view2);
            }
            if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.l7)) {
                return iv0Var.H0(((org.telegram.ui.Cells.l7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.o7)) {
                return iv0Var.H0(((org.telegram.ui.Cells.o7) view2).getMessage(), view2, 0, true);
            }
            if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.k7)) {
                return iv0Var.H0(((org.telegram.ui.Cells.k7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.e2)) {
                return iv0Var.H0((MessageObject) ((org.telegram.ui.Cells.e2) view2).getParentObject(), view2, 0, true);
            }
            if ((i13 == 0 || (iv0.p0(i13) && iv0Var.C())) && (view2 instanceof org.telegram.ui.Cells.u7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.u7) view2).getMessageObject();
                if (messageObject != null) {
                    return iv0Var.H0(messageObject, view2, ds0Var.F, true);
                }
                return false;
            }
            int i14 = ds0Var.F;
            if (i14 != 10) {
                if (i14 != 11) {
                    return false;
                }
                iv0Var.R.E(view2);
                return true;
            }
            qt0 qt0Var = iv0Var.Q;
            ArrayList arrayList = qt0Var.d;
            iv0 iv0Var2 = qt0Var.f;
            if (i10 >= 0 && i10 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i10);
                Bundle bundle = new Bundle();
                boolean z11 = tLObject instanceof TLRPC.Chat;
                if (z11) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                org.telegram.ui.eo eoVar = new org.telegram.ui.eo(bundle);
                org.telegram.ui.ActionBar.p2 p2Var = iv0Var2.v1;
                if (p2Var instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) p2Var;
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
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, iv0Var2.getContext(), iv0Var2.F1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(iv0Var2.h0(org.telegram.ui.ActionBar.j6.G8));
                        if (z11) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z10;
                            }
                            p2Var.presentFragmentAsPreview(eoVar);
                            return z10;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(iv0Var2.getContext(), false, false);
                        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                        g1Var.setMinimumWidth(160);
                        g1Var.setOnClickListener(new g80(qt0Var, 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(iv0Var2.getContext(), false, false);
                        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                        g1Var2.setMinimumWidth(160);
                        g1Var2.setOnClickListener(new org.telegram.ui.Cells.wa(qt0Var, (TLRPC.Chat) tLObject, i10, 9));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                        p2Var.presentFragmentAsPreviewWithMenu(eoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z10;
                    }
                }
                z10 = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, iv0Var2.getContext(), iv0Var2.F1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(iv0Var2.h0(org.telegram.ui.ActionBar.j6.G8));
                if (z11) {
                }
            }
        } else {
            gs0 gs0Var = ds0Var.h;
            jl0 jl0Var = gs0Var.V0;
            if (jl0Var != null) {
                jl0Var.d(i10, view2);
                return true;
            }
            kl0 kl0Var = gs0Var.W0;
            if (kl0Var != null) {
                kl0Var.c(0.0f, 0.0f, i10, view2);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void h() {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.v1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public final void p(float f7) {
        org.telegram.ui.ActionBar.p2 p2Var = this.b.v1;
        if (p2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                p2Var.movePreviewFragment(f7);
            }
        }
    }
}
