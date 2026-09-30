package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.ba;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class e5 implements ba {
    public final /* synthetic */ int a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ e5(Layout layout, int i10, int i11, int i12) {
        this.a = i12;
        this.b = layout;
        this.c = i10;
        this.d = i11;
    }

    @Override // org.telegram.ui.Cells.ba
    public final Layout getLayout() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.Cells.ba
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final /* synthetic */ Rect getSelectionBounds() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final CharSequence getText() {
        switch (this.a) {
        }
        return this.b.getText();
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getX() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getY() {
        switch (this.a) {
        }
        return this.d;
    }
}
