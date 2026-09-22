package ii;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ k2(d6 d6Var, int i10) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                d6 d6Var = this.b;
                d6Var.G = null;
                a aVar = d6Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = d6Var.f.getText().toString();
                        if (!obj.equals(d6Var.H)) {
                            a aVar2 = d6Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = d6Var.I + 1;
                            d6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new fi.m0(d6Var, i10, aVar2, obj, 1));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
