package ai;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ r1(f2 f2Var, int i7) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                f2Var.i = true;
                f2Var.g(null);
                break;
            case 1:
                f2 f2Var2 = this.b;
                f2Var2.getClass();
                Log.d("Dictation", "stop: no final within 1.6 s, keeping the partial");
                f2Var2.g.g(f2Var2.k, "stop-timeout");
                f2Var2.g(null);
                break;
            case 2:
                this.b.g(null);
                break;
            case 3:
                f2 f2Var3 = this.b;
                if (!f2Var3.j && !f2Var3.i && f2Var3.T && !f2Var3.S) {
                    String n10 = f2Var3.g.n();
                    if (f2Var3.R < n10.length()) {
                        int i7 = f2Var3.R;
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
                            f2Var3.S = true;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Log.d("Dictation", "clean (voice) " + trim.length() + " chars from " + i7 + ": " + l2.c(trim));
                            f2Var3.U = ConnectionsManager.getInstance(f2Var3.b).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new t1(f2Var3, elapsedRealtime, substring, i7, substring2, substring3));
                            break;
                        }
                    }
                }
                break;
            case 4:
                this.b.g(null);
                break;
            case 5:
                f2 f2Var4 = this.b;
                if (!f2Var4.j) {
                    f2Var4.g(null);
                    break;
                }
                break;
            default:
                this.b.k(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
