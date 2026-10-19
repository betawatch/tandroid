package ai;

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
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.v70;
import org.telegram.ui.cy;
import org.telegram.ui.eo0;
import org.telegram.ui.io;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t3(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l7.d1((l7) this.c, (String) this.d, this.b);
                break;
            case 1:
                final io ioVar = (io) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ioVar.getParentActivity(), 3, null);
                    b2Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !ioVar.M.b();
                    if (ioVar.M.getCheckBox().F == null) {
                        ioVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = ioVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() { // from class: org.telegram.ui.co
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            io ioVar2 = io.this;
                            TLRPC.Chat chat = ioVar2.x0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                ioVar2.getMessagesController().putChat(ioVar2.x0, false);
                            }
                            ioVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < ioVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < ioVar2.getMessagesController().channelAutotranslationLevelMin) {
                                ioVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = ioVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new ai.x2(ioVar2, b2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            ioVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(ioVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            ioVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            ioVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ei.o3(5, ioVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.c;
                ls lsVar = (ls) this.d;
                b2VarArr[0].dismiss();
                lsVar.run(-this.b);
                break;
            case 3:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = (org.telegram.ui.ActionBar.b2[]) this.c;
                ls lsVar2 = (ls) this.d;
                b2VarArr2[0].dismiss();
                lsVar2.run(-this.b);
                break;
            case 4:
                v70.O((v70) this.c, (Context) this.d, this.b);
                break;
            case 5:
                cy cyVar = (cy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    cyVar.h4(j11);
                } else {
                    cyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                cyVar.finishPreviewFragment();
                break;
            default:
                eo0 eo0Var = (eo0) this.c;
                TextView textView = (TextView) this.d;
                eo0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = eo0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    eo0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, eo0Var.C0.invoice.currency));
                } else {
                    eo0Var.m0 = true;
                    eo0Var.f[0].setText("");
                    eo0Var.m0 = false;
                    eo0Var.H0 = 0L;
                    eo0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = eo0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
