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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eo(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                final to toVar = (to) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(toVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !toVar.M.b();
                    if (toVar.M.getCheckBox().F == null) {
                        toVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = toVar.getMessagesController().getBoostsController();
                    final long j3 = this.b;
                    boostsController.getBoostsStats(j3, new Utilities.Callback() { // from class: org.telegram.ui.mo
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            to toVar2 = to.this;
                            TLRPC.Chat chat = toVar2.x0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                toVar2.getMessagesController().putChat(toVar2.x0, false);
                            }
                            toVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < toVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < toVar2.getMessagesController().channelAutotranslationLevelMin) {
                                toVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = toVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(toVar2, b2Var2, tL_premium_boostsStatus, j10, 6));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            toVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(toVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            toVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            toVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.t3(5, toVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.c;
                org.telegram.ui.Components.es esVar = (org.telegram.ui.Components.es) this.d;
                b2VarArr[0].dismiss();
                esVar.run(-this.b);
                break;
            case 2:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = (org.telegram.ui.ActionBar.b2[]) this.c;
                org.telegram.ui.Components.es esVar2 = (org.telegram.ui.Components.es) this.d;
                b2VarArr2[0].dismiss();
                esVar2.run(-this.b);
                break;
            case 3:
                org.telegram.ui.Components.p70.L((org.telegram.ui.Components.p70) this.c, (Context) this.d, this.b);
                break;
            case 4:
                uy uyVar = (uy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.s2) this.d).getHasUnread();
                long j10 = this.b;
                if (hasUnread) {
                    uyVar.s4(j10);
                } else {
                    uyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                uyVar.finishPreviewFragment();
                break;
            case 5:
                so0 so0Var = (so0) this.c;
                TextView textView = (TextView) this.d;
                so0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = so0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    so0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, so0Var.C0.invoice.currency));
                } else {
                    so0Var.m0 = true;
                    so0Var.f[0].setText("");
                    so0Var.m0 = false;
                    so0Var.H0 = 0L;
                    so0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = so0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
            default:
                yh.y3.Y0((yh.y3) this.c, (String) this.d, this.b);
                break;
        }
    }
}
