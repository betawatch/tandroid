package bg;

import android.util.SparseIntArray;
import ih.f8;
import java.util.Calendar;
import mh.m4;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.zb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements zb0, org.telegram.ui.ActionBar.b2, cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i9, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, Utilities.Callback callback) {
        this.a = i9;
        this.c = zArr;
        this.d = document;
        this.b = i10;
        this.e = zArr2;
        this.f = callback;
    }

    @Override // org.telegram.ui.Components.cj0
    public void a(ej0 ej0Var, int i9) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        m2.g gVar = (m2.g) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i10 = this.b + i9;
        int i11 = this.a;
        sparseIntArray.put(i11, i10);
        if (gVar.getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        int i10 = this.a;
        if (!UserConfig.getInstance(i10).isPremium()) {
            new zf.x0((org.telegram.ui.ActionBar.o2) new m4(null), 12, false).show();
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
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new f8(zArr2, callback, i10, updateemojistatus, 1));
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(bc0 bc0Var, int i9) {
        s sVar = (s) this.c;
        q qVar = (q) this.d;
        r rVar = (r) this.e;
        bc0 bc0Var2 = (bc0) this.f;
        try {
            sVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (bc0Var.getTag() != null && bc0Var.getTag().equals("DAY")) {
            if (bc0Var.getValue() == bc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        bc0Var.setMinValue(bc0Var.getMinValue() + 1);
                        qVar.setMinValue(0);
                    } else {
                        qVar.setMinValue(i10 + 1);
                    }
                    rVar.setMinValue(0);
                } else {
                    qVar.setMinValue(i10);
                    rVar.setMinValue(i11);
                }
            } else if (bc0Var.getValue() == bc0Var.getMaxValue()) {
                qVar.setMaxValue(this.a);
                rVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                qVar.setMinValue(0);
                rVar.setMinValue(0);
                qVar.setMaxValue(23);
                rVar.setMaxValue(11);
            }
        }
        if (bc0Var.getTag() != null && bc0Var.getTag().equals("HOUR") && bc0Var2.getValue() == bc0Var2.getMinValue()) {
            if (bc0Var.getValue() != bc0Var.getMinValue()) {
                rVar.setMinValue(0);
                rVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i12 = (calendar2.get(12) / 5) + 1;
            if (i12 > 11) {
                rVar.setMinValue(0);
            } else {
                rVar.setMinValue(i12);
            }
        }
    }

    public /* synthetic */ g(SparseIntArray sparseIntArray, int i9, int i10, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i9;
        this.b = i10;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ g(s sVar, q qVar, r rVar, int i9, int i10, bc0 bc0Var) {
        this.c = sVar;
        this.d = qVar;
        this.e = rVar;
        this.a = i9;
        this.b = i10;
        this.f = bc0Var;
    }
}
