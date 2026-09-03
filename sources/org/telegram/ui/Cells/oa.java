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
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.qy;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ oa(zn znVar, TLRPC.User user, String str, boolean z4, int i10) {
        this.d = znVar;
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
                qy qyVar = (qy) p2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i13 = org.telegram.ui.ActionBar.j6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i13, 0, new g(qyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                lq lqVar = new lq(R.drawable.attach_arrow_right, 0);
                lqVar.setOverrideColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                lqVar.setScale(0.7f, 0.7f);
                lqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                qc.a0(qyVar).M(LocaleController.getString(z4 ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), replaceSingleTag, R.raw.contact_check).j();
                MessagesController.getInstance(i11).getUnconfirmedAuthController().confirm(arrayList, new gg.h(3));
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                break;
            default:
                zn znVar = (zn) p2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.z4.a;
                if (znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(znVar.getParentActivity(), null, false, false);
                    g3Var.fixNavigationBar();
                    g3Var.title = LocaleController.getString(z4 ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
                    g3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(znVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(znVar.getParentActivity());
                    linearLayout.addView(textView, k7.b6.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i11, false))));
                    TextView textView2 = new TextView(znVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, w03, w03));
                    linearLayout.addView(textView2, k7.b6.t(-1, 48, 0, 16, 12, 16, 8));
                    g3Var.customView = linearLayout;
                    g3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.a3(g3Var, i12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ oa(qy qyVar, boolean z4, int i10, ArrayList arrayList) {
        this.d = qyVar;
        this.b = z4;
        this.c = i10;
        this.e = arrayList;
    }
}
