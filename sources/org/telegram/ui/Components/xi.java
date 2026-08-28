package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.oc1;
import org.telegram.ui.zh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xi extends org.telegram.ui.Cells.za {
    public final /* synthetic */ int w;
    public final /* synthetic */ vk0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi(vk0 vk0Var, Context context, int i9) {
        super(context, 5);
        this.w = i9;
        this.x = vk0Var;
    }

    @Override // org.telegram.ui.Cells.za
    public final void a(int i9, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((yi) ((ra) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.q0(((zh1) this.x).d, this, obj, i9);
                break;
            default:
                ((bi1) this.x).A.presentFragment(new oc1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.za
    public boolean b(Object obj, int i9) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.r0(((zh1) this.x).d, this, obj, i9);
            default:
                return super.b(obj, i9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(ra raVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = raVar;
    }
}
