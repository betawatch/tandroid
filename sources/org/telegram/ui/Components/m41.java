package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class m41 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u41 b;

    public /* synthetic */ m41(u41 u41Var, int i10) {
        this.a = i10;
        this.b = u41Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k61 k61Var = (k61) obj2;
                final u41 u41Var = this.b;
                String[] strArr = u41Var.i0;
                arrayList.add(w51.B(null));
                k61Var.E = 1;
                k61Var.U();
                String str = u41Var.e0;
                arrayList.add(o41.b(3, "", str != null ? j41.y(j41.E(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(s41.a(4, u41Var.a0, u41Var.k0, new dt(18, u41Var, k61Var), new j90() { // from class: org.telegram.ui.Components.n41
                    @Override // org.telegram.ui.Components.j90
                    public final void a(ClickableSpan clickableSpan) {
                        u41.Q(u41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j41.E(u41Var.f0, null, null));
                sb2.append((u41Var.g0 == 1 || strArr == null) ? "" : a4.a.s(new StringBuilder(" ("), strArr[u41Var.g0], ")"));
                arrayList.add(o41.b(5, "", j41.y(sb2.toString()), null, new l41(u41Var, 4)));
                arrayList.add(s41.a(6, u41Var.c0, false, null, new j90() { // from class: org.telegram.ui.Components.n41
                    @Override // org.telegram.ui.Components.j90
                    public final void a(ClickableSpan clickableSpan) {
                        u41.Q(u41.this, clickableSpan);
                    }
                }, null));
                k61Var.T();
                arrayList.add(w51.B(null));
                k61Var.U();
                arrayList.add(w51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                k61Var.T();
                break;
            default:
                u41.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
