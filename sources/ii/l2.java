package ii;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ l2(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                f6 f6Var = this.b;
                f6Var.G = null;
                a aVar = f6Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = f6Var.f.getText().toString();
                        if (!obj.equals(f6Var.H)) {
                            a aVar2 = f6Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = f6Var.I + 1;
                            f6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new fi.m0(f6Var, i10, aVar2, obj, 1));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
