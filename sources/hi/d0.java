package hi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.da;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d0 implements da {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public d0(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
    }

    @Override // org.telegram.ui.Cells.da
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.da
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.da
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.da
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.da
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.da
    public final int getY() {
        return 0;
    }
}
