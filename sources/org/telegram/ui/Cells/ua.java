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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ ua(bo boVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = boVar;
        this.e = str;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = this.c;
        boolean z10 = this.b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.o2 o2Var = this.d;
        int i13 = 0;
        switch (i10) {
            case 0:
                wy wyVar = (wy) o2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i14 = org.telegram.ui.ActionBar.j6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i14, 0, new g(wyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                oq oqVar = new oq(R.drawable.attach_arrow_right, 0);
                oqVar.setOverrideColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                oqVar.setScale(0.7f, 0.7f);
                oqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                vc.a0(wyVar).M(LocaleController.getString(z10 ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), replaceSingleTag, R.raw.contact_check).j();
                MessagesController.getInstance(i12).getUnconfirmedAuthController().confirm(arrayList, new org.telegram.ui.ActionBar.k3(i11));
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                break;
            default:
                bo boVar = (bo) o2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.c5.a;
                if (boVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) boVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
                    g3Var.fixNavigationBar();
                    g3Var.title = LocaleController.getString(z10 ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
                    g3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(boVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(boVar.getParentActivity());
                    linearLayout.addView(textView, w7.x5.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i12, false))));
                    TextView textView2 = new TextView(boVar.getParentActivity());
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
                    linearLayout.addView(textView2, w7.x5.t(-1, 48, 0, 16, 12, 16, 8));
                    g3Var.customView = linearLayout;
                    g3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.c3(g3Var, i13));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ua(wy wyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = wyVar;
        this.b = z10;
        this.c = i10;
        this.e = arrayList;
    }
}
