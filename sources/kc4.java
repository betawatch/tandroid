// default package

import java.io.FileInputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kc4 extends ax2 {
    public Object a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lc4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc4(lc4 lc4Var, ax2 ax2Var) {
        super(ax2Var);
        this.d = lc4Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return lc4.a(this.d, this);
    }
}
