package di;

import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import com.google.android.gms.internal.play_billing.s0;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ b(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
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
                k kVar = (k) this.e;
                long j10 = this.c;
                h hVar = (h) this.f;
                int i10 = this.b;
                boolean z11 = this.d;
                n4.q qVar = (n4.q) this.h;
                synchronized (l.d) {
                    try {
                        Spannable spannable = (Spannable) kVar.a.get();
                        if (spannable != null && kVar.b.get(Long.valueOf(j10)) == hVar) {
                            String str = hVar.a;
                            if (i10 <= spannable.length() && i10 == str.length()) {
                                for (int i11 = 0; i11 < str.length(); i11++) {
                                    if (spannable.charAt(i11) == str.charAt(i11)) {
                                    }
                                }
                                z10 = true;
                                if (z10 && !z11) {
                                    l.a(spannable, i10, (s0) qVar.a);
                                }
                                kVar.b.remove(Long.valueOf(j10));
                                if (kVar.b.isEmpty()) {
                                    l.e.remove(kVar);
                                    if (spannable instanceof f) {
                                        ((f) spannable).a = true;
                                    }
                                }
                                if (z10) {
                                    zs.e().k(zs.i4, new Object[0]);
                                }
                                return;
                            }
                            z10 = false;
                            if (z10) {
                                l.a(spannable, i10, (s0) qVar.a);
                            }
                            kVar.b.remove(Long.valueOf(j10));
                            if (kVar.b.isEmpty()) {
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

    public /* synthetic */ b(k kVar, long j10, h hVar, int i10, boolean z10, n4.q qVar) {
        this.e = kVar;
        this.c = j10;
        this.f = hVar;
        this.b = i10;
        this.d = z10;
        this.h = qVar;
    }
}
