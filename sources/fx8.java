// default package

import android.os.SystemClock;
import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fx8 implements RequestTimeDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wea b;

    public /* synthetic */ fx8(wea weaVar, byte b) {
        this.a = b;
        this.b = weaVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(final long j) {
        byte b = this.a;
        final wea weaVar = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                hl.c3(new Runnable() { // from class: gx8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        long j2 = j;
                        wea weaVar2 = weaVar;
                        switch (b3) {
                            case 0:
                                weaVar2.e = SystemClock.elapsedRealtime();
                                weaVar2.c = false;
                                if (j2 == -1) {
                                    weaVar2.d = false;
                                    weaVar2.b = 0L;
                                } else {
                                    weaVar2.b = j2;
                                    weaVar2.d = true;
                                }
                                jn7.e().k(jn7.E4, weaVar2);
                                break;
                            default:
                                weaVar2.e = SystemClock.elapsedRealtime();
                                weaVar2.c = false;
                                if (j2 == -1) {
                                    weaVar2.d = false;
                                    weaVar2.b = 0L;
                                } else {
                                    weaVar2.b = j2;
                                    weaVar2.d = true;
                                }
                                jn7.e().k(jn7.E4, weaVar2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: gx8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        long j2 = j;
                        wea weaVar2 = weaVar;
                        switch (b32) {
                            case 0:
                                weaVar2.e = SystemClock.elapsedRealtime();
                                weaVar2.c = false;
                                if (j2 == -1) {
                                    weaVar2.d = false;
                                    weaVar2.b = 0L;
                                } else {
                                    weaVar2.b = j2;
                                    weaVar2.d = true;
                                }
                                jn7.e().k(jn7.E4, weaVar2);
                                break;
                            default:
                                weaVar2.e = SystemClock.elapsedRealtime();
                                weaVar2.c = false;
                                if (j2 == -1) {
                                    weaVar2.d = false;
                                    weaVar2.b = 0L;
                                } else {
                                    weaVar2.b = j2;
                                    weaVar2.d = true;
                                }
                                jn7.e().k(jn7.E4, weaVar2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
