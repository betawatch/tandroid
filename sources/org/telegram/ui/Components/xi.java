package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.qc1;
import org.telegram.ui.rc1;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xi extends org.telegram.ui.Cells.ta {
    public final /* synthetic */ int x;
    public final /* synthetic */ tj0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi(tj0 tj0Var, Context context, int i7) {
        super(context, 5);
        this.x = i7;
        this.y = tj0Var;
    }

    @Override // org.telegram.ui.Cells.ta
    public final void a(int i7, Object obj) {
        switch (this.x) {
            case 0:
                q0.a aVar = ((yi) ((ha) this.y).f).y;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.w0(((qc1) this.y).d, this, obj, i7);
                break;
            default:
                ((rc1) this.y).F.presentFragment(new t71(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ta
    public boolean b(Object obj, int i7) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.x0(((qc1) this.y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(ha haVar, Context context) {
        super(context, 1);
        this.x = 0;
        this.y = haVar;
    }
}
