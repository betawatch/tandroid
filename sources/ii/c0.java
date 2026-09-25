package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ba;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class c0 implements ba {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public c0(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
    }

    @Override // org.telegram.ui.Cells.ba
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.ba
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.ba
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.ba
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getY() {
        return 0;
    }
}
