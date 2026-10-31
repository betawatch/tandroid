package org.telegram.messenger;

import android.graphics.BlendMode;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements l9, Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.u1, xu0 {
    public final /* synthetic */ int a;

    public /* synthetic */ e9(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ BlendMode b(Object obj) {
        return (BlendMode) obj;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.a) {
            case 16:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i10, z10);
            case 17:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i10, z10);
            case 18:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i10, z10);
            case 19:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i10, z10);
            case 20:
            case 21:
            case 22:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i10, z10);
            case 23:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 25:
                int i11 = tz.a;
                break;
            default:
                x1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        switch (this.a) {
            case 12:
                return new TLRPC.TL_messageEntityBold();
            case 13:
                return new TLRPC.TL_messageEntityItalic();
            case 14:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public void m(int i10) {
        if (i10 == 0) {
            tz.A(3);
            return;
        }
        if (i10 == 1) {
            tz.A(0);
        } else if (i10 == 2) {
            tz.A(1);
        } else if (i10 == 3) {
            tz.A(2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        tz.j = SystemClock.elapsedRealtime();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PushListenerController.sendRegistrationToServer(2, str);
            return;
        }
        if (v2.a) {
            f8.b("Failed to get regid");
        }
        tz.h = "__FIREBASE_FAILED__";
        PushListenerController.sendRegistrationToServer(2, null);
    }

    public /* synthetic */ e9(eu euVar) {
        this.a = 22;
    }

    @Override // org.telegram.ui.Components.xu0
    public /* synthetic */ void s() {
    }
}
