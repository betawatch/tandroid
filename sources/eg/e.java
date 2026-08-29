package eg;

import android.util.SparseIntArray;
import java.util.Calendar;
import lh.b8;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qc0;
import ph.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements oc0, nj0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.a = i10;
        this.c = zArr;
        this.d = document;
        this.b = i11;
        this.e = zArr2;
        this.f = callback;
    }

    @Override // org.telegram.ui.Components.nj0
    public void a(pj0 pj0Var, int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        m2.g gVar = (m2.g) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i11 = this.b + i10;
        int i12 = this.a;
        sparseIntArray.put(i12, i11);
        if (gVar.getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        int i11 = this.a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new cg.p1((org.telegram.ui.ActionBar.o2) new s3(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.id;
        int i12 = this.b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new b8(zArr2, callback, i11, updateemojistatus, 8));
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
        q qVar = (q) this.c;
        o oVar = (o) this.d;
        p pVar = (p) this.e;
        qc0 qc0Var2 = (qc0) this.f;
        try {
            qVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (qc0Var.getTag() != null && qc0Var.getTag().equals("DAY")) {
            if (qc0Var.getValue() == qc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        qc0Var.setMinValue(qc0Var.getMinValue() + 1);
                        oVar.setMinValue(0);
                    } else {
                        oVar.setMinValue(i11 + 1);
                    }
                    pVar.setMinValue(0);
                } else {
                    oVar.setMinValue(i11);
                    pVar.setMinValue(i12);
                }
            } else if (qc0Var.getValue() == qc0Var.getMaxValue()) {
                oVar.setMaxValue(this.a);
                pVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                oVar.setMinValue(0);
                pVar.setMinValue(0);
                oVar.setMaxValue(23);
                pVar.setMaxValue(11);
            }
        }
        if (qc0Var.getTag() != null && qc0Var.getTag().equals("HOUR") && qc0Var2.getValue() == qc0Var2.getMinValue()) {
            if (qc0Var.getValue() != qc0Var.getMinValue()) {
                pVar.setMinValue(0);
                pVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i13 = (calendar2.get(12) / 5) + 1;
            if (i13 > 11) {
                pVar.setMinValue(0);
            } else {
                pVar.setMinValue(i13);
            }
        }
    }

    public /* synthetic */ e(SparseIntArray sparseIntArray, int i10, int i11, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i10;
        this.b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ e(q qVar, o oVar, p pVar, int i10, int i11, qc0 qc0Var) {
        this.c = qVar;
        this.d = oVar;
        this.e = pVar;
        this.a = i10;
        this.b = i11;
        this.f = qc0Var;
    }
}
