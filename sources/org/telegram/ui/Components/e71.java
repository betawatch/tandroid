package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e71 implements g71 {
    public final View a;
    public final String b;
    public final org.telegram.utils.twidget.u c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public h71 h;
    public int n;
    public boolean r;

    public e71(org.telegram.ui.Cells.h2 h2Var, int i3, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = h2Var;
        this.d = e6Var;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder m10 = k2.p1.m(i3, "tg-widget:preview/", "/");
        m10.append(botInlineResult.query_id);
        m10.append("/");
        m10.append(botInlineResult.id);
        m10.append("/");
        m10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = m10.toString();
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
            org.telegram.utils.twidget.m mVar = new org.telegram.utils.twidget.m(sb2, i3, 0L, 0, 0L, tL_messageMediaWidget, true);
            mVar.z = true;
            concurrentHashMap2.putIfAbsent(sb2, mVar);
        }
        this.b = sb2;
        this.c = org.telegram.utils.twidget.p.i(sb2);
    }

    public final void a(int i3) {
        org.telegram.utils.twidget.u uVar = this.c;
        if (uVar == null || i3 <= 0) {
            return;
        }
        this.n = i3;
        uVar.n(i3);
        if (this.r) {
            return;
        }
        this.r = true;
        uVar.l(org.telegram.utils.twidget.i0.a(this.d, true));
        if (this.h == null) {
            this.h = new h71(this, org.telegram.messenger.g0.p);
        }
        h71 h71Var = this.h;
        if (h71Var.p != uVar) {
            h71Var.q();
            h71Var.p = uVar;
            uVar.h = h71Var;
            uVar.m(h71Var.q);
        }
        this.h.p(true);
        org.telegram.utils.twidget.p.s(uVar);
    }

    @Override // org.telegram.ui.Components.g71
    public final void h() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.g71
    public final void j() {
        View view = this.a;
        view.requestLayout();
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(boolean z10) {
    }

    @Override // org.telegram.ui.Components.g71
    public final /* synthetic */ void f(String str) {
    }

    @Override // org.telegram.ui.Components.g71
    public final /* synthetic */ void d() {
    }
}
