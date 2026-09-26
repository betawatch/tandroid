package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bo(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                final ro roVar = (ro) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(roVar.getParentActivity(), 3, null);
                    a2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !roVar.M.b();
                    if (roVar.M.getCheckBox().F == null) {
                        roVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = roVar.getMessagesController().getBoostsController();
                    final long j3 = this.b;
                    boostsController.getBoostsStats(j3, new Utilities.Callback() { // from class: org.telegram.ui.ko
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ro roVar2 = ro.this;
                            TLRPC.Chat chat = roVar2.x0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                roVar2.getMessagesController().putChat(roVar2.x0, false);
                            }
                            roVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < roVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                            if (z11 && tL_premium_boostsStatus.level < roVar2.getMessagesController().channelAutotranslationLevelMin) {
                                roVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = roVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(roVar2, a2Var2, tL_premium_boostsStatus, j10, 6));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            roVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(roVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            roVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            a2Var2.dismiss();
                            roVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.t3(5, roVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.c;
                org.telegram.ui.Components.cs csVar = (org.telegram.ui.Components.cs) this.d;
                a2VarArr[0].dismiss();
                csVar.run(-this.b);
                break;
            case 2:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = (org.telegram.ui.ActionBar.a2[]) this.c;
                org.telegram.ui.Components.cs csVar2 = (org.telegram.ui.Components.cs) this.d;
                a2VarArr2[0].dismiss();
                csVar2.run(-this.b);
                break;
            case 3:
                org.telegram.ui.Components.m70.N((org.telegram.ui.Components.m70) this.c, (Context) this.d, this.b);
                break;
            case 4:
                qy qyVar = (qy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.s2) this.d).getHasUnread();
                long j10 = this.b;
                if (hasUnread) {
                    qyVar.j4(j10);
                } else {
                    qyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                qyVar.finishPreviewFragment();
                break;
            case 5:
                oo0 oo0Var = (oo0) this.c;
                TextView textView = (TextView) this.d;
                oo0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = oo0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    oo0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, oo0Var.C0.invoice.currency));
                } else {
                    oo0Var.m0 = true;
                    oo0Var.f[0].setText("");
                    oo0Var.m0 = false;
                    oo0Var.H0 = 0L;
                    oo0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = oo0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
            default:
                yh.x3.Y0((yh.x3) this.c, (String) this.d, this.b);
                break;
        }
    }
}
