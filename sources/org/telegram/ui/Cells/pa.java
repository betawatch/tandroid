package org.telegram.ui.Cells;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.py;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ pa(xn xnVar, TLRPC.User user, String str, boolean z4, int i10) {
        this.d = xnVar;
        this.e = str;
        this.b = z4;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = this.c;
        boolean z4 = this.b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.p2 p2Var = this.d;
        int i12 = 0;
        switch (i10) {
            case 0:
                py pyVar = (py) p2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i13 = org.telegram.ui.ActionBar.k6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i13, 0, new g(pyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                oq oqVar = new oq(R.drawable.attach_arrow_right, 0);
                oqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                oqVar.setScale(0.7f, 0.7f);
                oqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                qc.a0(pyVar).M(LocaleController.getString(z4 ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), replaceSingleTag, R.raw.contact_check).j();
                MessagesController.getInstance(i11).getUnconfirmedAuthController().confirm(arrayList, new hg.h(3));
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                break;
            default:
                xn xnVar = (xn) p2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.z4.a;
                if (xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(xnVar.getParentActivity(), null, false, false);
                    h3Var.fixNavigationBar();
                    h3Var.title = LocaleController.getString(z4 ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
                    h3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(xnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(xnVar.getParentActivity());
                    linearLayout.addView(textView, k7.c6.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i11, false))));
                    TextView textView2 = new TextView(xnVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, w02, w03, w03));
                    linearLayout.addView(textView2, k7.c6.t(-1, 48, 0, 16, 12, 16, 8));
                    h3Var.customView = linearLayout;
                    h3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.a3(h3Var, i12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pa(py pyVar, boolean z4, int i10, ArrayList arrayList) {
        this.d = pyVar;
        this.b = z4;
        this.c = i10;
        this.e = arrayList;
    }
}
