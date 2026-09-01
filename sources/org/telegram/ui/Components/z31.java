package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h41 b;

    public /* synthetic */ z31(h41 h41Var, int i10) {
        this.a = i10;
        this.b = h41Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                final h41 h41Var = this.b;
                String[] strArr = h41Var.f0;
                arrayList.add(j51.B(null));
                x51Var.B = 1;
                x51Var.U();
                String str = h41Var.b0;
                arrayList.add(b41.b(3, "", str != null ? w31.y(w31.D(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(f41.a(4, h41Var.X, h41Var.h0, new sx0(3, h41Var, x51Var), new f90() { // from class: org.telegram.ui.Components.a41
                    @Override // org.telegram.ui.Components.f90
                    public final void a(ClickableSpan clickableSpan) {
                        h41.Q(h41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb = new StringBuilder();
                sb.append(w31.D(h41Var.c0, null, null));
                sb.append((h41Var.d0 == 1 || strArr == null) ? "" : android.support.v4.media.a.r(new StringBuilder(" ("), strArr[h41Var.d0], ")"));
                arrayList.add(b41.b(5, "", w31.y(sb.toString()), null, new y31(h41Var, 4)));
                arrayList.add(f41.a(6, h41Var.Z, false, null, new f90() { // from class: org.telegram.ui.Components.a41
                    @Override // org.telegram.ui.Components.f90
                    public final void a(ClickableSpan clickableSpan) {
                        h41.Q(h41.this, clickableSpan);
                    }
                }, null));
                x51Var.T();
                arrayList.add(j51.B(null));
                x51Var.U();
                arrayList.add(j51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                x51Var.T();
                break;
            default:
                h41.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
