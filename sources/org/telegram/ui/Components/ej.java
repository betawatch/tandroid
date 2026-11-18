package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ej extends org.telegram.ui.Cells.va {
    public final /* synthetic */ int x;
    public final /* synthetic */ bk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej(bk0 bk0Var, Context context, int i7) {
        super(context, 5);
        this.x = i7;
        this.y = bk0Var;
    }

    @Override // org.telegram.ui.Cells.va
    public final void a(int i7, Object obj) {
        switch (this.x) {
            case 0:
                q0.a aVar = ((fj) ((qa) this.y).f).y;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.w0(((tc1) this.y).d, this, obj, i7);
                break;
            default:
                ((uc1) this.y).F.presentFragment(new org.telegram.ui.x71(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.va
    public boolean b(Object obj, int i7) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.x0(((tc1) this.y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(qa qaVar, Context context) {
        super(context, 1);
        this.x = 0;
        this.y = qaVar;
    }
}
