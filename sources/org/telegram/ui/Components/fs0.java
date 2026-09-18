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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fs0 implements dl0 {
    public final /* synthetic */ vr0 a;
    public final /* synthetic */ zu0 b;

    public fs0(zu0 zu0Var, vr0 vr0Var) {
        this.b = zu0Var;
        this.a = vr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    @Override // org.telegram.ui.Components.dl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        zu0 zu0Var = this.b;
        jt0 jt0Var = zu0Var.a0;
        int i12 = 0;
        if (zu0Var.o1) {
            return false;
        }
        vr0 vr0Var = this.a;
        if (vr0Var.h.getAdapter() == zu0Var.S) {
            return false;
        }
        if (!zu0Var.C1 || vr0Var.F == 11) {
            int i13 = vr0Var.F;
            if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.ab)) {
                if (jt0Var.e.isEmpty()) {
                    i11 = i10;
                } else {
                    if (i10 >= jt0Var.e.size()) {
                        return false;
                    }
                    i11 = ((Integer) jt0Var.e.get(i10)).intValue();
                }
                if (i11 < 0 || i11 >= jt0Var.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = jt0Var.d.participants.participants.get(i11);
                ml0 ml0Var = (ml0) view2.getParent();
                while (true) {
                    if (i12 >= ml0Var.getChildCount()) {
                        break;
                    }
                    View childAt = ml0Var.getChildAt(i12);
                    if (RecyclerView.S(childAt) == i10) {
                        view2 = childAt;
                        break;
                    }
                    i12++;
                }
                return zu0Var.I0(chatParticipant, true, view2);
            }
            if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.j7)) {
                return zu0Var.H0(((org.telegram.ui.Cells.j7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.n7)) {
                return zu0Var.H0(((org.telegram.ui.Cells.n7) view2).getMessage(), view2, 0, true);
            }
            if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.i7)) {
                return zu0Var.H0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
            }
            if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.e2)) {
                return zu0Var.H0((MessageObject) ((org.telegram.ui.Cells.e2) view2).getParentObject(), view2, 0, true);
            }
            if ((i13 == 0 || (zu0.p0(i13) && zu0Var.C())) && (view2 instanceof org.telegram.ui.Cells.t7)) {
                MessageObject messageObject = ((org.telegram.ui.Cells.t7) view2).getMessageObject();
                if (messageObject != null) {
                    return zu0Var.H0(messageObject, view2, vr0Var.F, true);
                }
                return false;
            }
            int i14 = vr0Var.F;
            if (i14 != 10) {
                if (i14 != 11) {
                    return false;
                }
                zu0Var.R.E(view2);
                return true;
            }
            it0 it0Var = zu0Var.Q;
            ArrayList arrayList = it0Var.d;
            zu0 zu0Var2 = it0Var.f;
            if (i10 >= 0 && i10 < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i10);
                Bundle bundle = new Bundle();
                boolean z11 = tLObject instanceof TLRPC.Chat;
                if (z11) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                org.telegram.ui.bo boVar = new org.telegram.ui.bo(bundle);
                org.telegram.ui.ActionBar.o2 o2Var = zu0Var2.v1;
                if (o2Var instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) o2Var;
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
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, zu0Var2.getContext(), zu0Var2.F1);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(zu0Var2.h0(org.telegram.ui.ActionBar.j6.G8));
                        if (z11) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z10;
                            }
                            o2Var.presentFragmentAsPreview(boVar);
                            return z10;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(zu0Var2.getContext(), false, false);
                        g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                        g1Var.setMinimumWidth(160);
                        g1Var.setOnClickListener(new x70(it0Var, 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(zu0Var2.getContext(), false, false);
                        g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                        g1Var2.setMinimumWidth(160);
                        g1Var2.setOnClickListener(new org.telegram.ui.Cells.va(it0Var, (TLRPC.Chat) tLObject, i10, 9));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                        o2Var.presentFragmentAsPreviewWithMenu(boVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z10;
                    }
                }
                z10 = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, zu0Var2.getContext(), zu0Var2.F1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(zu0Var2.h0(org.telegram.ui.ActionBar.j6.G8));
                if (z11) {
                }
            }
        } else {
            yr0 yr0Var = vr0Var.h;
            al0 al0Var = yr0Var.V0;
            if (al0Var != null) {
                al0Var.d(i10, view2);
                return true;
            }
            bl0 bl0Var = yr0Var.W0;
            if (bl0Var != null) {
                bl0Var.c(0.0f, 0.0f, i10, view2);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void g() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.v1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final void q(float f7) {
        org.telegram.ui.ActionBar.o2 o2Var = this.b.v1;
        if (o2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                o2Var.movePreviewFragment(f7);
            }
        }
    }
}
