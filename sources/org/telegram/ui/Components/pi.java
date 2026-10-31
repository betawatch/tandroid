package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.m91;
import org.telegram.ui.oe1;
import org.telegram.ui.pe1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.Cells.ua {
    public final /* synthetic */ int x;
    public final /* synthetic */ sk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(sk0 sk0Var, Context context, int i10) {
        super(context, 5);
        this.x = i10;
        this.y = sk0Var;
    }

    @Override // org.telegram.ui.Cells.ua
    public final void a(int i10, Object obj) {
        switch (this.x) {
            case 0:
                q0.a aVar = ((qi) ((fa) this.y).f).y;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.v0(((oe1) this.y).d, this, obj, i10);
                break;
            default:
                ((pe1) this.y).E.presentFragment(new m91(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ua
    public boolean b(Object obj, int i10) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.w0(((oe1) this.y).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(fa faVar, Context context) {
        super(context, 1);
        this.x = 0;
        this.y = faVar;
    }
}
