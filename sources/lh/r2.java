package lh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.zr;
import org.telegram.ui.lo0;
import org.telegram.ui.qy;
import org.telegram.ui.ro;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r2(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g5.Y0((g5) this.c, (String) this.d, this.b);
                break;
            case 1:
                final ro roVar = (ro) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(roVar.getParentActivity(), 3, null);
                    d2Var.q(400L);
                    zArr[0] = true;
                    final boolean z4 = !roVar.J.b();
                    if (roVar.J.getCheckBox().C == null) {
                        roVar.J.setChecked(z4);
                    }
                    ChannelBoostsController boostsController = roVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new h5.d() { // from class: org.telegram.ui.mo
                        @Override // h5.d
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ro roVar2 = ro.this;
                            TLRPC.Chat chat = roVar2.u0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                roVar2.getMessagesController().putChat(roVar2.u0, false);
                            }
                            roVar2.J.getCheckBox().setIcon(tL_premium_boostsStatus.level < roVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z10 = z4;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            if (z10 && tL_premium_boostsStatus.level < roVar2.getMessagesController().channelAutotranslationLevelMin) {
                                roVar2.J.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = roVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new lh.w1(roVar2, d2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            roVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(roVar2.u0);
                            tL_channels_toggleAutotranslation.enabled = z10;
                            roVar2.J.setChecked(z10);
                            zArr2[0] = false;
                            d2Var2.dismiss();
                            roVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new org.telegram.messenger.zd(4, roVar2, z10), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.c;
                zr zrVar = (zr) this.d;
                d2VarArr[0].dismiss();
                zrVar.run(-this.b);
                break;
            case 3:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = (org.telegram.ui.ActionBar.d2[]) this.c;
                zr zrVar2 = (zr) this.d;
                d2VarArr2[0].dismiss();
                zrVar2.run(-this.b);
                break;
            case 4:
                d70.N((d70) this.c, (Context) this.d, this.b);
                break;
            case 5:
                qy qyVar = (qy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.q2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    qyVar.j4(j11);
                } else {
                    qyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                qyVar.finishPreviewFragment();
                break;
            default:
                lo0 lo0Var = (lo0) this.c;
                TextView textView = (TextView) this.d;
                lo0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l10 = lo0Var.E0;
                if (l10 == null || longValue != l10.longValue()) {
                    lo0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, lo0Var.z0.invoice.currency));
                } else {
                    lo0Var.j0 = true;
                    lo0Var.f[0].setText("");
                    lo0Var.j0 = false;
                    lo0Var.E0 = 0L;
                    lo0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = lo0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
