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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kt0 implements cm0 {
    public final /* synthetic */ at0 a;
    public final /* synthetic */ aw0 b;

    public kt0(aw0 aw0Var, at0 at0Var) {
        this.b = aw0Var;
        this.a = at0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0224  */
    @Override // org.telegram.ui.Components.cm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        aw0 aw0Var = this.b;
        ku0 ku0Var = aw0Var.c0;
        int i12 = 0;
        if (!aw0Var.q1) {
            at0 at0Var = this.a;
            if (at0Var.h.getAdapter() != aw0Var.U) {
                if (!aw0Var.E1 || at0Var.E == 11) {
                    int i13 = at0Var.E;
                    if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.ab)) {
                        if (ku0Var.e.isEmpty()) {
                            i11 = i10;
                        } else if (i10 < ku0Var.e.size()) {
                            i11 = ((Integer) ku0Var.e.get(i10)).intValue();
                        }
                        if (i11 >= 0 && i11 < ku0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = ku0Var.d.participants.participants.get(i11);
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
                            return aw0Var.P0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.o7)) {
                            return aw0Var.O0(((org.telegram.ui.Cells.o7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.r7)) {
                            return aw0Var.O0(((org.telegram.ui.Cells.r7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.n7)) {
                            return aw0Var.O0(((org.telegram.ui.Cells.n7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.d2)) {
                            return aw0Var.O0((MessageObject) ((org.telegram.ui.Cells.d2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i13 == 0 || (aw0.w0(i13) && aw0Var.F())) && (view2 instanceof org.telegram.ui.Cells.w7)) {
                            MessageObject messageObject = ((org.telegram.ui.Cells.w7) view2).getMessageObject();
                            if (messageObject != null) {
                                return aw0Var.O0(messageObject, view2, at0Var.E, true);
                            }
                        } else {
                            int i14 = at0Var.E;
                            if (i14 != 10) {
                                if (i14 != 11) {
                                    return false;
                                }
                                aw0Var.T.E(view2);
                                return true;
                            }
                            ju0 ju0Var = aw0Var.S;
                            ArrayList arrayList = ju0Var.d;
                            aw0 aw0Var2 = ju0Var.f;
                            if (i10 >= 0 && i10 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i10);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.un unVar = new org.telegram.ui.un(bundle);
                                org.telegram.ui.ActionBar.r2 r2Var = aw0Var2.x1;
                                org.telegram.ui.ActionBar.u6 u6Var = aw0Var2.H1;
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
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, aw0Var2.getContext(), u6Var);
                                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, u6Var);
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            r2Var.presentFragmentAsPreview(unVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(aw0Var2.getContext(), false, false);
                                        g1Var.j(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                                        g1Var.setMinimumWidth(160);
                                        g1Var.setOnClickListener(new w80(ju0Var, 14));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(aw0Var2.getContext(), false, false);
                                        g1Var2.j(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                                        g1Var2.setMinimumWidth(160);
                                        g1Var2.setOnClickListener(new bi.pa(ju0Var, (TLRPC.Chat) tLObject, i10, 12));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                                        r2Var.presentFragmentAsPreviewWithMenu(unVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, aw0Var2.getContext(), u6Var);
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, u6Var);
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    dt0 dt0Var = at0Var.h;
                    zl0 zl0Var = dt0Var.T0;
                    if (zl0Var != null) {
                        zl0Var.c(i10, view2);
                        return true;
                    }
                    am0 am0Var = dt0Var.U0;
                    if (am0Var != null) {
                        am0Var.e(0.0f, 0.0f, i10, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cm0
    public final void g() {
        org.telegram.ui.ActionBar.r2 r2Var = this.b.x1;
        if (r2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                r2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.cm0
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
