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
import org.telegram.ui.Components.x70;
import org.telegram.ui.ey;
import org.telegram.ui.io0;
import org.telegram.ui.ko;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                l7.c1((l7) this.c, (String) this.d, this.b);
                break;
            case 1:
                final ko koVar = (ko) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(koVar.getParentActivity(), 3, null);
                    c2Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !koVar.M.d();
                    if (koVar.M.getCheckBox().F == null) {
                        koVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = koVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() { // from class: org.telegram.ui.fo
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ko koVar2 = ko.this;
                            TLRPC.Chat chat = koVar2.w0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                koVar2.getMessagesController().putChat(koVar2.w0, false);
                            }
                            koVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < koVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                            if (z11 && tL_premium_boostsStatus.level < koVar2.getMessagesController().channelAutotranslationLevelMin) {
                                koVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = koVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new ai.x2(koVar2, c2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            koVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(koVar2.w0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            koVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            c2Var2.dismiss();
                            koVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ei.o3(5, koVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                ls lsVar = (ls) this.d;
                c2VarArr[0].dismiss();
                lsVar.run(-this.b);
                break;
            case 3:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = (org.telegram.ui.ActionBar.c2[]) this.c;
                ls lsVar2 = (ls) this.d;
                c2VarArr2[0].dismiss();
                lsVar2.run(-this.b);
                break;
            case 4:
                x70.N((x70) this.c, (Context) this.d, this.b);
                break;
            case 5:
                ey eyVar = (ey) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.q2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    eyVar.h4(j11);
                } else {
                    eyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                eyVar.finishPreviewFragment();
                break;
            default:
                io0 io0Var = (io0) this.c;
                TextView textView = (TextView) this.d;
                io0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = io0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    io0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, io0Var.C0.invoice.currency));
                } else {
                    io0Var.m0 = true;
                    io0Var.f[0].setText("");
                    io0Var.m0 = false;
                    io0Var.H0 = 0L;
                    io0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = io0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
