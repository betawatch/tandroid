package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class kt implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ot c;

    public kt(ot otVar, ArrayList arrayList, boolean z10) {
        this.c = otVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        st stVar = this.c.a;
        if (stVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            qt qtVar = stVar.l;
            if (qtVar != null) {
                qtVar.l(stVar.W, stVar.Y, stVar.b0, ((Integer) arrayList.get(intValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            qt qtVar2 = stVar.l;
            if (qtVar2 != null) {
                qtVar2.M(stVar.a0, stVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(stVar.r).addRecentSticker(2, stVar.b0, stVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document = stVar.W;
            Object obj = stVar.b0;
            String str = stVar.Y;
            qt qtVar3 = stVar.l;
            if (qtVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.e5.L(stVar.w, qtVar3.a(), new a1.d(qtVar3, document, str, obj, 10));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(stVar.r).addRecentSticker(0, stVar.b0, stVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            stVar.l.i(stVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            stVar.l.n(stVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            stVar.l.E(stVar.W);
        }
        stVar.p();
    }
}
