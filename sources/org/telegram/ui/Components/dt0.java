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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dt0 implements dm0 {
    public final /* synthetic */ ts0 a;
    public final /* synthetic */ xv0 b;

    public dt0(xv0 xv0Var, ts0 ts0Var) {
        this.b = xv0Var;
        this.a = ts0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    @Override // org.telegram.ui.Components.dm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        xv0 xv0Var = this.b;
        hu0 hu0Var = xv0Var.a0;
        int i12 = 0;
        if (!xv0Var.o1) {
            ts0 ts0Var = this.a;
            if (ts0Var.h.getAdapter() != xv0Var.S) {
                if (!xv0Var.C1 || ts0Var.F == 11) {
                    int i13 = ts0Var.F;
                    if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.xa)) {
                        if (hu0Var.e.isEmpty()) {
                            i11 = i10;
                        } else if (i10 < hu0Var.e.size()) {
                            i11 = ((Integer) hu0Var.e.get(i10)).intValue();
                        }
                        if (i11 >= 0 && i11 < hu0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = hu0Var.d.participants.participants.get(i11);
                            mm0 mm0Var = (mm0) view2.getParent();
                            while (true) {
                                if (i12 >= mm0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = mm0Var.getChildAt(i12);
                                if (RecyclerView.R(childAt) == i10) {
                                    view2 = childAt;
                                    break;
                                }
                                i12++;
                            }
                            return xv0Var.I0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.k7)) {
                            return xv0Var.H0(((org.telegram.ui.Cells.k7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.n7)) {
                            return xv0Var.H0(((org.telegram.ui.Cells.n7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.j7)) {
                            return xv0Var.H0(((org.telegram.ui.Cells.j7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.f2)) {
                            return xv0Var.H0((MessageObject) ((org.telegram.ui.Cells.f2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i13 == 0 || (xv0.p0(i13) && xv0Var.C())) && (view2 instanceof org.telegram.ui.Cells.t7)) {
                            MessageObject messageObject = ((org.telegram.ui.Cells.t7) view2).getMessageObject();
                            if (messageObject != null) {
                                return xv0Var.H0(messageObject, view2, ts0Var.F, true);
                            }
                        } else {
                            int i14 = ts0Var.F;
                            if (i14 != 10) {
                                if (i14 != 11) {
                                    return false;
                                }
                                xv0Var.R.E(view2);
                                return true;
                            }
                            gu0 gu0Var = xv0Var.Q;
                            ArrayList arrayList = gu0Var.d;
                            xv0 xv0Var2 = gu0Var.f;
                            if (i10 >= 0 && i10 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i10);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.fo foVar = new org.telegram.ui.fo(bundle);
                                org.telegram.ui.ActionBar.m2 m2Var = xv0Var2.v1;
                                if (m2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) m2Var;
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
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, xv0Var2.getContext(), xv0Var2.F1);
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(xv0Var2.h0(org.telegram.ui.ActionBar.g6.G8));
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            m2Var.presentFragmentAsPreview(foVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(xv0Var2.getContext(), false, false);
                                        e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                                        e1Var.setMinimumWidth(160);
                                        e1Var.setOnClickListener(new z80(gu0Var, 15));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(xv0Var2.getContext(), false, false);
                                        e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                                        e1Var2.setMinimumWidth(160);
                                        e1Var2.setOnClickListener(new org.telegram.ui.Cells.sa(gu0Var, (TLRPC.Chat) tLObject, i10, 10));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                                        m2Var.presentFragmentAsPreviewWithMenu(foVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, xv0Var2.getContext(), xv0Var2.F1);
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(xv0Var2.h0(org.telegram.ui.ActionBar.g6.G8));
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    ws0 ws0Var = ts0Var.h;
                    am0 am0Var = ws0Var.T0;
                    if (am0Var != null) {
                        am0Var.a(i10, view2);
                        return true;
                    }
                    bm0 bm0Var = ws0Var.U0;
                    if (bm0Var != null) {
                        bm0Var.d(0.0f, 0.0f, i10, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public final void h() {
        org.telegram.ui.ActionBar.m2 m2Var = this.b.v1;
        if (m2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                m2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public final void q(float f7) {
        org.telegram.ui.ActionBar.m2 m2Var = this.b.v1;
        if (m2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                m2Var.movePreviewFragment(f7);
            }
        }
    }
}
