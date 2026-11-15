package ai;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ o1(c2 c2Var, int i7) {
        this.a = i7;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.i = true;
                c2Var.f(null);
                break;
            case 1:
                c2 c2Var2 = this.b;
                c2Var2.getClass();
                Log.d("Dictation", "stop: no final within 1.6 s, keeping the partial");
                c2Var2.g.g(c2Var2.k, "stop-timeout");
                c2Var2.f(null);
                break;
            case 2:
                this.b.f(null);
                break;
            case 3:
                final c2 c2Var3 = this.b;
                if (!c2Var3.j && !c2Var3.i && c2Var3.V && !c2Var3.U) {
                    String n10 = c2Var3.g.n();
                    if (c2Var3.T < n10.length()) {
                        final int i7 = c2Var3.T;
                        final String substring = n10.substring(i7);
                        String trim = substring.trim();
                        if (trim.split("\\s+").length >= 2) {
                            int indexOf = substring.indexOf(trim);
                            final String substring2 = substring.substring(0, indexOf);
                            final String substring3 = substring.substring(trim.length() + indexOf);
                            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                            tL_textWithEntities.text = trim;
                            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
                            c2Var3.U = true;
                            final long elapsedRealtime = SystemClock.elapsedRealtime();
                            Log.d("Dictation", "clean (voice) " + trim.length() + " chars from " + i7 + ": \"" + i2.c(trim) + "\"");
                            c2Var3.W = ConnectionsManager.getInstance(c2Var3.b).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new s10() { // from class: ai.q1
                                @Override // org.telegram.messenger.s10
                                public final void a(Object obj, Object obj2) {
                                    TLRPC.TL_textWithEntities tL_textWithEntities2;
                                    TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    c2 c2Var4 = c2.this;
                                    c2Var4.U = false;
                                    c2Var4.W = -1;
                                    if (c2Var4.j) {
                                        return;
                                    }
                                    if (tL_composedMessageWithAI == null || (tL_textWithEntities2 = tL_composedMessageWithAI.result_text) == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                        r.b.t(new StringBuilder("clean failed: "), tL_error != null ? tL_error.text : null, "Dictation");
                                        return;
                                    }
                                    Log.d("Dictation", "clean done in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms: \"" + i2.c(tL_composedMessageWithAI.result_text.text) + "\"");
                                    String n11 = c2Var4.g.n();
                                    String str = substring;
                                    int i10 = i7;
                                    if (n11.startsWith(str, i10)) {
                                        ArrayList arrayList = c2Var4.S;
                                        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(substring2);
                                        m10.append(tL_composedMessageWithAI.result_text.text.trim());
                                        m10.append(substring3);
                                        arrayList.add(new z1(i10, str, m10.toString()));
                                        c2Var4.T = str.length() + i10;
                                        c2Var4.e();
                                    }
                                }
                            });
                            break;
                        }
                    }
                }
                break;
            case 4:
                this.b.f(null);
                break;
            case 5:
                c2 c2Var4 = this.b;
                if (!c2Var4.j) {
                    c2Var4.f(null);
                    break;
                }
                break;
            default:
                this.b.j(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
