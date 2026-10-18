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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ys0 implements zl0 {
    public final /* synthetic */ os0 a;
    public final /* synthetic */ sv0 b;

    public ys0(sv0 sv0Var, os0 os0Var) {
        this.b = sv0Var;
        this.a = os0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    @Override // org.telegram.ui.Components.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f7, float f10, int i10, View view) {
        boolean z10;
        int i11;
        View view2 = view;
        sv0 sv0Var = this.b;
        cu0 cu0Var = sv0Var.a0;
        int i12 = 0;
        if (!sv0Var.o1) {
            os0 os0Var = this.a;
            if (os0Var.h.getAdapter() != sv0Var.S) {
                if (!sv0Var.C1 || os0Var.F == 11) {
                    int i13 = os0Var.F;
                    if (i13 == 7 && (view2 instanceof org.telegram.ui.Cells.va)) {
                        if (cu0Var.e.isEmpty()) {
                            i11 = i10;
                        } else if (i10 < cu0Var.e.size()) {
                            i11 = ((Integer) cu0Var.e.get(i10)).intValue();
                        }
                        if (i11 >= 0 && i11 < cu0Var.d.participants.participants.size()) {
                            TLRPC.ChatParticipant chatParticipant = cu0Var.d.participants.participants.get(i11);
                            im0 im0Var = (im0) view2.getParent();
                            while (true) {
                                if (i12 >= im0Var.getChildCount()) {
                                    break;
                                }
                                View childAt = im0Var.getChildAt(i12);
                                if (RecyclerView.R(childAt) == i10) {
                                    view2 = childAt;
                                    break;
                                }
                                i12++;
                            }
                            return sv0Var.K0(chatParticipant, true, view2);
                        }
                    } else {
                        if (i13 == 1 && (view2 instanceof org.telegram.ui.Cells.i7)) {
                            return sv0Var.J0(((org.telegram.ui.Cells.i7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 3 && (view2 instanceof org.telegram.ui.Cells.m7)) {
                            return sv0Var.J0(((org.telegram.ui.Cells.m7) view2).getMessage(), view2, 0, true);
                        }
                        if ((i13 == 2 || i13 == 4) && (view2 instanceof org.telegram.ui.Cells.h7)) {
                            return sv0Var.J0(((org.telegram.ui.Cells.h7) view2).getMessage(), view2, 0, true);
                        }
                        if (i13 == 5 && (view2 instanceof org.telegram.ui.Cells.f2)) {
                            return sv0Var.J0((MessageObject) ((org.telegram.ui.Cells.f2) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i13 == 0 || (sv0.q0(i13) && sv0Var.C())) && (view2 instanceof org.telegram.ui.Cells.s7)) {
                            MessageObject messageObject = ((org.telegram.ui.Cells.s7) view2).getMessageObject();
                            if (messageObject != null) {
                                return sv0Var.J0(messageObject, view2, os0Var.F, true);
                            }
                        } else {
                            int i14 = os0Var.F;
                            if (i14 != 10) {
                                if (i14 != 11) {
                                    return false;
                                }
                                sv0Var.R.E(view2);
                                return true;
                            }
                            bu0 bu0Var = sv0Var.Q;
                            ArrayList arrayList = bu0Var.d;
                            sv0 sv0Var2 = bu0Var.f;
                            if (i10 >= 0 && i10 < arrayList.size()) {
                                TLObject tLObject = (TLObject) arrayList.get(i10);
                                Bundle bundle = new Bundle();
                                boolean z11 = tLObject instanceof TLRPC.Chat;
                                if (z11) {
                                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                org.telegram.ui.sn snVar = new org.telegram.ui.sn(bundle);
                                org.telegram.ui.ActionBar.n2 n2Var = sv0Var2.v1;
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
                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, sv0Var2.getContext(), sv0Var2.F1);
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(sv0Var2.i0(org.telegram.ui.ActionBar.h6.G8));
                                        if (z11) {
                                            if (!(tLObject instanceof TLRPC.User)) {
                                                return z10;
                                            }
                                            n2Var.presentFragmentAsPreview(snVar);
                                            return z10;
                                        }
                                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(sv0Var2.getContext(), false, false);
                                        e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                                        e1Var.setMinimumWidth(160);
                                        e1Var.setOnClickListener(new u80(bu0Var, 15));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(sv0Var2.getContext(), false, false);
                                        e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                                        e1Var2.setMinimumWidth(160);
                                        e1Var2.setOnClickListener(new ai.ha(bu0Var, (TLRPC.Chat) tLObject, i10, 11));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                                        n2Var.presentFragmentAsPreviewWithMenu(snVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                                        return z10;
                                    }
                                }
                                z10 = true;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, sv0Var2.getContext(), sv0Var2.F1);
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(sv0Var2.i0(org.telegram.ui.ActionBar.h6.G8));
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    rs0 rs0Var = os0Var.h;
                    wl0 wl0Var = rs0Var.T0;
                    if (wl0Var != null) {
                        wl0Var.a(i10, view2);
                        return true;
                    }
                    xl0 xl0Var = rs0Var.U0;
                    if (xl0Var != null) {
                        xl0Var.d(0.0f, 0.0f, i10, view2);
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void h() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.finishPreviewFragment();
            }
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final void o(float f7) {
        org.telegram.ui.ActionBar.n2 n2Var = this.b.v1;
        if (n2Var != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2Var.movePreviewFragment(f7);
            }
        }
    }
}
