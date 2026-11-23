package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j1 {
    public final int a;
    public final String b;
    public final v0 c;
    public boolean d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public int j;
    public rc.u k;
    public long l;
    public final g1 m;
    public final g1 n;
    public final g1 o;
    public int i = -1;
    public final rc p = new rc(this, 29);

    /* JADX WARN: Type inference failed for: r0v1, types: [org.telegram.ui.Wallet.g1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [org.telegram.ui.Wallet.g1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.telegram.ui.Wallet.g1] */
    public j1(int i7, String str, v0 v0Var) {
        final int i10 = 0;
        this.m = new Runnable(this) { // from class: org.telegram.ui.Wallet.g1
            public final /* synthetic */ j1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.e();
                        break;
                    case 1:
                        j1 j1Var = this.b;
                        if (j1Var.d) {
                            j1Var.d("URL expired; renewing connection");
                            j1Var.b();
                            j1Var.e();
                            break;
                        }
                        break;
                    default:
                        this.b.f("connection or subscription timed out");
                        break;
                }
            }
        };
        final int i11 = 1;
        this.n = new Runnable(this) { // from class: org.telegram.ui.Wallet.g1
            public final /* synthetic */ j1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.e();
                        break;
                    case 1:
                        j1 j1Var = this.b;
                        if (j1Var.d) {
                            j1Var.d("URL expired; renewing connection");
                            j1Var.b();
                            j1Var.e();
                            break;
                        }
                        break;
                    default:
                        this.b.f("connection or subscription timed out");
                        break;
                }
            }
        };
        final int i12 = 2;
        this.o = new Runnable(this) { // from class: org.telegram.ui.Wallet.g1
            public final /* synthetic */ j1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.e();
                        break;
                    case 1:
                        j1 j1Var = this.b;
                        if (j1Var.d) {
                            j1Var.d("URL expired; renewing connection");
                            j1Var.b();
                            j1Var.e();
                            break;
                        }
                        break;
                    default:
                        this.b.f("connection or subscription timed out");
                        break;
                }
            }
        };
        this.a = i7;
        this.b = str;
        this.c = v0Var;
    }

    public static String a(rc.v vVar) {
        String str;
        com.google.android.gms.internal.clearcut.y0 y0Var;
        switch (vVar.a) {
            case 1:
                str = "NOT_IN_CREATED_STATE";
                break;
            case 2:
                str = "SOCKET_INPUT_STREAM_FAILURE";
                break;
            case 3:
                str = "SOCKET_OUTPUT_STREAM_FAILURE";
                break;
            case 4:
                str = "OPENING_HAHDSHAKE_REQUEST_FAILURE";
                break;
            case 5:
                str = "OPENING_HANDSHAKE_RESPONSE_FAILURE";
                break;
            case 6:
                str = "STATUS_LINE_EMPTY";
                break;
            case 7:
                str = "STATUS_LINE_BAD_FORMAT";
                break;
            case 8:
                str = "NOT_SWITCHING_PROTOCOLS";
                break;
            case 9:
                str = "HTTP_HEADER_FAILURE";
                break;
            case 10:
                str = "NO_UPGRADE_HEADER";
                break;
            case 11:
                str = "NO_WEBSOCKET_IN_UPGRADE_HEADER";
                break;
            case 12:
                str = "NO_CONNECTION_HEADER";
                break;
            case 13:
                str = "NO_UPGRADE_IN_CONNECTION_HEADER";
                break;
            case 14:
                str = "NO_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 15:
                str = "UNEXPECTED_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 16:
                str = "EXTENSION_PARSE_ERROR";
                break;
            case 17:
                str = "UNSUPPORTED_EXTENSION";
                break;
            case 18:
                str = "EXTENSIONS_CONFLICT";
                break;
            case 19:
                str = "UNSUPPORTED_PROTOCOL";
                break;
            case 20:
                str = "INSUFFICENT_DATA";
                break;
            case 21:
                str = "INVALID_PAYLOAD_LENGTH";
                break;
            case 22:
                str = "TOO_LONG_PAYLOAD";
                break;
            case 23:
                str = "INSUFFICIENT_MEMORY_FOR_PAYLOAD";
                break;
            case 24:
                str = "INTERRUPTED_IN_READING";
                break;
            case 25:
                str = "IO_ERROR_IN_READING";
                break;
            case 26:
                str = "IO_ERROR_IN_WRITING";
                break;
            case 27:
                str = "FLUSH_ERROR";
                break;
            case 28:
                str = "NON_ZERO_RESERVED_BITS";
                break;
            case 29:
                str = "UNEXPECTED_RESERVED_BIT";
                break;
            case ks.T /* 30 */:
                str = "FRAME_MASKED";
                break;
            case ks.U /* 31 */:
                str = "UNKNOWN_OPCODE";
                break;
            case 32:
                str = "FRAGMENTED_CONTROL_FRAME";
                break;
            case 33:
                str = "UNEXPECTED_CONTINUATION_FRAME";
                break;
            case 34:
                str = "CONTINUATION_NOT_CLOSED";
                break;
            case 35:
                str = "TOO_LONG_CONTROL_FRAME_PAYLOAD";
                break;
            case 36:
                str = "MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 37:
                str = "TEXT_MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 38:
                str = "UNEXPECTED_ERROR_IN_READING_THREAD";
                break;
            case 39:
                str = "UNEXPECTED_ERROR_IN_WRITING_THREAD";
                break;
            case 40:
                str = "PERMESSAGE_DEFLATE_UNSUPPORTED_PARAMETER";
                break;
            case 41:
                str = "PERMESSAGE_DEFLATE_INVALID_MAX_WINDOW_BITS";
                break;
            case 42:
                str = "COMPRESSION_ERROR";
                break;
            case 43:
                str = "DECOMPRESSION_ERROR";
                break;
            case 44:
                str = "SOCKET_CONNECT_ERROR";
                break;
            case 45:
                str = "PROXY_HANDSHAKE_ERROR";
                break;
            case 46:
                str = "SOCKET_OVERLAY_ERROR";
                break;
            case 47:
                str = "SSL_HANDSHAKE_ERROR";
                break;
            case 48:
                str = "NO_MORE_FRAME";
                break;
            case 49:
                str = "HOSTNAME_UNVERIFIED";
                break;
            default:
                str = "null";
                break;
        }
        if (!(vVar instanceof rc.n) || (y0Var = ((rc.n) vVar).b) == null) {
            return str;
        }
        StringBuilder n10 = p5.c.n(str, ", HTTP ");
        n10.append(y0Var.b);
        return n10.toString();
    }

    public final void b() {
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        sb2.append(this.k != null);
        sb2.append(", subscribed=");
        sb2.append(this.e);
        sb2.append(", URL request=");
        sb2.append(this.i);
        d(sb2.toString());
        this.h++;
        this.e = false;
        org.telegram.messenger.g0.r(this.m);
        org.telegram.messenger.g0.r(this.n);
        org.telegram.messenger.g0.r(this.o);
        org.telegram.messenger.g0.r(this.p);
        if (this.i >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.i, true);
            this.i = -1;
        }
        rc.u uVar = this.k;
        this.k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(rc.u uVar, int i7) {
        return this.d && this.k == uVar && this.h == i7;
    }

    public final void d(String str) {
        org.telegram.messenger.a8.b("[gram-wallet-streaming] account=" + this.a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (this.d) {
            org.telegram.messenger.g0.r(this.m);
            final int i7 = this.h + 1;
            this.h = i7;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            d("requesting streaming URL; retry=" + this.j);
            org.telegram.messenger.g0.h3(this.o, 30000L);
            this.i = ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new d3.b(1), new p10() { // from class: org.telegram.ui.Wallet.h1
                @Override // org.telegram.messenger.p10
                public final void a(Object obj, Object obj2) {
                    j1 j1Var = j1.this;
                    int i10 = i7;
                    long j3 = elapsedRealtime;
                    TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    if (!j1Var.d || j1Var.h != i10) {
                        j1Var.d("ignoring stale URL response; attempt=" + i10);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j3);
                    sb2.append(" ms; errorCode=");
                    sb2.append(tL_error == null ? "none" : Integer.valueOf(tL_error.code));
                    j1Var.d(sb2.toString());
                    j1Var.i = -1;
                    org.telegram.messenger.g0.r(j1Var.o);
                    if (streamingurl == null || TextUtils.isEmpty(streamingurl.url)) {
                        j1Var.f("could not obtain streaming URL");
                        return;
                    }
                    long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(j1Var.a).getCurrentTime()) * 1000;
                    j1Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                    if (currentTime <= 0) {
                        j1Var.f("received expired streaming URL");
                        return;
                    }
                    org.telegram.messenger.g0.h3(j1Var.n, currentTime);
                    String str = streamingurl.url;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    j1Var.d("opening websocket; attempt=" + i10);
                    try {
                        b3.j jVar = new b3.j(15, (short) 0);
                        jVar.b = 10000;
                        rc.u h = jVar.h(str);
                        j1Var.k = h;
                        i1 i1Var = new i1(j1Var, i10, elapsedRealtime2);
                        ab.q qVar = h.d;
                        synchronized (((ArrayList) qVar.c)) {
                            ((ArrayList) qVar.c).add(i1Var);
                            qVar.a = true;
                        }
                        org.telegram.messenger.g0.h3(j1Var.o, 30000L);
                        rc.u uVar = j1Var.k;
                        uVar.getClass();
                        rc.b bVar = new rc.b("ConnectThread", uVar, 3, 0);
                        ab.q qVar2 = uVar.d;
                        if (qVar2 != null) {
                            ArrayList arrayList = (ArrayList) qVar2.q();
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj3 = arrayList.get(i11);
                                i11++;
                                i1 i1Var2 = (i1) obj3;
                                try {
                                    try {
                                        i1Var2.getClass();
                                    } catch (Throwable unused) {
                                        i1Var2.getClass();
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        bVar.start();
                    } catch (Exception e10) {
                        j1Var.f("could not open websocket: ".concat(e10.getClass().getSimpleName()));
                    }
                }
            });
        }
    }

    public final void f(String str) {
        if (this.d) {
            b();
            int i7 = this.j;
            this.j = i7 + 1;
            long min = Math.min(30000L, 1000 << Math.min(i7, 5)) + ((long) (Math.random() * 500.0d));
            d(str + "; retrying in " + min + " ms");
            org.telegram.messenger.g0.h3(this.m, min);
        }
    }

    public final void g(String str) {
        d("send -> " + str);
        rc.u uVar = this.k;
        uVar.getClass();
        rc.x xVar = new rc.x();
        xVar.a = true;
        xVar.e = 1;
        if (str == null || str.length() == 0) {
            xVar.g = null;
        } else {
            xVar.c(rc.k.a(str));
        }
        uVar.g(xVar);
    }

    public final void h() {
        if (this.d) {
            d("stopping");
            this.d = false;
            b();
        }
    }
}
