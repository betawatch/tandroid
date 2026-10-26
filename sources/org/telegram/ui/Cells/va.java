package org.telegram.ui.Cells;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.cy;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ va(un unVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = unVar;
        this.e = str;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = this.c;
        boolean z10 = this.b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.r2 r2Var = this.d;
        int i12 = 0;
        switch (i10) {
            case 0:
                cy cyVar = (cy) r2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i13 = org.telegram.ui.ActionBar.y6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i13, 0, new g(cyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                zq zqVar = new zq(R.drawable.attach_arrow_right, 0);
                zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
                zqVar.setScale(0.7f, 0.7f);
                zqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                wc.b0(cyVar).M(LocaleController.getString(z10 ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), replaceSingleTag, R.raw.contact_check).j();
                MessagesController.getInstance(i11).getUnconfirmedAuthController().confirm(arrayList, new di.e(8));
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                break;
            default:
                un unVar = (un) r2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.g5.a;
                if (unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) unVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
                    k3Var.fixNavigationBar();
                    k3Var.title = LocaleController.getString(z10 ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
                    k3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(unVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(unVar.getParentActivity());
                    linearLayout.addView(textView, gb1.x(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i11, false))));
                    TextView textView2 = new TextView(unVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Sh, null);
                    int dp = AndroidUtilities.dp(8.0f);
                    int i14 = org.telegram.ui.ActionBar.y6.Oh;
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, i14, false);
                    int i15 = org.telegram.ui.ActionBar.y6.Qh;
                    int x03 = org.telegram.ui.ActionBar.y6.x0(null, i15, false);
                    y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, x03, x03);
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
                    org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i15);
                    textView2.setBackground(j02);
                    org.telegram.ui.ActionBar.f7.k(textView2, j02, N, N2, null);
                    linearLayout.addView(textView2, gb1.x(-1, 48, 0, 16, 12, 16, 8));
                    k3Var.customView = linearLayout;
                    k3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.g3(k3Var, i12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ va(cy cyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = cyVar;
        this.b = z10;
        this.c = i10;
        this.e = arrayList;
    }
}
