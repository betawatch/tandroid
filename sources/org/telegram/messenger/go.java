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
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class go implements Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.p1, tt0, o10, et0, t10, kh.i, ej0, it0, jt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ go(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // org.telegram.ui.Components.jt0
    public void c(Object obj, float f10) {
        org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj;
        switch (this.a) {
            case 23:
                zqVar.H1 = f10;
                if (zqVar.getParent() != null) {
                    ((View) zqVar.getParent()).invalidate();
                    break;
                }
                break;
            case 24:
            case 26:
            default:
                zqVar.K1 = f10;
                if (zqVar.getParent() != null) {
                    ((View) zqVar.getParent()).invalidate();
                    break;
                }
                break;
            case 25:
                zqVar.I1 = f10;
                if (zqVar.getParent() != null) {
                    ((View) zqVar.getParent()).invalidate();
                    break;
                }
                break;
            case 27:
                zqVar.J1 = f10;
                if (zqVar.getParent() != null) {
                    ((View) zqVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.a) {
            case 14:
                if (num.intValue() == 0) {
                    return bd.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return bd.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
        switch (this.a) {
            case 0:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i3, z10);
            case 1:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i3, z10);
            case 2:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i3, z10);
            case 3:
            case 4:
            case 5:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i3, z10);
            case 6:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i3, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 8:
                int i10 = az.a;
                break;
            case 11:
                s1Var.dismiss();
                break;
            case 15:
                s1Var.dismiss();
                break;
            default:
                s1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.it0
    public float get(Object obj) {
        org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj;
        switch (this.a) {
            case 22:
                return zqVar.H1;
            case 23:
            case 25:
            default:
                return zqVar.K1;
            case 24:
                return zqVar.I1;
            case 26:
                return zqVar.J1;
        }
    }

    @Override // org.telegram.ui.Components.et0
    public /* synthetic */ float i(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // kh.i
    public void k(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.tt0
    public void l(int i3) {
        if (i3 == 0) {
            az.A(3);
            return;
        }
        if (i3 == 1) {
            az.A(0);
        } else if (i3 == 2) {
            az.A(1);
        } else if (i3 == 3) {
            az.A(2);
        }
    }

    @Override // org.telegram.ui.Components.et0
    public RecyclerView m(View view) {
        return ((org.telegram.ui.rd) view).a;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        az.j = SystemClock.elapsedRealtime();
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
        az.h = "__FIREBASE_FAILED__";
        PushListenerController.sendRegistrationToServer(2, null);
    }

    @Override // org.telegram.ui.Components.et0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public /* synthetic */ go(Object obj, int i3) {
        this.a = i3;
    }

    @Override // org.telegram.ui.Components.tt0
    public /* synthetic */ void p() {
    }
}
