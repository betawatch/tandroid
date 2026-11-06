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
import org.telegram.ui.sg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements org.telegram.ui.ActionBar.r1, RequestTimeDelegate, bp, sg0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        if (aVar != null) {
            aVar.accept(user);
        }
        return tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text);
    }

    @Override // org.telegram.ui.sg0
    public void d(Canvas canvas) {
        cv cvVar = (cv) this.b;
        View view = (View) this.c;
        jv jvVar = cvVar.W;
        AtomicReference atomicReference = jvVar.D;
        StaticLayout staticLayout = jvVar.b;
        ArrayList arrayList = jvVar.x;
        xh.f.g(view, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, jvVar.b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    ((org.telegram.ui.ActionBar.f2) this.c).getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                ng ngVar = (ng) this.c;
                sharedPreferences.edit().putBoolean("proxycheckstatusip", true).apply();
                ngVar.run();
                break;
        }
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        g0.h3(new a4((boolean[]) this.b, j3, (org.telegram.ui.Components.jc[]) this.c, 10));
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        gz gzVar = (gz) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        g0.h3(new xw(gzVar, message, message.id, 1));
    }
}
