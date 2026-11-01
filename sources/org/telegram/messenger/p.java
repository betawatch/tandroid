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
import org.telegram.ui.wh0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements org.telegram.ui.ActionBar.u1, RequestTimeDelegate, hp, wh0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.hp
    public boolean a(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        if (aVar != null) {
            aVar.accept(user);
        }
        return tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text);
    }

    @Override // org.telegram.ui.wh0
    public void d(Canvas canvas) {
        ov ovVar = (ov) this.b;
        View view = (View) this.c;
        vv vvVar = ovVar.W;
        AtomicReference atomicReference = vvVar.D;
        StaticLayout staticLayout = vvVar.b;
        ArrayList arrayList = vvVar.x;
        nh.i.g(view, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, vvVar.b, vvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    ((org.telegram.ui.ActionBar.k2) this.c).getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
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
    public void run(long j10) {
        i0.g3(new d4((boolean[]) this.b, j10, (org.telegram.ui.Components.ec[]) this.c, 10));
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        rz rzVar = (rz) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        i0.g3(new jx(rzVar, message, message.id, 1));
    }
}
