package gg;

import android.util.SparseIntArray;
import java.util.Calendar;
import nh.b8;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.yj0;
import rh.t3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements uc0, wj0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.a = i10;
        this.c = zArr;
        this.d = document;
        this.b = i11;
        this.e = zArr2;
        this.f = callback;
    }

    @Override // org.telegram.ui.Components.wj0
    public void a(yj0 yj0Var, int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        m2.h hVar = (m2.h) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i11 = this.b + i10;
        int i12 = this.a;
        sparseIntArray.put(i12, i11);
        if (hVar.getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        int i11 = this.a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new eg.o1((org.telegram.ui.ActionBar.p2) new t3(null), 12, false).show();
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

    @Override // org.telegram.ui.Components.uc0
    public void q(wc0 wc0Var, int i10) {
        p pVar = (p) this.c;
        n nVar = (n) this.d;
        o oVar = (o) this.e;
        wc0 wc0Var2 = (wc0) this.f;
        try {
            pVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (wc0Var.getTag() != null && wc0Var.getTag().equals("DAY")) {
            if (wc0Var.getValue() == wc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        wc0Var.setMinValue(wc0Var.getMinValue() + 1);
                        nVar.setMinValue(0);
                    } else {
                        nVar.setMinValue(i11 + 1);
                    }
                    oVar.setMinValue(0);
                } else {
                    nVar.setMinValue(i11);
                    oVar.setMinValue(i12);
                }
            } else if (wc0Var.getValue() == wc0Var.getMaxValue()) {
                nVar.setMaxValue(this.a);
                oVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                nVar.setMinValue(0);
                oVar.setMinValue(0);
                nVar.setMaxValue(23);
                oVar.setMaxValue(11);
            }
        }
        if (wc0Var.getTag() != null && wc0Var.getTag().equals("HOUR") && wc0Var2.getValue() == wc0Var2.getMinValue()) {
            if (wc0Var.getValue() != wc0Var.getMinValue()) {
                oVar.setMinValue(0);
                oVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i13 = (calendar2.get(12) / 5) + 1;
            if (i13 > 11) {
                oVar.setMinValue(0);
            } else {
                oVar.setMinValue(i13);
            }
        }
    }

    public /* synthetic */ d(SparseIntArray sparseIntArray, int i10, int i11, m2.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i10;
        this.b = i11;
        this.d = hVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ d(p pVar, n nVar, o oVar, int i10, int i11, wc0 wc0Var) {
        this.c = pVar;
        this.d = nVar;
        this.e = oVar;
        this.a = i10;
        this.b = i11;
        this.f = wc0Var;
    }
}
