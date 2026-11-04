package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ vd(int i3, ViewGroup viewGroup, Object obj, Object obj2) {
        this.a = i3;
        this.d = viewGroup;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        int i3;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.b;
                if (wmVar != null) {
                    chatActivityEnterView.h2 = !chatActivityEnterView.h2;
                    if (chatActivityEnterView.f0 == null) {
                        chatActivityEnterView.f0 = new uq((Activity) this.c, R.drawable.input_notify_on, org.telegram.ui.ActionBar.k6.Kl);
                    }
                    chatActivityEnterView.f0.a(chatActivityEnterView.h2, true);
                    chatActivityEnterView.J1.setImageDrawable(chatActivityEnterView.f0);
                    org.telegram.messenger.hp.s1(chatActivityEnterView.R).d7.edit().putBoolean("silent_" + chatActivityEnterView.R2, chatActivityEnterView.h2).commit();
                    org.telegram.messenger.us.t(chatActivityEnterView.R).c0(chatActivityEnterView.R2, wmVar == null ? 0L : wmVar.b(), true);
                    wmVar.f8();
                    UndoView undoView = wmVar.N3;
                    if (undoView != null) {
                        undoView.j(!chatActivityEnterView.h2 ? 54 : 55, 0L, null);
                    }
                    ImageView imageView = chatActivityEnterView.J1;
                    if (chatActivityEnterView.h2) {
                        str = "AccDescrChanSilentOn";
                        i3 = 2131754906;
                    } else {
                        str = "AccDescrChanSilentOff";
                        i3 = 2131754907;
                    }
                    imageView.setContentDescription(org.telegram.messenger.bd.M0(i3, str));
                    chatActivityEnterView.H1(true);
                    break;
                }
                break;
            default:
                if (org.telegram.ui.uw.y4) {
                    break;
                } else {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
                    org.telegram.ui.uw.y4 = true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                    String str2 = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.k6.Q0(string) == null || org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str3 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.k6.Q0(string2) == null || !org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                    if (!string.equals(string2)) {
                        str3 = string2;
                    } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                        boolean z10 = !q10;
                        org.telegram.ui.ActionBar.j6 Q0 = q10 ? org.telegram.ui.ActionBar.k6.Q0(str3) : org.telegram.ui.ActionBar.k6.Q0(str2);
                        ch0 ch0Var = ((org.telegram.ui.rt) this.d).d;
                        ch0Var.P(q10 ? ch0Var.e[0] - 1 : 0);
                        ((org.telegram.ui.rt) this.d).e.getImageView().d();
                        int[] iArr = {(((org.telegram.ui.rt) this.d).e.getImageView().getMeasuredWidth() / 2) + r3, org.telegram.messenger.k5.C(3.0f, ((org.telegram.ui.rt) this.d).e.getImageView().getMeasuredHeight() / 2, r3)};
                        ((org.telegram.ui.rt) this.d).e.getImageView().getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), ((org.telegram.ui.rt) this.d).e.getImageView(), ((org.telegram.ui.rt) this.d).e, new ci.ka(this, (Context) this.b, x02, z10, (org.telegram.ui.ActionBar.d2) this.c, 6));
                        break;
                    }
                    str2 = string;
                    boolean q102 = org.telegram.ui.ActionBar.k6.I.q();
                    boolean z102 = !q102;
                    if (q102) {
                    }
                    ch0 ch0Var2 = ((org.telegram.ui.rt) this.d).d;
                    ch0Var2.P(q102 ? ch0Var2.e[0] - 1 : 0);
                    ((org.telegram.ui.rt) this.d).e.getImageView().d();
                    int[] iArr2 = {(((org.telegram.ui.rt) this.d).e.getImageView().getMeasuredWidth() / 2) + i10, org.telegram.messenger.k5.C(3.0f, ((org.telegram.ui.rt) this.d).e.getImageView().getMeasuredHeight() / 2, i11)};
                    ((org.telegram.ui.rt) this.d).e.getImageView().getLocationInWindow(iArr2);
                    int i102 = iArr2[0];
                    int i112 = iArr2[1];
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, Q0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z102), ((org.telegram.ui.rt) this.d).e.getImageView(), ((org.telegram.ui.rt) this.d).e, new ci.ka(this, (Context) this.b, x02, z102, (org.telegram.ui.ActionBar.d2) this.c, 6));
                }
                break;
        }
    }
}
