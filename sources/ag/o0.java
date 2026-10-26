package ag;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ long c;

    public /* synthetic */ o0(long j10, un unVar) {
        this.a = 0;
        this.c = j10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new ProfileActivity(a1.g.h(this.c, "user_id"), null));
                break;
            case 1:
                this.b.getMessagesController().loadFullChat(this.c, 0, true);
                break;
            case 2:
                un unVar = this.b;
                LongSparseIntArray longSparseIntArray = unVar.Y5;
                long j10 = this.c;
                longSparseIntArray.put(j10, 0);
                e41 e41Var = unVar.d2;
                if (e41Var != null) {
                    e41Var.setAllTopicsHidden(false);
                }
                if (j10 == unVar.p4) {
                    unVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                un unVar2 = this.b;
                qc v = wc.v(unVar2.getParentActivity(), unVar2, null, 1, this.c, 1, unVar2.getThemedColor(y6.Fi), unVar2.getThemedColor(y6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 4:
                un unVar3 = this.b;
                unVar3.getClass();
                unVar3.presentFragment(un.ba(this.c));
                break;
            case 5:
                un unVar4 = this.b;
                unVar4.getClass();
                unVar4.presentFragment(ProfileActivity.t4(this.c));
                break;
            case 6:
                r0.getMediaDataController().loadBotInfo(this.c, r1, true, this.b.classGuid);
                break;
            default:
                wc.b0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
        }
    }

    public /* synthetic */ o0(un unVar, long j10, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = j10;
    }
}
