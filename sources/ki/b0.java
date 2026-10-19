package ki;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.y9;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class b0 implements y9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public b0(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
    }

    @Override // org.telegram.ui.Cells.y9
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.y9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.y9
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.y9
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getY() {
        return 0;
    }
}
