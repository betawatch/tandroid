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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vq0 implements tj0 {
    public final /* synthetic */ kq0 a;
    public final /* synthetic */ jt0 b;

    public vq0(jt0 jt0Var, kq0 kq0Var) {
        this.b = jt0Var;
        this.a = kq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @Override // org.telegram.ui.Components.tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(float f10, float f11, int i7, View view) {
        boolean z10;
        int i10;
        View view2 = view;
        jt0 jt0Var = this.b;
        vr0 vr0Var = jt0Var.d0;
        int i11 = 0;
        if (!jt0Var.r1) {
            kq0 kq0Var = this.a;
            if (kq0Var.h.getAdapter() != jt0Var.V) {
                if (!jt0Var.F1 || kq0Var.F == 11) {
                    int i12 = kq0Var.F;
                    if (i12 == 7 && (view2 instanceof org.telegram.ui.Cells.ra)) {
                        if (vr0Var.e.isEmpty()) {
                            i10 = i7;
                        } else if (i7 < vr0Var.e.size()) {
                            i10 = ((Integer) vr0Var.e.get(i7)).intValue();
                        }
                        if (i10 >= 0 && i10 < vr0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = vr0Var.d.participants.participants.get(i10);
                            ek0 ek0Var = (ek0) view2.getParent();
                            while (true) {
                                if (i11 >= ek0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = ek0Var.getChildAt(i11);
                                if (RecyclerView.R(childAt) == i7) {
                                    view2 = childAt;
                                    break;
                                }
                                i11++;
                            }
                            return jt0Var.U0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i12 == 1 && (view2 instanceof org.telegram.ui.Cells.i7)) {
                            return jt0Var.T0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 3 && (view2 instanceof org.telegram.ui.Cells.l7)) {
                            return jt0Var.T0(((org.telegram.ui.Cells.l7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i12 == 2 || i12 == 4) && (view2 instanceof org.telegram.ui.Cells.h7)) {
                            return jt0Var.T0(((org.telegram.ui.Cells.h7) view2).getMessage(), view2, 0, true);
                        }
                        if (i12 == 5 && (view2 instanceof org.telegram.ui.Cells.i2)) {
                            return jt0Var.T0((org.telegram.messenger.gj) ((org.telegram.ui.Cells.i2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i12 == 0 || (jt0.z0(i12) && jt0Var.H())) && (view2 instanceof org.telegram.ui.Cells.p7)) {
                            org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.p7) view2).getMessageObject();
                            if (messageObject != null) {
                                return jt0Var.T0(messageObject, view2, kq0Var.F, true);
                            }
                        } else {
                            int i13 = kq0Var.F;
                            if (i13 != 10) {
                                if (i13 != 11) {
                                    return false;
                                }
                                jt0Var.U.E(view2);
                                return true;
                            }
                            ur0 ur0Var = jt0Var.T;
                            ArrayList arrayList = ur0Var.d;
                            jt0 jt0Var2 = ur0Var.f;
                            if (i7 >= 0 && i7 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i7);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.bn bnVar = new org.telegram.ui.bn(bundle);
                                org.telegram.ui.ActionBar.g2 g2Var = jt0Var2.y1;
                                org.telegram.ui.ActionBar.h6 h6Var = jt0Var2.I1;
                                if (g2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) g2Var;
                                    if (profileActivity.U != null) {
                                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                        z10 = true;
                                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.scale(0.16666667f, 0.16666667f);
                                        profileActivity.fragmentView.draw(canvas);
                                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ls.K2));
                                        profileActivity.U.setBackground(new BitmapDrawable(createBitmap));
                                        profileActivity.U.setAlpha(0.0f);
                                        profileActivity.U.setVisibility(0);
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, jt0Var2.getContext(), h6Var);
                                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, h6Var);
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            g2Var.presentFragmentAsPreview(bnVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(jt0Var2.getContext(), false, false);
                                        y0Var.j(org.telegram.messenger.hd.N0(2131747617, null), R.drawable.msg_channel, null);
                                        y0Var.setMinimumWidth(org.telegram.messenger.ls.q2);
                                        int i14 = 15;
                                        y0Var.setOnClickListener(new j70(ur0Var, i14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(jt0Var2.getContext(), false, false);
                                        y0Var2.j(org.telegram.messenger.hd.N0(2131746466, null), R.drawable.msg_addbot, null);
                                        y0Var2.setMinimumWidth(org.telegram.messenger.ls.q2);
                                        y0Var2.setOnClickListener(new bi.h5(ur0Var, (TLRPC.Chat) tLObject, i7, i14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
                                        g2Var.presentFragmentAsPreviewWithMenu(bnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, jt0Var2.getContext(), h6Var);
                                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, h6Var);
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    nq0 nq0Var = kq0Var.h;
                    qj0 qj0Var = nq0Var.U0;
                    if (qj0Var != null) {
                        qj0Var.c(i7, view2);
                        return true;
                    }
                    rj0 rj0Var = nq0Var.V0;
                    if (rj0Var != null) {
                        rj0Var.f(0.0f, 0.0f, i7, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final void j() {
        org.telegram.ui.ActionBar.g2 g2Var = this.b.y1;
        if (g2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                g2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final void r(float f10) {
        org.telegram.ui.ActionBar.g2 g2Var = this.b.y1;
        if (g2Var != null) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                g2Var.movePreviewFragment(f10);
            }
        }
    }
}
