package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ca;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class c0 implements ca {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ Rect b;

    public c0(Layout layout, Rect rect) {
        this.a = layout;
        this.b = rect;
    }

    @Override // org.telegram.ui.Cells.ca
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.ca
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ca
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.ca
    public final Rect getSelectionBounds() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.ca
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // org.telegram.ui.Cells.ca
    public final int getX() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.ca
    public final int getY() {
        return 0;
    }
}
