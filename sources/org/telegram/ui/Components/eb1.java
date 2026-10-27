package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class eb1 implements tb1 {
    public final View a;
    public final String b;
    public final nb1 c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public ub1 h;
    public int n;
    public boolean r;

    public eb1(org.telegram.ui.Cells.d2 d2Var, int i10, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = d2Var;
        this.d = u6Var;
        ConcurrentHashMap concurrentHashMap = jb1.a;
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder k10 = ic.a.k(i10, "tg-widget:preview/", "/");
        k10.append(botInlineResult.query_id);
        k10.append("/");
        k10.append(botInlineResult.id);
        k10.append("/");
        k10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = k10.toString();
        ConcurrentHashMap concurrentHashMap2 = jb1.a;
        if (!concurrentHashMap2.containsKey(sb2)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            gb1 gb1Var = new gb1(sb2, i10, 0L, 0, tL_messageMediaWidget, true);
            gb1Var.y = true;
            concurrentHashMap2.putIfAbsent(sb2, gb1Var);
        }
        this.b = sb2;
        this.c = jb1.i(sb2);
    }

    @Override // org.telegram.ui.Components.tb1
    public final void d() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.tb1
    public final void e() {
        View view = this.a;
        view.requestLayout();
        view.invalidate();
    }

    public final void f(int i10) {
        nb1 nb1Var = this.c;
        if (nb1Var == null || i10 <= 0) {
            return;
        }
        this.n = i10;
        nb1Var.q(i10);
        if (this.r) {
            return;
        }
        this.r = true;
        nb1Var.o(ec1.a(this.d, true));
        if (this.h == null) {
            this.h = new ub1(this, AndroidUtilities.density);
        }
        ub1 ub1Var = this.h;
        if (ub1Var.p != nb1Var) {
            ub1Var.q();
            ub1Var.p = nb1Var;
            nb1Var.h = ub1Var;
            nb1Var.p(ub1Var.q);
        }
        this.h.p(true);
        jb1.r(nb1Var);
    }

    @Override // org.telegram.ui.Components.tb1
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.tb1
    public final void a(boolean z10) {
    }

    @Override // org.telegram.ui.Components.tb1
    public final /* synthetic */ void c(String str) {
    }
}
