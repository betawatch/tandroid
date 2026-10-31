package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class o5 implements u9 {
    public final /* synthetic */ int a;
    public final Object b;
    public final int c;
    public final int d;

    public /* synthetic */ o5(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.b = obj;
        this.c = i10;
        this.d = i11;
    }

    @Override // org.telegram.ui.Cells.u9
    public final Layout a() {
        switch (this.a) {
            case 0:
                return (Layout) this.b;
            case 1:
                return (Layout) this.b;
            case 2:
                return (Layout) this.b;
            default:
                return ((u9) this.b).a();
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ Rect c() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getPrefix() {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return ((u9) this.b).getPrefix();
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((u9) this.b).getRow();
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getText() {
        switch (this.a) {
            case 0:
                return ((Layout) this.b).getText();
            case 1:
                return ((Layout) this.b).getText();
            case 2:
                return ((Layout) this.b).getText();
            default:
                return ((u9) this.b).getText();
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getX() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            default:
                return ((u9) this.b).getX() + this.c;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getY() {
        switch (this.a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((u9) this.b).getY() + this.d;
        }
    }
}
