package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ sd(int i10, ViewGroup viewGroup, Object obj, Object obj2) {
        this.a = i10;
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
        int i10;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.b;
                if (unVar != null) {
                    chatActivityEnterView.g2 = !chatActivityEnterView.g2;
                    if (chatActivityEnterView.e0 == null) {
                        chatActivityEnterView.e0 = new dr((Activity) this.c, R.drawable.input_notify_on, org.telegram.ui.ActionBar.t6.Kl);
                    }
                    chatActivityEnterView.e0.a(chatActivityEnterView.g2, true);
                    chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.e0);
                    org.telegram.messenger.vp.r1(chatActivityEnterView.Q).e7.edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.g2).commit();
                    org.telegram.messenger.ot.t(chatActivityEnterView.Q).c0(chatActivityEnterView.Q2, unVar == null ? 0L : unVar.b(), true);
                    unVar.Y7();
                    UndoView undoView = unVar.M3;
                    if (undoView != null) {
                        undoView.j(!chatActivityEnterView.g2 ? 54 : 55, 0L, null);
                    }
                    ImageView imageView = chatActivityEnterView.I1;
                    if (chatActivityEnterView.g2) {
                        str = "AccDescrChanSilentOn";
                        i10 = 2131754906;
                    } else {
                        str = "AccDescrChanSilentOff";
                        i10 = 2131754907;
                    }
                    imageView.setContentDescription(org.telegram.messenger.cd.L0(i10, str));
                    chatActivityEnterView.F1(true);
                    break;
                }
                break;
            default:
                if (org.telegram.ui.ay.x4) {
                    break;
                } else {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false);
                    org.telegram.ui.ay.x4 = true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
                    String str2 = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.t6.Q0(string) == null || org.telegram.ui.ActionBar.t6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str3 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.t6.Q0(string2) == null || !org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
                    if (!string.equals(string2)) {
                        str3 = string2;
                    } else if (s6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
                        boolean z10 = !q6;
                        org.telegram.ui.ActionBar.s6 Q0 = q6 ? org.telegram.ui.ActionBar.t6.Q0(str3) : org.telegram.ui.ActionBar.t6.Q0(str2);
                        bi0 bi0Var = ((org.telegram.ui.vu) this.d).d;
                        bi0Var.P(q6 ? bi0Var.e[0] - 1 : 0);
                        ((org.telegram.ui.vu) this.d).e.getImageView().d();
                        int[] iArr = {(((org.telegram.ui.vu) this.d).e.getImageView().getMeasuredWidth() / 2) + r3, org.telegram.messenger.m5.C(3.0f, ((org.telegram.ui.vu) this.d).e.getImageView().getMeasuredHeight() / 2, r3)};
                        ((org.telegram.ui.vu) this.d).e.getImageView().getLocationInWindow(iArr);
                        int i11 = iArr[0];
                        int i12 = iArr[1];
                        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), ((org.telegram.ui.vu) this.d).e.getImageView(), ((org.telegram.ui.vu) this.d).e, new ig.o0(this, (Context) this.b, x02, z10, (org.telegram.ui.ActionBar.k2) this.c, 5));
                        break;
                    }
                    str2 = string;
                    boolean q62 = org.telegram.ui.ActionBar.t6.I.q();
                    boolean z102 = !q62;
                    if (q62) {
                    }
                    bi0 bi0Var2 = ((org.telegram.ui.vu) this.d).d;
                    bi0Var2.P(q62 ? bi0Var2.e[0] - 1 : 0);
                    ((org.telegram.ui.vu) this.d).e.getImageView().d();
                    int[] iArr2 = {(((org.telegram.ui.vu) this.d).e.getImageView().getMeasuredWidth() / 2) + i11, org.telegram.messenger.m5.C(3.0f, ((org.telegram.ui.vu) this.d).e.getImageView().getMeasuredHeight() / 2, i12)};
                    ((org.telegram.ui.vu) this.d).e.getImageView().getLocationInWindow(iArr2);
                    int i112 = iArr2[0];
                    int i122 = iArr2[1];
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, Q0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z102), ((org.telegram.ui.vu) this.d).e.getImageView(), ((org.telegram.ui.vu) this.d).e, new ig.o0(this, (Context) this.b, x02, z102, (org.telegram.ui.ActionBar.k2) this.c, 5));
                }
                break;
        }
    }
}
