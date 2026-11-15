package ki;

import android.util.SparseIntArray;
import fi.b8;
import java.util.Calendar;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.vh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements org.telegram.ui.ActionBar.q1, th0, gb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b4(int i7, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, z10 z10Var) {
        this.a = i7;
        this.c = zArr;
        this.e = document;
        this.b = i10;
        this.d = zArr2;
        this.f = z10Var;
    }

    @Override // org.telegram.ui.Components.th0
    public void b(vh0 vh0Var, int i7) {
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
        z10 z10Var = (z10) this.f;
        int i10 = this.a;
        if (!m10.i(i10).q()) {
            new ug.x0((org.telegram.ui.ActionBar.e2) new e4(null), 12, false).show();
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
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new b8(zArr2, z10Var, i10, updateemojistatus, 1));
    }

    @Override // org.telegram.ui.Components.gb0
    public void m(ib0 ib0Var, int i7) {
        org.telegram.ui.Components.w3 w3Var = (org.telegram.ui.Components.w3) this.c;
        wg.f fVar = (wg.f) this.d;
        wg.g gVar = (wg.g) this.e;
        ib0 ib0Var2 = (ib0) this.f;
        try {
            w3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (ib0Var.getTag() != null && ib0Var.getTag().equals("DAY")) {
            if (ib0Var.getValue() == ib0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        ib0Var.setMinValue(ib0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i10 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i10);
                    gVar.setMinValue(i11);
                }
            } else if (ib0Var.getValue() == ib0Var.getMaxValue()) {
                fVar.setMaxValue(this.a);
                gVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (ib0Var.getTag() != null && ib0Var.getTag().equals("HOUR") && ib0Var2.getValue() == ib0Var2.getMinValue()) {
            if (ib0Var.getValue() != ib0Var.getMinValue()) {
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

    public /* synthetic */ b4(SparseIntArray sparseIntArray, int i7, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i7;
        this.b = i10;
        this.d = lVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ b4(org.telegram.ui.Components.w3 w3Var, wg.f fVar, wg.g gVar, int i7, int i10, ib0 ib0Var) {
        this.c = w3Var;
        this.d = fVar;
        this.e = gVar;
        this.a = i7;
        this.b = i10;
        this.f = ib0Var;
    }
}
