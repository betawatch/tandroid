package ni;

import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import com.google.android.gms.internal.play_billing.s0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i10;
        this.c = j10;
        this.d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:9:0x0033, B:11:0x003d, B:14:0x004b, B:16:0x0055, B:20:0x005d, B:22:0x0063, B:24:0x006f, B:30:0x0077, B:31:0x0081, B:33:0x0092, B:35:0x009b, B:37:0x00a1, B:38:0x00ac, B:42:0x00ae), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:9:0x0033, B:11:0x003d, B:14:0x004b, B:16:0x0055, B:20:0x005d, B:22:0x0063, B:24:0x006f, B:30:0x0077, B:31:0x0081, B:33:0x0092, B:35:0x009b, B:37:0x00a1, B:38:0x00ac, B:42:0x00ae), top: B:8:0x0033 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                j jVar = (j) this.e;
                long j10 = this.c;
                g gVar = (g) this.f;
                int i10 = this.b;
                boolean z11 = this.d;
                m4.c cVar = (m4.c) this.h;
                synchronized (k.d) {
                    try {
                        Spannable spannable = (Spannable) jVar.a.get();
                        if (spannable != null && jVar.b.get(Long.valueOf(j10)) == gVar) {
                            String str = gVar.a;
                            if (i10 <= spannable.length() && i10 == str.length()) {
                                for (int i11 = 0; i11 < str.length(); i11++) {
                                    if (spannable.charAt(i11) == str.charAt(i11)) {
                                    }
                                }
                                z10 = true;
                                if (z10 && !z11) {
                                    k.a(spannable, i10, (s0) cVar.b);
                                }
                                jVar.b.remove(Long.valueOf(j10));
                                if (jVar.b.isEmpty()) {
                                    k.e.remove(jVar);
                                    if (spannable instanceof e) {
                                        ((e) spannable).a = true;
                                    }
                                }
                                if (z10) {
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
                                }
                                return;
                            }
                            z10 = false;
                            if (z10) {
                                k.a(spannable, i10, (s0) cVar.b);
                            }
                            jVar.b.remove(Long.valueOf(j10));
                            if (jVar.b.isEmpty()) {
                            }
                            if (z10) {
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                VoIPPreNotificationService.lambda$show$1((Intent) this.e, (TL_phone.PhoneCall) this.f, (Context) this.h, this.b, this.c, this.d);
                return;
        }
    }

    public /* synthetic */ a(j jVar, long j10, g gVar, int i10, boolean z10, m4.c cVar) {
        this.e = jVar;
        this.c = j10;
        this.f = gVar;
        this.b = i10;
        this.d = z10;
        this.h = cVar;
    }
}
