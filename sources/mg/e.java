package mg;

import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.yb0;
import xh.m3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements yb0, ti0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, q20 q20Var) {
        this.a = i10;
        this.c = zArr;
        this.d = document;
        this.b = i11;
        this.e = zArr2;
        this.f = q20Var;
    }

    @Override // org.telegram.ui.Components.ti0
    public void c(vi0 vi0Var, int i10) {
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

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        q20 q20Var = (q20) this.f;
        int i11 = this.a;
        if (!d20.i(i11).q()) {
            new kg.i1((k2) new m3(null), 12, false).show();
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
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new org.telegram.ui.b0(zArr2, q20Var, i11, updateemojistatus, 8));
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        o oVar = (o) this.c;
        m mVar = (m) this.d;
        n nVar = (n) this.e;
        ac0 ac0Var2 = (ac0) this.f;
        try {
            oVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (ac0Var.getTag() != null && ac0Var.getTag().equals("DAY")) {
            if (ac0Var.getValue() == ac0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        ac0Var.setMinValue(ac0Var.getMinValue() + 1);
                        mVar.setMinValue(0);
                    } else {
                        mVar.setMinValue(i11 + 1);
                    }
                    nVar.setMinValue(0);
                } else {
                    mVar.setMinValue(i11);
                    nVar.setMinValue(i12);
                }
            } else if (ac0Var.getValue() == ac0Var.getMaxValue()) {
                mVar.setMaxValue(this.a);
                nVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                mVar.setMinValue(0);
                nVar.setMinValue(0);
                mVar.setMaxValue(23);
                nVar.setMaxValue(11);
            }
        }
        if (ac0Var.getTag() != null && ac0Var.getTag().equals("HOUR") && ac0Var2.getValue() == ac0Var2.getMinValue()) {
            if (ac0Var.getValue() != ac0Var.getMinValue()) {
                nVar.setMinValue(0);
                nVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i13 = (calendar2.get(12) / 5) + 1;
            if (i13 > 11) {
                nVar.setMinValue(0);
            } else {
                nVar.setMinValue(i13);
            }
        }
    }

    public /* synthetic */ e(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i10;
        this.b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ e(o oVar, m mVar, n nVar, int i10, int i11, ac0 ac0Var) {
        this.c = oVar;
        this.d = mVar;
        this.e = nVar;
        this.a = i10;
        this.b = i11;
        this.f = ac0Var;
    }
}
