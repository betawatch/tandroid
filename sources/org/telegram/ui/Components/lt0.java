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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lt0 implements dm0 {
    public final /* synthetic */ bt0 a;
    public final /* synthetic */ bw0 b;

    public lt0(bw0 bw0Var, bt0 bt0Var) {
        this.b = bw0Var;
        this.a = bt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0224  */
    @Override // org.telegram.ui.Components.dm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        bw0 bw0Var = this.b;
        lu0 lu0Var = bw0Var.c0;
        int i12 = 0;
        if (!bw0Var.q1) {
            bt0 bt0Var = this.a;
            if (bt0Var.h.getAdapter() != bw0Var.U) {
                if (!bw0Var.E1 || bt0Var.E == 11) {
                    int i13 = bt0Var.E;
                    if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.ab)) {
                        if (lu0Var.e.isEmpty()) {
                            i11 = i10;
                        } else if (i10 < lu0Var.e.size()) {
                            i11 = ((Integer) lu0Var.e.get(i10)).intValue();
                        }
                        if (i11 >= 0 && i11 < lu0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = lu0Var.d.participants.participants.get(i11);
                            nm0 nm0Var = (nm0) view2.getParent();
                            while (true) {
                                if (i12 >= nm0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = nm0Var.getChildAt(i12);
                                if (RecyclerView.R(childAt) == i10) {
                                    view2 = childAt;
                                    break;
                                }
                                i12++;
                            }
                            return bw0Var.P0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.o7)) {
                            return bw0Var.O0(((org.telegram.ui.Cells.o7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.r7)) {
                            return bw0Var.O0(((org.telegram.ui.Cells.r7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.n7)) {
                            return bw0Var.O0(((org.telegram.ui.Cells.n7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.d2)) {
                            return bw0Var.O0((MessageObject) ((org.telegram.ui.Cells.d2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i13 == 0 || (bw0.w0(i13) && bw0Var.F())) && (view2 instanceof org.telegram.ui.Cells.w7)) {
                            MessageObject messageObject = ((org.telegram.ui.Cells.w7) view2).getMessageObject();
                            if (messageObject != null) {
                                return bw0Var.O0(messageObject, view2, bt0Var.E, true);
                            }
                        } else {
                            int i14 = bt0Var.E;
                            if (i14 != 10) {
                                if (i14 != 11) {
                                    return false;
                                }
                                bw0Var.T.E(view2);
                                return true;
                            }
                            ku0 ku0Var = bw0Var.S;
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
                                org.telegram.ui.wn wnVar = new org.telegram.ui.wn(bundle);
                                org.telegram.ui.ActionBar.r2 r2Var = bw0Var2.x1;
                                org.telegram.ui.ActionBar.u6 u6Var = bw0Var2.H1;
                                if (r2Var instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) r2Var;
                                    if (profileActivity.T != null) {
                                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                        z10 = true;
                                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.scale(0.16666667f, 0.16666667f);
                                        profileActivity.fragmentView.draw(canvas);
                                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
                                        profileActivity.T.setBackground(new BitmapDrawable(createBitmap));
                                        profileActivity.T.setAlpha(0.0f);
                                        profileActivity.T.setVisibility(0);
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, bw0Var2.getContext(), u6Var);
                                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, u6Var);
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            r2Var.presentFragmentAsPreview(wnVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(bw0Var2.getContext(), false, false);
                                        g1Var.j(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                                        g1Var.setMinimumWidth(160);
                                        g1Var.setOnClickListener(new x80(ku0Var, 14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(bw0Var2.getContext(), false, false);
                                        g1Var2.j(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                                        g1Var2.setMinimumWidth(160);
                                        g1Var2.setOnClickListener(new bi.pa(ku0Var, (TLRPC.Chat) tLObject, i10, 12));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                                        r2Var.presentFragmentAsPreviewWithMenu(wnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, bw0Var2.getContext(), u6Var);
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, u6Var);
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    et0 et0Var = bt0Var.h;
                    am0 am0Var = et0Var.T0;
                    if (am0Var != null) {
                        am0Var.c(i10, view2);
                        return true;
                    }
                    bm0 bm0Var = et0Var.U0;
                    if (bm0Var != null) {
                        bm0Var.e(0.0f, 0.0f, i10, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public final void g() {
        org.telegram.ui.ActionBar.r2 r2Var = this.b.x1;
        if (r2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                r2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public final void o(float f7) {
        org.telegram.ui.ActionBar.r2 r2Var = this.b.x1;
        if (r2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                r2Var.movePreviewFragment(f7);
            }
        }
    }
}
