package ei;

import ai.za;
import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.sc0;
import org.telegram.ui.Components.uc0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements org.telegram.ui.ActionBar.b2, oj0, sc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.a = i10;
        this.c = zArr;
        this.e = document;
        this.b = i11;
        this.d = zArr2;
        this.f = callback;
    }

    @Override // org.telegram.ui.Components.oj0
    public void a(qj0 qj0Var, int i10) {
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

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        int i11 = this.a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new rg.x0((org.telegram.ui.ActionBar.o2) new y4(null), 12, false).show();
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
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new za(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(uc0 uc0Var, int i10) {
        org.telegram.ui.Components.a4 a4Var = (org.telegram.ui.Components.a4) this.c;
        tg.i iVar = (tg.i) this.d;
        tg.j jVar = (tg.j) this.e;
        uc0 uc0Var2 = (uc0) this.f;
        try {
            a4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (uc0Var.getTag() != null && uc0Var.getTag().equals("DAY")) {
            if (uc0Var.getValue() == uc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        uc0Var.setMinValue(uc0Var.getMinValue() + 1);
                        iVar.setMinValue(0);
                    } else {
                        iVar.setMinValue(i11 + 1);
                    }
                    jVar.setMinValue(0);
                } else {
                    iVar.setMinValue(i11);
                    jVar.setMinValue(i12);
                }
            } else if (uc0Var.getValue() == uc0Var.getMaxValue()) {
                iVar.setMaxValue(this.a);
                jVar.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                iVar.setMinValue(0);
                jVar.setMinValue(0);
                iVar.setMaxValue(23);
                jVar.setMaxValue(11);
            }
        }
        if (uc0Var.getTag() != null && uc0Var.getTag().equals("HOUR") && uc0Var2.getValue() == uc0Var2.getMinValue()) {
            if (uc0Var.getValue() != uc0Var.getMinValue()) {
                jVar.setMinValue(0);
                jVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i13 = (calendar2.get(12) / 5) + 1;
            if (i13 > 11) {
                jVar.setMinValue(0);
            } else {
                jVar.setMinValue(i13);
            }
        }
    }

    public /* synthetic */ u4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i10;
        this.b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }

    public /* synthetic */ u4(org.telegram.ui.Components.a4 a4Var, tg.i iVar, tg.j jVar, int i10, int i11, uc0 uc0Var) {
        this.c = a4Var;
        this.d = iVar;
        this.e = jVar;
        this.a = i10;
        this.b = i11;
        this.f = uc0Var;
    }
}
