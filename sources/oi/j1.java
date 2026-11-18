package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;
    public final /* synthetic */ a c;

    public /* synthetic */ j1(z1 z1Var, a aVar, int i7) {
        this.a = i7;
        this.b = z1Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        a aVar = this.c;
        z1 z1Var = this.b;
        switch (i7) {
            case 0:
                s3 s3Var = z1Var.Q;
                ArrayList arrayList = s3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                s3Var.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                z1Var.Q.Y4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                z1Var.Q.Y4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                z1Var.Q.Y4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                s3 s3Var2 = z1Var.Q;
                ArrayList arrayList2 = s3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                s3Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                z1Var.Q.Z4(aVar, 0);
                break;
            case 6:
                z1Var.Q.Z4(aVar, 1);
                break;
            case 7:
                z1Var.Q.Z4(aVar, 2);
                break;
            case 8:
                z1Var.Q.Z4(aVar, 3);
                break;
            default:
                View C1 = z1Var.Q.C1(aVar);
                if (!(C1 instanceof l4)) {
                    z1Var.Q.g3.O(false);
                    break;
                } else {
                    ((l4) C1).g(aVar, z1Var.Q.getMapDelegate());
                    break;
                }
        }
    }
}
