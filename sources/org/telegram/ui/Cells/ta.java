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
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.xc;
import org.telegram.ui.qy;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ ta(wn wnVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = wnVar;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.d;
        int i12 = 0;
        switch (i10) {
            case 0:
                qy qyVar = (qy) m2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i13 = org.telegram.ui.ActionBar.h6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i13, 0, new g(qyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                pq pqVar = new pq(R.drawable.attach_arrow_right, 0);
                pqVar.setOverrideColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                pqVar.setScale(0.7f, 0.7f);
                pqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(pqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                xc.a0(qyVar).M(LocaleController.getString(z10 ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), replaceSingleTag, R.raw.contact_check).j();
                MessagesController.getInstance(i11).getUnconfirmedAuthController().confirm(arrayList, new ai.i(8));
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                break;
            default:
                wn wnVar = (wn) m2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.e5.a;
                if (wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) wnVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
                    e3Var.fixNavigationBar();
                    e3Var.title = LocaleController.getString(z10 ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
                    e3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(wnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(wnVar.getParentActivity());
                    linearLayout.addView(textView, w7.y5.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i11, false))));
                    TextView textView2 = new TextView(wnVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                    int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, w02, w03, w03));
                    linearLayout.addView(textView2, w7.y5.t(-1, 48, 0, 16, 12, 16, 8));
                    e3Var.customView = linearLayout;
                    e3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.e3(e3Var, i12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ta(qy qyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = qyVar;
        this.b = z10;
        this.c = i10;
        this.e = arrayList;
    }
}
