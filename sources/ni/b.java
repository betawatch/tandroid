package ni;

import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import com.google.android.gms.internal.play_billing.s0;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ b(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z9) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i7;
        this.c = j3;
        this.d = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:9:0x0033, B:11:0x003d, B:14:0x004b, B:16:0x0055, B:20:0x005d, B:22:0x0063, B:24:0x006f, B:30:0x0077, B:31:0x0081, B:33:0x0092, B:35:0x009b, B:37:0x00a1, B:38:0x00ac, B:42:0x00ae), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:9:0x0033, B:11:0x003d, B:14:0x004b, B:16:0x0055, B:20:0x005d, B:22:0x0063, B:24:0x006f, B:30:0x0077, B:31:0x0081, B:33:0x0092, B:35:0x009b, B:37:0x00a1, B:38:0x00ac, B:42:0x00ae), top: B:8:0x0033 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        switch (this.a) {
            case 0:
                l lVar = (l) this.e;
                long j3 = this.c;
                i iVar = (i) this.f;
                int i7 = this.b;
                boolean z10 = this.d;
                j2.n nVar = (j2.n) this.h;
                synchronized (m.d) {
                    try {
                        Spannable spannable = (Spannable) lVar.a.get();
                        if (spannable != null && lVar.b.get(Long.valueOf(j3)) == iVar) {
                            String str = iVar.a;
                            if (i7 <= spannable.length() && i7 == str.length()) {
                                for (int i10 = 0; i10 < str.length(); i10++) {
                                    if (spannable.charAt(i10) == str.charAt(i10)) {
                                    }
                                }
                                z9 = true;
                                if (z9 && !z10) {
                                    m.a(spannable, i7, (s0) nVar.b);
                                }
                                lVar.b.remove(Long.valueOf(j3));
                                if (lVar.b.isEmpty()) {
                                    m.e.remove(lVar);
                                    if (spannable instanceof g) {
                                        ((g) spannable).a = true;
                                    }
                                }
                                if (z9) {
                                    qs.e().k(qs.i4, new Object[0]);
                                }
                                return;
                            }
                            z9 = false;
                            if (z9) {
                                m.a(spannable, i7, (s0) nVar.b);
                            }
                            lVar.b.remove(Long.valueOf(j3));
                            if (lVar.b.isEmpty()) {
                            }
                            if (z9) {
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

    public /* synthetic */ b(l lVar, long j3, i iVar, int i7, boolean z9, j2.n nVar) {
        this.e = lVar;
        this.c = j3;
        this.f = iVar;
        this.b = i7;
        this.d = z9;
        this.h = nVar;
    }
}
