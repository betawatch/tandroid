package lh;

import android.view.ViewGroup;
import org.telegram.ui.a61;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class k1 extends h7.a6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ k1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // h7.a6
    public final void a() {
        switch (this.a) {
            case 0:
                ((o1) this.b).X2 = false;
                break;
            default:
                ((a61) this.b).s1 = false;
                break;
        }
    }

    @Override // h7.a6
    public final void b() {
        switch (this.a) {
            case 0:
                ((o1) this.b).X2 = true;
                break;
            default:
                ((a61) this.b).s1 = true;
                break;
        }
    }
}
