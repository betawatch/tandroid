package jh;

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
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bo0;
import org.telegram.ui.fy;
import org.telegram.ui.ko;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q2(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h5.Y0((h5) this.c, (String) this.d, this.b);
                break;
            case 1:
                final ko koVar = (ko) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(koVar.getParentActivity(), 3, null);
                    c2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !koVar.I.b();
                    if (koVar.I.getCheckBox().B == null) {
                        koVar.I.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = koVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new f5.d() { // from class: org.telegram.ui.go
                        @Override // f5.d
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ko koVar2 = ko.this;
                            TLRPC.Chat chat = koVar2.t0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                koVar2.getMessagesController().putChat(koVar2.t0, false);
                            }
                            koVar2.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < koVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                            if (z11 && tL_premium_boostsStatus.level < koVar2.getMessagesController().channelAutotranslationLevelMin) {
                                koVar2.I.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = koVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new jh.w1(koVar2, c2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            koVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(koVar2.t0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            koVar2.I.setChecked(z11);
                            zArr2[0] = false;
                            c2Var2.dismiss();
                            koVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new nh.l3(5, koVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                wr wrVar = (wr) this.d;
                c2VarArr[0].dismiss();
                wrVar.run(-this.b);
                break;
            case 3:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = (org.telegram.ui.ActionBar.c2[]) this.c;
                wr wrVar2 = (wr) this.d;
                c2VarArr2[0].dismiss();
                wrVar2.run(-this.b);
                break;
            case 4:
                x60.M((x60) this.c, (Context) this.d, this.b);
                break;
            case 5:
                fy fyVar = (fy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.p2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    fyVar.j4(j11);
                } else {
                    fyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                fyVar.finishPreviewFragment();
                break;
            default:
                bo0 bo0Var = (bo0) this.c;
                TextView textView = (TextView) this.d;
                bo0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l10 = bo0Var.D0;
                if (l10 == null || longValue != l10.longValue()) {
                    bo0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, bo0Var.y0.invoice.currency));
                } else {
                    bo0Var.i0 = true;
                    bo0Var.f[0].setText("");
                    bo0Var.i0 = false;
                    bo0Var.D0 = 0L;
                    bo0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = bo0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
