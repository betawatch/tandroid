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
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.vt0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class fd implements j9, Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.q1, vt0, t10, gt0, y10, jh.i, fj0, kt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ fd(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.a) {
            case 21:
                if (num.intValue() == 0) {
                    return hd.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return hd.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        switch (this.a) {
            case 6:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i7, z10);
            case 7:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i7, z10);
            case 8:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i7, z10);
            case 9:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i7, z10);
            case 10:
            case 11:
            case 12:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i7, z10);
            case 13:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    @Override // org.telegram.ui.Components.kt0
    public float get(Object obj) {
        return ((org.telegram.ui.dr) obj).M1;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 15:
                int i10 = gz.a;
                break;
            case 18:
                t1Var.dismiss();
                break;
            case 22:
                t1Var.dismiss();
                break;
            default:
                t1Var.dismiss();
                break;
        }
    }

    @Override // jh.i
    public void j(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.gt0
    public /* synthetic */ float k(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.y0.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.vt0
    public void l(int i7) {
        if (i7 == 0) {
            gz.A(3);
            return;
        }
        if (i7 == 1) {
            gz.A(0);
        } else if (i7 == 2) {
            gz.A(1);
        } else if (i7 == 3) {
            gz.A(2);
        }
    }

    @Override // org.telegram.ui.Components.gt0
    public RecyclerView n(View view) {
        return ((org.telegram.ui.rd) view).a;
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        switch (this.a) {
            case 2:
                return new TLRPC.TL_messageEntityBold();
            case 3:
                return new TLRPC.TL_messageEntityItalic();
            case 4:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        gz.j = SystemClock.elapsedRealtime();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PushListenerController.sendRegistrationToServer(2, str);
            return;
        }
        if (r2.a) {
            a8.b("Failed to get regid");
        }
        gz.h = "__FIREBASE_FAILED__";
        PushListenerController.sendRegistrationToServer(2, null);
    }

    @Override // org.telegram.ui.Components.gt0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.y0.b(recyclerView);
    }

    public /* synthetic */ fd(Object obj, int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void p() {
    }
}
