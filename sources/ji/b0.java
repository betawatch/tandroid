package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.z9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b0 implements z9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public b0(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
    }

    @Override // org.telegram.ui.Cells.z9
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.z9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z9
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.z9
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.z9
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.z9
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.z9
    public final int getY() {
        return 0;
    }
}
