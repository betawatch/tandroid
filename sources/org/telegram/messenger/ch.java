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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class ch implements k9, Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.r1, wt0, w10, ht0, b20, jh.i, bj0, lt0, mt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ch(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // jh.i
    public void b(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.a) {
            case 17:
                if (num.intValue() == 0) {
                    return id.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return id.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
        switch (this.a) {
            case 2:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i7, z9);
            case 3:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i7, z9);
            case 4:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i7, z9);
            case 5:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i7, z9);
            case 6:
            case 7:
            case 8:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i7, z9);
            case 9:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i7, z9);
        }
    }

    @Override // org.telegram.ui.Components.mt0
    public void f(Object obj, float f10) {
        org.telegram.ui.dr drVar = (org.telegram.ui.dr) obj;
        switch (this.a) {
            case 26:
                drVar.G1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                drVar.H1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 11:
                int i10 = iz.a;
                break;
            case 14:
                u1Var.dismiss();
                break;
            case 18:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.lt0
    public float get(Object obj) {
        org.telegram.ui.dr drVar = (org.telegram.ui.dr) obj;
        switch (this.a) {
            case 25:
                return drVar.G1;
            case 26:
            default:
                return drVar.I1;
            case 27:
                return drVar.H1;
        }
    }

    @Override // org.telegram.ui.Components.ht0
    public /* synthetic */ float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        switch (this.a) {
            case 0:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override // org.telegram.ui.Components.ht0
    public RecyclerView l(View view) {
        return ((org.telegram.ui.td) view).a;
    }

    @Override // org.telegram.ui.Components.wt0
    public void m(int i7) {
        if (i7 == 0) {
            iz.A(3);
            return;
        }
        if (i7 == 1) {
            iz.A(0);
        } else if (i7 == 2) {
            iz.A(1);
        } else if (i7 == 3) {
            iz.A(2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        iz.j = SystemClock.elapsedRealtime();
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
        iz.h = "__FIREBASE_FAILED__";
        PushListenerController.sendRegistrationToServer(2, null);
    }

    @Override // org.telegram.ui.Components.ht0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public /* synthetic */ ch(Object obj, int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.wt0
    public /* synthetic */ void n() {
    }
}
