package ji;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ j2(g6 g6Var, int i10) {
        this.a = i10;
        this.b = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                g6 g6Var = this.b;
                g6Var.G = null;
                a aVar = g6Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = g6Var.f.getText().toString();
                        if (!obj.equals(g6Var.H)) {
                            a aVar2 = g6Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = g6Var.I + 1;
                            g6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new gi.m0(g6Var, i10, aVar2, obj, 1));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
