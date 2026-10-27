package bi;

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
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ey;
import org.telegram.ui.oo;
import org.telegram.ui.ro0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p3(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h7.c1((h7) this.c, (String) this.d, this.b);
                break;
            case 1:
                final oo ooVar = (oo) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ooVar.getParentActivity(), 3, null);
                    e2Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !ooVar.M.d();
                    if (ooVar.M.getCheckBox().F == null) {
                        ooVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = ooVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() { // from class: org.telegram.ui.jo
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            oo ooVar2 = oo.this;
                            TLRPC.Chat chat = ooVar2.w0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                ooVar2.getMessagesController().putChat(ooVar2.w0, false);
                            }
                            ooVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < ooVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            if (z11 && tL_premium_boostsStatus.level < ooVar2.getMessagesController().channelAutotranslationLevelMin) {
                                ooVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = ooVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new bi.t2(ooVar2, e2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            ooVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(ooVar2.w0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            ooVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            e2Var2.dismiss();
                            ooVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new fi.m3(5, ooVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.c;
                ns nsVar = (ns) this.d;
                e2VarArr[0].dismiss();
                nsVar.run(-this.b);
                break;
            case 3:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = (org.telegram.ui.ActionBar.e2[]) this.c;
                ns nsVar2 = (ns) this.d;
                e2VarArr2[0].dismiss();
                nsVar2.run(-this.b);
                break;
            case 4:
                z70.N((z70) this.c, (Context) this.d, this.b);
                break;
            case 5:
                ey eyVar = (ey) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.p2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    eyVar.r4(j11);
                } else {
                    eyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                eyVar.finishPreviewFragment();
                break;
            default:
                ro0 ro0Var = (ro0) this.c;
                TextView textView = (TextView) this.d;
                ro0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = ro0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    ro0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, ro0Var.C0.invoice.currency));
                } else {
                    ro0Var.m0 = true;
                    ro0Var.f[0].setText("");
                    ro0Var.m0 = false;
                    ro0Var.H0 = 0L;
                    ro0Var.M0();
                }
                EditTextBoldCursor editTextBoldCursor = ro0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
