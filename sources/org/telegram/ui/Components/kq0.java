package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kq0 implements ej0 {
    public final /* synthetic */ zp0 a;
    public final /* synthetic */ ys0 b;

    public kq0(ys0 ys0Var, zp0 zp0Var) {
        this.b = ys0Var;
        this.a = zp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @Override // org.telegram.ui.Components.ej0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(float f10, float f11, int i7, View view) {
        boolean z9;
        int i10;
        View view2 = view;
        ys0 ys0Var = this.b;
        lr0 lr0Var = ys0Var.c0;
        int i11 = 0;
        if (!ys0Var.q1) {
            zp0 zp0Var = this.a;
            if (zp0Var.h.getAdapter() != ys0Var.U) {
                if (!ys0Var.E1 || zp0Var.E == 11) {
                    int i12 = zp0Var.E;
                    if (i12 == 7 && (view2 instanceof org.telegram.ui.Cells.pa)) {
                        if (lr0Var.e.isEmpty()) {
                            i10 = i7;
                        } else if (i7 < lr0Var.e.size()) {
                            i10 = ((Integer) lr0Var.e.get(i7)).intValue();
                        }
                        if (i10 >= 0 && i10 < lr0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = lr0Var.d.participants.participants.get(i10);
                            pj0 pj0Var = (pj0) view2.getParent();
                            while (true) {
                                if (i11 >= pj0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = pj0Var.getChildAt(i11);
                                if (RecyclerView.R(childAt) == i7) {
                                    view2 = childAt;
                                    break;
                                }
                                i11++;
                            }
                            return ys0Var.U0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i12 == 1 && (view2 instanceof org.telegram.ui.Cells.h7)) {
                            return ys0Var.T0(((org.telegram.ui.Cells.h7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 3 && (view2 instanceof org.telegram.ui.Cells.k7)) {
                            return ys0Var.T0(((org.telegram.ui.Cells.k7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i12 == 2 || i12 == 4) && (view2 instanceof org.telegram.ui.Cells.g7)) {
                            return ys0Var.T0(((org.telegram.ui.Cells.g7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 5 && (view2 instanceof org.telegram.ui.Cells.h2)) {
                            return ys0Var.T0((org.telegram.messenger.ij) ((org.telegram.ui.Cells.h2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i12 == 0 || (ys0.z0(i12) && ys0Var.H())) && (view2 instanceof org.telegram.ui.Cells.o7)) {
                            org.telegram.messenger.ij messageObject = ((org.telegram.ui.Cells.o7) view2).getMessageObject();
                            if (messageObject != null) {
                                return ys0Var.T0(messageObject, view2, zp0Var.E, true);
                            }
                        } else {
                            int i13 = zp0Var.E;
                            if (i13 != 10) {
                                if (i13 != 11) {
                                    return false;
                                }
                                ys0Var.T.E(view2);
                                return true;
                            }
                            kr0 kr0Var = ys0Var.S;
                            ArrayList arrayList = kr0Var.d;
                            ys0 ys0Var2 = kr0Var.f;
                            if (i7 >= 0 && i7 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i7);
                                Bundle bundle = new Bundle();
                                boolean z10 = tLObject instanceof TLRPC.Chat;
                                if (z10) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.cn cnVar = new org.telegram.ui.cn(bundle);
                                org.telegram.ui.ActionBar.f2 f2Var = ys0Var2.x1;
                                org.telegram.ui.ActionBar.h6 h6Var = ys0Var2.H1;
                                if (f2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) f2Var;
                                    if (profileActivity.T != null) {
                                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                        z9 = true;
                                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.scale(0.16666667f, 0.16666667f);
                                        profileActivity.fragmentView.draw(canvas);
                                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.qs.K2));
                                        profileActivity.T.setBackground(new BitmapDrawable(createBitmap));
                                        profileActivity.T.setAlpha(0.0f);
                                        profileActivity.T.setVisibility(0);
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, ys0Var2.getContext(), h6Var);
                                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, h6Var);
                                        if (z10) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z9;
                                            }
                                            f2Var.presentFragmentAsPreview(cnVar);
                                            return z9;
                                        }
                                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(ys0Var2.getContext(), false, false);
                                        z0Var.j(org.telegram.messenger.id.M0(2131747811, null), R.drawable.msg_channel, null);
                                        z0Var.setMinimumWidth(org.telegram.messenger.qs.q2);
                                        int i14 = 12;
                                        z0Var.setOnClickListener(new la0(kr0Var, i14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(ys0Var2.getContext(), false, false);
                                        z0Var2.j(org.telegram.messenger.id.M0(2131746662, null), R.drawable.msg_addbot, null);
                                        z0Var2.setMinimumWidth(org.telegram.messenger.qs.q2);
                                        z0Var2.setOnClickListener(new bi.la(kr0Var, (TLRPC.Chat) tLObject, i7, i14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                                        f2Var.presentFragmentAsPreviewWithMenu(cnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z9;
                                    }
                                }
                                z9 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, ys0Var2.getContext(), h6Var);
                                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, h6Var);
                                if (z10) {
                                }
                            }
                        }
                    }
                } else {
                    cq0 cq0Var = zp0Var.h;
                    bj0 bj0Var = cq0Var.T0;
                    if (bj0Var != null) {
                        bj0Var.c(i7, view2);
                        return true;
                    }
                    cj0 cj0Var = cq0Var.U0;
                    if (cj0Var != null) {
                        cj0Var.f(0.0f, 0.0f, i7, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ej0
    public final void i() {
        org.telegram.ui.ActionBar.f2 f2Var = this.b.x1;
        if (f2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                f2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.ej0
    public final void q(float f10) {
        org.telegram.ui.ActionBar.f2 f2Var = this.b.x1;
        if (f2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                f2Var.movePreviewFragment(f10);
            }
        }
    }
}
