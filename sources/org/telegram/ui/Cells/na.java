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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.tc;
import org.telegram.ui.fy;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ na(tn tnVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = tnVar;
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
        org.telegram.ui.ActionBar.o2 o2Var = this.d;
        int i12 = 0;
        switch (i10) {
            case 0:
                fy fyVar = (fy) o2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i13 = org.telegram.ui.ActionBar.g6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i13, 0, new g(fyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                iq iqVar = new iq(R.drawable.attach_arrow_right, 0);
                iqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                iqVar.setScale(0.7f, 0.7f);
                iqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                tc.a0(fyVar).M(LocaleController.getString(z10 ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), replaceSingleTag, R.raw.contact_check).j();
                MessagesController.getInstance(i11).getUnconfirmedAuthController().confirm(arrayList, new eg.h(3));
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                break;
            default:
                tn tnVar = (tn) o2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.c5.a;
                if (tnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(tnVar.getParentActivity(), null, false, false);
                    f3Var.fixNavigationBar();
                    f3Var.title = LocaleController.getString(z10 ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
                    f3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(tnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(tnVar.getParentActivity());
                    linearLayout.addView(textView, i7.f6.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i11, false))));
                    TextView textView2 = new TextView(tnVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w02, w03, w03));
                    linearLayout.addView(textView2, i7.f6.t(-1, 48, 0, 16, 12, 16, 8));
                    f3Var.customView = linearLayout;
                    f3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.d3(f3Var, i12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ na(fy fyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = fyVar;
        this.b = z10;
        this.c = i10;
        this.e = arrayList;
    }
}
