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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ht0 implements hm0 {
    public final /* synthetic */ xs0 a;
    public final /* synthetic */ bw0 b;

    public ht0(bw0 bw0Var, xs0 xs0Var) {
        this.b = bw0Var;
        this.a = xs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    @Override // org.telegram.ui.Components.hm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        bw0 bw0Var = this.b;
        lu0 lu0Var = bw0Var.a0;
        int i12 = 0;
        if (!bw0Var.o1) {
            xs0 xs0Var = this.a;
            if (xs0Var.h.getAdapter() != bw0Var.S) {
                if (!bw0Var.C1 || xs0Var.F == 11) {
                    int i13 = xs0Var.F;
                    if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.xa)) {
                        if (lu0Var.e.isEmpty()) {
                            i11 = i10;
                        } else if (i10 < lu0Var.e.size()) {
                            i11 = ((Integer) lu0Var.e.get(i10)).intValue();
                        }
                        if (i11 >= 0 && i11 < lu0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = lu0Var.d.participants.participants.get(i11);
                            qm0 qm0Var = (qm0) view2.getParent();
                            while (true) {
                                if (i12 >= qm0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = qm0Var.getChildAt(i12);
                                if (RecyclerView.R(childAt) == i10) {
                                    view2 = childAt;
                                    break;
                                }
                                i12++;
                            }
                            return bw0Var.I0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.k7)) {
                            return bw0Var.H0(((org.telegram.ui.Cells.k7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.n7)) {
                            return bw0Var.H0(((org.telegram.ui.Cells.n7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.j7)) {
                            return bw0Var.H0(((org.telegram.ui.Cells.j7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.f2)) {
                            return bw0Var.H0((MessageObject) ((org.telegram.ui.Cells.f2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i13 == 0 || (bw0.p0(i13) && bw0Var.C())) && (view2 instanceof org.telegram.ui.Cells.t7)) {
                            MessageObject messageObject = ((org.telegram.ui.Cells.t7) view2).getMessageObject();
                            if (messageObject != null) {
                                return bw0Var.H0(messageObject, view2, xs0Var.F, true);
                            }
                        } else {
                            int i14 = xs0Var.F;
                            if (i14 != 10) {
                                if (i14 != 11) {
                                    return false;
                                }
                                bw0Var.R.E(view2);
                                return true;
                            }
                            ku0 ku0Var = bw0Var.Q;
                            ArrayList arrayList = ku0Var.d;
                            bw0 bw0Var2 = ku0Var.f;
                            if (i10 >= 0 && i10 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i10);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.zn znVar = new org.telegram.ui.zn(bundle);
                                org.telegram.ui.ActionBar.n2 n2Var = bw0Var2.v1;
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
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, bw0Var2.getContext(), bw0Var2.F1);
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(bw0Var2.h0(org.telegram.ui.ActionBar.i6.G8));
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            n2Var.presentFragmentAsPreview(znVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(bw0Var2.getContext(), false, false);
                                        f1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                                        f1Var.setMinimumWidth(160);
                                        f1Var.setOnClickListener(new b90(ku0Var, 15));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(bw0Var2.getContext(), false, false);
                                        f1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                                        f1Var2.setMinimumWidth(160);
                                        f1Var2.setOnClickListener(new org.telegram.ui.Cells.sa(ku0Var, (TLRPC.Chat) tLObject, i10, 10));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                                        n2Var.presentFragmentAsPreviewWithMenu(znVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, bw0Var2.getContext(), bw0Var2.F1);
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(bw0Var2.h0(org.telegram.ui.ActionBar.i6.G8));
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    at0 at0Var = xs0Var.h;
                    em0 em0Var = at0Var.T0;
                    if (em0Var != null) {
                        em0Var.d(i10, view2);
                        return true;
                    }
                    fm0 fm0Var = at0Var.U0;
                    if (fm0Var != null) {
                        fm0Var.c(0.0f, 0.0f, i10, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.hm0
    public final void h() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.hm0
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
