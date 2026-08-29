package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n31 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ n31(v31 v31Var, int i10) {
        this.a = i10;
        this.b = v31Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                final v31 v31Var = this.b;
                String[] strArr = v31Var.e0;
                arrayList.add(w41.B(null));
                k51Var.A = 1;
                k51Var.U();
                String str = v31Var.a0;
                arrayList.add(p31.b(3, "", str != null ? k31.y(k31.D(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(t31.a(4, v31Var.W, v31Var.g0, new fi0(6, v31Var, k51Var), new x80() { // from class: org.telegram.ui.Components.o31
                    @Override // org.telegram.ui.Components.x80
                    public final void a(ClickableSpan clickableSpan) {
                        v31.Q(v31.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k31.D(v31Var.b0, null, null));
                sb2.append((v31Var.c0 == 1 || strArr == null) ? "" : a4.w.q(new StringBuilder(" ("), strArr[v31Var.c0], ")"));
                arrayList.add(p31.b(5, "", k31.y(sb2.toString()), null, new m31(v31Var, 4)));
                arrayList.add(t31.a(6, v31Var.Y, false, null, new x80() { // from class: org.telegram.ui.Components.o31
                    @Override // org.telegram.ui.Components.x80
                    public final void a(ClickableSpan clickableSpan) {
                        v31.Q(v31.this, clickableSpan);
                    }
                }, null));
                k51Var.T();
                arrayList.add(w41.B(null));
                k51Var.U();
                arrayList.add(w41.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                k51Var.T();
                break;
            default:
                v31.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
