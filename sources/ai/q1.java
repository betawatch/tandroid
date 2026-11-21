package ai;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ q1(e2 e2Var, int i7) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                e2Var.i = true;
                e2Var.f(null);
                break;
            case 1:
                e2 e2Var2 = this.b;
                e2Var2.getClass();
                Log.d("Dictation", "stop: no final within 1.6 s, keeping the partial");
                e2Var2.g.g(e2Var2.k, "stop-timeout");
                e2Var2.f(null);
                break;
            case 2:
                this.b.f(null);
                break;
            case 3:
                e2 e2Var3 = this.b;
                if (!e2Var3.j && !e2Var3.i && e2Var3.T && !e2Var3.S) {
                    String n10 = e2Var3.g.n();
                    if (e2Var3.R < n10.length()) {
                        int i7 = e2Var3.R;
                        String substring = n10.substring(i7);
                        String trim = substring.trim();
                        if (trim.split("\\s+").length >= 2) {
                            int indexOf = substring.indexOf(trim);
                            String substring2 = substring.substring(0, indexOf);
                            String substring3 = substring.substring(trim.length() + indexOf);
                            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                            tL_textWithEntities.text = trim;
                            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
                            e2Var3.S = true;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Log.d("Dictation", "clean (voice) " + trim.length() + " chars from " + i7 + ": " + k2.c(trim));
                            e2Var3.U = ConnectionsManager.getInstance(e2Var3.b).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new s1(e2Var3, elapsedRealtime, substring, i7, substring2, substring3));
                            break;
                        }
                    }
                }
                break;
            case 4:
                this.b.f(null);
                break;
            case 5:
                e2 e2Var4 = this.b;
                if (!e2Var4.j) {
                    e2Var4.f(null);
                    break;
                }
                break;
            default:
                this.b.j(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
