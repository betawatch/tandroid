package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ku(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l10 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((ju) this.d);
                dataSettingsActivity.T = dataSettingsActivity.T || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.V = l10.longValue();
                dataSettingsActivity.U = false;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    break;
                }
                break;
            case 1:
                qx qxVar = (qx) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.d2) this.d).q(150L);
                qy qyVar = qxVar.b;
                Boolean bool = qyVar.D.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    qyVar.getMessagesController().addUserToChat(this.b, qyVar.getMessagesController().getUser(Long.valueOf(qyVar.E)), 0, null, qyVar, false, runnable, new jf(8, runnable));
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                ProfileActivity.k0((ProfileActivity) this.c, (Context) this.d, this.b, (TL_payments.connectedBotStarRef) obj);
                break;
        }
    }
}
