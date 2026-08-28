package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ c31(k31 k31Var, int i9) {
        this.a = i9;
        this.b = k31Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                final k31 k31Var = this.b;
                String[] strArr = k31Var.e0;
                arrayList.add(l41.B(null));
                z41Var.A = 1;
                z41Var.U();
                String str = k31Var.a0;
                arrayList.add(e31.b(3, "", str != null ? z21.y(z21.D(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(i31.a(4, k31Var.W, k31Var.g0, new vh0(5, k31Var, z41Var), new k80() { // from class: org.telegram.ui.Components.d31
                    @Override // org.telegram.ui.Components.k80
                    public final void a(ClickableSpan clickableSpan) {
                        k31.P(k31.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z21.D(k31Var.b0, null, null));
                sb2.append((k31Var.c0 == 1 || strArr == null) ? "" : aa.d.r(new StringBuilder(" ("), strArr[k31Var.c0], ")"));
                arrayList.add(e31.b(5, "", z21.y(sb2.toString()), null, new b31(k31Var, 4)));
                arrayList.add(i31.a(6, k31Var.Y, false, null, new k80() { // from class: org.telegram.ui.Components.d31
                    @Override // org.telegram.ui.Components.k80
                    public final void a(ClickableSpan clickableSpan) {
                        k31.P(k31.this, clickableSpan);
                    }
                }, null));
                z41Var.T();
                arrayList.add(l41.B(null));
                z41Var.U();
                arrayList.add(l41.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                z41Var.T();
                break;
            default:
                k31.Q(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
