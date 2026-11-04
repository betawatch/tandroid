package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.StaticLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements org.telegram.ui.ActionBar.p1, RequestTimeDelegate, so, mg0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.so
    public boolean a(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        if (aVar != null) {
            aVar.accept(user);
        }
        return tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text);
    }

    @Override // org.telegram.ui.mg0
    public void d(Canvas canvas) {
        uu uuVar = (uu) this.b;
        View view = (View) this.c;
        bv bvVar = uuVar.X;
        AtomicReference atomicReference = bvVar.E;
        StaticLayout staticLayout = bvVar.b;
        ArrayList arrayList = bvVar.x;
        yh.f.g(view, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar.b, bvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    ((org.telegram.ui.ActionBar.d2) this.c).getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                fg fgVar = (fg) this.c;
                sharedPreferences.edit().putBoolean("proxycheckstatusip", true).apply();
                fgVar.run();
                break;
        }
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        g0.h3(new a4((boolean[]) this.b, j10, (org.telegram.ui.Components.hc[]) this.c, 10));
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        yy yyVar = (yy) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        g0.h3(new pw(yyVar, message, message.id, 1));
    }
}
