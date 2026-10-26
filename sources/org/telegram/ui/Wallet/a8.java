package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a8(fi.d dVar, s sVar, j2 j2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = 2;
        this.d = dVar;
        this.c = sVar;
        this.e = j2Var;
        this.b = u6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f7;
        int i10 = this.a;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, u6Var);
                String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = LocaleController.getString(R.string.WalletDeleteWalletInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zg1(3, (Runnable) obj2, (org.telegram.ui.ActionBar.k3) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 1:
                k8 k8Var = (k8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.u6 u6Var2 = k8Var.a;
                if (!TextUtils.isEmpty(k8Var.s) && k8Var.r != null) {
                    org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
                    LinearLayout linearLayout = new LinearLayout(k8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    TLRPC.User user = k8Var.r;
                    if (user != null) {
                        String forcedFirstName = UserObject.getForcedFirstName(user);
                        f7 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(k8Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(k8Var.getContext());
                        y9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
                        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                        j9Var.r(k8Var.r);
                        y9Var.f(k8Var.r, j9Var);
                        linearLayout2.addView(y9Var, gb1.u(30, 30, 16));
                        TextView textView = new TextView(k8Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.y6.G6;
                        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(LocaleController.formatString(R.string.WalletUserWallet, forcedFirstName));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(textView, gb1.x(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, gb1.u(-1, -2, 55));
                        z90 z90Var = new z90(k8Var.getContext(), null);
                        org.telegram.ui.ActionBar.f7.V(z90Var, i11, u6Var);
                        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
                        z90Var.setTextSize(1, 16.0f);
                        z90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        z90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.WalletAddressLinkedToUser, UserObject.getUserName(k8Var.r)), new q6(5, e2VarArr, runnable)));
                        linearLayout.addView(z90Var, gb1.x(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(k8Var.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                    TextView textView2 = new TextView(k8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.G6, u6Var);
                    textView2.setText(w7.Y(k8Var.s));
                    textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
                    int i12 = org.telegram.ui.ActionBar.y6.a7;
                    int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var2);
                    int w03 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var2);
                    int i13 = org.telegram.ui.ActionBar.y6.i6;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.y6.a0(w02, org.telegram.ui.ActionBar.y6.v(w03, org.telegram.ui.ActionBar.y6.w0(i13, u6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                    org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(i12, i13);
                    textView2.setBackground(a02);
                    org.telegram.ui.ActionBar.f7.k(textView2, a02, N, q5, u6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, gb1.h(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, gb1.x(-1, -2, 55, 0, 14, 0, 0));
                    gb1.c(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new m1(k8Var, e2VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k8Var.getContext(), 0, u6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    e2VarArr[0] = alertDialog$Builder2.p();
                    break;
                }
                break;
            default:
                fi.d dVar = (fi.d) obj3;
                s sVar = (s) obj2;
                j2 j2Var = (j2) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    sVar.run(new o(dVar, j2Var, u6Var, 9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a8(Object obj, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = u6Var;
        this.c = runnable;
        this.e = obj2;
    }
}
