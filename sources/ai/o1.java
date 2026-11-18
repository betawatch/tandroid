package ai;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                c2 c2Var3 = this.b;
                if (!c2Var3.j && !c2Var3.i && c2Var3.T && !c2Var3.S) {
                    String n10 = c2Var3.g.n();
                    if (c2Var3.R < n10.length()) {
                        int i7 = c2Var3.R;
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
                            c2Var3.S = true;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Log.d("Dictation", "clean (voice) " + trim.length() + " chars from " + i7 + ": " + i2.c(trim));
                            c2Var3.U = ConnectionsManager.getInstance(c2Var3.b).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new q1(c2Var3, elapsedRealtime, substring, i7, substring2, substring3));
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
