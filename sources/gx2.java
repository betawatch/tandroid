// default package

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gx2 extends LinearLayout {
    public final bf0 a;
    public final lka b;
    public final ylb c;
    public TLRPC.StickerSetCovered d;

    public gx2(Context context, ylb ylbVar) {
        super(context);
        this.c = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        lkaVar.setTextSize(16);
        lkaVar.setTextColor(-1);
        setOrientation(0);
        addView(bf0Var, qoe.t(24, 24, 17, 17, 0, 17, 0));
        addView(lkaVar, qoe.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
