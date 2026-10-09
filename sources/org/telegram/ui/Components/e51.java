package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e51 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m51 b;

    public /* synthetic */ e51(m51 m51Var, int i10) {
        this.a = i10;
        this.b = m51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var = (c71) obj2;
                final m51 m51Var = this.b;
                String[] strArr = m51Var.i0;
                arrayList.add(p61.B(null));
                c71Var.E = 1;
                c71Var.U();
                String str = m51Var.e0;
                arrayList.add(g51.b(3, "", str != null ? b51.B(b51.F(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(k51.a(4, m51Var.a0, m51Var.k0, new ut(18, m51Var, c71Var), new da0() { // from class: org.telegram.ui.Components.f51
                    @Override // org.telegram.ui.Components.da0
                    public final void a(ClickableSpan clickableSpan) {
                        m51.R(m51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b51.F(m51Var.f0, null, null));
                sb2.append((m51Var.g0 == 1 || strArr == null) ? "" : a1.g.t(new StringBuilder(" ("), strArr[m51Var.g0], ")"));
                arrayList.add(g51.b(5, "", b51.B(sb2.toString()), null, new d51(m51Var, 4)));
                arrayList.add(k51.a(6, m51Var.c0, false, null, new da0() { // from class: org.telegram.ui.Components.f51
                    @Override // org.telegram.ui.Components.da0
                    public final void a(ClickableSpan clickableSpan) {
                        m51.R(m51.this, clickableSpan);
                    }
                }, null));
                c71Var.T();
                arrayList.add(p61.B(null));
                c71Var.U();
                arrayList.add(p61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                c71Var.T();
                break;
            default:
                m51.S(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
