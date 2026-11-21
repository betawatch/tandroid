package org.telegram.messenger;

import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class ed implements i9, Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.q1, gu0, r10, rt0, w10, jh.i, pj0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ed(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // jh.i
    public void d(View view, RectF rectF) {
        view.invalidate();
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        switch (this.a) {
            case 7:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i7, z10);
            case 8:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i7, z10);
            case 9:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i7, z10);
            case 10:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i7, z10);
            case 11:
            case 12:
            case 13:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i7, z10);
            case 14:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    @Override // org.telegram.messenger.r10
    public Object g(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.a) {
            case 22:
                if (num.intValue() == 0) {
                    return gd.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return gd.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 16:
                int i10 = bz.a;
                break;
            case 19:
                t1Var.dismiss();
                break;
            case 23:
                t1Var.dismiss();
                break;
            default:
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rt0
    public /* synthetic */ float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.gu0
    public void k(int i7) {
        if (i7 == 0) {
            bz.A(3);
            return;
        }
        if (i7 == 1) {
            bz.A(0);
        } else if (i7 == 2) {
            bz.A(1);
        } else if (i7 == 3) {
            bz.A(2);
        }
    }

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        switch (this.a) {
            case 3:
                return new TLRPC.TL_messageEntityBold();
            case 4:
                return new TLRPC.TL_messageEntityItalic();
            case 5:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override // org.telegram.ui.Components.rt0
    public RecyclerView n(View view) {
        return ((org.telegram.ui.rd) view).a;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        bz.j = SystemClock.elapsedRealtime();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PushListenerController.sendRegistrationToServer(2, str);
            return;
        }
        if (s2.a) {
            a8.b("Failed to get regid");
        }
        bz.h = "__FIREBASE_FAILED__";
        PushListenerController.sendRegistrationToServer(2, null);
    }

    @Override // org.telegram.ui.Components.rt0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    public /* synthetic */ ed(Object obj, int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.gu0
    public /* synthetic */ void o() {
    }
}
