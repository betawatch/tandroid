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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jq0 implements ij0 {
    public final /* synthetic */ zp0 a;
    public final /* synthetic */ ws0 b;

    public jq0(ws0 ws0Var, zp0 zp0Var) {
        this.b = ws0Var;
        this.a = zp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229  */
    @Override // org.telegram.ui.Components.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(float f10, float f11, int i3, View view) {
        boolean z10;
        int i10;
        View view2 = view;
        ws0 ws0Var = this.b;
        jr0 jr0Var = ws0Var.d0;
        int i11 = 0;
        if (!ws0Var.r1) {
            zp0 zp0Var = this.a;
            if (zp0Var.h.getAdapter() != ws0Var.V) {
                if (!ws0Var.F1 || zp0Var.F == 11) {
                    int i12 = zp0Var.F;
                    if (i12 == 7 && (view2 instanceof org.telegram.ui.Cells.pa)) {
                        if (jr0Var.e.isEmpty()) {
                            i10 = i3;
                        } else if (i3 < jr0Var.e.size()) {
                            i10 = ((Integer) jr0Var.e.get(i3)).intValue();
                        }
                        if (i10 >= 0 && i10 < jr0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = jr0Var.d.participants.participants.get(i10);
                            tj0 tj0Var = (tj0) view2.getParent();
                            while (true) {
                                if (i11 >= tj0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = tj0Var.getChildAt(i11);
                                if (RecyclerView.R(childAt) == i3) {
                                    view2 = childAt;
                                    break;
                                }
                                i11++;
                            }
                            return ws0Var.T0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i12 == 1 && (view2 instanceof org.telegram.ui.Cells.g7)) {
                            return ws0Var.S0(((org.telegram.ui.Cells.g7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 3 && (view2 instanceof org.telegram.ui.Cells.j7)) {
                            return ws0Var.S0(((org.telegram.ui.Cells.j7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i12 == 2 || i12 == 4) && (view2 instanceof org.telegram.ui.Cells.f7)) {
                            return ws0Var.S0(((org.telegram.ui.Cells.f7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 5 && (view2 instanceof org.telegram.ui.Cells.h2)) {
                            return ws0Var.S0((org.telegram.messenger.zi) ((org.telegram.ui.Cells.h2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i12 == 0 || (ws0.z0(i12) && ws0Var.H())) && (view2 instanceof org.telegram.ui.Cells.n7)) {
                            org.telegram.messenger.zi messageObject = ((org.telegram.ui.Cells.n7) view2).getMessageObject();
                            if (messageObject != null) {
                                return ws0Var.S0(messageObject, view2, zp0Var.F, true);
                            }
                        } else {
                            int i13 = zp0Var.F;
                            if (i13 != 10) {
                                if (i13 != 11) {
                                    return false;
                                }
                                ws0Var.U.E(view2);
                                return true;
                            }
                            ir0 ir0Var = ws0Var.T;
                            ArrayList arrayList = ir0Var.d;
                            ws0 ws0Var2 = ir0Var.f;
                            if (i3 >= 0 && i3 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i3);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.wm wmVar = new org.telegram.ui.wm(bundle);
                                org.telegram.ui.ActionBar.d2 d2Var = ws0Var2.y1;
                                org.telegram.ui.ActionBar.e6 e6Var = ws0Var2.I1;
                                if (d2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) d2Var;
                                    if (profileActivity.U != null) {
                                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                        z10 = true;
                                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.scale(0.16666667f, 0.16666667f);
                                        profileActivity.fragmentView.draw(canvas);
                                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.hs.K2));
                                        profileActivity.U.setBackground(new BitmapDrawable(createBitmap));
                                        profileActivity.U.setAlpha(0.0f);
                                        profileActivity.U.setVisibility(0);
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, ws0Var2.getContext(), e6Var);
                                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, e6Var);
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            d2Var.presentFragmentAsPreview(wmVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(ws0Var2.getContext(), false, false);
                                        y0Var.j(org.telegram.messenger.bd.M0(2131747819, null), R.drawable.msg_channel, null);
                                        y0Var.setMinimumWidth(org.telegram.messenger.hs.q2);
                                        y0Var.setOnClickListener(new ga0(ir0Var, 13));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(ws0Var2.getContext(), false, false);
                                        y0Var2.j(org.telegram.messenger.bd.M0(2131746670, null), R.drawable.msg_addbot, null);
                                        y0Var2.setMinimumWidth(org.telegram.messenger.hs.q2);
                                        y0Var2.setOnClickListener(new ai.h3(ir0Var, (TLRPC.Chat) tLObject, i3, 14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
                                        d2Var.presentFragmentAsPreviewWithMenu(wmVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, ws0Var2.getContext(), e6Var);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, e6Var);
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    cq0 cq0Var = zp0Var.h;
                    fj0 fj0Var = cq0Var.U0;
                    if (fj0Var != null) {
                        fj0Var.f(i3, view2);
                        return true;
                    }
                    gj0 gj0Var = cq0Var.V0;
                    if (gj0Var != null) {
                        gj0Var.b(0.0f, 0.0f, i3, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ij0
    public final void h() {
        org.telegram.ui.ActionBar.d2 d2Var = this.b.y1;
        if (d2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                d2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public final void r(float f10) {
        org.telegram.ui.ActionBar.d2 d2Var = this.b.y1;
        if (d2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                d2Var.movePreviewFragment(f10);
            }
        }
    }
}
