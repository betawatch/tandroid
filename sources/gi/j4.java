package gi;

import android.util.SparseIntArray;
import ci.t8;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.od0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements org.telegram.ui.ActionBar.a2, kk0, md0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.a = i10;
        this.c = zArr;
        this.e = document;
        this.b = i11;
        this.d = zArr2;
        this.f = callback;
    }

    @Override // org.telegram.ui.Components.kk0
    public void a(mk0 mk0Var, int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        z4.g gVar = (z4.g) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i11 = this.b + i10;
        int i12 = this.a;
        sparseIntArray.put(i12, i11);
        if (gVar.getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        int i11 = this.a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new sg.x0((org.telegram.ui.ActionBar.n2) new n4(null), 12, false).show();
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
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new t8(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override // org.telegram.ui.Components.md0
    public void q(od0 od0Var, int i10) {
        org.telegram.ui.Components.d4 d4Var = (org.telegram.ui.Components.d4) this.c;
        ug.f fVar = (ug.f) this.d;
        ug.g gVar = (ug.g) this.e;
        od0 od0Var2 = (od0) this.f;
        try {
            d4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (od0Var.getTag() != null && od0Var.getTag().equals("DAY")) {
            if (od0Var.getValue() == od0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        od0Var.setMinValue(od0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i11 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i11);
                    gVar.setMinValue(i12);
                }
            } else if (od0Var.getValue() == od0Var.getMaxValue()) {
                fVar.setMaxValue(this.a);
                gVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (od0Var.getTag() != null && od0Var.getTag().equals("HOUR") && od0Var2.getValue() == od0Var2.getMinValue()) {
            if (od0Var.getValue() != od0Var.getMinValue()) {
                gVar.setMinValue(0);
                gVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i13 = (calendar2.get(12) / 5) + 1;
            if (i13 > 11) {
                gVar.setMinValue(0);
            } else {
                gVar.setMinValue(i13);
            }
        }
    }

    public /* synthetic */ j4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i10;
        this.b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ j4(org.telegram.ui.Components.d4 d4Var, ug.f fVar, ug.g gVar, int i10, int i11, od0 od0Var) {
        this.c = d4Var;
        this.d = fVar;
        this.e = gVar;
        this.a = i10;
        this.b = i11;
        this.f = od0Var;
    }
}
