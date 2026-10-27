package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s51 b;

    public /* synthetic */ j51(s51 s51Var, int i10) {
        this.a = i10;
        this.b = s51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k71 k71Var = (k71) obj2;
                final s51 s51Var = this.b;
                String[] strArr = s51Var.i0;
                arrayList.add(u61.C(null));
                k71Var.F = 1;
                k71Var.V();
                String str = s51Var.e0;
                arrayList.add(m51.b(3, "", str != null ? g51.J(g51.N(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(q51.a(4, s51Var.a0, s51Var.k0, new ga(29, s51Var, k71Var), new z90() { // from class: org.telegram.ui.Components.k51
                    @Override // org.telegram.ui.Components.z90
                    public final void a(ClickableSpan clickableSpan) {
                        s51.Q(s51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g51.N(s51Var.f0, null, null));
                sb2.append((s51Var.g0 == 1 || strArr == null) ? "" : a1.g.s(new StringBuilder(" ("), strArr[s51Var.g0], ")"));
                arrayList.add(m51.b(5, "", g51.J(sb2.toString()), null, new i51(s51Var, 4)));
                arrayList.add(q51.a(6, s51Var.c0, false, null, new z90() { // from class: org.telegram.ui.Components.k51
                    @Override // org.telegram.ui.Components.z90
                    public final void a(ClickableSpan clickableSpan) {
                        s51.Q(s51.this, clickableSpan);
                    }
                }, null));
                k71Var.U();
                arrayList.add(u61.C(null));
                k71Var.V();
                arrayList.add(u61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                k71Var.U();
                break;
            default:
                s51.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
