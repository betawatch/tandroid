package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ay0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ay0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String userName;
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                int i11 = ProfileActivity.R6;
                TL_agent.agentProvider provider = profileActivity.getMessagesController().getAgentController().getProvider(str);
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
                if (provider != null) {
                    str = provider.title;
                }
                if (user == null || UserObject.getPublicUsername(user) == null) {
                    userName = UserObject.getUserName(user);
                } else {
                    userName = "@" + UserObject.getPublicUsername(user);
                }
                org.telegram.ui.Components.wc.b0(profileActivity).K(R.raw.contact_check, LocaleController.formatString(R.string.AgentProviderConnected, str), LocaleController.formatString(R.string.AgentProviderConnectedText, userName), LocaleController.getString(R.string.AgentStart), new fb0(profileActivity, 13)).j();
                break;
            case 1:
                View view = (View) obj;
                int i12 = ProfileActivity.R6;
                if (view instanceof org.telegram.ui.Cells.g9) {
                    org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
                    g9Var.a.setLoading(profileActivity.o5);
                    g9Var.b.setLoading(profileActivity.o5);
                    break;
                }
                break;
            case 2:
                ProfileActivity.k0(profileActivity, (Boolean) obj);
                break;
            case 3:
                int i13 = ProfileActivity.R6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.aw(profileActivity, profileActivity.getParentActivity(), profileActivity.z0, arrayList));
                break;
            default:
                View view2 = (View) obj;
                int i14 = ProfileActivity.R6;
                if (view2 instanceof org.telegram.ui.Cells.q4) {
                    ((org.telegram.ui.Cells.q4) view2).setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.L6, profileActivity.z0));
                } else if (view2 instanceof org.telegram.ui.Cells.g9) {
                    ((org.telegram.ui.Cells.g9) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.v8) {
                    ((org.telegram.ui.Cells.v8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.n5) {
                    ((org.telegram.ui.Cells.n5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof jg.k1) {
                    jg.k1 k1Var = (jg.k1) view2;
                    org.telegram.ui.Components.pq pqVar = k1Var.r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i15 = org.telegram.ui.ActionBar.y6.o6;
                    org.telegram.ui.ActionBar.u6 u6Var = k1Var.a;
                    int w02 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
                    k1Var.a(w02);
                    int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
                    k1Var.a(w03);
                    int o13 = org.telegram.ui.ActionBar.y6.o1(0.22f, w03);
                    pqVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, o12, o13, o13));
                    int w04 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
                    k1Var.a(w04);
                    pqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.l6) {
                    ((org.telegram.ui.Cells.l6) view2).updateColors();
                }
                j01 j01Var = profileActivity.d;
                profileActivity.a.getClass();
                j01Var.j(RecyclerView.R(view2));
                profileActivity.d.getClass();
                break;
        }
    }
}
