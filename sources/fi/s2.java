package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.lz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s2 extends lz {
    public final /* synthetic */ int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.U = i7;
    }

    @Override // org.telegram.ui.Components.lz
    public int getColumnsCount() {
        switch (this.U) {
            case 0:
                return 3;
            case 1:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override // org.telegram.ui.Components.lz
    public int getViewType() {
        switch (this.U) {
            case 1:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // org.telegram.ui.Components.lz, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.U) {
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(104.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }
}
