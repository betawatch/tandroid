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
import org.telegram.ui.Components.y70;
import org.telegram.ui.cy;
import org.telegram.ui.mo;
import org.telegram.ui.po0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                final mo moVar = (mo) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(moVar.getParentActivity(), 3, null);
                    e2Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !moVar.M.d();
                    if (moVar.M.getCheckBox().F == null) {
                        moVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = moVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() { // from class: org.telegram.ui.ho
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            mo moVar2 = mo.this;
                            TLRPC.Chat chat = moVar2.w0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                moVar2.getMessagesController().putChat(moVar2.w0, false);
                            }
                            moVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < moVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            if (z11 && tL_premium_boostsStatus.level < moVar2.getMessagesController().channelAutotranslationLevelMin) {
                                moVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = moVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new bi.t2(moVar2, e2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            moVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(moVar2.w0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            moVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            e2Var2.dismiss();
                            moVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new fi.m3(5, moVar2, z11), 64);
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
                y70.N((y70) this.c, (Context) this.d, this.b);
                break;
            case 5:
                cy cyVar = (cy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.p2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    cyVar.r4(j11);
                } else {
                    cyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                cyVar.finishPreviewFragment();
                break;
            default:
                po0 po0Var = (po0) this.c;
                TextView textView = (TextView) this.d;
                po0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = po0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    po0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, po0Var.C0.invoice.currency));
                } else {
                    po0Var.m0 = true;
                    po0Var.f[0].setText("");
                    po0Var.m0 = false;
                    po0Var.H0 = 0L;
                    po0Var.M0();
                }
                EditTextBoldCursor editTextBoldCursor = po0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
