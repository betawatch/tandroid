// default package

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class l14 implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ z8d b;
    public final /* synthetic */ h6 c;

    public l14(h6 h6Var, boolean[] zArr, z8d z8dVar) {
        this.c = h6Var;
        this.a = zArr;
        this.b = z8dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o14 o14Var = (o14) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        id[] idVarArr = {new id(3, null, o14Var.G.getContext())};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        o24 o24Var = o14Var.G;
        String str = o14Var.x;
        if (str == null) {
            str = o24Var.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        hl.d3(new ze7((Object) this, (Object) idVarArr, ConnectionsManager.getInstance(o24Var.d1).sendRequest(tL_messages_getEmojiURL, new fn0((Object) this, (Object) idVarArr, (Object) this.b, (byte) 23)), (byte) 24), 1000L);
    }
}
