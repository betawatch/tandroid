// default package

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class kb9 implements pib {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public kb9(StaticLayout staticLayout, Rect rect) {
        this.b = staticLayout;
        this.c = rect;
    }

    @Override // pib, jg7
    public final Layout a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (StaticLayout) obj;
            default:
                pwc pwcVar = (pwc) obj;
                qwc qwcVar = pwcVar.h;
                if (qwcVar != null) {
                    return qwcVar;
                }
                qwc qwcVar2 = new qwc(pwcVar);
                pwcVar.h = qwcVar2;
                return qwcVar2;
        }
    }

    @Override // pib
    public final Rect c() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override // pib
    public final CharSequence getPrefix() {
        byte b = this.a;
        return null;
    }

    @Override // pib
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((zi9) this.c).V;
        }
    }

    @Override // pib
    public final CharSequence getText() {
        switch (this.a) {
            case 0:
                StaticLayout staticLayout = (StaticLayout) this.b;
                if (staticLayout != null) {
                    return staticLayout.getText();
                }
                return null;
            default:
                Layout a = a();
                if (a != null) {
                    return a.getText();
                }
                return null;
        }
    }

    @Override // pib
    public final int getX() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                zi9 zi9Var = (zi9) this.c;
                return (zi9Var.T - zi9Var.k0) + ((pwc) this.b).b;
        }
    }

    @Override // pib
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((zi9) this.c).U + ((pwc) this.b).c;
        }
    }

    public kb9(zi9 zi9Var, pwc pwcVar) {
        this.c = zi9Var;
        this.b = pwcVar;
    }
}
