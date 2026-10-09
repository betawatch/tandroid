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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ii1;
import org.telegram.ui.ls0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e7 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e7(Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, org.telegram.ui.ActionBar.f3 f3Var) {
        this.d = context;
        this.c = e6Var;
        this.b = runnable;
        this.e = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f7;
        int i10 = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, e6Var);
                String string = LocaleController.getString(R.string.WalletDeleteWalletTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.WalletDeleteWalletInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ls0(23, (Runnable) obj2, (org.telegram.ui.ActionBar.f3) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 1:
                n7 n7Var = (n7) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = n7Var.a;
                if (!TextUtils.isEmpty(n7Var.r) && n7Var.n != null) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                    LinearLayout linearLayout = new LinearLayout(n7Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    TLRPC.User user = n7Var.n;
                    if (user != null) {
                        String forcedFirstName = UserObject.getForcedFirstName(user);
                        LinearLayout linearLayout2 = new LinearLayout(n7Var.getContext());
                        linearLayout2.setOrientation(0);
                        f7 = 4.0f;
                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        y9 y9Var = new y9(n7Var.getContext());
                        y9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
                        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
                        j9Var.r(n7Var.n);
                        y9Var.e(n7Var.n, j9Var);
                        linearLayout2.addView(y9Var, w7.x5.q(30, 30, 16));
                        TextView textView = new TextView(n7Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.i6.G6;
                        bi.o(i11, e6Var2, textView, 1, 20.0f);
                        textView.setText(LocaleController.formatString(R.string.WalletUserWallet, forcedFirstName));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        linearLayout2.addView(textView, w7.x5.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, w7.x5.q(-1, -2, 55));
                        ea0 ea0Var = new ea0(n7Var.getContext(), null);
                        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var2));
                        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var2));
                        ea0Var.setTextSize(1, 16.0f);
                        ea0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        ea0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.WalletAddressLinkedToUser, UserObject.getUserName(n7Var.n)), new ii1(18, b2VarArr, runnable)));
                        linearLayout.addView(ea0Var, w7.x5.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(n7Var.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
                    TextView textView2 = new TextView(n7Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
                    textView2.setText(a7.X(n7Var.r));
                    textView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f));
                    textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
                    int i12 = org.telegram.ui.ActionBar.i6.a7;
                    textView2.setBackground(org.telegram.ui.ActionBar.i6.a0(org.telegram.ui.ActionBar.i6.w0(i12, e6Var2), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(i12, e6Var2), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var2)), 10, 10));
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 7));
                    linearLayout.addView(frameLayout, w7.x5.t(-1, -2, 55, 0, 14, 0, 0));
                    w7.z5.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new l1(n7Var, b2VarArr, runnable2, 2));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n7Var.getContext(), 0, e6Var);
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    b2VarArr[0] = alertDialog$Builder2.o();
                    break;
                }
                break;
            default:
                ci.d dVar = (ci.d) obj3;
                z6 z6Var = (z6) obj2;
                i2 i2Var = (i2) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    z6Var.run(new o(dVar, i2Var, e6Var, 9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e7(ci.d dVar, z6 z6Var, i2 i2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = dVar;
        this.b = z6Var;
        this.e = i2Var;
        this.c = e6Var;
    }

    public /* synthetic */ e7(n7 n7Var, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable2) {
        this.d = n7Var;
        this.b = runnable;
        this.c = e6Var;
        this.e = runnable2;
    }
}
