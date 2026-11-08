package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class xd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ xd(int i7, ViewGroup viewGroup, Object obj, Object obj2) {
        this.a = i7;
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
        int i7;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.b;
                if (anVar != null) {
                    chatActivityEnterView.g2 = !chatActivityEnterView.g2;
                    if (chatActivityEnterView.e0 == null) {
                        chatActivityEnterView.e0 = new uq((Activity) this.c, R.drawable.input_notify_on, org.telegram.ui.ActionBar.k6.Kl);
                    }
                    chatActivityEnterView.e0.a(chatActivityEnterView.g2, true);
                    chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.e0);
                    org.telegram.messenger.qp.s1(chatActivityEnterView.Q).d7.edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.g2).commit();
                    org.telegram.messenger.dt.t(chatActivityEnterView.Q).c0(chatActivityEnterView.Q2, anVar == null ? 0L : anVar.b(), true);
                    anVar.f8();
                    UndoView undoView = anVar.M3;
                    if (undoView != null) {
                        undoView.j(!chatActivityEnterView.g2 ? 54 : 55, 0L, null);
                    }
                    ImageView imageView = chatActivityEnterView.I1;
                    if (chatActivityEnterView.g2) {
                        str = "AccDescrChanSilentOn";
                        i7 = 2131754906;
                    } else {
                        str = "AccDescrChanSilentOff";
                        i7 = 2131754907;
                    }
                    imageView.setContentDescription(org.telegram.messenger.id.M0(i7, str));
                    chatActivityEnterView.I1(true);
                    break;
                }
                break;
            default:
                if (org.telegram.ui.ww.x4) {
                    break;
                } else {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
                    org.telegram.ui.ww.x4 = true;
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
                        boolean z9 = !q10;
                        org.telegram.ui.ActionBar.j6 Q0 = q10 ? org.telegram.ui.ActionBar.k6.Q0(str3) : org.telegram.ui.ActionBar.k6.Q0(str2);
                        zg0 zg0Var = ((org.telegram.ui.tt) this.d).d;
                        zg0Var.P(q10 ? zg0Var.e[0] - 1 : 0);
                        ((org.telegram.ui.tt) this.d).e.getImageView().d();
                        int[] iArr = {(((org.telegram.ui.tt) this.d).e.getImageView().getMeasuredWidth() / 2) + r3, org.telegram.messenger.k5.C(3.0f, ((org.telegram.ui.tt) this.d).e.getImageView().getMeasuredHeight() / 2, r3)};
                        ((org.telegram.ui.tt) this.d).e.getImageView().getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z9), ((org.telegram.ui.tt) this.d).e.getImageView(), ((org.telegram.ui.tt) this.d).e, new bi.nb(this, (Context) this.b, x02, z9, (org.telegram.ui.ActionBar.f2) this.c, 5));
                        break;
                    }
                    str2 = string;
                    boolean q102 = org.telegram.ui.ActionBar.k6.I.q();
                    boolean z92 = !q102;
                    if (q102) {
                    }
                    zg0 zg0Var2 = ((org.telegram.ui.tt) this.d).d;
                    zg0Var2.P(q102 ? zg0Var2.e[0] - 1 : 0);
                    ((org.telegram.ui.tt) this.d).e.getImageView().d();
                    int[] iArr2 = {(((org.telegram.ui.tt) this.d).e.getImageView().getMeasuredWidth() / 2) + i10, org.telegram.messenger.k5.C(3.0f, ((org.telegram.ui.tt) this.d).e.getImageView().getMeasuredHeight() / 2, i11)};
                    ((org.telegram.ui.tt) this.d).e.getImageView().getLocationInWindow(iArr2);
                    int i102 = iArr2[0];
                    int i112 = iArr2[1];
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z92), ((org.telegram.ui.tt) this.d).e.getImageView(), ((org.telegram.ui.tt) this.d).e, new bi.nb(this, (Context) this.b, x02, z92, (org.telegram.ui.ActionBar.f2) this.c, 5));
                }
                break;
        }
    }
}
