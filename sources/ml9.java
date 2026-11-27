// default package

import android.graphics.Rect;
import android.text.Layout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ml9 implements kmb {
    public final /* synthetic */ byte a;
    public final Object b;
    public final int c;
    public final int d;

    public /* synthetic */ ml9(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
        this.d = i2;
    }

    @Override // kmb
    public final Layout a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (Layout) obj;
            case 1:
                return (Layout) obj;
            case 2:
                return (Layout) obj;
            default:
                return ((kmb) obj).a();
        }
    }

    @Override // kmb
    public final Rect c() {
        byte b = this.a;
        return null;
    }

    @Override // kmb
    public final CharSequence getPrefix() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return null;
            default:
                return ((kmb) this.b).getPrefix();
        }
    }

    @Override // kmb
    public final int getRow() {
        switch (this.a) {
            case 0:
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((kmb) this.b).getRow();
        }
    }

    @Override // kmb
    public final CharSequence getText() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((Layout) obj).getText();
            case 1:
                return ((Layout) obj).getText();
            case 2:
                return ((Layout) obj).getText();
            default:
                return ((kmb) obj).getText();
        }
    }

    @Override // kmb
    public final int getX() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            default:
                return ((kmb) this.b).getX() + this.c;
        }
    }

    @Override // kmb
    public final int getY() {
        switch (this.a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((kmb) this.b).getY() + this.d;
        }
    }
}
