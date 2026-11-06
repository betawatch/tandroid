package hi;

import android.util.SparseIntArray;
import di.i8;
import java.util.Calendar;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements org.telegram.ui.ActionBar.r1, ph0, fb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g4(int i7, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, c20 c20Var) {
        this.a = i7;
        this.c = zArr;
        this.e = document;
        this.b = i10;
        this.d = zArr2;
        this.f = c20Var;
    }

    @Override // org.telegram.ui.Components.ph0
    public void b(rh0 rh0Var, int i7) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        c5.k kVar = (c5.k) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i10 = this.b + i7;
        int i11 = this.a;
        sparseIntArray.put(i11, i10);
        if (kVar.getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        c20 c20Var = (c20) this.f;
        int i10 = this.a;
        if (!p10.i(i10).q()) {
            new ug.w0((org.telegram.ui.ActionBar.f2) new k4(null), 12, false).show();
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
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new i8(zArr2, c20Var, i10, updateemojistatus, 1));
    }

    @Override // org.telegram.ui.Components.fb0
    public void n(hb0 hb0Var, int i7) {
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.c;
        wg.f fVar = (wg.f) this.d;
        wg.g gVar = (wg.g) this.e;
        hb0 hb0Var2 = (hb0) this.f;
        try {
            y3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (hb0Var.getTag() != null && hb0Var.getTag().equals("DAY")) {
            if (hb0Var.getValue() == hb0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        hb0Var.setMinValue(hb0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i10 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i10);
                    gVar.setMinValue(i11);
                }
            } else if (hb0Var.getValue() == hb0Var.getMaxValue()) {
                fVar.setMaxValue(this.a);
                gVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (hb0Var.getTag() != null && hb0Var.getTag().equals("HOUR") && hb0Var2.getValue() == hb0Var2.getMinValue()) {
            if (hb0Var.getValue() != hb0Var.getMinValue()) {
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

    public /* synthetic */ g4(SparseIntArray sparseIntArray, int i7, int i10, c5.k kVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i7;
        this.b = i10;
        this.d = kVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ g4(org.telegram.ui.Components.y3 y3Var, wg.f fVar, wg.g gVar, int i7, int i10, hb0 hb0Var) {
        this.c = y3Var;
        this.d = fVar;
        this.e = gVar;
        this.a = i7;
        this.b = i10;
        this.f = hb0Var;
    }
}
