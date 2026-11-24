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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ada implements f39 {
    public final /* synthetic */ pca a;
    public final /* synthetic */ nfa b;

    public ada(nfa nfaVar, pca pcaVar) {
        this.b = nfaVar;
        this.a = pcaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0218  */
    @Override // f39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f, float f2, int i, View view) {
        boolean z;
        int i2;
        View view2 = view;
        nfa nfaVar = this.b;
        aea aeaVar = nfaVar.d0;
        int i3 = 0;
        if (nfaVar.r1) {
            return false;
        }
        pca pcaVar = this.a;
        if (pcaVar.h.getAdapter() == nfaVar.V) {
            return false;
        }
        if (!nfaVar.F1 || pcaVar.F == 11) {
            int i4 = pcaVar.F;
            if (i4 == 7 && (view2 instanceof v6c)) {
                if (aeaVar.e.isEmpty()) {
                    i2 = i;
                } else {
                    if (i >= aeaVar.e.size()) {
                        return false;
                    }
                    i2 = ((Integer) aeaVar.e.get(i)).intValue();
                }
                if (i2 < 0 || i2 >= aeaVar.d.participants.participants.size()) {
                    return false;
                }
                TLRPC.ChatParticipant chatParticipant = aeaVar.d.participants.participants.get(i2);
                o39 o39Var = (o39) view2.getParent();
                while (true) {
                    if (i3 >= o39Var.getChildCount()) {
                        break;
                    }
                    View childAt = o39Var.getChildAt(i3);
                    if (RecyclerView.R(childAt) == i) {
                        view2 = childAt;
                        break;
                    }
                    i3++;
                }
                return nfaVar.O0(chatParticipant, true, view2);
            }
            if (i4 == 1 && (view2 instanceof iba)) {
                return nfaVar.N0(((iba) view2).getMessage(), view2, 0, true);
            }
            if (i4 == 3 && (view2 instanceof lba)) {
                return nfaVar.N0(((lba) view2).getMessage(), view2, 0, true);
            }
            if ((i4 == 2 || i4 == 4) && (view2 instanceof eba)) {
                return nfaVar.N0(((eba) view2).getMessage(), view2, 0, true);
            }
            if (i4 == 5 && (view2 instanceof bw2)) {
                return nfaVar.N0((k27) ((bw2) view2).getParentObject(), view2, 0, true);
            }
            if ((i4 == 0 || (nfa.j0(i4) && nfaVar.p())) && (view2 instanceof qfa)) {
                k27 messageObject = ((qfa) view2).getMessageObject();
                if (messageObject != null) {
                    return nfaVar.N0(messageObject, view2, pcaVar.F, true);
                }
                return false;
            }
            int i5 = pcaVar.F;
            if (i5 != 10) {
                if (i5 != 11) {
                    return false;
                }
                nfaVar.U.E(view2);
                return true;
            }
            zda zdaVar = nfaVar.T;
            ArrayList arrayList = zdaVar.d;
            nfa nfaVar2 = zdaVar.f;
            if (i >= 0 && i < arrayList.size()) {
                TLObject tLObject = (TLObject) arrayList.get(i);
                Bundle bundle = new Bundle();
                boolean z2 = tLObject instanceof TLRPC.Chat;
                if (z2) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                mu1 mu1Var = new mu1(bundle);
                d dVar = nfaVar2.y1;
                wjb wjbVar = nfaVar2.I1;
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
                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / kk7.J2));
                        profileActivity.U.setBackground(new BitmapDrawable(createBitmap));
                        profileActivity.U.setAlpha(0.0f);
                        profileActivity.U.setVisibility(0);
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, wjbVar, nfaVar2.getContext());
                        zkb.h(bkb.F8, wjbVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        if (z2) {
                            if (!(tLObject instanceof TLRPC.User)) {
                                return z;
                            }
                            dVar.presentFragmentAsPreview(mu1Var);
                            return z;
                        }
                        a8 a8Var = new a8(nfaVar2.getContext(), false, false);
                        a8Var.j(k96.M0(2131747618, null), R.drawable.msg_channel, null);
                        a8Var.setMinimumWidth(kk7.p2);
                        a8Var.setOnClickListener(new ik8(zdaVar, (byte) 25));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                        a8 a8Var2 = new a8(nfaVar2.getContext(), false, false);
                        a8Var2.j(k96.M0(2131746469, null), R.drawable.msg_addbot, null);
                        a8Var2.setMinimumWidth(kk7.p2);
                        a8Var2.setOnClickListener(new wg((Object) zdaVar, tLObject, i, (byte) 16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
                        dVar.presentFragmentAsPreviewWithMenu(mu1Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        return z;
                    }
                }
                z = true;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, wjbVar, nfaVar2.getContext());
                zkb.h(bkb.F8, wjbVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                if (z2) {
                }
            }
        } else {
            sca scaVar = pcaVar.h;
            c39 c39Var = scaVar.U0;
            if (c39Var != null) {
                c39Var.d(i, view2);
                return true;
            }
            d39 d39Var = scaVar.V0;
            if (d39Var != null) {
                d39Var.e(0.0f, 0.0f, i, view2);
                return true;
            }
        }
        return true;
    }

    @Override // f39
    public final void f() {
        d dVar = this.b.y1;
        if (dVar != null) {
            Point point = gl.q;
            if (point.x > point.y) {
                dVar.finishPreviewFragment();
            }
        }
    }

    @Override // f39
    public final void g(float f) {
        d dVar = this.b.y1;
        if (dVar != null) {
            Point point = gl.q;
            if (point.x > point.y) {
                dVar.movePreviewFragment(f);
            }
        }
    }
}
