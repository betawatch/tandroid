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
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements org.telegram.ui.ActionBar.q1, RequestTimeDelegate, yo, xg0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.xg0
    public void a(Canvas canvas) {
        xu xuVar = (xu) this.b;
        View view = (View) this.c;
        ev evVar = xuVar.X;
        AtomicReference atomicReference = evVar.E;
        StaticLayout staticLayout = evVar.b;
        ArrayList arrayList = evVar.x;
        xh.f.g(view, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, evVar.b, evVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // org.telegram.messenger.yo
    public boolean e(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        if (aVar != null) {
            aVar.accept(user);
        }
        return tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    ((org.telegram.ui.ActionBar.g2) this.c).getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                zf zfVar = (zf) this.c;
                sharedPreferences.edit().putBoolean("proxycheckstatusip", true).apply();
                zfVar.run();
                break;
        }
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        g0.g3(new d4((boolean[]) this.b, j3, (org.telegram.ui.Components.nc[]) this.c, 10));
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        az azVar = (az) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        g0.g3(new qw(azVar, message, message.id, 1));
    }
}
