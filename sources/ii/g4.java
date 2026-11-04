package ii;

import android.util.SparseIntArray;
import ei.i8;
import java.util.Calendar;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.uh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g4 implements org.telegram.ui.ActionBar.p1, sh0, ab0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g4(int i3, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, u10 u10Var) {
        this.a = i3;
        this.c = zArr;
        this.e = document;
        this.b = i10;
        this.d = zArr2;
        this.f = u10Var;
    }

    @Override // org.telegram.ui.Components.sh0
    public void c(uh0 uh0Var, int i3) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        b5.l lVar = (b5.l) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i10 = this.b + i3;
        int i11 = this.a;
        sparseIntArray.put(i11, i10);
        if (lVar.getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        u10 u10Var = (u10) this.f;
        int i10 = this.a;
        if (!h10.i(i10).q()) {
            new vg.v0((org.telegram.ui.ActionBar.d2) new k4(null), 12, false).show();
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
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new i8(zArr2, u10Var, i10, updateemojistatus, 1));
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        org.telegram.ui.Components.w3 w3Var = (org.telegram.ui.Components.w3) this.c;
        xg.h hVar = (xg.h) this.d;
        xg.i iVar = (xg.i) this.e;
        cb0 cb0Var2 = (cb0) this.f;
        try {
            w3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (cb0Var.getTag() != null && cb0Var.getTag().equals("DAY")) {
            if (cb0Var.getValue() == cb0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        cb0Var.setMinValue(cb0Var.getMinValue() + 1);
                        hVar.setMinValue(0);
                    } else {
                        hVar.setMinValue(i10 + 1);
                    }
                    iVar.setMinValue(0);
                } else {
                    hVar.setMinValue(i10);
                    iVar.setMinValue(i11);
                }
            } else if (cb0Var.getValue() == cb0Var.getMaxValue()) {
                hVar.setMaxValue(this.a);
                iVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                hVar.setMinValue(0);
                iVar.setMinValue(0);
                hVar.setMaxValue(23);
                iVar.setMaxValue(11);
            }
        }
        if (cb0Var.getTag() != null && cb0Var.getTag().equals("HOUR") && cb0Var2.getValue() == cb0Var2.getMinValue()) {
            if (cb0Var.getValue() != cb0Var.getMinValue()) {
                iVar.setMinValue(0);
                iVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i12 = (calendar2.get(12) / 5) + 1;
            if (i12 > 11) {
                iVar.setMinValue(0);
            } else {
                iVar.setMinValue(i12);
            }
        }
    }

    public /* synthetic */ g4(SparseIntArray sparseIntArray, int i3, int i10, b5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i3;
        this.b = i10;
        this.d = lVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ g4(org.telegram.ui.Components.w3 w3Var, xg.h hVar, xg.i iVar, int i3, int i10, cb0 cb0Var) {
        this.c = w3Var;
        this.d = hVar;
        this.e = iVar;
        this.a = i3;
        this.b = i10;
        this.f = cb0Var;
    }
}
