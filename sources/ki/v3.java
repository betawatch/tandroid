package ki;

import android.util.SparseIntArray;
import fi.y7;
import java.util.Calendar;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements org.telegram.ui.ActionBar.q1, ei0, rb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v3(int i7, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, x10 x10Var) {
        this.a = i7;
        this.c = zArr;
        this.e = document;
        this.b = i10;
        this.d = zArr2;
        this.f = x10Var;
    }

    @Override // org.telegram.ui.Components.ei0
    public void b(gi0 gi0Var, int i7) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        c5.l lVar = (c5.l) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i10 = this.b + i7;
        int i11 = this.a;
        sparseIntArray.put(i11, i10);
        if (lVar.getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        x10 x10Var = (x10) this.f;
        int i10 = this.a;
        if (!j10.i(i10).q()) {
            new ug.y0((org.telegram.ui.ActionBar.g2) new y3(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.id;
        int i11 = this.b;
        if (i11 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i10).getCurrentTime() + i11;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new y7(zArr2, x10Var, i10, updateemojistatus, 1));
    }

    @Override // org.telegram.ui.Components.rb0
    public void n(tb0 tb0Var, int i7) {
        f4 f4Var = (f4) this.c;
        wg.f fVar = (wg.f) this.d;
        wg.g gVar = (wg.g) this.e;
        tb0 tb0Var2 = (tb0) this.f;
        try {
            f4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (tb0Var.getTag() != null && tb0Var.getTag().equals("DAY")) {
            if (tb0Var.getValue() == tb0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        tb0Var.setMinValue(tb0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i10 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i10);
                    gVar.setMinValue(i11);
                }
            } else if (tb0Var.getValue() == tb0Var.getMaxValue()) {
                fVar.setMaxValue(this.a);
                gVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (tb0Var.getTag() != null && tb0Var.getTag().equals("HOUR") && tb0Var2.getValue() == tb0Var2.getMinValue()) {
            if (tb0Var.getValue() != tb0Var.getMinValue()) {
                gVar.setMinValue(0);
                gVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i12 = (calendar2.get(12) / 5) + 1;
            if (i12 > 11) {
                gVar.setMinValue(0);
            } else {
                gVar.setMinValue(i12);
            }
        }
    }

    public /* synthetic */ v3(SparseIntArray sparseIntArray, int i7, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i7;
        this.b = i10;
        this.d = lVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ v3(f4 f4Var, wg.f fVar, wg.g gVar, int i7, int i10, tb0 tb0Var) {
        this.c = f4Var;
        this.d = fVar;
        this.e = gVar;
        this.a = i7;
        this.b = i10;
        this.f = tb0Var;
    }
}
