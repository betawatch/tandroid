package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.b6;
import org.telegram.messenger.f8;
import org.telegram.messenger.v2;
import org.telegram.messenger.w0;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.xj;
import org.telegram.ui.qq;
import p4.t0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((x9.l) this.b).d).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        switch (this.a) {
            case 0:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((g) this.b).dismiss();
                    return;
                }
                return;
            case 1:
                ((Executor) ((e2.w) this.b).c).execute(new d1.e(9, this, context));
                return;
            case 2:
                ((g.o) this.b).k();
                return;
            case 3:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            case 4:
                if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("source_id");
                    intent.getIntExtra("action_id", -1);
                    ArrayList arrayList = (ArrayList) ((jf.c) this.b).c.get(stringExtra);
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        throw a1.g.h(it);
                    }
                    return;
                }
                return;
            case 5:
                k2.e eVar = (k2.e) this.b;
                if (isInitialStickyBroadcast()) {
                    return;
                }
                eVar.b(k2.b.b(context, intent, eVar.j, eVar.i, eVar.a()));
                return;
            case 6:
                m4.b bVar = (m4.b) this.b;
                bVar.c.execute(new m4.a(bVar, 2));
                return;
            case 7:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((n4.f) ((n4.u) ((m4.p0) this.b).n.b).a).a.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 8:
                ((b6) this.b).g();
                return;
            case 9:
                if (v2.a) {
                    f8.b("file system changed");
                }
                org.telegram.messenger.a aVar = new org.telegram.messenger.a(this, 11);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    org.telegram.messenger.i0.h3(aVar, 1000L);
                    return;
                } else {
                    aVar.run();
                    return;
                }
            case 10:
                w0.d.post(new org.telegram.messenger.a(this, 13));
                return;
            case 11:
                tf tfVar = new tf(this, 24);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((xj) this.b).r.postDelayed(tfVar, 1000L);
                    return;
                } else {
                    tfVar.run();
                    return;
                }
            case 12:
                org.telegram.messenger.i0.g3(new qq(this, intent.getStringExtra("mode") != null ? intent.getStringExtra("mode") : "toggle", intent.getStringExtra("style") != null ? intent.getStringExtra("style") : "reveal", 20));
                return;
            case 13:
                ((t0) this.b).c();
                return;
            default:
                x9.l lVar = (x9.l) this.b;
                if (lVar != null && lVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    x9.l lVar2 = (x9.l) this.b;
                    ((FirebaseMessaging) lVar2.d).getClass();
                    FirebaseMessaging.b(lVar2, 0L);
                    ((FirebaseMessaging) ((x9.l) this.b).d).b.unregisterReceiver(this);
                    this.b = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
