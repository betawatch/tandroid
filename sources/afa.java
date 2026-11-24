// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class afa implements i59 {
    public final /* synthetic */ pea a;
    public final /* synthetic */ nha b;

    public afa(nha nhaVar, pea peaVar) {
        this.b = nhaVar;
        this.a = peaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0218  */
    @Override // i59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f, float f2, int i, View view) {
        boolean z;
        int i2;
        View view2 = view;
        nha nhaVar = this.b;
        aga agaVar = nhaVar.d0;
        int i3 = 0;
        if (nhaVar.r1) {
            return false;
        }
        pea peaVar = this.a;
        if (peaVar.h.getAdapter() == nhaVar.V) {
            return false;
        }
        if (!nhaVar.F1 || peaVar.F == 11) {
            int i4 = peaVar.F;
            if (i4 == 7 && (view2 instanceof w8c)) {
                if (agaVar.e.isEmpty()) {
                    i2 = i;
                } else {
                    if (i >= agaVar.e.size()) {
                        return false;
                    }
                    i2 = ((Integer) agaVar.e.get(i)).intValue();
                }
                if (i2 < 0 || i2 >= agaVar.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = agaVar.d.participants.participants.get(i2);
                r59 r59Var = (r59) view2.getParent();
                while (true) {
                    if (i3 >= r59Var.getChildCount()) {
                        break;
                    }
                    View childAt = r59Var.getChildAt(i3);
                    if (RecyclerView.R(childAt) == i) {
                        view2 = childAt;
                        break;
                    }
                    i3++;
                }
                return nhaVar.O0(chatParticipant, true, view2);
            }
            if (i4 == 1 && (view2 instanceof ida)) {
                return nhaVar.N0(((ida) view2).getMessage(), view2, 0, true);
            }
            if (i4 == 3 && (view2 instanceof lda)) {
                return nhaVar.N0(((lda) view2).getMessage(), view2, 0, true);
            }
            if ((i4 == 2 || i4 == 4) && (view2 instanceof eda)) {
                return nhaVar.N0(((eda) view2).getMessage(), view2, 0, true);
            }
            if (i4 == 5 && (view2 instanceof lx2)) {
                return nhaVar.N0((k47) ((lx2) view2).getParentObject(), view2, 0, true);
            }
            if ((i4 == 0 || (nha.j0(i4) && nhaVar.p())) && (view2 instanceof sha)) {
                k47 messageObject = ((sha) view2).getMessageObject();
                if (messageObject != null) {
                    return nhaVar.N0(messageObject, view2, peaVar.F, true);
                }
                return false;
            }
            int i5 = peaVar.F;
            if (i5 != 10) {
                if (i5 != 11) {
                    return false;
                }
                nhaVar.U.E(view2);
                return true;
            }
            zfa zfaVar = nhaVar.T;
            ArrayList arrayList = zfaVar.d;
            nha nhaVar2 = zfaVar.f;
            if (i >= 0 && i < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i);
                Bundle bundle = new Bundle();
                boolean z2 = tLObject instanceof TLRPC.Chat;
                if (z2) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                yv1 yv1Var = new yv1(bundle);
                d dVar = nhaVar2.y1;
                ylb ylbVar = nhaVar2.I1;
                if (dVar instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) dVar;
                    if (profileActivity.U != null) {
                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                        z = true;
                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.scale(0.16666667f, 0.16666667f);
                        profileActivity.fragmentView.draw(canvas);
                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / nm7.J2));
                        profileActivity.U.setBackground(new BitmapDrawable(createBitmap));
                        profileActivity.U.setAlpha(0.0f);
                        profileActivity.U.setVisibility(0);
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, ylbVar, nhaVar2.getContext());
                        anb.h(cmb.F8, ylbVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        if (z2) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z;
                            }
                            dVar.presentFragmentAsPreview(yv1Var);
                            return z;
                        }
                        a8 a8Var = new a8(nhaVar2.getContext(), false, false);
                        a8Var.j(jb6.M0(2131747544, null), R.drawable.msg_channel, null);
                        a8Var.setMinimumWidth(nm7.p2);
                        a8Var.setOnClickListener(new wk8(zfaVar, (byte) 28));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                        a8 a8Var2 = new a8(nhaVar2.getContext(), false, false);
                        a8Var2.j(jb6.M0(2131746395, null), R.drawable.msg_addbot, null);
                        a8Var2.setMinimumWidth(nm7.p2);
                        a8Var2.setOnClickListener(new wh((Object) zfaVar, tLObject, i, (byte) 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
                        dVar.presentFragmentAsPreviewWithMenu(yv1Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z;
                    }
                }
                z = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, ylbVar, nhaVar2.getContext());
                anb.h(cmb.F8, ylbVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                if (z2) {
                }
            }
        } else {
            sea seaVar = peaVar.h;
            f59 f59Var = seaVar.U0;
            if (f59Var != null) {
                f59Var.g(i, view2);
                return true;
            }
            g59 g59Var = seaVar.V0;
            if (g59Var != null) {
                g59Var.d(0.0f, 0.0f, i, view2);
                return true;
            }
        }
        return true;
    }

    @Override // i59
    public final void i() {
        d dVar = this.b.y1;
        if (dVar != null) {
            Point point = gm.q;
            if (point.x > point.y) {
                dVar.finishPreviewFragment();
            }
        }
    }

    @Override // i59
    public final void k(float f) {
        d dVar = this.b.y1;
        if (dVar != null) {
            Point point = gm.q;
            if (point.x > point.y) {
                dVar.movePreviewFragment(f);
            }
        }
    }
}
