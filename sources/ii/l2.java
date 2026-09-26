package ii;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ l2(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                e6 e6Var = this.b;
                e6Var.G = null;
                a aVar = e6Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = e6Var.f.getText().toString();
                        if (!obj.equals(e6Var.H)) {
                            a aVar2 = e6Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = e6Var.I + 1;
                            e6Var.I = i10;
                            CodeHighlighting.highlightEditable(obj, str, new fi.m0(e6Var, i10, aVar2, obj, 1));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
