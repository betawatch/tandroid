package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class m71 implements o71 {
    public final View a;
    public final String b;
    public final org.telegram.utils.twidget.u c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public p71 h;
    public int n;
    public boolean r;

    public m71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = h2Var;
        this.d = f6Var;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder n10 = jg.g.n(i7, "tg-widget:preview/", "/");
        n10.append(botInlineResult.query_id);
        n10.append("/");
        n10.append(botInlineResult.id);
        n10.append("/");
        n10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = n10.toString();
        ConcurrentHashMap concurrentHashMap2 = org.telegram.utils.twidget.p.a;
        if (!concurrentHashMap2.containsKey(sb2)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            org.telegram.utils.twidget.m mVar = new org.telegram.utils.twidget.m(sb2, i7, 0L, 0, 0L, tL_messageMediaWidget, true);
            mVar.z = true;
            concurrentHashMap2.putIfAbsent(sb2, mVar);
        }
        this.b = sb2;
        this.c = org.telegram.utils.twidget.p.i(sb2);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.u uVar = this.c;
        if (uVar == null || i7 <= 0) {
            return;
        }
        this.n = i7;
        uVar.n(i7);
        if (this.r) {
            return;
        }
        this.r = true;
        uVar.l(org.telegram.utils.twidget.i0.a(this.d, true));
        if (this.h == null) {
            this.h = new p71(this, org.telegram.messenger.g0.p);
        }
        p71 p71Var = this.h;
        if (p71Var.p != uVar) {
            p71Var.q();
            p71Var.p = uVar;
            uVar.h = p71Var;
            uVar.m(p71Var.q);
        }
        this.h.p(true);
        org.telegram.utils.twidget.p.s(uVar);
    }

    @Override // org.telegram.ui.Components.o71
    public final void h() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.o71
    public final void j() {
        View view = this.a;
        view.requestLayout();
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(boolean z9) {
    }

    @Override // org.telegram.ui.Components.o71
    public final /* synthetic */ void f(String str) {
    }

    @Override // org.telegram.ui.Components.o71
    public final /* synthetic */ void d() {
    }
}
